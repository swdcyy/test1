package com.yxcorp.gifshow.share.post.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import android.os.Bundle;
import java.lang.Object;
import com.yxcorp.gifshow.share.post.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import om6.q;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import qic.e;
import erd.o;
import brd.t;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import qic.d;
import com.yxcorp.gifshow.share.post.d;
import erd.g;
import crd.b;

public final class g implements Runnable	// class@001c3b
{
    public final GifshowActivity b;
    public final SimpleMagicFace c;
    public final Bundle d;

    public void g(GifshowActivity p0,SimpleMagicFace p1,Bundle p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       if (PatchProxy.applyVoidThreeRefs(tb, tc, td, null, h.class, "5")) {
       }else {
          t ot = y6.s(q.class, LoadPolicy.DIALOG).w(new e(tb, tc)).compose(tb.E2(ActivityEvent.DESTROY));
          if (ot != null) {
             ot.subscribe(new d(tb, td), d.b);
          }
       }
       return;
    }
}
