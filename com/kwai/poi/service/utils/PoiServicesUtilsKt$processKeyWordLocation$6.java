package com.kwai.poi.service.utils.PoiServicesUtilsKt$processKeyWordLocation$6;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.poi.service.model.PoiServiceRequestConfig;
import java.lang.String;
import ie6.a$a;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import com.kwai.framework.poi.api.constant.PoiErrorInfo;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.poi.service.model.PoiServiceConfigInfo;
import java.lang.CharSequence;
import le6.g;
import ie6.a;

public final class PoiServicesUtilsKt$processKeyWordLocation$6 extends Lambda implements l	// class@0013ba
{
    public final l $block;
    public final String $cityName;
    public final String $extParams;
    public final Ref$IntRef $locationSource;
    public final PoiServiceRequestConfig $poiServiceRequestConfig;
    public final a$a $requestBuilder;

    public void PoiServicesUtilsKt$processKeyWordLocation$6(PoiServiceRequestConfig p0,String p1,a$a p2,String p3,Ref$IntRef p4,l p5){
       this.$poiServiceRequestConfig = p0;
       this.$cityName = p1;
       this.$requestBuilder = p2;
       this.$extParams = p3;
       this.$locationSource = p4;
       this.$block = p5;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PoiErrorInfo p0){
       boolean cityLimit;
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiServicesUtilsKt$processKeyWordLocation$6.class, "1")) {
          return;
       }
       a.p(p0, "it");
       PoiServicesUtilsKt$processKeyWordLocation$6 t$poiService = this.$poiServiceRequestConfig;
       if (t$poiService != null) {
          PoiServiceConfigInfo keyWordConfi = t$poiService.getKeyWordConfigInfo();
          if (keyWordConfi != null) {
             cityLimit = keyWordConfi.getCityLimit();
          }else if(this.$cityName.length() > 0){
             cityLimit = true;
          }else {
             cityLimit = false;
          }
       }else {
          goto label_001f ;
       }
       PoiServicesUtilsKt$processKeyWordLocation$6 t$requestBui = this.$requestBuilder;
       t$requestBui.b(this.$cityName);
       t$requestBui.c(cityLimit);
       t$requestBui.n(g.a(this.$extParams, this.$locationSource.element, cityLimit));
       a uoa = t$requestBui.a();
       this.$block.invoke(uoa);
       return;
    }
}
