package dac.b;
import dac.b$c;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xwb.c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.relation.model.ExploreFriendParams;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.d;
import androidx.lifecycle.LifecycleOwner;
import qrd.l1;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import dac.b$a;
import erd.a;
import dac.b$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Boolean;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import dac.b$d;
import java.lang.Runnable;

public final class b	// class@002136
{
    public final c a;
    public ExploreFriendParams b;
    public final ContactPermissionHolder c;
    public final BaseFragment d;
    public static final b$c e;

    static {
       b.e = new b$c(null);
    }
    public void b(BaseFragment p0){
       String str = "host";
       a.p(p0, str);
       super();
       this.d = p0;
       c uoc = new c();
       this.a = uoc;
       b$c e = b.e;
       Objects.requireNonNull(e);
       ExploreFriendParams uExploreFrie = PatchProxy.applyOneRefs(p0, e, b$c.class, "2");
       if (uExploreFrie == PatchProxyResult.class) {
          a.p(p0, str);
          Bundle arguments = p0.getArguments();
          uExploreFrie = null;
          Serializable serializable = (arguments != null)? SerializableHook.getSerializable(arguments, "exploreFriendParams"): uExploreFrie;
          if (serializable instanceof ExploreFriendParams) {
             uExploreFrie = serializable;
          }
       }
       this.b = uExploreFrie;
       ContactPermissionHolder uContactPerm = new ContactPermissionHolder(new b(uoc));
       uContactPerm.f = true;
       uContactPerm.l(p0);
       this.c = uContactPerm;
       p0.Vg().k().compose(p0.Ug(FragmentEvent.DESTROY)).doOnTerminate(b$a.b).subscribe(new b$b(this), Functions.d());
       return;
    }
    public static final void a(Bundle p0,ExploreFriendParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "7")) {
          return;
       }
       b$c e = b.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, e, b$c.class, "1")) {
          a.p(p0, "args");
          a.p(p1, "params");
          SerializableHook.putSerializable(p0, "exploreFriendParams", p1);
       }
       return;
    }
    public static void d(b p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.b(p1);
       return;
    }
    public final void b(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.c(p0, -1);
       return;
    }
    public final void c(boolean p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uob, "4")) {
          return;
       }
       FragmentActivity activity = this.d.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.c.g(activity, p1, new b$d(this, p0));
       return;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.d();
    }
}
