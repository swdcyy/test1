package com.kwai.live.gzone.accompanyplay.anchor.i0;
import u07.u;
import h37.o0;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j37.b;
import j37.a;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyMemberInfo;
import brd.t;
import com.yxcorp.gifshow.fragment.ObservableBox;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gr8.b;
import brd.x;
import com.kwai.live.gzone.accompanyplay.anchor.i0$a;
import sfc.a;
import erd.g;
import crd.b;

public class i0 implements u	// class@000b14
{
    public final Activity b;
    public final o0 c;

    public void i0(o0 p0,Activity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i0.class, "1")) {
          return;
       }
       i0 tc = this.c;
       ObservableBox.a(a.b().m(tc.r, tc.s.I.mRoundId, tc.q.mUserId)).compose(this.b.ge()).subscribe(new i0$a(this), new a());
       return;
    }
}
