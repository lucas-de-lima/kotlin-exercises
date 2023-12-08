Resumo

Para criar um arquivo de origem Kotlin no IntelliJ IDEA, comece com um projeto Kotlin.

Para compilar e executar um programa no IntelliJ IDEA, clique no triângulo verde próximo à main()função. A saída aparece em uma janela de registro abaixo.

No IntelliJ IDEA, especifique argumentos de linha de comando para passar para a main()função em Run > Edit Configurations .

Quase tudo em Kotlin tem um valor. Você pode usar esse fato para tornar seu código mais conciso usando o valor de um ifou whencomo expressão ou valor de retorno.

Os argumentos padrão eliminam a necessidade de múltiplas versões de uma função ou método. Por exemplo:fun swim(speed: String = "fast") { ... }

Funções compactas ou funções de expressão única podem tornar seu código mais legível. Por exemplo:fun isTooHot(temperature: Int) = temperature > 30

Você aprendeu algumas noções básicas sobre filtros, que usam expressões lambda. Por exemplo:val beginsWithP = decorations.filter { it [0] == 'p' }

Uma expressão lambda é uma expressão que cria uma função sem nome. As expressões lambda são definidas entre chaves {}.

Em uma função de ordem superior , você passa uma função como uma expressão lambda para outra função como dados. Por exemplo:dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}

Há muita coisa nesta lição, especialmente se você for novo em lambdas. Uma lição posterior revisita lambdas e funções de ordem superior.