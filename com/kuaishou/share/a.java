package com.kuaishou.share.a;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.share.ElementPackage$ResultStatus;

public interface abstract a implements MessageLiteOrBuilder	// class@000f2d
{

    String getBusinessInfo();
    ByteString getBusinessInfoBytes();
    String getErrorCode();
    ByteString getErrorCodeBytes();
    String getErrorMessage();
    ByteString getErrorMessageBytes();
    String getShareActionKey();
    ByteString getShareActionKeyBytes();
    String getShareContent();
    ByteString getShareContentBytes();
    String getShareContentId();
    ByteString getShareContentIdBytes();
    String getShareId();
    ByteString getShareIdBytes();
    String getShareMethod();
    ByteString getShareMethodBytes();
    String getShareMode();
    ByteString getShareModeBytes();
    ElementPackage$ResultStatus getShareResult();
    int getShareResultValue();
    String getSubBiz();
    ByteString getSubBizBytes();
}
