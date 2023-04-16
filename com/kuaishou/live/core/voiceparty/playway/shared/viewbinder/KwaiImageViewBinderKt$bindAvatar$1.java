package com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$bindAvatar$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import zu2.b;
import zu2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KwaiImageViewBinderKt$bindAvatar$1 extends Lambda implements p	// class@00188b
{
    public static final KwaiImageViewBinderKt$bindAvatar$1 INSTANCE;

    static {
       KwaiImageViewBinderKt$bindAvatar$1.INSTANCE = new KwaiImageViewBinderKt$bindAvatar$1();
    }
    public void KwaiImageViewBinderKt$bindAvatar$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final a invoke(View p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KwaiImageViewBinderKt$bindAvatar$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       a.m(p1);
       return new a(p0, p1);
    }
}
