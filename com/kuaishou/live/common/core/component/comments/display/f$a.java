package com.kuaishou.live.common.core.component.comments.display.f$a;
import q81.e;
import com.kuaishou.live.common.core.component.comments.display.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import android.view.View;
import com.kuaishou.live.basic.model.QLiveMessage;
import q81.d;
import android.view.MotionEvent;

public class f$a implements e	// class@001074
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       uoa.m = p0;
       if (p0) {
          k1.m(uoa.j);
          f$a ta = this.a;
          ta.p = (long)ta.a.mAutoScrollToBottomDelayTimeMs;
       }
       this.a.a();
       return;
    }
    public boolean b(View p0,QLiveMessage p1,int p2){
       return d.c(this, p0, p1, p2);
    }
    public void c(View p0,QLiveMessage p1,int p2){
       d.a(this, p0, p1, p2);
    }
    public void onDoubleTap(MotionEvent p0){
       d.b(this, p0);
    }
}
