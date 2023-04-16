package com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$g;
import erd.o;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import a0c.g;
import q87.c;
import java.util.Objects;
import brd.t;
import a0c.c;
import java.io.File;
import jd.c;
import rzb.b;
import a0c.d;
import pzb.b;
import erd.c;
import pzb.c;
import t45.d;
import brd.z;
import pzb.j;

public final class CommonOperateBubbleProcessor$g implements o	// class@001038
{
    public final CommonOperateBubbleProcessor b;

    public void CommonOperateBubbleProcessor$g(CommonOperateBubbleProcessor p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommonOperateBubbleProcessor$g obj = PatchProxy.applyOneRefs(p0, this, CommonOperateBubbleProcessor$g.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "guideInfo");
          Object[] objArray = new Object[0];
          g.C().w("home_entrance_bubble", "CommonOperateBubbleProcessor start process bubble icon", objArray);
          if (p0.mBubbleUiType == null) {
             obj = this.b;
             Objects.requireNonNull(obj);
             obj = PatchProxy.applyOneRefs(p0, obj, CommonOperateBubbleProcessor.class, "7");
             if (obj != patchProxyRe) {
             }else {
                c b = c.b;
                ot = b.b(b.i(b.j(p0), b.f(p0.getImage())), b.e(p0.mType), b.d(p0.mType), null);
                t ot1 = t.zip(ot, b.b(b.i(b.j(p0), b.f(p0.getExpandCameraIcon(p0.mCameraButtonLocation))), p0.getBubbleIconWidth(), p0.getBubbleIconHeight(), new b(d.c.a())), new b(p0));
                p0 = ot1.flatMap(new c(p0));
                p0 = p0.subscribeOn(d.c).observeOn(d.a);
                a.o(p0, "Observable.zip\(imageIcon¡­veOn\(KwaiSchedulers.MAIN\)");
             }
          }else {
             p0 = j.a.a(p0);
          }
          ot = p0;
       }
       return obj;
    }
}
