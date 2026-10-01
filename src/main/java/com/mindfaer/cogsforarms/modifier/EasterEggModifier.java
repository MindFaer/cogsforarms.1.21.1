package com.mindfaer.cogsforarms.modifier;

import io.redspace.irons_artifice.data.ShotComponents;
import io.redspace.irons_artifice.data.ValueModifier;
import io.redspace.irons_artifice.modifier.ValueStackModifier;
import net.minecraft.network.chat.Component;

import java.util.Map;
import java.util.function.Consumer;

public class EasterEggModifier extends ValueStackModifier {
    public EasterEggModifier() {
        super(Map.of(
                ShotComponents.PROJECTILE_COUNT, new ValueModifier(1, ValueModifier.Operation.ADD, ValueModifier.Type.BENEFICIAL)
        ));
    }
}
