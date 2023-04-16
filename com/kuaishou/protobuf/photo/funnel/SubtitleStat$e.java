package com.kuaishou.protobuf.photo.funnel.SubtitleStat$e;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo;
import java.util.List;

public interface abstract SubtitleStat$e implements MessageLiteOrBuilder	// class@000e76
{

    String getFileKey();
    ByteString getFileKeyBytes();
    SubtitleStat$RecInfo getInfo(int p0);
    int getInfoCount();
    List getInfoList();
    int getStatus();
}
