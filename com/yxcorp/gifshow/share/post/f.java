package com.yxcorp.gifshow.share.post.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.music.Music;
import android.os.Bundle;
import java.lang.Object;
import com.yxcorp.gifshow.share.post.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a46.b;
import lnc.x6;
import lnc.y6;
import pm6.m;
import brd.t;
import com.yxcorp.gifshow.music.utils.c;
import com.yxcorp.gifshow.fragment.ObservableBox$b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.fragment.ObservableBox;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.share.post.b;
import erd.g;
import com.yxcorp.gifshow.share.post.c;
import crd.b;

public final class f implements Runnable	// class@001c3a
{
    public final GifshowActivity b;
    public final Music c;
    public final Bundle d;

    public void f(GifshowActivity p0,Music p1,Bundle p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       if (PatchProxy.applyVoidThreeRefs(tb, tc, td, null, h.class, "6")) {
       }else {
          b uob = y6.r(b.class);
          int i = (uob != null)? uob.xa(): m.b(0);
          ObservableBox$b uob1 = new ObservableBox$b(tb);
          uob1.a(true);
          t ot = ObservableBox.b(c.b(tc, (long)i), uob1);
          ot.compose(c.c(tb.m(), ActivityEvent.DESTROY)).subscribeOn(d.c).observeOn(d.a).doOnNext(new b(td)).doOnError(c.b).subscribe();
       }
       return;
    }
}
