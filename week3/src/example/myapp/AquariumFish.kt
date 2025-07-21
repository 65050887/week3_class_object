package example.myapp

abstract  class AquariumFish {
    abstract  val color: String

//    class Shark: AquariumFish() {
//        override val color = "grey"
//    }
//
//    class Plecostomus: AquariumFish() {
//        override val color = "gold"
//    }

//    class Shark: AquariumFish(), FishAction {
//        override val color = "grey"
//        override fun eat() {
//            println("hunt and eat fish")
//        }
//    }

//    class Plecostomus: AquariumFish(), FishAction {
//        override val color = "gold"
//        override fun eat() {
//            println("eat algae")
//        }
//    }

    class Shark: FishAction, FishColor {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

    class Plecostomus: FishAction, FishColor {
        override val color = "gold"
        override fun eat() {
            println("eat algae")
        }
    }
}

interface FishAction {
    fun eat()
}
//    abstract class AquariumFish : FishAction {
//        abstract val color: String
//        override fun eat() = println("yum")
//    }

interface FishColor {
    val color: String
}

//class  Plecostomus(fishColor : FishColor = GoldColor): FishAction, FishColor by fishColor{
//    // override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}

class  Plecostomus(fishColor : FishColor = GoldColor): FishAction by PrintingFishAction("eat alage"), FishColor by fishColor {
    // override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}


