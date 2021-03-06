package de.fhg.iais.roberta.mode.sensor;

import de.fhg.iais.roberta.inter.mode.general.IMode;

public enum ElectricCurrentSensorMode implements IMode {
    VALUE();

    private final String[] values;

    private ElectricCurrentSensorMode(String... values) {
        this.values = values;
    }

    @Override
    public String[] getValues() {
        return this.values;
    }

}