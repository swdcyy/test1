package com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNameViewModel$isVip$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import xs2.l;

public final class DecorationNameViewModel$isVip$1 extends Lambda implements p	// class@0015ee
{
    public static final DecorationNameViewModel$isVip$1 INSTANCE;

    static {
       DecorationNameViewModel$isVip$1.INSTANCE = new DecorationNameViewModel$isVip$1();
    }
    public void DecorationNameViewModel$isVip$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0, p1));
    }
    public final boolean invoke(Map p0,Integer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DecorationNameViewModel$isVip$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "decorationInfo");
       l ol = p0.get(p1);
       boolean b = (ol != null)? ol.c(): false;
       return b;
    }
}
