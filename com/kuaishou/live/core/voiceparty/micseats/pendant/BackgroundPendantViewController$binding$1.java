package com.kuaishou.live.core.voiceparty.micseats.pendant.BackgroundPendantViewController$binding$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.Integer;

public final class BackgroundPendantViewController$binding$1 extends Lambda implements l	// class@0015d9
{
    public static final BackgroundPendantViewController$binding$1 INSTANCE;

    static {
       BackgroundPendantViewController$binding$1.INSTANCE = new BackgroundPendantViewController$binding$1();
    }
    public void BackgroundPendantViewController$binding$1(){
       super(1);
    }
    public final int invoke(Boolean p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, BackgroundPendantViewController$binding$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.g(p0, Boolean.FALSE)) {
          i = 0x7f0605f1;
       }else if(a.g(p0, Boolean.TRUE) && !SystemUtil.a(21)){
          i = 0x7f060c92;
       }else {
          i = 0;
       }
       return i;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
