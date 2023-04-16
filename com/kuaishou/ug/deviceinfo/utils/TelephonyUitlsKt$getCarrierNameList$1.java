package com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getCarrierNameList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.List;
import java.lang.Object;
import w25.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import zsd.u;

public final class TelephonyUitlsKt$getCarrierNameList$1 extends Lambda implements l	// class@001187
{
    public final Ref$ObjectRef $carrierName;
    public final List $carrierNameList;

    public void TelephonyUitlsKt$getCarrierNameList$1(Ref$ObjectRef p0,List p1){
       this.$carrierName = p0;
       this.$carrierNameList = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TelephonyUitlsKt$getCarrierNameList$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0 = p0.e;
       this.$carrierName.element = p0;
       TelephonyUitlsKt$getCarrierNameList$1 ogetCarrierN = (p0 == null || u.S1(p0))? 1: null;
       if (!ogetCarrierN) {
          Ref$ObjectRef element = this.$carrierName.element;
          a.m(element);
          this.$carrierNameList.add(element);
       }
       return;
    }
}
