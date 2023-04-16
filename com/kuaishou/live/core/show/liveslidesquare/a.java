package com.kuaishou.live.core.show.liveslidesquare.a;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.liveslidesquare.a$a;
import za2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import vq5.b;
import vq5.d;
import java.util.List;
import qvb.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import qvb.i;
import za2.a;
import za2.c;
import qvb.j;
import za2.f;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends c implements g	// class@000c91
{
    public long p;
    public a0 q;
    public a r;
    public b s;
    public static String sLivePresenterClassName = "LiveAudienceOpenSpecifiedSlidePlayPresenter";
    public static String t = "disableLiveRevenueActivitySlidePlayGuideText";

    public void a(){
       super();
       this.p = 0;
       this.r = new a$a(this);
       this.s = new b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.q.p2.t5("specifiedslide", this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.q.p2.Z4("specifiedslide");
       return;
    }
    public void P8(List p0,int p1,String p2,int p3,int p4,String p5,String p6,String p7,q p8){
       Object[] objArray;
       a uoa1;
       c uoc;
       Object obj2;
       Object obj = this;
       object oobject = p0;
       int i = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       int i1 = 8;
       int i2 = 7;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[i2] = p7;
          objArray[i1] = p8;
          if (PatchProxy.applyVoid(objArray, obj, uoa, "4")) {
             return;
          }
       }
       if (q.f(p0)) {
          return;
       }else if(i >= p0.size()){
          return;
       }else if(PatchProxy.isSupport(uoa)){
          uoa1 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p3), Integer.valueOf(p4), this, a.class, "5");
          if (uoa1 != patchProxyRe) {
          label_007d :
             Object obj1 = uoa1;
             if (PatchProxy.isSupport(uoa)) {
                objArray = new Object[i1];
                objArray[0] = obj1;
                objArray[1] = Integer.valueOf(p3);
                objArray[2] = Integer.valueOf(p1);
                objArray[3] = p2;
                objArray[4] = p5;
                objArray[5] = p6;
                objArray[6] = p7;
                objArray[i2] = p8;
                uoc = PatchProxy.apply(objArray, obj, uoa, "6");
                if (uoc != patchProxyRe) {
                   obj2 = obj1;
                label_00c2 :
                   obj2.h(uoc);
                   obj2.a();
                   return;
                }
             }
             obj2 = obj1;
             uoc = new c(this, p8, obj1, p3, p7, p5, p6, p1, p2);
             goto label_00c2 ;
          }
       }
       uoa1 = new a(oobject, i, p4);
       goto label_007d ;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new f());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       return;
    }
}
