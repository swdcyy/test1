package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b$b;
import erd.o;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postentrance.util.b;
import java.util.Objects;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter;
import brd.t;
import rzb.p;
import androidx.fragment.app.FragmentActivity;
import pr6.d;
import a0c.g;
import q87.c;
import a0c.c;
import pzb.r;
import android.app.Activity;
import brd.x;
import t45.d;
import brd.z;
import ozb.m;
import erd.g;
import java.lang.Throwable;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$a;
import qrd.p;
import pzb.g;
import pzb.f;
import pzb.m;

public final class HomePostOperationBubblePresenter$b$b implements o	// class@001028
{
    public final HomePostOperationBubblePresenter$b b;
    public final Ref$ObjectRef c;

    public void HomePostOperationBubblePresenter$b$b(HomePostOperationBubblePresenter$b p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       HomePostOperationBubblePresenter$b obj = PatchProxy.applyOneRefs(p0, this, HomePostOperationBubblePresenter$b$b.class, str);
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "guideInfo");
          this.c.element = p0;
          b.f("stage_picked_data", p0);
          obj = this.b.v;
          Objects.requireNonNull(obj);
          HomePostOperationBubblePresenter homePostOper = HomePostOperationBubblePresenter.class;
          t obj1 = PatchProxy.applyOneRefs(p0, obj, homePostOper, "6");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else if(p.b.b(p0)){
             FragmentActivity uFragmentAct = obj.z.g();
             if (uFragmentAct != null) {
                Object[] objArray = new Object[0];
                g.C().w("home_entrance_bubble", "start using TK bubble", objArray);
                c.b.m("start using TK bubble");
                p0 = t.just(p0).compose(new r(uFragmentAct)).observeOn(d.a).doOnError(new m(p0));
                if (p0 == null) {
                }
             }else {
             }
          }else {
             obj1 = t.just(p0);
             Object obj2 = PatchProxy.applyOneRefs(p0, obj, homePostOper, "7");
             if (obj2 != patchProxyRe) {
             }else {
                p0 = p0.mType;
                if (p0 != 14) {
                   if (p0 != 16) {
                      if (p0 != 20) {
                         p0 = CommonOperateBubbleProcessor.c;
                         Objects.requireNonNull(p0);
                         p0 = PatchProxy.apply(null, p0, CommonOperateBubbleProcessor$a.class, str);
                         if (p0 == patchProxyRe) {
                            p0 = CommonOperateBubbleProcessor.b.getValue();
                         }
                      }else {
                         p0 = g.e;
                      }
                   }else {
                      p0 = f.d;
                   }
                }else {
                   p0 = m.d;
                }
                obj2 = p0;
             }
             p0 = obj1.compose(obj2);
             a.o(p0, "Observable.just\(bubbleIn¡­bleProcessor\(bubbleInfo\)\)");
          }
          obj = p0;
       }
       return obj;
    }
}
