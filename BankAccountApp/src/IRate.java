public interface IRate {

    // write a method to returns the base rate
    default double getBaseRate() {
        return 2.5;
    }

}
