package com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getIccidList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import w25.b;
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

public final class TelephonyUitlsKt$getIccidList$1 extends Lambda implements l	// class@001189
{
    public final Ref$ObjectRef $iccid;
    public final List $iccidList;
    public final b $telephonyInfoHelper;

    public void TelephonyUitlsKt$getIccidList$1(Ref$ObjectRef p0,b p1,List p2){
       this.$iccid = p0;
       this.$telephonyInfoHelper = p1;
       this.$iccidList = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TelephonyUitlsKt$getIccidList$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       a b = p0.b;
       this.$iccid.element = b;
       TelephonyUitlsKt$getIccidList$1 ogetIccidLis = null;
       TelephonyUitlsKt$getIccidList$1 ogetIccidLis1 = (b == null || u.S1(b))? 1: null;
       if (ogetIccidLis1) {
          this.$iccid.element = this.$telephonyInfoHelper.e(p0.a());
       }
       Ref$ObjectRef element = this.$iccid.element;
       if (element == null || u.S1(element)) {
          ogetIccidLis = 1;
       }
       if (!ogetIccidLis) {
          Ref$ObjectRef element1 = this.$iccid.element;
          a.m(element1);
          this.$iccidList.add(element1);
       }
       return;
    }
}