package com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c;
import ux6.a;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import android.view.View;
import java.lang.Object;
import ux6.d;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import java.lang.String;
import java.util.Objects;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel$c;
import mrd.a;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c$a;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c$b;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c$c;
import zx6.a;
import brd.z;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c$d;
import android.view.View$OnLayoutChangeListener;

public final class DefaultFrameUiModule$c implements a	// class@00085c
{
    public b a;
    public b b;
    public b c;
    public b d;
    public final DefaultFrameUiModule e;
    public final View f;

    public void DefaultFrameUiModule$c(DefaultFrameUiModule p0,View p1){
       this.e = p0;
       this.f = p1;
       super();
    }
    public void a(){
       d uod = this.e.l();
       Objects.requireNonNull(uod, "null cannot be cast to non-null type com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel");
       DefaultFrameUiModule$c tf = this.f;
       Objects.requireNonNull(tf, "null cannot be cast to non-null type com.kwai.framework.player.ui.impl.PlayerKitContentFrame");
       DefaultFrameViewModel$c uoc = uod.i();
       this.a = uoc.c().subscribe(new DefaultFrameUiModule$c$a(tf));
       this.b = uoc.a().subscribe(new DefaultFrameUiModule$c$b(tf));
       a uoa = null;
       if (uoc.b().i() == null) {
          ViewGroup$LayoutParams layoutParams = tf.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          uoc.b().onNext(layoutParams);
          uoa = 1;
       }
       this.c = uoc.b().skip(uoa).subscribe(new DefaultFrameUiModule$c$c(tf));
       this.d = uoc.d().observeOn(a.a).subscribe(new DefaultFrameUiModule$c$d(tf));
       tf.addOnLayoutChangeListener(uod);
       return;
    }
    public void b(){
       DefaultFrameUiModule$c ta = this.a;
       if (ta != null) {
          ta.dispose();
       }
       ta = this.b;
       if (ta != null) {
          ta.dispose();
       }
       ta = this.c;
       if (ta != null) {
          ta.dispose();
       }
       ta = this.d;
       if (ta != null) {
          ta.dispose();
       }
       d uod = this.e.l();
       Objects.requireNonNull(uod, "null cannot be cast to non-null type com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel");
       DefaultFrameUiModule$c tf = this.f;
       Objects.requireNonNull(tf, "null cannot be cast to non-null type com.kwai.framework.player.ui.impl.PlayerKitContentFrame");
       tf.removeOnLayoutChangeListener(uod);
       return;
    }
}
