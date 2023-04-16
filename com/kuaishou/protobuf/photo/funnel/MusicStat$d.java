package com.kuaishou.protobuf.photo.funnel.MusicStat$d;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract MusicStat$d implements MessageLiteOrBuilder	// class@000e2c
{

    String getClickTime();
    ByteString getClickTimeBytes();
    String getDownloadFinishTime();
    ByteString getDownloadFinishTimeBytes();
    String getMusicId();
    ByteString getMusicIdBytes();
    boolean getNeedDownload();
    String getPlayTime();
    ByteString getPlayTimeBytes();
    String getSource();
    ByteString getSourceBytes();
    int getStatus();
}
