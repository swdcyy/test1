package com.kuaishou.protobuf.photo.funnel.b;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem;
import java.util.List;

public interface abstract b implements MessageLiteOrBuilder	// class@000e85
{

    BodyStat$BodyItem getItem(int p0);
    int getItemCount();
    List getItemList();
}
