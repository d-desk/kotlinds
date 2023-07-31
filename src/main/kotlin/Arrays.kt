class Arrays
{
    fun createArrayUsingArrayOf():Array<Int> = arrayOf(1,2,3,4,5,6,7,8)
    fun createArrayUsingConstructor(): IntArray =  IntArray(3)

    fun accessElementWithoutGet(index:Int,array:Array<Int>) = array[index]
    fun accessElementWithGet(index:Int,array:IntArray) = array.get(index)
    fun accessElementWithComponent(array:Array<Int>) = array.component1()
    fun accessElementWithDefaultValue(array:Array<Int>) = array.getOrElse(50){-1}

    fun iterateOverArrayElement(array:Array<Int>)
    {
        print("Array Elements : ")
        for (item in array)
        {
            print("$item,")
        }
    }

    fun iterateOverArrayElementWithIndex(array:Array<Int>)
    {
        println()
        println("Array Elements With Index: ")
        for ((index,item) in array.withIndex())
        {
            println("$item at $index")
        }
    }

    fun iterateOverArrayElementUsingForEach(array:Array<Int>)
    {
        print("Array Elements : ")
        array.forEach { item -> print("$item,")}

    }

    fun updateArrayWithoutSet(index:Int,value:Int,array:Array<Int>)
    {
       array[index] = value
    }

    fun updateArrayWitSet(index:Int,value:Int,array:Array<Int>)
    {
        array.set(index,value)
    }

    fun getArraySize(array:Array<Int>) = array.size

}