package com.mindfaer.cogsforarms.modifier;

import io.redspace.irons_artifice.data.ShotComponents;
import io.redspace.irons_artifice.data.ValueModifier;
import io.redspace.irons_artifice.modifier.ValueStackModifier;

import java.util.Map;

public class LightweightCoreModifier extends ValueStackModifier {
    public LightweightCoreModifier() {
        super(Map.of(
                ShotComponents.BULLET_SPEED, new ValueModifier(0.30, ValueModifier.Operation.MULTIPLY_TOTAL, ValueModifier.Type.BENEFICIAL),
                ShotComponents.CAMERA_RECOIL_MULTIPLIER, new ValueModifier(-0.15, ValueModifier.Operation.MULTIPLY_TOTAL, ValueModifier.Type.HARMFUL),
                ShotComponents.DAMAGE, new ValueModifier(-0.1, ValueModifier.Operation.MULTIPLY_TOTAL, ValueModifier.Type.BENEFICIAL)
        ));
    }
}
