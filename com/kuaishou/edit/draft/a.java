package com.kuaishou.edit.draft.a;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.AEEffect$AttachType;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId;
import java.util.List;
import com.kuaishou.edit.draft.TimeRange;

public interface abstract a implements MessageLiteOrBuilder	// class@001925
{

    String getAeAssetDir();
    ByteString getAeAssetDirBytes();
    AEEffect$AttachType getAttachType();
    int getAttachTypeValue();
    Attributes getAttributes();
    FeatureId getFeatureId();
    int getFillingMode();
    String getTemplateId();
    ByteString getTemplateIdBytes();
    String getTextPicturePath(int p0);
    ByteString getTextPicturePathBytes(int p0);
    int getTextPicturePathCount();
    List getTextPicturePathList();
    String getTexts(int p0);
    ByteString getTextsBytes(int p0);
    int getTextsCount();
    List getTextsList();
    TimeRange getTimeRange();
    int getZIndex();
    boolean hasAttributes();
    boolean hasFeatureId();
    boolean hasTimeRange();
}
