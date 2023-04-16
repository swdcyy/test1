package com.yxcorp.gifshow.growth.halfscreenfollow.l;
import java.lang.Object;
import java.lang.String;
import qoa.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.halfscreenfollow.l$a;
import tna.m;
import cra.q;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.halfscreenfollow.k;
import java.lang.Runnable;
import t45.c;

public class l	// class@001394
{

    public void l(){
       super();
    }
    public static void a(int p0,String p1,int p2,boolean p3,b p4){
       boolean b;
       l ol = l.class;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, ol, "2")) {
             return;
          }
       }
       l$a uoa = (p4 == null)? new l$a(p2): p4;
       m om = new m(p2);
       if (PatchProxy.isSupport(q.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p3), Integer.valueOf(i), om, null, q.class, "1");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          label_0081 :
             if (!b) {
                uoa.s();
                return;
             }else {
                k ok = new k(uoa, p3, p0, p1, p2);
                c.a(v6);
                return;
             }
          }
       }
       a.p(om, "oldConfig");
       if (q.a(i)) {
          i1 = p3;
       }else if(p3){
          i1 = om.invoke().booleanValue();
       }
       b = i1;
       goto label_0081 ;
    }
}
