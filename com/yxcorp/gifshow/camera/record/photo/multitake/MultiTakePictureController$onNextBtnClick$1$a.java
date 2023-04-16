package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onNextBtnClick$1$a;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onNextBtnClick$1;
import java.util.List;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import lq.i;
import lq.e;
import java.util.Objects;
import com.yxcorp.gifshow.util.r0;
import k36.c;
import gd9.a;
import k36.f;
import lnc.m8;

public final class MultiTakePictureController$onNextBtnClick$1$a implements g	// class@000edf
{
    public final MultiTakePictureController$onNextBtnClick$1 b;
    public final List c;

    public void MultiTakePictureController$onNextBtnClick$1$a(MultiTakePictureController$onNextBtnClick$1 p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$onNextBtnClick$1$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w(MultiTakePictureController.V.c(), "videoContext ready", objArray);
          MultiTakePictureController$onNextBtnClick$1 this$0 = this.b.this$0;
          if (this$0.H != null) {
             d e = this$0.e;
             a.o(e, "mActivity");
             String str = j0.f(e.getIntent(), "tag");
             String str1 = "";
             String str2 = (str != null)? str: str1;
             a.o(str2, "IntentUtils.getStringExt\x20\x02 TagParams.KEY_TAG\) ?: \"\"\x00");
             e = this.b.this$0.d;
             a.o(e, "mCallerContext");
             w ow = e.b();
             a.o(ow, "mCallerContext.controllerManager");
             String taskId = ow.getTaskId();
             if (i.h()) {
                str1 = i.m().k().c();
             }
             MultiTakePictureController h = this.b.this$0.H;
             a.m(h);
             a.o(p0, "videoContext");
             Objects.requireNonNull(h);
             a.p(p0, "videoContext");
             h.k = p0;
             c.d().g(a.d(2, p0));
             MultiTakePictureController h1 = this.b.this$0.H;
             a.m(h1);
             h1.m(this.c, true, false, taskId, str2, str1, false, false, false, h1.y);
          }else {
             this$0.u2();
          }
       }
       return;
    }
}
