public interface IBaseRate {
    // Normally will come from FED or another dev / bank api.
        // We want to IMPLEMENT it from somewhere else.

    // BENCHMARK rate; we will base our rates off of it.
    default double getBaseRate() {
        return 2.5;
    }
}
