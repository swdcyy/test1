package com.yxcorp.gifshow.profile.http.i;
import qvb.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.profile.http.i$a;
import qvb.q;
import qvb.a;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.yxcorp.gifshow.profile.model.response.PhotoCollectorListResponse;
import wkd.b;
import o3c.l;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.http.h;
import erd.o;
import com.yxcorp.gifshow.profile.http.g;
import erd.g;
import java.util.List;
import la6.b;
import java.util.Iterator;

public class i extends f	// class@001356
{
    public User p;
    public String q;
    public String r;
    public QPhoto s;

    public void i(QPhoto p0){
       super();
       this.h(new i$a(this));
       this.s = p0;
    }
    public t I1(){
       Object[] objArray = null;
       PhotoCollectorListResponse obj = PatchProxy.apply(objArray, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L0();
       Object obj1 = b.a(0x37313f08);
       String photoId = this.s.getPhotoId();
       i tr = this.r;
       i tp = this.p;
       String id = (tp != null)? tp.getId(): this.q;
       String str = id;
       if (!this.K() && obj != null) {
          objArray = obj.getCursor();
       }
       return obj1.s(photoId, 20, tr, str, objArray).map(h.b).doOnNext(new g(this));
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.i2(p0, p1);
    }
    public void h2(){
       int i;
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i = 0;
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          int i1 = i + 1;
          iterator.next().mPosition = i;
          i = i1;
       }
       return;
    }
    public boolean i(){
       return false;
    }
    public void i2(PhotoCollectorListResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       this.h2();
       return;
    }
}
