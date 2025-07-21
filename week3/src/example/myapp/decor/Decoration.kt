package example.myapp.decor

    data class Decoration(val rocks: String){

    }
//        val rock = decoration.rock
//        val wood = decoration.wood
//        val diver = decoration.diver
//
//        val (rock, wood, diver) = decoration

    // Here is a data class with 3 properties.
    data class Decoration2(val rocks: String, val wood: String, val diver: String)

    fun makeDecorations() {
//        val decoration1 = Decoration("granite")
//        println(decoration1)
//
//        val decoration2 = Decoration("slate")
//        println(decoration2)
//
//        val decoration3 = Decoration("slate")
//        println(decoration3)
//
//        println(decoration1.equals(decoration2))
//        println(decoration3.equals(decoration2))

        val d5 = Decoration2("crystal", "wood", "diver")
        println(d5)

        // Assign all properties to variables
        val (rock, wood, diver) = d5
        println(rock)
        println(wood)
        println(diver)

        // Destructure with skip
        val (rockOnly, _, diverOnly) = d5
    }

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}





