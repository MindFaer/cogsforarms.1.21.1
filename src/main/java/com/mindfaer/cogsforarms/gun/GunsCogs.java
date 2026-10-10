package com.mindfaer.cogsforarms.gun;

import io.redspace.irons_artifice.client.sounds.GunShotSoundSettings;
import io.redspace.irons_artifice.data.FireCycleCue;
import io.redspace.irons_artifice.data.FireCycleCueStack;
import io.redspace.irons_artifice.data.FireMode;
import io.redspace.irons_artifice.data.HandOccupancy;
import io.redspace.irons_artifice.data.MuzzleFlashType;
import io.redspace.irons_artifice.data.PlayableSound;
import io.redspace.irons_artifice.data.RecoilProfile;
import io.redspace.irons_artifice.data.ReloadCue;
import io.redspace.irons_artifice.data.ReloadCueStack;
import io.redspace.irons_artifice.data.ShotComponentTemplate;
import io.redspace.irons_artifice.gun.ArmPoseKind;
import io.redspace.irons_artifice.gun.GunProfile;
import io.redspace.irons_artifice.gun.GunState;
import io.redspace.irons_artifice.item.GunItem;
import io.redspace.irons_artifice.registry.SoundRegistry;
import net.minecraft.sounds.SoundEvents;

public final class GunsCogs {
    public static final GunProfile HEXED_HELLBRINGER = GunProfile.builder(5, 6, 35, FireMode.SEMI, ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(13, 1.2, 0.45, 10, RecoilProfile.of(24f, .3f, 2.7f, 465))
                            .projectileCount(3)
                            .bulletSpeedMultiplier(1.35)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot(SoundRegistry.BLACKPOWDER_REVOLVER_SHOOT, 0.5f),
                                    GunShotSoundSettings.standardEcho(SoundRegistry.ARQUEBUS_SHOOT, 0.75f),
                                    PlayableSound.holder(SoundEvents.DISPENSER_FAIL))
                            .build())
            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(0.17f, PlayableSound.of(SoundRegistry.ARQUEBUS_OPEN_BREECH, 1.25f, 0.95f, 1.05f)),
                    new ReloadCue(0.25f, PlayableSound.of(SoundRegistry.CLOCKWORK_RIFLE_EJECT_MAG, 1.25f, 0.95f, 1.05f)),
                    new ReloadCue(0.87f, PlayableSound.of(SoundRegistry.CLOCKWORK_RIFLE_INSERT_MAG, 1.3f, 0.85f, 0.95f)),
                    new ReloadCue(0.29f, PlayableSound.of(SoundRegistry.ARQUEBUS_OPEN_BREECH, 1.3f, 1f, 1.2f))
            ))
            .equipSound(PlayableSound.of(SoundRegistry.ARQUEBUS_EQUIP, 0.75f, 0.95f, 1.05f))
            .occupancy(GunState.FIRE, HandOccupancy.BOTH)
            .build();
}
