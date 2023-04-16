package com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$bindAvatar$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import zu2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wb5.i;
import java.lang.Integer;

public final class KwaiImageViewBinderKt$bindAvatar$3 extends Lambda implements l	// class@00188d
{
    public static final KwaiImageViewBinderKt$bindAvatar$3 INSTANCE;

    static {
       KwaiImageViewBinderKt$bindAvatar$3.INSTANCE = new KwaiImageViewBinderKt$bindAvatar$3();
    }
    public void KwaiImageViewBinderKt$bindAvatar$3(){
       super(1);
    }
    public final int invoke(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiImageViewBinderKt$bindAvatar$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0 != null)? 0x7f08069a: 0;
       return i;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
