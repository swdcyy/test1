package com.kuaishou.protobuf.photo.funnel.d;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.MusicStat$Download;
import java.util.List;
import com.kuaishou.protobuf.photo.funnel.MusicStat$ItemClick;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract d implements MessageLiteOrBuilder	// class@000e87
{

    MusicStat$Download getDownloads(int p0);
    int getDownloadsCount();
    List getDownloadsList();
    MusicStat$ItemClick getItemClicks(int p0);
    int getItemClicksCount();
    List getItemClicksList();
    String getLibClickTime();
    ByteString getLibClickTimeBytes();
    String getLibDataFinishTime();
    ByteString getLibDataFinishTimeBytes();
    String getLibShowTime();
    ByteString getLibShowTimeBytes();
    String getLibanOpCerateTime();
    ByteString getLibanOpCerateTimeBytes();
}
