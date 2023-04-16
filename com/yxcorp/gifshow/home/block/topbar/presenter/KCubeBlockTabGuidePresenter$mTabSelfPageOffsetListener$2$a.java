package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2$a;
import fr6.e;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2;
import java.lang.Object;
import wq6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter;
import mrd.a;

public final class KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2$a implements e	// class@001665
{
    public final KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2 a;

    public void KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2$a(KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(h p0,float p1,int p2){
       if (PatchProxy.isSupport(KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), this, KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "interactiveTab");
       this.a.this$0.t.onNext(Float.valueOf(p1));
       return;
    }
}
