package com.yxcorp.gifshow.photo.download.task.p0;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.n0;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.photo.download.task.o0;
import io.reactivex.g;

public class p0 implements o	// class@000f12
{
    public final n0 b;

    public void p0(n0 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, p0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new o0(this, p0));
       }
       return ot;
    }
}
