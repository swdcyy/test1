package com.kuaishou.merchant.api.live.sandeabiz.SandeaBizType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SandeaBizType extends Enum	// class@001570
{
    public static final SandeaBizType[] $VALUES;
    public static final SandeaBizType AUCTION;
    public static final SandeaBizType SANDEAGO;
    public static final SandeaBizType SANDEAPY;

    static {
       SandeaBizType sandeaBizTyp = new SandeaBizType("SANDEAGO", 0);
       SandeaBizType.SANDEAGO = sandeaBizTyp;
       SandeaBizType sandeaBizTyp1 = new SandeaBizType("SANDEAPY", 1);
       SandeaBizType.SANDEAPY = sandeaBizTyp1;
       SandeaBizType sandeaBizTyp2 = new SandeaBizType("AUCTION", 2);
       SandeaBizType.AUCTION = sandeaBizTyp2;
       SandeaBizType[] sandeaBizTyp3 = new SandeaBizType[]{sandeaBizTyp,sandeaBizTyp1,sandeaBizTyp2};
       SandeaBizType.$VALUES = sandeaBizTyp3;
    }
    public void SandeaBizType(String p0,int p1){
       super(p0, p1);
    }
    public static SandeaBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SandeaBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SandeaBizType.class, p0);
    }
    public static SandeaBizType[] values(){
       Object obj = PatchProxy.apply(null, null, SandeaBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SandeaBizType.$VALUES.clone();
    }
}
