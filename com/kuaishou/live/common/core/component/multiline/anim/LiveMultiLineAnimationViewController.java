package com.kuaishou.live.common.core.component.multiline.anim.LiveMultiLineAnimationViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.multiline.anim.LiveMultiLineAnimationViewController$animModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multiline.anim.LiveMultiLineImageAnimationView;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import android.view.View;
import iq1.d;
import iq1.f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import ls1.b;
import trd.j;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiLineAnimationViewController extends ViewController	// class@0014e4
{
    public final p j;
    public LiveMultiLineImageAnimationView k;

    public void LiveMultiLineAnimationViewController(){
       super();
       this.j = s.c(LiveMultiLineAnimationViewController$animModel$2.INSTANCE);
    }
    public void F2(){
       LiveMultiLineAnimationViewController liveMultiLin = LiveMultiLineAnimationViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiLin, "2")) {
          return;
       }
       LiveMultiLineImageAnimationView liveMultiLin1 = new LiveMultiLineImageAnimationView(this.D2());
       this.k = liveMultiLin1;
       liveMultiLin1.setVisibility(8);
       LiveMultiLineAnimationViewController tk = this.k;
       if (tk == null) {
          a.S("imageAnimationView");
       }
       this.R2(tk);
       if (!PatchProxy.applyVoid(objArray, this, liveMultiLin, "4")) {
          this.V2().b.observe(this, new f(this));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLineAnimationViewController.class, "3")) {
          return;
       }
       d uod = this.V2();
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoid(null, uod, d.class, "4")) {
          b.b(uod.b).setValue(null);
          uod.a.clear();
       }
       return;
    }
    public final d V2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineAnimationViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
