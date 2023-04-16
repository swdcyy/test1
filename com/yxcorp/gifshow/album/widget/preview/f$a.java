package com.yxcorp.gifshow.album.widget.preview.f$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.album.widget.preview.f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.RelativeLayout;

public class f$a implements PopupInterface$h	// class@001b38
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, f$a.class, "1")) {
          return;
       }
       f$a tb = this.b;
       tb.i = null;
       f c = tb.c;
       if (c != null) {
          c.setVisibility(8);
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
