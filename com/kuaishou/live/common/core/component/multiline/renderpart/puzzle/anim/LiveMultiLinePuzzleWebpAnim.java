package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleWebpAnim;
import yr1.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import ls1.d;
import java.lang.String;
import msd.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleWebpAnim$start$1;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleWebpAnim$a;
import com.kuaishou.live.common.core.component.multiline.util.LiveMultiLineResourceManager$bindAnimationResource$2;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.x0;
import ls1.c;
import hc.b;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.common.core.basic.tools.l;

public final class LiveMultiLinePuzzleWebpAnim implements c	// class@0015a7
{
    public final KwaiImageView a;
    public final d b;
    public final String c;
    public final l d;

    public void LiveMultiLinePuzzleWebpAnim(KwaiImageView p0,d p1,String p2,l p3){
       a.p(p0, "targetView");
       a.p(p1, "resourceManager");
       a.p(p2, "animFileName");
       a.p(p3, "animationCallBack");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleWebpAnim.class, "1")) {
          return;
       }
       a.p(p0, "onFinish");
       int i = 0;
       this.a.setVisibility(i);
       LiveMultiLinePuzzleWebpAnim tb = this.b;
       LiveMultiLinePuzzleWebpAnim ta = this.a;
       LiveMultiLinePuzzleWebpAnim tc = this.c;
       LiveMultiLinePuzzleWebpAnim$start$1 ostart$1 = new LiveMultiLinePuzzleWebpAnim$start$1(p0);
       LiveMultiLinePuzzleWebpAnim$a uoa = new LiveMultiLinePuzzleWebpAnim$a(this, p0);
       LiveMultiLineResourceManager$bindAnimationResource$2 iNSTANCE = LiveMultiLineResourceManager$bindAnimationResource$2.INSTANCE;
       Objects.requireNonNull(tb);
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{ta,tc,null,ostart$1,iNSTANCE,uoa};
          if (!PatchProxy.applyVoid(objArray, tb, uod, "4")) {
          label_0051 :
             a.p(ta, "targetView");
             a.p(tc, "fileName");
             a.p(ostart$1, "bindFailureListener");
             a.p(iNSTANCE, "bindSuccessListener");
             File uFile = LiveResourceFileUtil.j(tb.a, tb.b(tc, null));
             if (uFile == null || !uFile.exists()) {
                ostart$1.invoke(null);
             }else {
                d uod1 = Fresco.newDraweeControllerBuilder();
                uod1.q(1);
                d uod2 = uod1.D(x0.f("file://"+uFile.getAbsolutePath()));
                uod2.s(new c(tb, ostart$1, uoa, iNSTANCE));
                AbstractDraweeController uAbstractDra = uod2.e();
                a.o(uAbstractDra, "Fresco.newDraweeControll¡­    }\)\n          .build\(\)");
                ta.setController(uAbstractDra);
             }
          }
       }else {
          goto label_0051 ;
       }
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLinePuzzleWebpAnim.class, "2")) {
          return;
       }
       l.j(this.a);
       return;
    }
}
