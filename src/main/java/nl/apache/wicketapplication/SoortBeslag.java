package nl.apache.wicketapplication;

import java.io.Serializable;

public class SoortBeslag implements Serializable {
    private BeslagType soortBeslag;

    public SoortBeslag(BeslagType soortBeslag) {
        this.soortBeslag = soortBeslag;
    }

    public String getSoortBeslag() {
        return soortBeslag.toString();
    }

    public void setSoortBeslag(BeslagType soortBeslag) {
        this.soortBeslag = soortBeslag;
    }
}

