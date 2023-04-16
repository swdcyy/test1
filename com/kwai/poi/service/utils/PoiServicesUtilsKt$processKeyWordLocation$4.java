package com.kwai.poi.service.utils.PoiServicesUtilsKt$processKeyWordLocation$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.poi.service.model.PoiServiceRequestConfig;
import ie6.a$a;
import java.lang.String;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.poi.service.model.PoiServiceConfigInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import le6.g;
import ie6.a;

public final class PoiServicesUtilsKt$processKeyWordLocation$4 extends Lambda implements l	// class@0013b8
{
    public final l $block;
    public final String $extParams;
    public final Ref$IntRef $locationSource;
    public final PoiServiceRequestConfig $poiServiceRequestConfig;
    public final a$a $requestBuilder;

    public void PoiServicesUtilsKt$processKeyWordLocation$4(PoiServiceRequestConfig p0,a$a p1,String p2,Ref$IntRef p3,l p4){
       this.$poiServiceRequestConfig = p0;
       this.$requestBuilder = p1;
       this.$extParams = p2;
       this.$locationSource = p3;
       this.$block = p4;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       boolean cityLimit;
       Boolean uBoolean;
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiServicesUtilsKt$processKeyWordLocation$4.class, "1")) {
          return;
       }
       PoiServicesUtilsKt$processKeyWordLocation$4 t$poiService = this.$poiServiceRequestConfig;
       if (t$poiService != null) {
          PoiServiceConfigInfo keyWordConfi = t$poiService.getKeyWordConfigInfo();
          if (keyWordConfi != null) {
             cityLimit = keyWordConfi.getCityLimit();
          }else if(p0 != null){
             cityLimit = (p0.length() > 0)? true: false;
          }else {
             uBoolean = null;
          label_002b :
             cityLimit = a.g(uBoolean, Boolean.TRUE);
             PoiServicesUtilsKt$processKeyWordLocation$4 t$requestBui = this.$requestBuilder;
             t$requestBui.n(g.a(this.$extParams, this.$locationSource.element, cityLimit));
             if (p0 == null) {
                p0 = "";
             }
             t$requestBui.b(p0);
             t$requestBui.c(cityLimit);
             this.$block.invoke(t$requestBui.a());
             return;
          }
       }else {
          goto label_001e ;
       }
       uBoolean = Boolean.valueOf(cityLimit);
       goto label_002b ;
    }
}
