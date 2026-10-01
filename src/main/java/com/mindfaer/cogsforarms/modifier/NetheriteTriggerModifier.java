package com.mindfaer.cogsforarms.modifier;

import io.redspace.irons_artifice.data.ShotComponents;
import io.redspace.irons_artifice.data.ValueModifier;
import io.redspace.irons_artifice.modifier.ValueStackModifier;

import java.util.Map;

public class NetheriteTriggerModifier extends ValueStackModifier {
    public NetheriteTriggerModifier() {
        super(Map.of(
                ShotComponents.FIRE_RATE, new ValueModifier(-0.10, ValueModifier.Operation.MULTIPLY_TOTAL, ValueModifier.Type.BENEFICIAL),
                ShotComponents.DAMAGE, new ValueModifier(0.40, ValueModifier.Operation.MULTIPLY_TOTAL, ValueModifier.Type.BENEFICIAL),
                ShotComponents.SPREAD, new ValueModifier(-1, ValueModifier.Operation.ADD, ValueModifier.Type.HARMFUL)
        ));
    }
}
