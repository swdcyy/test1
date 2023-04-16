package com.yxcorp.gifshow.detail.fragments.milano.presenter.c$c;
import tw6.e;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.yxcorp.utility.n;

public class c$c implements e	// class@00151d
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       if (!this.a.B.getVisibility()) {
          c$c ta = this.a;
          ta.M = true;
          n.Y(ta.B, 8, false);
       }
       return;
    }
    public void b(int p0){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       c$c ta = this.a;
       if (ta.M != null) {
          ta.M = false;
          n.Y(ta.B, false, false);
       }
       return;
    }
}
