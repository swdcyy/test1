package com.yxcorp.gifshow.share.history.g;
import qvb.f;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import com.yxcorp.gifshow.share.model.ShareHistoryResponse;
import com.yxcorp.gifshow.share.l;
import java.lang.Long;
import wkd.b;
import fic.a;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.share.history.g$a;
import erd.g;
import java.util.List;
import la6.b;

public class g extends f	// class@001bb5
{
    public List p;
    public String q;
    public int r;

    public void g(int p0){
       super();
       this.r = p0;
    }
    public t I1(){
       t ot;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, g.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       long l = (long)this.r;
       obj = (!this.K() && this.L0() != null)? this.L0().getCursor(): objArray;
       if (PatchProxy.isSupport(l.class)) {
          ot = PatchProxy.applyTwoRefs(Long.valueOf(l), obj, objArray, l.class, "6");
          if (ot != patchProxyRe) {
          label_004f :
             return ot.map(new e()).doOnNext(new g$a(this));
          }
       }
       ot = b.a(-586496146).d(l, obj);
       goto label_004f ;
    }
    public void M1(Object p0,List p1){
       this.j2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.j2(p0, p1);
    }
    public List h2(){
       return this.p;
    }
    public String i2(){
       return this.q;
    }
    public void j2(ShareHistoryResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       this.q = p0.getTitle();
       this.p = p0.getRecoItems();
       return;
    }
}
