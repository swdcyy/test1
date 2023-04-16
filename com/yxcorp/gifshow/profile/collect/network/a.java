package com.yxcorp.gifshow.profile.collect.network.a;
import o3c.p;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import k2c.a;
import qvb.n0;
import com.yxcorp.gifshow.profile.collect.model.response.CollectionPOIResponse;
import cjd.e;
import erd.o;
import n2c.a;
import erd.g;
import n2c.b;

public class a extends p	// class@0012ce
{
    public final String p;

    public void a(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x79c94a4a);
       a tp = this.p;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.g(tp, "poi", objArray, 20).map(new e()).doOnNext(new a(this)).doOnError(new b(this));
    }
}
