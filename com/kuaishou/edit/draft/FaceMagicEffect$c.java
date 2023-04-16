package com.kuaishou.edit.draft.FaceMagicEffect$c;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$CheckMd5;
import java.util.List;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Url;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$PassThroughParams;

public interface abstract FaceMagicEffect$c implements MessageLiteOrBuilder	// class@00179e
{

    FaceMagicEffect$Extra$CheckMd5 getCheckMd5(int p0);
    int getCheckMd5Count();
    List getCheckMd5List();
    long getCheckSum();
    String getId();
    ByteString getIdBytes();
    Url getImage(int p0);
    int getImageCount();
    List getImageList();
    String getName();
    ByteString getNameBytes();
    FaceMagicEffect$Extra$PassThroughParams getPassThroughParams();
    Url getResource(int p0);
    int getResourceCount();
    List getResourceList();
    int getResourceType();
    String getTag();
    ByteString getTagBytes();
    String getTopic();
    ByteString getTopicBytes();
    int getVersion();
    boolean hasPassThroughParams();
}
