package e7a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e7a.b$a;
import nsd.u;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import e7a.b$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import e7a.b$c;
import erd.g;
import crd.b;

public final class b extends PresenterV2	// class@00207f
{
    public a p;
    public BaseFragment q;
    public final IMediaPlayer$OnInfoListener r;
    public static boolean s;
    public static final b$a t;

    static {
       b.t = new b$a(null);
    }
    public void b(NasaSlideParam p0){
       a.p(p0, "nasaSlideParams");
       super();
       this.r = new b$b(this, p0);
    }
    public static final BaseFragment P8(b p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          e player = tp.getPlayer();
          if (player != null) {
             player.addOnInfoListener(this.r);
          }
       }
       Activity activity = this.getActivity();
       if (activity != null && activity instanceof GifshowActivity) {
          this.X7(activity.m().subscribe(b$c.b));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          e player = tp.getPlayer();
          if (player != null) {
             player.removeOnInfoListener(this.r);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.s8(a.class);
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       return;
    }
}
