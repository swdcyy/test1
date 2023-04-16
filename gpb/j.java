package gpb.j;
import android.animation.AnimatorListenerAdapter;
import gpb.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import kotlin.jvm.internal.a;
import k2b.e0;
import k2b.u1;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import com.yxcorp.gifshow.util.rx.RxBus;
import b46.a;

public final class j extends AnimatorListenerAdapter	// class@002b62
{
    public final i a;

    public void j(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       Fragment parentFragme = i.P8(this.a).getParentFragment();
       if (parentFragme != null) {
          e uoe = parentFragme.getChildFragmentManager().beginTransaction();
          a.o(uoe, "parentFragment.childFrag¡­anager.beginTransaction\(\)");
          uoe.u(i.P8(this.a)).m();
          i t = this.a.t;
          if (t == null) {
             a.S("originLogPage");
          }
          u1.L0(t);
          t = this.a.q;
          if (t == null) {
             a.S("searchPanelInteraction");
          }
          t.onHideMusicSearchPanel();
          t.u = false;
          RxBus.f.b(new a(false));
       }
       return;
    }
}
