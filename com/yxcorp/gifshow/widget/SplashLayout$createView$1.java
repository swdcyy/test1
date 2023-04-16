package com.yxcorp.gifshow.widget.SplashLayout$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import tyc.w4;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import ox7.e;
import android.widget.FrameLayout$LayoutParams;
import ox7.e$a;
import com.yxcorp.gifshow.widget.SplashLayout$createView$1$1;
import android.view.ViewGroup$LayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.widget.SplashLayout$createView$1$2;
import android.view.ViewGroup;
import android.view.View;

public final class SplashLayout$createView$1 extends Lambda implements l	// class@0018cb
{
    public final w4 this$0;

    public void SplashLayout$createView$1(w4 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashLayout$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setId(R.id.default_splash_root);
       SplashLayout$createView$1 tthis$0 = this.this$0;
       this.this$0.h1(p0, Integer.valueOf(R.id.center_logo), new AppCompatImageView(p0.getContext()), tthis$0.M0(e$a.b(tthis$0, p0, null, 1, null), SplashLayout$createView$1$1.INSTANCE), SplashLayout$createView$1$2.INSTANCE);
       return;
    }
}
