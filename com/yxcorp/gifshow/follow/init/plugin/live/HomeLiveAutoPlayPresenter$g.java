package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$g;
import erd.g;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import v99.a;
import kotlin.jvm.internal.a;
import ba9.a;
import y99.k;

public final class HomeLiveAutoPlayPresenter$g implements g	// class@0010c3
{
    public final HomeLiveAutoPlayPresenter b;

    public void HomeLiveAutoPlayPresenter$g(HomeLiveAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       HomeLiveAutoPlayPresenter$g og = HomeLiveAutoPlayPresenter$g.class;
       if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, og, "1")) {
          if (b) {
             b = HomeLiveAutoPlayPresenter.R8(this.b);
             HomeLiveAutoPlayPresenter l = this.b.L;
             if (l == null) {
                a.S("mPlayView");
             }
             b.v("float_window_show", l);
             this.b.b9();
          }else {
             b = this.b.Q;
             if (b == null) {
                a.S("mViewFocusState");
             }
             b.a();
          }
       }
       return;
    }
}
