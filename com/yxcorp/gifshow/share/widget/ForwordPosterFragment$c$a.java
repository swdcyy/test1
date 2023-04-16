package com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment;
import android.view.View;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import djc.v0;
import io.reactivex.g;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c$a$a;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c$a$b;
import erd.g;
import crd.b;

public final class ForwordPosterFragment$c$a implements Runnable	// class@001cfd
{
    public final ForwordPosterFragment$c b;

    public void ForwordPosterFragment$c$a(ForwordPosterFragment$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       t ot;
       if (PatchProxy.applyVoidWithListener(null, this, ForwordPosterFragment$c$a.class, "1")) {
          return;
       }
       ForwordPosterFragment$c c = this.b.c;
       int width = ForwordPosterFragment.ii(c).getWidth();
       int height = ForwordPosterFragment.ii(this.b.c).getHeight();
       Objects.requireNonNull(c);
       if (PatchProxy.isSupport(ForwordPosterFragment.class)) {
          ot = PatchProxy.applyTwoRefs(Integer.valueOf(width), Integer.valueOf(height), c, ForwordPosterFragment.class, "5");
          if (ot != PatchProxyResult.class) {
          label_0062 :
             ot.subscribe(new ForwordPosterFragment$c$a$a(this), new ForwordPosterFragment$c$a$b(this));
             PatchProxy.onMethodExit(ForwordPosterFragment$c$a.class, "1");
             return;
          }
       }
       ot = t.create(new v0(c, width, height)).subscribeOn(d.c).observeOn(a.c());
       a.o(ot, "Observable.create<Bitmap¡­dSchedulers.mainThread\(\)\)");
       goto label_0062 ;
    }
}
