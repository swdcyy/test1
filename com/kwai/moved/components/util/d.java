package com.kwai.moved.components.util.d;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.moved.components.util.c;
import io.reactivex.g;
import ac7.f;
import erd.o;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import com.kwai.moved.components.util.b;
import ac7.g;

public class d	// class@000f69
{

    public void d(){
       super();
    }
    public static t a(FragmentActivity p0,int p1,String p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, d.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.create(new c(p0, p1)).flatMap(new f(p0, p2));
    }
    public static t b(g p0,Activity p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new b(p1)).flatMap(new g(p0, p1, p2));
    }
}
