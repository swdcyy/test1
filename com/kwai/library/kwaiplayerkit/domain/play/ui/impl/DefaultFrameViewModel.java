package com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel;
import nx6.b;
import android.view.View$OnLayoutChangeListener;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel$b;
import nsd.u;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel$a;
import ux6.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel$c;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel$mDelegateLayoutListener$1;
import msd.a;
import qrd.p;
import qrd.s;
import android.widget.FrameLayout$LayoutParams;
import mrd.a;
import java.util.concurrent.CopyOnWriteArraySet;
import ay6.k;
import px6.e;
import java.lang.StringBuilder;
import java.lang.Integer;
import ux6.e;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import ox6.a$b;
import xx6.d;
import ox6.a;
import android.view.View;
import java.util.Iterator;
import java.lang.Iterable;

public final class DefaultFrameViewModel implements b, View$OnLayoutChangeListener	// class@000863
{
    public final DefaultFrameViewModel$c b;
    public boolean c;
    public final p d;
    public final p e;
    public final b f;
    public static g g;
    public static final DefaultFrameViewModel$b h;

    static {
       DefaultFrameViewModel.h = new DefaultFrameViewModel$b(null);
       DefaultFrameViewModel.g = new DefaultFrameViewModel$a();
    }
    public void DefaultFrameViewModel(b p0){
       a.p(p0, "mContext");
       super();
       this.f = p0;
       this.b = new DefaultFrameViewModel$c();
       p op = s.c(DefaultFrameViewModel$mDelegateLayoutListener$1.INSTANCE);
       this.d = op;
       this.e = op;
    }
    public void a(FrameLayout$LayoutParams p0){
       a.p(p0, "params");
       this.b.b().onNext(p0);
    }
    public void b(View$OnLayoutChangeListener p0){
       a.p(p0, "listener");
       this.h().remove(p0);
    }
    public void c(int p0,int p1){
       FrameLayout$LayoutParams layoutParams = this.b.b().i();
       if (layoutParams == null) {
          layoutParams = new FrameLayout$LayoutParams(-1, -1);
          layoutParams.gravity = 17;
       }
       layoutParams.width = p0;
       layoutParams.height = p1;
       this.b.b().onNext(layoutParams);
       return;
    }
    public void d(View$OnLayoutChangeListener p0){
       a.p(p0, "listener");
       this.h().add(p0);
    }
    public void e(int p0){
       e.a().i("DefaultFrameViewModel", this.f.e()+", "+"changeSurfaceType manual");
       this.b.d().onNext(Integer.valueOf(p0));
    }
    public e f(){
       return this.i();
    }
    public void g(Bitmap p0){
       a.p(p0, "bitmap");
       this.b.a().onNext(new WeakReference(p0));
    }
    public final CopyOnWriteArraySet h(){
       return this.e.getValue();
    }
    public DefaultFrameViewModel$c i(){
       return this.b;
    }
    public final void j(IWaynePlayer p0){
       a.p(p0, "player");
       a$b uob = new a$b();
       uob.a = this.c;
       d uod = this.f.d();
       if (uod != null) {
          String str = uod.j();
          if (str != null) {
             a.p(str, "<set-?>");
             uob.b = str;
          }
       }
       this.b.c().onNext(new a(p0, uob));
       return;
    }
    public final void k(){
       this.b.c().onNext(DefaultFrameViewModel.g);
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (!this.d.isInitialized()) {
          return;
       }
       Iterator iterator = this.h().iterator();
       while (iterator.hasNext()) {
          iterator.next().onLayoutChange(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       }
       return;
    }
}
