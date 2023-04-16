package com.kwai.live.gzone.widget.b;
import com.kwai.live.gzone.widget.e;
import android.app.Activity;
import com.kwai.live.gzone.widget.e$a;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import f37.o0;
import android.widget.FrameLayout;
import ag6.a;
import com.kwai.live.gzone.promotion.j;

public abstract class b extends e	// class@000e8b
{
    public View x;
    public ViewGroup y;

    public void b(Activity p0){
       super(p0);
    }
    public void b(e$a p0){
       super(p0);
       this.p.a0(true);
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (this.l0()) {
          this.h0(this.x);
          if (this.y.getLayoutParams() instanceof FrameLayout$LayoutParams) {
             this.y.getLayoutParams().gravity = 85;
             b uob = -2;
             if (this.x.getLayoutParams().height == -1 || this.x.getLayoutParams().height == uob) {
                this.y.getLayoutParams().height = this.x.getLayoutParams().height;
             }
             if (this.x.getLayoutParams().width == -1 || this.x.getLayoutParams().width == uob) {
                this.y.getLayoutParams().width = this.x.getLayoutParams().width;
             }
          }
       }
       super.O(p0);
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       FrameLayout obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.l0()) {
          return super.a(p0, p1, p2, p3);
       }
       this.s = p2;
       Context uContext = o0.d(p1.getContext(), 0);
       p1 = p1.cloneInContext(uContext);
       obj = new FrameLayout(uContext);
       this.y = obj;
       obj.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       View view = a.c(p1, this.d0(), p2, 0);
       this.x = view;
       this.y.addView(view);
       return this.y;
    }
    public boolean l0(){
       return this instanceof j;
    }
    public Context m0(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l0()) {
          return this.y.getContext();
       }
       return this.u();
    }
}
