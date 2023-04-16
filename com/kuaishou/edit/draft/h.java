package com.kuaishou.edit.draft.h;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;

public interface abstract h implements MessageLiteOrBuilder	// class@001931
{

    String getAssetDir();
    ByteString getAssetDirBytes();
    Attributes getAttributes();
    FaceMagicEffect$Extra getExtra();
    FeatureId getFeatureId();
    TimeRange getRange();
    FaceMagicEffect$Type getType();
    int getTypeValue();
    boolean hasAttributes();
    boolean hasExtra();
    boolean hasFeatureId();
    boolean hasRange();
}
