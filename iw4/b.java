package iw4.b;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract b implements MessageLiteOrBuilder	// class@00250c
{

    String getAppVersion();
    ByteString getAppVersionBytes();
    String getDeviceId();
    ByteString getDeviceIdBytes();
    String getGlobalId();
    ByteString getGlobalIdBytes();
    String getKpf();
    ByteString getKpfBytes();
    String getKpn();
    ByteString getKpnBytes();
    String getSdkVersion();
    ByteString getSdkVersionBytes();
}
