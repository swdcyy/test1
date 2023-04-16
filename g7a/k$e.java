package g7a.k$e;
import erd.g;
import g7a.k;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import java.util.Objects;
import tkd.b;
import tkd.d;
import gx5.d;
import com.kwai.framework.model.user.PhotoGuestConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.util.List;
import java.util.Collection;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p0;
import rd5.g;
import com.kuaishou.android.model.mix.QComment;
import io.reactivex.subjects.PublishSubject;

public final class k$e implements g	// class@0023e4
{
    public final k b;

    public void k$e(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$e.class, "1")) {
       }else {
          int i = 1;
          if (!(a.g(k.W8(this.b).t(), k.P8(this.b)) ^ i)) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, p0, k.class, "4")) {
                b uob = d.a(-1188553266);
                a.o(uob, "PluginManager.get\(Profil¡­eaturePlugin::class.java\)");
                PhotoGuestConfig photoGuestCo = uob.Hj();
                if (photoGuestCo != null) {
                   k q = p0.q;
                   if (q == null) {
                      a.S("mPhoto");
                   }
                   if (photoGuestCo.a(q.created())) {
                      i.d(R.style.arg_RES_7f11066a, a1.q(R.string.arg_RES_7f104844, photoGuestCo.mTimeRangeDays));
                   }else {
                      k q1 = p0.q;
                      if (q1 == null) {
                         a.S("mPhoto");
                      }
                      List recentViewer = q1.getRecentViewers();
                      if (recentViewer != null && !recentViewer.isEmpty()) {
                         i = 0;
                      }
                      if (i) {
                         int i1 = (p0.x > null)? 0x7f100dc6: 0x7f10394b;
                         i.d(R.style.arg_RES_7f11066a, a1.p(i1));
                      }else if(!p0.C(p0.getContext())){
                         g og = new g(0, objArray);
                         og.c = 9;
                         og.d = false;
                         q1 = p0.u;
                         if (q1 == null) {
                            a.S("mShowCommentDialogPublisher");
                         }
                         q1.onNext(og);
                         p0.Y8("VIEW_RECORD");
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
