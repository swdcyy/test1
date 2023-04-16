package com.yxcorp.gifshow.detail.util.e;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.detail.util.e$b;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.util.e$a;
import com.yxcorp.gifshow.detail.util.d;
import brd.a0;
import m9a.a0;
import erd.o;
import m9a.z;
import erd.g;
import io.reactivex.internal.functions.Functions;

public class e	// class@001a33
{

    public void e(){
       super();
    }
    public static b a(Context p0,String p1,e$b p2){
       e$a obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new e$a(null);
       obj.d = p2;
       obj.b = a0.B(p1).C(new a0(p1)).R(new z(obj, p0), Functions.d());
       return obj;
    }
}
