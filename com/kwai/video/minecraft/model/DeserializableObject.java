package com.kwai.video.minecraft.model.DeserializableObject;
import com.kwai.video.minecraft.model.ErrorStatus;

public interface abstract DeserializableObject	// class@0009ec
{

    DeserializableObject parseFrom(byte[] p0,ErrorStatus p1);
}
