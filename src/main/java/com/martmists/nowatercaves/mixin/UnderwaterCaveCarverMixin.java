package com.martmists.nowatercaves.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.carver.Carver;
import net.minecraft.world.gen.carver.UnderwaterCaveCarver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.BitSet;
import java.util.Random;

@Mixin(UnderwaterCaveCarver.class)
public class UnderwaterCaveCarverMixin {
    @Inject(method = "carveAtPoint(Lnet/minecraft/world/gen/carver/Carver;Lnet/minecraft/world/chunk/Chunk;Ljava/util/BitSet;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos$Mutable;IIIIIIII)Z", at = @At("HEAD"), cancellable = true)
    private static void carveAtPoint(Carver<?> carver, Chunk chunk, BitSet mask, Random random, BlockPos.Mutable pos, int seaLevel, int mainChunkX, int mainChunkZ, int x, int z, int relativeX, int y, int relativeZ, CallbackInfoReturnable<Boolean> info){
        info.setReturnValue(false);
    }
}
