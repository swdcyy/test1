package com.kwai.live.gzone.accompanyplay.anchor.f0$a;
import com.kwai.live.gzone.accompanyplay.anchor.f0$c;
import com.kwai.live.gzone.accompanyplay.anchor.f0;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.edit.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mrd.a;
import k37.p1;
import g37.d;

public class f0$a implements f0$c	// class@000b0a
{
    public final f0 a;

    public void f0$a(f0 p0){
       this.a = p0;
       super();
    }
    public g a(){
       f0$a obj = PatchProxy.apply(null, this, f0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj.p == null) {
          f0$a ta = this.a;
          g og = new g(obj.getActivity(), ta.q, ta.t, "live_watch", ta.s);
          obj.p = v1;
       }
       return this.a.p;
    }
    public a b(){
       return this.a.q;
    }
}
