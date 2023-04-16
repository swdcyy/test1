package com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket$CoverType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class RedPacket$CoverType extends Enum	// class@00101a
{
    public final int mCode;
    public static final RedPacket$CoverType[] $VALUES;
    public static final RedPacket$CoverType NORMAL;
    public static final RedPacket$CoverType PRETTY;
    public static final RedPacket$CoverType UNKNOWN;

    static {
       RedPacket$CoverType uCoverType = new RedPacket$CoverType("UNKNOWN", 0, 0);
       RedPacket$CoverType.UNKNOWN = uCoverType;
       RedPacket$CoverType uCoverType1 = new RedPacket$CoverType("NORMAL", 1, 1);
       RedPacket$CoverType.NORMAL = uCoverType1;
       RedPacket$CoverType uCoverType2 = new RedPacket$CoverType("PRETTY", 2, 2);
       RedPacket$CoverType.PRETTY = uCoverType2;
       RedPacket$CoverType[] uCoverTypeAr = new RedPacket$CoverType[]{uCoverType,uCoverType1,uCoverType2};
       RedPacket$CoverType.$VALUES = uCoverTypeAr;
    }
    public void RedPacket$CoverType(String p0,int p1,int p2){
       super(p0, p1);
       this.mCode = p2;
    }
    public static RedPacket$CoverType codeValueOf(int p0){
       RedPacket$CoverType[] obj;
       object oobject;
       RedPacket$CoverType uCoverType = RedPacket$CoverType.class;
       if (PatchProxy.isSupport(uCoverType)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uCoverType, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = RedPacket$CoverType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return RedPacket$CoverType.NORMAL;
          }
          oobject = obj[i];
          if (oobject.mCode == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static RedPacket$CoverType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RedPacket$CoverType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RedPacket$CoverType.class, p0);
    }
    public static RedPacket$CoverType[] values(){
       Object obj = PatchProxy.apply(null, null, RedPacket$CoverType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedPacket$CoverType.$VALUES.clone();
    }
}
