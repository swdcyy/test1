package com.yxcorp.gifshow.log.d0;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.log.g$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import java.util.Objects;
import com.yxcorp.gifshow.log.h;
import k2b.b;
import k2b.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.log.b;
import android.app.Activity;
import k2b.k2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import ok.o;
import kp.r1;
import java.lang.Integer;
import java.lang.Boolean;

public class d0	// class@001afc
{
    public final BaseFeed a;
    public final String b;
    public final int c;
    public final int d;
    public String e;
    public String f;
    public ClientEvent$ExpTagTransList g;
    public boolean h;
    public boolean i;
    public int j;

    public void d0(BaseFeed p0,String p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void d0(BaseFeed p0,String p1,int p2,int p3,ClientEvent$ExpTagTransList p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.g = p4;
    }
    public static g$b a(BaseFeed p0,BaseFragment p1,String p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d0.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       g$b uob = null;
       int i = 0xe0ff4fb;
       if (p1 != null) {
          g og = b.a(i);
          Objects.requireNonNull(og);
          b obj1 = PatchProxy.applyOneRefs(p1, og, g.class, "5");
          if (obj1 != patchProxyRe) {
             uob = obj1;
          }else {
             b uob1 = b.a(0x4b316083).l0();
             if (uob1 != null) {
                FragmentActivity activity = p1.getActivity();
                uob = new g$b(10);
                Iterator iterator = uob1.e().iterator();
                while (iterator.hasNext()) {
                   obj1 = iterator.next();
                   if (activity == null || !obj1.M(activity)) {
                      k2 ok2 = obj1.D();
                      uob.a(ok2.z);
                      uob.a(ok2.A);
                   }
                }
             }
          }
       }else {
          uob = b.a(i).b(uob);
       }
       if (uob == null) {
          uob = new g$b(10);
       }
       if (p0 != null) {
          ClientEvent$ExpTagTrans uExpTagTrans = new ClientEvent$ExpTagTrans();
          uExpTagTrans.clientExpTag = p2;
          uExpTagTrans.serverExpTag = r1.I1(p0);
          if (uob.c(uExpTagTrans)) {
             ClientEvent$ExpTagTrans uExpTagTrans1 = uob.d();
             if (uExpTagTrans1 == null || !(uExpTagTrans.serverExpTag).equals(uExpTagTrans1.serverExpTag)) {
                uob.a(uExpTagTrans);
             }
          }
       }
       return uob;
    }
    public static d0 b(BaseFeed p0,String p1,int p2,int p3,String p4,ClientEvent$ExpTagTransList p5,boolean p6,boolean p7,int p8){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          Object obj = PatchProxy.apply(objArray, null, uod0, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uod0 = new d0(p0, p1, p2, p3);
       uod0.f = p4;
       uod0.g = p5;
       uod0.h = p6;
       uod0.j = p8;
       uod0.i = p7;
       return uod0;
    }
    public static d0 d(BaseFeed p0,String p1,int p2){
       if (PatchProxy.isSupport(d0.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, d0.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new d0(p0, p1, p2, 1);
    }
    public static d0 e(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d0(p0, null, -1, 1);
    }
    public static d0 f(BaseFeed p0,String p1,ClientEvent$ExpTagTransList p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d0.b(p0, null, -1, 1, p1, p2, false, false, 2);
    }
    public static d0 g(BaseFeed p0,int p1,String p2,ClientEvent$ExpTagTransList p3,boolean p4,boolean p5,int p6){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5),Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, null, uod0, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d0.b(p0, null, -1, p1, p2, p3, p4, p5, p6);
    }
    public static d0 h(BaseFeed p0,int p1){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uod0, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new d0(p0, null, -1, p1);
    }
    public static d0 i(BaseFeed p0,String p1,int p2,int p3,String p4,ClientEvent$ExpTagTransList p5){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, null, uod0, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d0.b(p0, p1, p2, p3, p4, p5, false, true, 2);
    }
    public d0 c(String p0){
       this.e = p0;
       return this;
    }
}
