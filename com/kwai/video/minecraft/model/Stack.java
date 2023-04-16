package com.kwai.video.minecraft.model.Stack;
import com.kwai.video.minecraft.model.Composable;
import com.kwai.video.minecraft.model.Item;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.String;

public interface abstract Stack implements Composable, Item	// class@000a21
{

    ImmutableArray children();
    String stackId();
}
