package com.kwai.nearby.slidedetail.RealShowActual;
import java.lang.Enum;
import com.yxcorp.gifshow.action.RealActionBizType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.Boolean;

public final class RealShowActual extends Enum	// class@001018
{
    public final String mActualKey;
    public final String mBizType;
    public final String mPage;
    public static final RealShowActual[] $VALUES;
    public static final RealShowActual LOCAL;

    static {
       RealShowActual realShowActu = new RealShowActual("LOCAL", 0, "STREAM_LOCAL", RealActionBizType.LOCAL.bizType(), "nearby");
       RealShowActual.LOCAL = v6;
       RealShowActual[] realShowActu1 = new RealShowActual[]{v6};
       RealShowActual.$VALUES = realShowActu1;
    }
    public void RealShowActual(String p0,int p1,String p2,String p3,String p4){
       super(p0, p1);
       this.mActualKey = p2;
       this.mBizType = p3;
       this.mPage = p4;
    }
    public static RealShowActual getRealShowActualBySourcePage(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RealShowActual.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       if (p0.equals("nearby")) {
          return RealShowActual.LOCAL;
       }
       throw new IllegalArgumentException("不存在的SourcePage实时行为上报");
    }
    public static boolean isContainPage(String p0){
       RealShowActual[] obj = PatchProxy.applyOneRefs(p0, null, RealShowActual.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = RealShowActual.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if ((obj[i].mPage).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static RealShowActual valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RealShowActual.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RealShowActual.class, p0);
    }
    public static RealShowActual[] values(){
       Object obj = PatchProxy.apply(null, null, RealShowActual.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RealShowActual.$VALUES.clone();
    }
}
