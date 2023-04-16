package com.kuaishou.protobuf.photo.funnel.MusicStat$c;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract MusicStat$c implements MessageLiteOrBuilder	// class@000e2b
{

    String getLyricDownloadTime();
    ByteString getLyricDownloadTimeBytes();
    boolean getLyricNeedDownload();
    String getMmuDownloadTime();
    ByteString getMmuDownloadTimeBytes();
    boolean getMmuNeedDownload();
    String getMusicDownloadTime();
    ByteString getMusicDownloadTimeBytes();
    String getMusicId();
    ByteString getMusicIdBytes();
    boolean getMusicNeedDownload();
    String getPlayTime();
    ByteString getPlayTimeBytes();
    String getSource();
    ByteString getSourceBytes();
    String getStartTime();
    ByteString getStartTimeBytes();
}
