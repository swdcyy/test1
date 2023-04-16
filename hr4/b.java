package hr4.b;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract b implements MessageLiteOrBuilder	// class@0023ba
{

    int getAppType();
    String getAppver();
    ByteString getAppverBytes();
    int getClientId();
    String getDeviceId();
    ByteString getDeviceIdBytes();
    String getLocale();
    ByteString getLocaleBytes();
    String getServerInfo();
    ByteString getServerInfoBytes();
    String getSysver();
    ByteString getSysverBytes();
    long getUserId();
}
