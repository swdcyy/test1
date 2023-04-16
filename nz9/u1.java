package nz9.u1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.c;
import im8.f;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import nz9.q1;
import nz9.n1;
import nz9.r1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import nz9.s1;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import com.kwai.library.widget.popup.bubble.a$c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import android.app.Activity;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import nz9.p1;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import nz9.o1;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import nz9.u1$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.bubble.a;

public class u1	// class@00324e
{
    public final Handler a;
    public final BaseFragment b;
    public a c;
    public boolean d;
    public final c e;
    public final f f;
    public final f g;
    public u1$c h;
    public String i;
    public u1$b j;
    public final IMediaPlayer$OnInfoListener k;
    public final ViewTreeObserver$OnScrollChangedListener l;
    public final Runnable m;

    public void u1(BaseFragment p0,c p1,f p2,f p3){
       super();
       this.a = new Handler(Looper.getMainLooper());
       this.i = "";
       this.k = new q1(this);
       this.l = new n1(this);
       this.m = new r1(this);
       this.b = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, u1.class, "6")) {
          return;
       }
       this.f.set(Boolean.FALSE);
       u1 te = this.e;
       if (te != null) {
          te.f(this.k);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, u1.class, "7")) {
          return;
       }
       k1.o(new s1(this));
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, u1.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.f.get();
       }
       return obj.booleanValue();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, u1.class, "5")) {
          return;
       }
       if (VisitorModeManager.f()) {
          return;
       }
       this.a();
       this.f.set(Boolean.TRUE);
       u1 te = this.e;
       if (te != null) {
          te.b(this.k);
       }
       return;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u1.class, "3")) {
          return;
       }
       if (VisitorModeManager.f()) {
          return;
       }
       p0.getViewTreeObserver().addOnScrollChangedListener(this.l);
       FragmentActivity activity = this.b.getActivity();
       Objects.requireNonNull(activity);
       a$c uoc = new a$c(activity);
       uoc.o0(p0);
       uoc.D0(BubbleInterface$Position.LEFT);
       uoc.C0(a1.e(18.00f));
       uoc.R("popup_type_bubble");
       uoc.D(PopupInterface$Excluded.NOT_AGAINST);
       uoc.T(3000);
       uoc.z(true);
       uoc.L(p1.b);
       uoc.A(true);
       uoc.J(new o1(this));
       uoc.M(new u1$a(this, p0));
       c uoc1 = uoc.k();
       uoc1.Z();
       this.c = uoc1;
       return;
    }
}
