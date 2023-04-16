package com.kuaishou.tuna_router.router.thanos_detail.b;
import qvb.f;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import java.util.Map;
import fg6.a;
import s25.d;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import on4.a;
import java.lang.Exception;
import msd.a;
import c15.b;
import com.kuaishou.tuna_router.router.thanos_detail.BusinessThanosDetailResponse;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import q25.a;
import cjd.e;
import erd.o;
import la6.b;
import java.lang.Boolean;
import com.kuaishou.tuna_router.router.thanos_detail.BusinessThanosDetailModel;

public class b extends f	// class@001184
{
    public final String p;
    public final String q;
    public final String r;
    public final Map s;
    public int t;
    public boolean u;

    public void b(String p0,String p1,String p2,String p3,boolean p4){
       super();
       HashMap hashMap = new HashMap();
       this.s = hashMap;
       this.t = -1;
       this.p = p0;
       this.q = p1;
       this.r = p3;
       this.u = p4;
       if (PatchProxy.applyVoidOneRefs(p2, this, b.class, "3")) {
       }else if(this.K() && !hashMap.size()){
          Map map = a.a.i(p2, new d(this).getType());
          Iterator iterator = map.keySet().iterator();
          while (iterator.hasNext()) {
             p2 = iterator.next();
             p3 = map.get(p2);
             if (p2 instanceof String && p3 != null) {
                this.s.put(p2, p3);
             }
          }
       }
    }
    public boolean B1(Object p0){
       return this.h2(p0);
    }
    public t I1(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = -1532568578;
       if (this.u != null) {
          obj = b.a(i);
          if (this.K()) {
             objArray = this.p;
          }
          return obj.a(objArray, this.q, this.s, this.r).map(new e());
       }else {
          obj = b.a(i);
          if (this.K()) {
             objArray = this.p;
          }
          return obj.b(objArray, this.q, this.s, this.r).map(new e());
       }
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public boolean X1(b p0){
       return this.h2(p0);
    }
    public void d2(b p0,List p1){
       this.i2(p0, p1);
    }
    public boolean h2(BusinessThanosDetailResponse p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (p0 != null && (p0.mBusinessThanosDetailModel != null && super.X1(p0)))? true: false;
       return b;
    }
    public void i2(BusinessThanosDetailResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       super.d2(p0, p1);
       this.s.put("pcursor", p0.getCursor());
       if (this.K()) {
          p0 = p0.mBusinessThanosDetailModel;
          if (p0 != null) {
             this.t = p0.mPhotoIndex;
          }
       }
       return;
    }
}
