package com.yxcorp.gifshow.ad.challenge.ranklist.ChallengeRankItemClickPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.challenge.ranklist.ChallengeRankItemClickPresenter;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import qvb.q;
import qvb.a;
import py8.a;
import java.util.List;
import qvb.n0;

public final class ChallengeRankItemClickPresenter$onBind$1 extends Lambda implements l	// class@001534
{
    public final ChallengeRankItemClickPresenter this$0;

    public void ChallengeRankItemClickPresenter$onBind$1(ChallengeRankItemClickPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       int i;
       ChallengeRankItemClickPresenter uChallengeRa = ChallengeRankItemClickPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ChallengeRankItemClickPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       ChallengeRankItemClickPresenter$onBind$1 tthis$0 = this.this$0;
       Activity activity = tthis$0.getActivity();
       Object[] objArray = null;
       if (!activity instanceof GifshowActivity) {
          activity = objArray;
       }
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(activity, tthis$0, uChallengeRa, "5") && activity != null) {
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.setCancelable(true);
          progressFrag.show(activity.getSupportFragmentManager(), "CHALLENGE_PROGRESS_DIALOG_TAG");
          tthis$0.v = progressFrag;
       }
       tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, uChallengeRa, "4")) {
          uChallengeRa = tthis$0.u;
          if (uChallengeRa != null) {
             uChallengeRa.f(tthis$0.w);
          }
          ChallengeRankItemClickPresenter t = tthis$0.t;
          if (t != null) {
             objArray = t.getItems();
          }
          t = tthis$0.t;
          if (t != null) {
             List items = t.getItems();
             if (items != null) {
                i = items.indexOf(tthis$0.s);
             label_0077 :
                a uoa = new a(objArray, i);
                uoa.h(tthis$0.w);
                uoa.load();
                tthis$0.u = uoa;
             }
          }
          i = 0;
          goto label_0077 ;
       }
       return;
    }
}
