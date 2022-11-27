class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {

        return !knightIsAwake;

//        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

        return knightIsAwake || archerIsAwake || prisonerIsAwake;

//        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {

        if (archerIsAwake == false && prisonerIsAwake == true) {
            return true;
        } else {
            return false;
        }

//        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

        boolean firstScenario = petDogIsPresent && !archerIsAwake && knightIsAwake; //sleeping archer and present dog
        boolean secondScenario = !petDogIsPresent && !knightIsAwake && !archerIsAwake; // archer and knight sleeping and without the dog
        boolean thirdScenario = !knightIsAwake && !archerIsAwake && !prisonerIsAwake && petDogIsPresent; //everyone sleeping present dog
        boolean fourthScenario = knightIsAwake && !archerIsAwake && !prisonerIsAwake && petDogIsPresent; //just knight awake dog present
        boolean fifthScenario = !knightIsAwake && !archerIsAwake && prisonerIsAwake && petDogIsPresent; //only prisoner awake dog present

        if (firstScenario == true && prisonerIsAwake == true) {
            return true;
        } else if (secondScenario == true && prisonerIsAwake == true) {
            return true;
        } else if (thirdScenario == true) {
            return true;
        } else if (fourthScenario == true) {
            return true;
        } else if (fifthScenario == true) {
            return true;
        } else {
            return false;
        }

//        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
