package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.a;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import psb.e;
import psb.f;
import qvb.n0;
import com.kuaishou.android.post.vote.model.VoteDetailItem;
import cjd.e;
import erd.o;
import wtc.c;

public class a extends f	// class@0012d0
{
    public String p;
    public String q;

    public void a(String p0,String p1){
       super();
       this.p = p0;
       this.q = p1;
    }
    public t I1(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.a();
       a tp = this.p;
       a tq = this.q;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.g(tp, tq, objArray, 20).map(new e()).map(new c(this));
    }
}
