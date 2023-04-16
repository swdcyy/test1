package com.kwai.poi.service.utils.PoiServicesUtilsKt$processKeyWordLocation$5;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.kwai.poi.service.model.PoiServiceRequestConfig;
import ie6.a$a;
import java.lang.String;
import kotlin.jvm.internal.Ref$IntRef;
import msd.l;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import com.kwai.poi.service.model.PoiServiceConfigInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import le6.g;
import ie6.a;

public final class PoiServicesUtilsKt$processKeyWordLocation$5 extends Lambda implements q	// class@0013b9
{
    public final l $block;
    public final String $extParams;
    public final Ref$IntRef $locationSource;
    public final PoiServiceRequestConfig $poiServiceRequestConfig;
    public final a$a $requestBuilder;

    public void PoiServicesUtilsKt$processKeyWordLocation$5(PoiServiceRequestConfig p0,a$a p1,String p2,Ref$IntRef p3,l p4){
       this.$poiServiceRequestConfig = p0;
       this.$requestBuilder = p1;
       this.$extParams = p2;
       this.$locationSource = p3;
       this.$block = p4;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0.doubleValue(), p1.doubleValue(), p2);
       return l1.a;
    }
    public final void invoke(double p0,double p1,String p2){
       boolean cityLimit;
       Boolean uBoolean;
       if (PatchProxy.isSupport(PoiServicesUtilsKt$processKeyWordLocation$5.class) && PatchProxy.applyVoidThreeRefs(Double.valueOf(p0), Double.valueOf(p1), p2, this, PoiServicesUtilsKt$processKeyWordLocation$5.class, "1")) {
          return;
       }
       PoiServicesUtilsKt$processKeyWordLocation$5 t$poiService = this.$poiServiceRequestConfig;
       if (t$poiService != null) {
          PoiServiceConfigInfo keyWordConfi = t$poiService.getKeyWordConfigInfo();
          if (keyWordConfi != null) {
             cityLimit = keyWordConfi.getCityLimit();
          }else if(p2 != null){
             cityLimit = (p2.length() > 0)? true: false;
          }else {
             uBoolean = null;
          label_003d :
             cityLimit = a.g(uBoolean, Boolean.TRUE);
             PoiServicesUtilsKt$processKeyWordLocation$5 t$requestBui = this.$requestBuilder;
             t$requestBui.e(Double.valueOf(p0));
             t$requestBui.f(Double.valueOf(p1));
             if (p2 == null) {
                p2 = "";
             }
             t$requestBui.b(p2);
             t$requestBui.c(cityLimit);
             t$requestBui.n(g.a(this.$extParams, this.$locationSource.element, cityLimit));
             this.$block.invoke(t$requestBui.a());
             return;
          }
       }else {
          goto label_0030 ;
       }
       uBoolean = Boolean.valueOf(cityLimit);
       goto label_003d ;
    }
}
