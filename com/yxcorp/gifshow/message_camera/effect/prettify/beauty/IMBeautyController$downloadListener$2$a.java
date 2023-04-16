package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$downloadListener$2$a;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$downloadListener$2;
import java.lang.Object;
import boc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import java.util.List;
import java.lang.StringBuilder;
import dc5.c;
import boc.e;
import com.yxcorp.gifshow.util.resource.MagicModel;
import com.yxcorp.gifshow.util.resource.Category;
import boc.z;
import java.lang.Throwable;

public final class IMBeautyController$downloadListener$2$a implements n$c	// class@001da8
{
    public final IMBeautyController$downloadListener$2 a;

    public void IMBeautyController$downloadListener$2$a(IMBeautyController$downloadListener$2 p0){
       this.a = p0;
       super();
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyController$downloadListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "category");
       IMBeautyController$downloadListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(p0, this$0, IMBeautyController.class, "19") && this$0.g.contains(p0)) {
          c.g("IMBeautyController", p0.getResourceName()+" download finish 1");
          if (p0 == e.c) {
             c.g("IMBeautyController", p0.getResourceName()+" download finish 2");
             this$0.i();
          }else if(p0 != Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2 && (p0 != e.B && (p0 != e.l && (p0 == e.M || p0 == e.L)))){
             c.g("IMBeautyController", p0.getResourceName()+" download finish 3");
          }
          if (this$0.a == null) {
             c.g("IMBeautyController", "applyLastConfig");
          }
          this$0.k(false);
       }
       return;
    }
    public void b(b p0,float p1){
       z.c(this, p0, p1);
    }
    public void c(b p0){
       z.a(this, p0);
    }
    public void d(b p0,Throwable p1){
       z.b(this, p0, p1);
    }
}
