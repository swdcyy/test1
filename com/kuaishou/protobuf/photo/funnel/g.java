package com.kuaishou.protobuf.photo.funnel.g;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$InfoItem;
import java.util.List;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type;

public interface abstract g implements MessageLiteOrBuilder	// class@000e8a
{

    int getAudioCount();
    boolean getEntranceClick();
    boolean getIsMute();
    SubtitleStat$InfoItem getItems(int p0);
    int getItemsCount();
    List getItemsList();
    long getRecCost();
    long getRemuxCost();
    SubtitleStat$Result getResults(int p0);
    int getResultsCount();
    List getResultsList();
    SubtitleStat$Type getType();
    int getTypeValue();
}
