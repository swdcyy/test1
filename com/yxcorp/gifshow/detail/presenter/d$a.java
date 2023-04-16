package com.yxcorp.gifshow.detail.presenter.d$a;
import d6a.a;
import com.yxcorp.gifshow.detail.presenter.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.debugview.XfDebugInfoView;
import android.widget.FrameLayout;
import java.util.Objects;
import com.yxcorp.gifshow.debugview.XfDebugInfoView$a;
import java.lang.System;

public class d$a extends a	// class@0016d2
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "3")) {
          return;
       }
       this.b.p.b();
       this.b.p.setVisibility(8);
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$a.class, "1")) {
          return;
       }
       this.b.p.setVisibility(0);
       d$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "7")) {
          tb.p.b();
          tb.p.setOnPageSelectListener(tb.B);
          tb.p.a("»ù");
          tb.p.a("µ÷");
          tb.p.a("Íø");
       }
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       this.b.w = System.currentTimeMillis();
       return;
    }
}
