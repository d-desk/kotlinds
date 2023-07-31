fun main(args: Array<String>) {

    val arraysObject = Arrays()

    val array = arraysObject.createArrayUsingArrayOf()
    val anotherArray = arraysObject.createArrayUsingConstructor()

    println(arraysObject.accessElementWithoutGet(index = 0,array))
    println(arraysObject.accessElementWithGet(index = 0,anotherArray))
    println(arraysObject.accessElementWithComponent(array))
    println(arraysObject.accessElementWithDefaultValue(array))

    arraysObject.iterateOverArrayElement(array)
    arraysObject.iterateOverArrayElementWithIndex(array)
    arraysObject.iterateOverArrayElementUsingForEach(array)

    arraysObject.updateArrayWithoutSet(0,9,array)
    arraysObject.updateArrayWitSet(1,7,array)
    println("\nUpdated Value")
    arraysObject.iterateOverArrayElement(array)

    println("\nArray Size ${arraysObject.getArraySize(array)}")







}