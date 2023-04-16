package com.yxcorp.gifshow.profile.model.response.a;
import erd.o;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import x3c.a;

public class a implements o	// class@0013f2
{
    public int b;
    public int c;
    public int d;

    public void a(int p0){
       super();
       this.c = 1;
       this.d = 1;
       this.b = p0;
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new a(this));
       }
       return ot;
    }
}
