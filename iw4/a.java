package iw4.a;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.share.ElementPackage;
import com.kuaishou.share.SDKConfigPackage;

public interface abstract a implements MessageLiteOrBuilder	// class@00250b
{

    String getAppInfo();
    ByteString getAppInfoBytes();
    String getClientTimeStamp();
    ByteString getClientTimeStampBytes();
    String getSessionId();
    ByteString getSessionIdBytes();
    ElementPackage getShareElementPackage();
    SDKConfigPackage getShareSDKConfigPackage();
    String getUserId();
    ByteString getUserIdBytes();
    boolean hasShareElementPackage();
    boolean hasShareSDKConfigPackage();
}
