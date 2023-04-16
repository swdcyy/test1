package com.kuaishou.edit.draft.f;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.EffectSource;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.ColorFilter$ResourceType;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;

public interface abstract f implements MessageLiteOrBuilder	// class@00192f
{

    Attributes getAttributes();
    EffectSource getEffectSource();
    int getEffectSourceValue();
    FeatureId getFeatureId();
    double getIntensity();
    boolean getIsCommonlyUsed();
    boolean getIsReco();
    ColorFilter$ResourceType getResourceType();
    int getResourceTypeValue();
    String getResources(int p0);
    ByteString getResourcesBytes(int p0);
    int getResourcesCount();
    List getResourcesList();
    int getSdkType();
    int getTabId();
    String getTabName();
    ByteString getTabNameBytes();
    boolean hasAttributes();
    boolean hasFeatureId();
}
