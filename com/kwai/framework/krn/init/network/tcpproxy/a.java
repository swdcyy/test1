package com.kwai.framework.krn.init.network.tcpproxy.a;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.ByteString;
import java.lang.String;
import java.util.List;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method;

public interface abstract a implements MessageLiteOrBuilder	// class@0015f5
{

    ByteString getHttpBody();
    int getHttpCode();
    String getHttpHeaderKeys(int p0);
    ByteString getHttpHeaderKeysBytes(int p0);
    int getHttpHeaderKeysCount();
    List getHttpHeaderKeysList();
    String getHttpHeaderValues(int p0);
    ByteString getHttpHeaderValuesBytes(int p0);
    int getHttpHeaderValuesCount();
    List getHttpHeaderValuesList();
    String getHttpUrl();
    ByteString getHttpUrlBytes();
    KLinkHttp$KlinkHttpPayload$Method getMethod();
    int getMethodValue();
}
