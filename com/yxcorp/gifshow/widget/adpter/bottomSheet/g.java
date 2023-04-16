package com.yxcorp.gifshow.widget.adpter.bottomSheet.g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$d;
import java.lang.Object;
import lnc.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f;
import android.content.Context;
import android.widget.FrameLayout;

public abstract class g implements PopupInterface$f, f$d	// class@0018f8
{
    public c b;
    public f c;
    public boolean d;
    public int e;
    public boolean f;

    public void g(){
       super();
       this.d = false;
       this.e = a1.d(0x7f070295);
       this.f = true;
    }
    public void A6(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       if (this.b.K() && this.d != null) {
          this.b.o();
       }
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = new f(p1.getContext(), this.c(p0, p1, p2, p3));
       this.c = uof;
       uof.g = this.f;
       uof.d(this);
       this.b = p0;
       f.b(this.c.c()).setPadding(0, 0, 0, this.e);
       return this.c.c();
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.c.a();
       return;
    }
    public abstract View c(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3);
    public void d(int p0){
       this.e = p0;
    }
    public void e(boolean p0){
       this.d = p0;
    }
    public void p1(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.b.o();
       return;
    }
}
