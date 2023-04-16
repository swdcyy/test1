package com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import a59.e;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup$mTKBridgeList$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import org.json.JSONObject;
import a59.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import a59.c;
import msd.l;
import y49.f;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public class TkBridgeGroup extends e	// class@00182a
{
    public final p b;

    public void TkBridgeGroup(){
       super();
       this.b = s.c(TkBridgeGroup$mTKBridgeList$2.INSTANCE);
    }
    public String a(){
       return "";
    }
    public Object b(String p0,JSONObject p1,a p2){
       Object obj1;
       Iterator obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TkBridgeGroup.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bridgeName");
       a.p(p1, "data");
       obj = this.m().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return this.c(p1, p2);
          }
          c uoc = obj.next();
          if (uoc instanceof TkBridgeGroup) {
             obj1 = uoc.b(p0, p1, p2);
             int i = a.g(obj1, "flag_bridge_not_match") ^ 0x01;
             if (i) {
                break ;
             }
          }else if(a.g(p0, uoc.a())){
             return uoc.b(p0, p1, p2);
          }
       }
       return obj1;
    }
    public Object c(JSONObject p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, TkBridgeGroup.class, "9");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       return "flag_bridge_not_match";
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, TkBridgeGroup.class, "11")) {
          return;
       }
       Iterator iterator = this.m().iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc instanceof e) {
             uoc.g();
          }
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, TkBridgeGroup.class, "10")) {
          return;
       }
       Iterator iterator = this.m().iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc instanceof e) {
             uoc.h();
          }
       }
       return;
    }
    public final void i(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TkBridgeGroup.class, "2")) {
          return;
       }
       a.p(p0, "bridge");
       if (a.g(p0.a(), "getData") && !this.k()) {
          return;
       }
       this.m().add(p0);
       return;
    }
    public final void j(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TkBridgeGroup.class, "3")) {
          return;
       }
       a.p(p0, "bridgeName");
       a.p(p1, "invoke");
       if (a.g(p0, "getData") && !this.k()) {
          return;
       }
       this.m().add(new f(p0, p1));
       return;
    }
    public final boolean k(){
       Object obj = PatchProxy.apply(null, this, TkBridgeGroup.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enable_tk_use_get_data", true);
    }
    public final List l(){
       Object obj = PatchProxy.apply(null, this, TkBridgeGroup.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m();
    }
    public final List m(){
       Object obj = PatchProxy.apply(null, this, TkBridgeGroup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TkBridgeGroup.class, "5")) {
          return;
       }
       a.p(p0, "bridgeName");
       this.o(p0, this.l());
       return;
    }
    public final void o(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TkBridgeGroup.class, "6")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc instanceof TkBridgeGroup) {
             this.o(p0, uoc.m());
          }else if(a.g(p0, uoc.a())){
             iterator.remove();
          }
       }
       return;
    }
}
