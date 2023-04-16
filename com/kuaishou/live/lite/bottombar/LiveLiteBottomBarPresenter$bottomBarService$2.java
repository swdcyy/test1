package com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter$bottomBarService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.bottombar.f;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.lite.bottombar.d;
import ok.h;
import com.google.common.collect.ImmutableList;

public final class LiveLiteBottomBarPresenter$bottomBarService$2 extends Lambda implements a	// class@001ead
{
    public final LiveLiteBottomBarPresenter this$0;

    public void LiveLiteBottomBarPresenter$bottomBarService$2(LiveLiteBottomBarPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLiteBottomBarPresenter obj = PatchProxy.apply(objArray, this, LiveLiteBottomBarPresenter$bottomBarService$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.F;
       if (obj != null) {
          objArray = PatchProxy.apply(objArray, obj, f.class, "12");
          if (objArray != patchProxyRe) {
          }else {
             objArray = m.s(obj.r).F(d.b).B();
          }
       }
       return objArray;
    }
}
