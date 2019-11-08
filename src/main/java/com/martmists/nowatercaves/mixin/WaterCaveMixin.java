package com.martmists.nowatercaves.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.carver.Carver;
import net.minecraft.world.gen.carver.UnderwaterCaveCarver;
import net.minecraft.world.gen.carver.UnderwaterRavineCarver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.BitSet;
import java.util.Random;

@Mixin(UnderwaterCaveCarver.class)
public class WaterCaveMixin {
    @Inject(method = "carveAtPoint", at = @At("HEAD"), cancellable = true)
    static void carveAtPoint(Carver<?> carver_1, Chunk chunk_1, BitSet bitSet_1, Random random_1, BlockPos.Mutable blockPos$Mutable_1, int int_1, int int_2, int int_3, int int_4, int int_5, int int_6, int int_7, int int_8, CallbackInfoReturnable<Boolean> info){
        info.setReturnValue(false);
    }
}
