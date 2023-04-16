package com.yxcorp.gifshow.profile.collect.network.c;
import o3c.p;
import com.yxcorp.gifshow.profile.collect.network.b;
import java.util.List;
import qvb.a;
import java.lang.Object;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import k2c.a;
import cjd.e;
import erd.o;
import n2c.e;
import erd.g;
import n2c.f;
import la6.b;
import qvb.f;
import qk.g0;
import b06.d;
import com.yxcorp.gifshow.entity.QPhoto;

public class c extends p	// class@0012d0
{
    public final String p;

    public void c(b p0){
       super();
       this.p = p0.p;
       this.b(p0.getItems());
       this.S1(p0.L0());
    }
    public void c(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x79c94a4a);
       c tp = this.p;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.c(tp, "serial", objArray, 20).map(new e()).doOnNext(new e(this)).doOnError(new f(this));
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (list != PatchProxyResult.class) {
       }else {
          list = super.W1(p0, p1);
          if (list != null) {
             d.f(list);
          }
       }
       return list;
    }
    public void d2(b p0,List p1){
       this.i2(p0, p1);
    }
    public void i2(ProfileFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       List items = p0.getItems();
       if (items == null) {
          return;
       }
       int i = 0;
       int i1 = (this.K())? 0: p1.size();
       while (i < items.size()) {
          int i2 = i + i1;
          items.get(i).setPosition(i2);
          i = i + 1;
       }
       super.d2(p0, p1);
       return;
    }
}
