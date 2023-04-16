package com.yxcorp.gifshow.photo.download.task.f$b;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.f;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.video.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.photo.download.task.j;

public class f$b implements o	// class@000ef9
{
    public final float b;
    public final f c;

    public void f$b(f p0,float p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, f$b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = qa.s(d.class, LoadPolicy.SILENT_IMMEDIATE).G(d.c).w(new j(this, p0, this.b));
       }
       return ot;
    }
}
