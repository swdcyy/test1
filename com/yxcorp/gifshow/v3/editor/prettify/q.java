package com.yxcorp.gifshow.v3.editor.prettify.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rsc.g;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import boc.b;

public abstract class q extends PresenterV2	// class@00119e
{
    public n$c p;

    public void q(){
       super();
    }
    public void E8(){
       q oq = q.class;
       if (PatchProxy.applyVoid(null, this, oq, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, oq, "3")) {
          g og = new g(this);
          this.p = og;
          n.a(og);
       }
       return;
    }
    public void J8(){
       q oq = q.class;
       if (PatchProxy.applyVoid(null, this, oq, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, oq, "4")) {
          oq = this.p;
          if (oq != null) {
             n.w(oq);
          }
       }
       return;
    }
    public abstract void P8(b p0);
}
