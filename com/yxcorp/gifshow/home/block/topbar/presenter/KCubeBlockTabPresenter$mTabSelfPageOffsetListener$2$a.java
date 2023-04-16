package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2$a;
import fr6.e;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2;
import java.lang.Object;
import wq6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import wra.b;
import java.lang.System;
import com.yxcorp.gifshow.DefaultHelper;

public final class KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2$a implements e	// class@001676
{
    public final KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2 a;

    public void KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2$a(KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(h p0,float p1,int p2){
       if (PatchProxy.isSupport(KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), this, KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "interactiveTab");
       if (!p1 - 0x3f800000 && !KCubeBlockTabPresenter.R8(this.a.this$0).c()) {
          DefaultHelper.k(System.currentTimeMillis());
          DefaultHelper.i(true);
       }
       return;
    }
}
