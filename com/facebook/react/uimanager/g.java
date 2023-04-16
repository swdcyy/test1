package com.facebook.react.uimanager.g;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.l;
import df.c;
import com.facebook.react.uimanager.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import yd.e;
import ef.a;
import com.facebook.react.uimanager.j;
import nf.a;
import ze.m;

public class g	// class@001348
{

    public void g(){
       super();
    }
    public f a(ReactApplicationContext p0,l p1,c p2,int p3){
       a obj;
       a uoa;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, g.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (e.d) {
          obj = new a(p0, p1, p2, p3);
       }else if(e.c){
          uoa = new a(p1);
       }else {
          uoa = new m(p1);
       }
       f uof = new f(p0, p1, new j(p0, uoa, p3), p2);
       return obj;
    }
}
