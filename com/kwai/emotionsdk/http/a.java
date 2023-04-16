package com.kwai.emotionsdk.http.a;
import erd.o;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import lk5.e;

public class a implements o	// class@000daf
{
    public int b;
    public int c;
    public static final String d = "a";

    public void a(){
       super();
       this.b = 5;
       this.c = 1;
    }
    public void a(int p0){
       super();
       this.b = 5;
       this.c = 1;
       this.b = p0;
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new e(this));
       }
       return ot;
    }
}
