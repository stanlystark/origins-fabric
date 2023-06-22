package io.github.apace100.origins.mixin;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.gui.tooltip.TooltipPositioner;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.List;

@Mixin(DrawContext.class)
public interface DrawContextInvoker {

    @Invoker("drawTooltip")
    void invokeRenderTooltipFromComponents(TextRenderer matrices, List<TooltipComponent> components, int x, int y, TooltipPositioner positioner);

    @Mutable
    @Accessor("matrices")
    void setMatrices(MatrixStack matrices);
}
