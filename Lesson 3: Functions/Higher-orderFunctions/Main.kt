var dirtyLevel = 20
// val waterFilter = { dirty : Int -> dirty / 2}
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
println(waterFilter(dirtyLevel))

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
println(updateDirty(30, waterFilter))

fun increaseDirty( start: Int ) = start + 1

println(updateDirty(15, ::increaseDirty))

dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
println(dirtyLevel)


