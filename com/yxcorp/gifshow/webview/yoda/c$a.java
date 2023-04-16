package com.yxcorp.gifshow.webview.yoda.c$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.webview.yoda.c;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ez7.b;

public class c$a implements PopupInterface$h	// class@0017a9
{
    public final ValueCallback b;
    public final c c;

    public void c$a(c p0,ValueCallback p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1 != 1) {
          if (p1 == 2) {
             this.b.onReceiveValue(this.c.j("mask"));
          }
       }else {
          this.b.onReceiveValue(this.c.j("back"));
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
