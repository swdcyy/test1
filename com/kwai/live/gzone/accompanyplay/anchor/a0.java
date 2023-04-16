package com.kwai.live.gzone.accompanyplay.anchor.a0;
import u07.u;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j37.b;
import j37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import brd.t;
import com.yxcorp.gifshow.fragment.ObservableBox;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gr8.b;
import brd.x;
import com.kwai.live.gzone.accompanyplay.anchor.a0$a;
import sfc.a;
import erd.g;
import crd.b;

public class a0 implements u	// class@000af6
{
    public final b0 b;

    public void a0(b0 p0){
       this.b = p0;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a0.class, "1")) {
          return;
       }
       a0 tb = this.b;
       ObservableBox.a(a.b().b(tb.w, tb.v.mRoundId)).compose(this.b.getActivity().ge()).subscribe(new a0$a(this), new a());
       return;
    }
}
