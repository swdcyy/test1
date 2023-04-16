package i3a.a;
import i3a.a$a;
import nsd.u;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import p3a.b;
import java.util.ArrayList;
import j3a.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import p3a.a;
import com.yxcorp.gifshow.detail.player.panel.ui.ElementTypes$register$1;
import msd.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.detail.player.panel.elements.TextElement;
import androidx.fragment.app.KwaiDialogFragment;
import msd.l;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import k3a.m;
import trd.y;
import com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment;
import com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment$a;
import com.kwai.robust.PatchProxyResult;
import i3a.a$b;
import android.content.DialogInterface$OnShowListener;
import i3a.a$c;
import android.content.DialogInterface$OnCancelListener;
import i3a.a$d;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import qrd.l1;

public final class a	// class@002771
{
    public PhotoPlayerPanelFragment a;
    public int b;
    public final b c;
    public final ArrayList d;
    public l e;
    public final List f;
    public final List g;
    public final FragmentActivity h;
    public static final a$a i;

    static {
       a.i = new a$a(null);
    }
    public void a(FragmentActivity p0){
       a.p(p0, "activity");
       super();
       this.h = p0;
       this.c = new b();
       ArrayList uArrayList = new ArrayList();
       this.d = uArrayList;
       this.f = uArrayList;
       this.g = new ArrayList();
    }
    public final void a(a p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       String str1 = "element";
       a.p(p0, str1);
       this.d.add(p0);
       a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, b.class, str)) {
          a.p(p0, str1);
          if (tc.a(p0) == -1) {
             tc.a.add(new a(p0.getClass(), new ElementTypes$register$1(p0)));
          }
       }
       if (p0.c()) {
          p0.f(0);
          this.b = 0;
       }else {
          p0.f(this.b);
          int i = this.b + 1;
          this.b = i;
          if (i >= 5) {
             this.b = 0;
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa instanceof TextElement) {
             uoa.k(false);
          }
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.dismiss();
       }
       this.a = null;
       return;
    }
    public final void d(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "onShow");
       if (CollectionsKt___CollectionsKt.e3(this.d) instanceof m) {
          y.O0(this.d);
       }
       PhotoPlayerPanelFragment$a c = PhotoPlayerPanelFragment.C;
       a tf = this.f;
       a tc = this.c;
       Objects.requireNonNull(c);
       PhotoPlayerPanelFragment photoPlayerP = PatchProxy.applyTwoRefs(tf, tc, c, PhotoPlayerPanelFragment$a.class, "1");
       if (photoPlayerP != PatchProxyResult.class) {
       }else {
          a.p(tf, "elements");
          a.p(tc, "elementTypes");
          photoPlayerP = new PhotoPlayerPanelFragment();
          photoPlayerP.z = tf;
          photoPlayerP.A = tc;
       }
       photoPlayerP.ph(new a$b(this, p0));
       photoPlayerP.oh(new a$c(this, p0));
       photoPlayerP.k0(new a$d(this, p0));
       photoPlayerP.Cb(this.h.getSupportFragmentManager(), "PlayerPanel");
       this.a = photoPlayerP;
       return;
    }
}
