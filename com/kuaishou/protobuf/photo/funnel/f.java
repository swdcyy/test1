package com.kuaishou.protobuf.photo.funnel.f;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.StickerStat$StickerItem;
import java.util.List;

public interface abstract f implements MessageLiteOrBuilder	// class@000e89
{

    StickerStat$StickerItem getItem(int p0);
    int getItemCount();
    List getItemList();
}
