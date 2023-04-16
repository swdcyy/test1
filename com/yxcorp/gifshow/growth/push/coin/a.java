package com.yxcorp.gifshow.growth.push.coin.a;
import e17.i$e;
import java.lang.Object;
import android.view.View;
import e17.i$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a implements i$e	// class@00149b
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(View p0,i$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "toastView");
       a.p(p1, "<anonymous parameter 1>");
       p0 = p0.findViewById(R.id.toast_icon);
       if (p0 != null) {
          p0.setVisibility(0);
       }
       return;
    }
}
