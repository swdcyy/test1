package gqb.p$b;
import android.view.View$OnClickListener;
import gqb.p;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import dqb.a;
import g9c.a;
import dqb.e;
import android.content.Context;
import qm9.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger$MusicRadioBtnType;

public final class p$b implements View$OnClickListener	// class@002b86
{
    public final p b;

    public void p$b(p p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$b.class, "1")) {
          return;
       }
       p$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, p.class, "4") && tb.getActivity() != null) {
          Activity activity = tb.getActivity();
          if (activity == null || activity.isFinishing() != true) {
             p q = tb.q;
             String str = "mSlidePlayViewModel";
             if (q == null) {
                a.S(str);
             }
             List list = q.V0();
             int i = (list != null)? list.size(): 0;
             if (i > 0) {
                if (tb.r == null) {
                   a uoa = new a();
                   tb.s = uoa;
                   p q1 = tb.q;
                   if (q1 == null) {
                      a.S(str);
                   }
                   uoa.W0(q1.V0());
                   Activity activity1 = tb.getActivity();
                   a.m(activity1);
                   a.o(activity1, "activity!!");
                   p s = tb.s;
                   a.m(s);
                   a.p(activity1, "context");
                   a.p(s, "musicDialogAdapter");
                   e uoe = new e(activity1);
                   uoe.s = activity1;
                   uoe.r = s;
                   tb.r = uoe;
                }
                q = tb.r;
                if (q != null) {
                   q.show();
                }
                p q2 = tb.q;
                if (q2 == null) {
                   a.S(str);
                }
                MusicRadioLogger.f(MusicRadioLogger.a(q2.getCurrentPhoto()), MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_LIST.getType(), 0, 4, null);
             }
          }
       }
       return;
    }
}
