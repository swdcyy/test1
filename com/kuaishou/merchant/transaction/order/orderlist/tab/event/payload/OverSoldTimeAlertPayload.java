package com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.OverSoldTimeAlertPayload;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.TabBusinessPayload;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.OverSoldTimeAlertPayload$a;
import nsd.u;
import com.google.gson.a;
import com.google.gson.JsonElement;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.google.gson.JsonObject;
import ekd.k0;
import com.kuaishou.merchant.transaction.order.orderlist.event.display.payload.DisplayAlertPayloadInfo;
import java.lang.reflect.Type;

public final class OverSoldTimeAlertPayload extends TabBusinessPayload	// class@0008ce
{
    public DisplayAlertPayloadInfo mAlert;
    public static final OverSoldTimeAlertPayload$a Companion;
    public static final long serialVersionUID;

    static {
       OverSoldTimeAlertPayload.Companion = new OverSoldTimeAlertPayload$a(null);
    }
    public void OverSoldTimeAlertPayload(){
       super();
    }
    public static final TabBusinessPayload convertInfo(a p0,JsonElement p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       OverSoldTimeAlertPayload$a obj = PatchProxy.applyTwoRefs(p0, p1, null, OverSoldTimeAlertPayload.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = OverSoldTimeAlertPayload.Companion;
       Objects.requireNonNull(obj);
       OverSoldTimeAlertPayload overSoldTime = PatchProxy.applyTwoRefs(p0, p1, obj, OverSoldTimeAlertPayload$a.class, "1");
       if (overSoldTime != patchProxyRe) {
       }else {
          overSoldTime = new OverSoldTimeAlertPayload();
          if (p1.E()) {
             p1 = k0.e(p1.r(), "alert");
             if (p1 != null) {
                overSoldTime.setMAlert(p0.c(p1, DisplayAlertPayloadInfo.class));
             }
          }
       }
       return overSoldTime;
    }
    public final DisplayAlertPayloadInfo getMAlert(){
       return this.mAlert;
    }
    public final void setMAlert(DisplayAlertPayloadInfo p0){
       this.mAlert = p0;
    }
}
