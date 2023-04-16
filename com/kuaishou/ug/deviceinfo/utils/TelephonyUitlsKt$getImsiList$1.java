package com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getImsiList$1;
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

public final class TelephonyUitlsKt$getImsiList$1 extends Lambda implements l	// class@00118b
{
    public final Ref$ObjectRef $imsi;
    public final List $imsiList;
    public final b $telephonyInfoHelper;

    public void TelephonyUitlsKt$getImsiList$1(Ref$ObjectRef p0,b p1,List p2){
       this.$imsi = p0;
       this.$telephonyInfoHelper = p1;
       this.$imsiList = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TelephonyUitlsKt$getImsiList$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.$imsi.element = this.$telephonyInfoHelper.b(p0.a());
       Ref$ObjectRef element = this.$imsi.element;
       TelephonyUitlsKt$getImsiList$1 ogetImsiList = (element == null || u.S1(element))? 1: null;
       if (!ogetImsiList) {
          Ref$ObjectRef element1 = this.$imsi.element;
          a.m(element1);
          this.$imsiList.add(element1);
       }
       return;
    }
}
