package com.yxcorp.gifshow.postentrance.bubblev2.presenter.a;
import erd.o;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import a0c.c;
import jd.c;
import brd.t;

public final class a implements o	// class@00102e
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "file");
          ot = c.b.c(p0, null);
       }
       return ot;
    }
}
