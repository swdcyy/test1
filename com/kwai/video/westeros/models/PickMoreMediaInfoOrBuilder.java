package com.kwai.video.westeros.models.PickMoreMediaInfoOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.EmbeddedPickingMedia;
import java.util.List;
import com.kwai.video.westeros.models.PickMediaInfo;
import com.kwai.video.westeros.models.PickMediaServerInfo;

public interface abstract PickMoreMediaInfoOrBuilder implements MessageLiteOrBuilder	// class@000ffa
{

    EmbeddedPickingMedia getDefaultInfo(int p0);
    int getDefaultInfoCount();
    List getDefaultInfoList();
    PickMediaInfo getMediaInfo(int p0);
    int getMediaInfoCount();
    List getMediaInfoList();
    int getMinMediaNum();
    boolean getNeedUploadCustomResource();
    boolean getRequireFacialReco();
    PickMediaServerInfo getServiceInfo(int p0);
    int getServiceInfoCount();
    List getServiceInfoList();
}
