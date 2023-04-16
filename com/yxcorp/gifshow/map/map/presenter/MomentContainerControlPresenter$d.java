package com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$d;
import oj0.a;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import fg6.a;
import i6b.g;
import com.google.gson.Gson;
import g6b.c;
import com.kwai.framework.model.user.User;
import i6b.a;
import kotlin.jvm.internal.a;
import xl8.b;

public final class MomentContainerControlPresenter$d implements a	// class@001cb9
{
    public final MomentContainerControlPresenter b;

    public void MomentContainerControlPresenter$d(MomentContainerControlPresenter p0){
       this.b = p0;
       super();
    }
    public final void W(Map p0){
       String id;
       c g;
       if (PatchProxy.applyVoidOneRefs(p0, this, MomentContainerControlPresenter$d.class, "1")) {
          return;
       }
       p0 = (p0 != null)? p0.get("momentInfo"): null;
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.String");
       g og = a.a.h(p0, g.class);
       c uoc = MomentContainerControlPresenter.R8(this.b);
       if (og != null) {
          og = og.user;
          if (og != null) {
             id = og.getId();
             if (id != null) {
             label_003b :
                uoc.q = id;
                g = MomentContainerControlPresenter.R8(this.b).g;
                g.a = "MOMENT_CLICK";
                MomentContainerControlPresenter s = this.b.s;
                if (s == null) {
                   a.S("mDataRefreshObservable");
                }
                s.d(g);
                return;
             }
          }
       }
       id = "";
       goto label_003b ;
    }
}
