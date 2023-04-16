package com.yxcorp.gifshow.photoad.f;
import mxb.z0;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import mxb.j;
import vq4.c;
import brd.a0;
import java.lang.Integer;
import mxb.z;
import erd.o;

public class f extends z0	// class@000f8c
{

    public void f(BaseFeed p0){
       super(p0);
    }
    public int e(){
       int i;
       c obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.d;
       if (obj == null) {
          i = super.e();
       }
       return i;
    }
    public a0 j(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.k();
       return a0.B(this.a).C(new z(this, p0));
    }
}
