package com.kwai.video.ksuploaderkit.apicenter.ServerAddress$AddressType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ServerAddress$AddressType extends Enum	// class@00099d
{
    public static final ServerAddress$AddressType[] $VALUES;
    public static final ServerAddress$AddressType Normal;
    public static final ServerAddress$AddressType Resume;

    static {
       ServerAddress$AddressType uAddressType = new ServerAddress$AddressType("Normal", 0);
       ServerAddress$AddressType.Normal = uAddressType;
       ServerAddress$AddressType uAddressType1 = new ServerAddress$AddressType("Resume", 1);
       ServerAddress$AddressType.Resume = uAddressType1;
       ServerAddress$AddressType[] uAddressType2 = new ServerAddress$AddressType[]{uAddressType,uAddressType1};
       ServerAddress$AddressType.$VALUES = uAddressType2;
    }
    public void ServerAddress$AddressType(String p0,int p1){
       super(p0, p1);
    }
    public static ServerAddress$AddressType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ServerAddress$AddressType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ServerAddress$AddressType.class, p0);
    }
    public static ServerAddress$AddressType[] values(){
       Object obj = PatchProxy.apply(null, null, ServerAddress$AddressType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServerAddress$AddressType.$VALUES.clone();
    }
}
