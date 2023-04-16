package com.kuaishou.edit.draft.d;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Attributes;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.EffectSource;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Beauty$Item;
import java.util.List;

public interface abstract d implements MessageLiteOrBuilder	// class@00192b
{

    Attributes getAttributes();
    String getBrightItem();
    ByteString getBrightItemBytes();
    EffectSource getEffectSource();
    int getEffectSourceValue();
    FeatureId getFeatureId();
    boolean getIsAiBeauty();
    Beauty$Item getItem(int p0);
    int getItemCount();
    List getItemList();
    boolean hasAttributes();
    boolean hasFeatureId();
}
