package com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNameViewModel$displayName$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Integer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import xs2.l;
import lnc.a1;

public final class DecorationNameViewModel$displayName$1 extends Lambda implements p	// class@0015ed
{
    public static final DecorationNameViewModel$displayName$1 INSTANCE;

    static {
       DecorationNameViewModel$displayName$1.INSTANCE = new DecorationNameViewModel$displayName$1();
    }
    public void DecorationNameViewModel$displayName$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final String invoke(Map p0,Integer p1){
       String str;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DecorationNameViewModel$displayName$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "decorationInfo");
       l ol = p0.get(p1);
       if (ol != null) {
          str = (ol.c())? a1.p(R.string.arg_RES_7f102e35): ol.a();
          if (str != null) {
          label_0033 :
             return str;
          }
       }
       str = "";
       goto label_0033 ;
    }
}
