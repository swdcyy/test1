package com.kuaishou.merchant.transaction.live.dynamic.service.activity.MtppRealtimeActivityServiceManageViewBinder;
import vd4.b;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.MtppRealtimeActivityServiceManageViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.MtppRealtimeActivityServiceManageViewBinder$onBind$1;
import kotlin.jvm.internal.a;
import msd.l;
import vd4.s$b;
import lj4.f;
import mu4.d;
import lj4.d;
import mu4.f;
import lj4.e;
import mu4.b;
import lj4.b;
import lj4.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.StringBuilder;
import oj4.a;
import java.lang.Integer;
import java.lang.Number;

public final class MtppRealtimeActivityServiceManageViewBinder extends b	// class@0007c5
{
    public s$b y;
    public a z;
    public static final MtppRealtimeActivityServiceManageViewBinder$a A;

    static {
       MtppRealtimeActivityServiceManageViewBinder.A = new MtppRealtimeActivityServiceManageViewBinder$a(null);
    }
    public void MtppRealtimeActivityServiceManageViewBinder(Fragment p0){
       super(p0);
    }
    public void E8(){
       MtppRealtimeActivityServiceManageViewBinder mtppRealtime = MtppRealtimeActivityServiceManageViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mtppRealtime, "2")) {
          return;
       }
       super.E8();
       MtppRealtimeActivityServiceManageViewBinder$onBind$1 oonBind$1 = new MtppRealtimeActivityServiceManageViewBinder$onBind$1(this);
       if (!PatchProxy.applyVoidOneRefs(oonBind$1, this, mtppRealtime, "20")) {
          MtppRealtimeActivityServiceManageViewBinder ty = this.y;
          if (ty == null) {
             a.S("mGlobalDataDispatchService");
          }
          ty.b("realtimeActivityStateManager", oonBind$1);
       }
       if (!PatchProxy.applyVoid(objArray, this, mtppRealtime, "10")) {
          this.X8("mt_purchase_panel_close_activity_state_service", new f(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, mtppRealtime, "11")) {
          this.Y8("mt_purchase_panel_get_local_sale_status", new d(this));
          this.W8("mt_purchase_panel_get_local_sale_status_async", new e(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, mtppRealtime, "12")) {
          this.Y8("mt_purchase_panel_get_activity_data", new b(this));
          this.W8("mt_purchase_panel_get_activity_data_async", new c(this));
       }
       return;
    }
    public void J8(){
       MtppRealtimeActivityServiceManageViewBinder mtppRealtime = MtppRealtimeActivityServiceManageViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mtppRealtime, "3")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoid(objArray, this, mtppRealtime, "21")) {
          mtppRealtime = this.y;
          if (mtppRealtime == null) {
             a.S("mGlobalDataDispatchService");
          }
          mtppRealtime.d("realtimeActivityStateManager");
       }
       this.s9();
       return;
    }
    public String a9(){
       return "realtimeActivityStateManager";
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MtppRealtimeActivityServiceManageViewBinder.class, "1")) {
          return;
       }
       super.j8();
       this.y = this.r8("global_data_dispatch_svr");
       return;
    }
    public final String o9(){
       JsonObject jsonObject;
       String str2;
       MtppRealtimeActivityServiceManageViewBinder obj = PatchProxy.apply(null, this, MtppRealtimeActivityServiceManageViewBinder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       String str = "MtppRealtimeActivityServiceManageViewBinder: getActivityData: ";
       String str1 = "type";
       if (obj == null) {
          jsonObject = new JsonObject();
          jsonObject.c0(str1, "null");
          str2 = jsonObject.toString();
          this.e9(str+str2);
       }else {
          a.m(obj);
          jsonObject = obj.o9();
          MtppRealtimeActivityServiceManageViewBinder tz = this.z;
          a.m(tz);
          jsonObject.c0(str1, tz.t9());
          str2 = jsonObject.toString();
          this.e9(str+str2);
       }
       return str2;
    }
    public final String q9(){
       String str;
       Object[] objArray = null;
       JsonObject obj = PatchProxy.apply(objArray, this, MtppRealtimeActivityServiceManageViewBinder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       MtppRealtimeActivityServiceManageViewBinder tz = this.z;
       if (tz != null) {
          str = tz.t9();
          if (str != null) {
          label_0022 :
             obj.c0("type", str);
             tz = this.z;
             if (tz != null) {
                objArray = Integer.valueOf(tz.q9());
             }
             obj.a0("localSaleStatus", objArray);
             String str1 = obj.toString();
             this.e9("MtppRealtimeActivityServiceManageViewBinder: getLocalStatus: "+str1);
             return str1;
          }
       }
       str = "null";
       goto label_0022 ;
    }
    public final void s9(){
       if (PatchProxy.applyVoid(null, this, MtppRealtimeActivityServiceManageViewBinder.class, "7")) {
          return;
       }
       MtppRealtimeActivityServiceManageViewBinder tz = this.z;
       if (tz != null) {
          tz.destroy();
          this.z = null;
          this.k9("MtppRealtimeActivityServiceManageViewBinder: service stopped");
       }
       return;
    }
}
