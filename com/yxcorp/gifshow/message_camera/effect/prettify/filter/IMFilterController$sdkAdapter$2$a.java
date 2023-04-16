package com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$sdkAdapter$2$a;
import b1c.e;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$sdkAdapter$2;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import dc5.c;
import java.util.Objects;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import ui9.f$c;
import xi9.j;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import java.util.List;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper;

public final class IMFilterController$sdkAdapter$2$a implements e	// class@001dca
{
    public final IMFilterController$sdkAdapter$2 a;

    public void IMFilterController$sdkAdapter$2$a(IMFilterController$sdkAdapter$2 p0){
       this.a = p0;
       super();
    }
    public void a(FilterConfig p0,a0 p1,boolean p2){
       IMFilterController a;
       if (PatchProxy.isSupport(IMFilterController$sdkAdapter$2$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, IMFilterController$sdkAdapter$2$a.class, "2")) {
          return;
       }
       a.p(p1, "source");
       c.a("IMFilterController", "onFilterChanged: config "+p0);
       IMFilterController$sdkAdapter$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(p0, this$0, IMFilterController.class, "6")) {
          if (p0 == null) {
             a = this$0.a;
             if (a != null) {
                a.r0(null);
             }
          }else {
             IMFilterController a1 = this$0.a;
             if (a1 != null) {
                IMFilterController$a i = IMFilterController.i;
                Objects.requireNonNull(i);
                f$c uoc = PatchProxy.applyOneRefs(p0, i, IMFilterController$a.class, "1");
                if (uoc != PatchProxyResult.class) {
                }else {
                   f$c uoc1 = new f$c(Filters.getFilterResourcePath(p0), p0.mImageType, p0.mDimension, (p0.mRatioIntensity * p0.mIntensity), p0.mSourceType, p0.mFileMd5CheckList);
                }
                a1.r0(uoc);
             }
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, IMFilterController$sdkAdapter$2$a.class, "1")) {
          return;
       }
       c.a("IMFilterController", "onDisableMagicBuiltinFilter");
       IMFilterController a = this.a.this$0.a;
       if (a != null) {
          a.o(false);
       }
       return;
    }
}
