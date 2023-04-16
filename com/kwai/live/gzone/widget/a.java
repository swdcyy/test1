package com.kwai.live.gzone.widget.a;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import u37.d;
import u37.e;
import w77.c;
import brd.x;
import cjd.e;
import erd.o;
import java.lang.Number;
import java.util.Random;

public class a	// class@000e8a
{

    public void a(){
       super();
    }
    public static t a(String p0,String p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return e.b().s(p0, String.valueOf(p1)).compose(new c(p2)).map(new e());
    }
    public static int b(int p0){
       Random obj;
       int i;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = null;
       if (p0 > 0) {
          i = new Random().nextInt(p0);
       }
       return i;
    }
}
