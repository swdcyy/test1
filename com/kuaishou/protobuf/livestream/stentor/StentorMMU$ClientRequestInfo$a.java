package com.kuaishou.protobuf.livestream.stentor.StentorMMU$ClientRequestInfo$a;
import hr4.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$ClientRequestInfo;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class StentorMMU$ClientRequestInfo$a extends GeneratedMessageLite$Builder implements b	// class@000d87
{

    public void StentorMMU$ClientRequestInfo$a(){
       super(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE);
    }
    public void StentorMMU$ClientRequestInfo$a(a p0){
       super(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE);
    }
    public int getAppType(){
       return this.instance.getAppType();
    }
    public String getAppver(){
       return this.instance.getAppver();
    }
    public ByteString getAppverBytes(){
       return this.instance.getAppverBytes();
    }
    public int getClientId(){
       return this.instance.getClientId();
    }
    public String getDeviceId(){
       return this.instance.getDeviceId();
    }
    public ByteString getDeviceIdBytes(){
       return this.instance.getDeviceIdBytes();
    }
    public String getLocale(){
       return this.instance.getLocale();
    }
    public ByteString getLocaleBytes(){
       return this.instance.getLocaleBytes();
    }
    public String getServerInfo(){
       return this.instance.getServerInfo();
    }
    public ByteString getServerInfoBytes(){
       return this.instance.getServerInfoBytes();
    }
    public String getSysver(){
       return this.instance.getSysver();
    }
    public ByteString getSysverBytes(){
       return this.instance.getSysverBytes();
    }
    public long getUserId(){
       return this.instance.getUserId();
    }
}
