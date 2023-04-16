package com.yxcorp.gifshow.photo.download.task.d;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.f;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import r16.f;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import ixb.e;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;

public final class d implements o	// class@000ef3
{
    public final f b;
    public final File c;
    public final String d;

    public void d(f p0,File p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       t ot = PatchProxy.applyThreeRefs(tc, td, p0, tb, f.class, "6");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new e(tb, tc, td, p0)).subscribeOn(d.c);
       }
       return ot;
    }
}
