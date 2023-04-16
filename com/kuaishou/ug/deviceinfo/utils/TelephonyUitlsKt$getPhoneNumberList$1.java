package com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getPhoneNumberList$1;
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
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.telephony.TelephonyManager;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt;

public final class TelephonyUitlsKt$getPhoneNumberList$1 extends Lambda implements l	// class@00118d
{
    public final Ref$ObjectRef $number;
    public final List $numberList;
    public final b $telephonyInfoHelper;

    public void TelephonyUitlsKt$getPhoneNumberList$1(Ref$ObjectRef p0,b p1,List p2){
       this.$number = p0;
       this.$telephonyInfoHelper = p1;
       this.$numberList = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, TelephonyUitlsKt$getPhoneNumberList$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       a f = p0.f;
       this.$number.element = f;
       TelephonyUitlsKt$getPhoneNumberList$1 ogetPhoneNum = null;
       TelephonyUitlsKt$getPhoneNumberList$1 ogetPhoneNum1 = (f == null || u.S1(f))? 1: null;
       if (ogetPhoneNum1) {
          ogetPhoneNum1 = this.$number;
          TelephonyUitlsKt$getPhoneNumberList$1 t$telephonyI = this.$telephonyInfoHelper;
          int i = p0.a();
          Objects.requireNonNull(t$telephonyI);
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             str = PatchProxy.applyOneRefs(Integer.valueOf(i), t$telephonyI, uob, "9");
             if (str != PatchProxyResult.class) {
             }else {
             label_004c :
                str = TelephonyUitlsKt.f(t$telephonyI.a, "getLine1Number", i);
                int i1 = (str == null || u.S1(str))? 1: 0;
                if (i1 && !i) {
                   str = t$telephonyI.h();
                }
             }
          }else {
             goto label_004c ;
          }
          ogetPhoneNum1.element = str;
       }
       Ref$ObjectRef element = this.$number.element;
       if (element == null || u.S1(element)) {
          ogetPhoneNum = 1;
       }
       if (!ogetPhoneNum) {
          Ref$ObjectRef element1 = this.$number.element;
          a.m(element1);
          this.$numberList.add(element1);
       }
       return;
    }
}
