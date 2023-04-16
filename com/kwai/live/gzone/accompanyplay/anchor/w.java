package com.kwai.live.gzone.accompanyplay.anchor.w;
import u07.u;
import com.kwai.live.gzone.accompanyplay.anchor.x;
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
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gr8.b;
import brd.x;
import com.kwai.live.gzone.accompanyplay.anchor.w$a;
import sfc.a;
import erd.g;
import crd.b;

public class w implements u	// class@000b3d
{
    public final x b;

    public void w(x p0){
       this.b = p0;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "1")) {
          return;
       }
       w tb = this.b;
       ObservableBox.a(a.b().q(tb.e, tb.c.mRoundId)).compose(this.b.b.ge()).subscribe(new w$a(this), new a());
       return;
    }
}
