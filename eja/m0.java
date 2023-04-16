package eja.m0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import eja.m0$a;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import dha.g;
import brd.t;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dha.g$a;
import wkd.b;
import l66.a;
import eja.m0$b;
import kga.c;
import erd.g;
import crd.b;
import dha.a;
import xl8.b;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import eja.m0$c;

public final class m0 extends PresenterV2	// class@0026da
{
    public a p;
    public g q;
    public b r;
    public static boolean s;
    public static final m0$a t;

    static {
       m0.t = new m0$a(null);
    }
    public void m0(){
       super();
    }
    public void E8(){
       g a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m0.class, "2")) {
          return;
       }
       m0 tq = this.q;
       if (tq == null) {
          a.S("mPhotoClickedState");
       }
       Objects.requireNonNull(tq);
       g og = PatchProxy.apply(objArray, tq, g.class, "1");
       if (og != patchProxyRe) {
       }else if(tq.b.isDetached() || tq.b.getActivity() == null){
          tq.a();
          og = t.empty();
       }else if(tq.c == null){
          tq.c = new g$a(tq);
          b.a(0x6d2a4fdd).a(tq.c);
       }
       og = tq.a;
       a = c.a;
       this.X7(og.subscribe(new m0$b(this), a));
       tq = this.p;
       if (tq == null) {
          a.S("mFromDetailBackState");
       }
       Objects.requireNonNull(tq);
       t ot = PatchProxy.apply(objArray, tq, a.class, "1");
       if (ot != patchProxyRe) {
       }else if(tq.a.isDetached() || tq.a.getActivity() == null){
          ot = t.empty();
       }else {
          ot = tq.b.observable().compose(tq.a.Ug(FragmentEvent.DESTROY));
       }
       this.X7(ot.subscribe(m0$c.b, a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "1")) {
          return;
       }
       Object obj = this.r8("HOME_FOLLOW_FROM_DETAIL_BACK_STATE");
       a.o(obj, "inject\(FollowAccessIds.H¡­W_FROM_DETAIL_BACK_STATE\)");
       this.p = obj;
       obj = this.r8("HOME_FOLLOW_PHOTO_CLICKED");
       a.o(obj, "inject\(FollowAccessIds.HOME_FOLLOW_PHOTO_CLICKED\)");
       this.q = obj;
       obj = this.r8("FOLLOW_SELECTOR_IS_DEFAULT_RANK");
       a.o(obj, "inject\(SocialAccessIds.F¡­SELECTOR_IS_DEFAULT_RANK\)");
       this.r = obj;
       return;
    }
}
