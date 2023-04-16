package com.kwai.video.westeros.models.ARConfigOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract ARConfigOrBuilder implements MessageLiteOrBuilder	// class@000e90
{

    String getArMeshType();
    ByteString getArMeshTypeBytes();
    boolean getRequireDepthData();
    boolean getRequireMeshData();
    boolean getRequirePersonMask();
    boolean getUseSystemAr();
}
