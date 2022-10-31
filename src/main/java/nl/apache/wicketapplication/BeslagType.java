package nl.apache.wicketapplication;

public enum BeslagType {
    EERDER("eerder"), NIEUW("Nieuw");

    private final String soortBeslag;

    BeslagType(String soortBeslag) {
        this.soortBeslag = soortBeslag;
    }

    public String getSoortBeslag() {
        return this.soortBeslag;
    }
}
