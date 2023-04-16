package ced.q0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.plugin.search.result.hashtag.presenters.r;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import o07.o;

public class q0 implements PopupInterface$h	// class@000575
{
    public long b;
    public final r c;

    public void q0(r p0){
       this.c = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "1")) {
          return;
       }
       this.b = System.currentTimeMillis();
       return;
    }
    public void H(c p0,int p1){
       p0.x = null;
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
