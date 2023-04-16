package com.yxcorp.gifshow.helper.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qra.s;
import java.lang.Runnable;
import t45.c;

public final class i	// class@00163a
{

    public void i(){
       super();
    }
    public static void a(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, oi, "1")) {
          return;
       }
       c.a(new s(p0));
       return;
    }
}
