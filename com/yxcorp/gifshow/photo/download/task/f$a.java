package com.yxcorp.gifshow.photo.download.task.f$a;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.f;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import ywb.f;
import ixb.f;
import io.reactivex.g;
import ixb.g;
import erd.a;

public class f$a implements o	// class@000ef8
{
    public final float b;
    public final f c;

    public void f$a(f p0,float p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, f$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          f uof = new f();
          ot = t.create(new f(this, uof, p0, this.b)).doOnDispose(new g(this, uof));
       }
       return ot;
    }
}
