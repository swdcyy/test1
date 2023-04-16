package com.yxcorp.gifshow.visible.ShareVisibleFragment;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment;
import com.yxcorp.gifshow.visible.ShareVisibleFragment$a;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Bundle;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import f66.i;
import jq.a;
import q87.c;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import qka.b;
import com.yxcorp.gifshow.visible.ShareVisibleRepo;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.visible.ShareVisibleFragment$ItemsVisibilityConfig;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import rxc.l;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import pt9.c;
import lnc.a1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import rxc.g;
import android.view.View;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.kwai.feature.post.api.fragment.FlyWheelKwaiDialogFragment;
import com.yxcorp.gifshow.visible.ShareVisibleFragment$b;
import com.yxcorp.gifshow.widget.m;
import ekd.m1;
import lq.i;

public final class ShareVisibleFragment extends ShareDialogContainerFragment	// class@0016b7
{
    public c A;
    public ShareVisibleFragment$ItemsVisibilityConfig B;
    public final float C;
    public final PresenterV2 y;
    public boolean z;
    public static final ShareVisibleFragment$a D;

    static {
       ShareVisibleFragment.D = new ShareVisibleFragment$a(null);
    }
    public void ShareVisibleFragment(){
       super();
       this.y = new PresenterV2();
       this.C = 0.40f;
    }
    public int getTheme(){
       return 0x7f1102a2;
    }
    public void onActivityCreated(Bundle p0){
       FragmentActivity activity;
       ShareVisibleViewModel shareVisible2;
       String str2;
       FragmentActivity activity1;
       ShareVisibleViewModel shareVisible = ShareVisibleViewModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareVisibleFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       String str = "ShareVisibleFragment";
       if (this.getActivity() == null) {
          PostUtils.D(str, "activity is not allow null", new IllegalArgumentException("activity is not allow null"));
          return;
       }else {
          Object[] objArray = new Object[0];
          a.b().w(str, "onActivityCreated init viewModel", objArray);
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null && this.z != null) {
                b.a(window);
             }
          }
          ShareVisibleFragment tA = this.A;
          KtvInfo ktvInfo = null;
          VideoContext videoContext = (tA != null)? tA.d1(): ktvInfo;
          ShareVisibleRepo shareVisible1 = new ShareVisibleRepo(tA, videoContext, ktvInfo, Boolean.TRUE);
          tA = this.B;
          if (tA == null) {
             a.S("mItemsVisibilityConfig");
          }
          ShareVisibleFragment$ItemsVisibilityConfig sHARE = ShareVisibleFragment$ItemsVisibilityConfig.SHARE;
          String str1 = "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity";
          if (tA == sHARE) {
             activity = this.getActivity();
             Objects.requireNonNull(activity, str1);
             shareVisible2 = ViewModelProviders.of(activity, new l(shareVisible1)).get(shareVisible);
          }else {
             shareVisible2 = ViewModelProviders.of(this, new l(shareVisible1)).get(shareVisible);
          }
          a.o(shareVisible2, "if \(mItemsVisibilityConf¡­el::class.java\)\n        }");
          ShareVisibleFragment ty = this.y;
          ShareVisibleFragment tB = this.B;
          if (tB == null) {
             a.S("mItemsVisibilityConfig");
          }
          if (tB == sHARE) {
             str2 = a1.p(R.string.arg_RES_7f104046);
          }else {
             activity1 = this.getActivity();
             Objects.requireNonNull(activity1, str1);
             str2 = (!PostExperimentUtils.B0(activity1))? a1.p(R.string.arg_RES_7f100ccf): a1.p(R.string.arg_RES_7f100cd5);
          }
          a.o(str2, "if \(mItemsVisibilityConf¡­dialog_title\)\n          }");
          ty.U7(new c(this, str2));
          ty = this.y;
          activity1 = this.getActivity();
          Objects.requireNonNull(activity1, str1);
          ShareVisibleFragment tB1 = this.B;
          if (tB1 == null) {
             a.S("mItemsVisibilityConfig");
          }
          ty.U7(new g(activity1, this, shareVisible2, tB1));
          this.y.f(this.uh());
          Object[] objArray1 = new Object[0];
          this.y.i(objArray1);
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareVisibleFragment.class, "3")) {
          return;
       }
       if (p0 != null) {
          Object[] objArray = new Object[0];
          a.b().w("ShareVisibleFragment", "restore,  dismiss now", objArray);
          this.dismissAllowingStateLoss();
       }
       super.onCreate(p0);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ShareVisibleFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       this.y.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareVisibleFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       m1.b(p0, new ShareVisibleFragment$b(this), R.id.empty);
       if (i.h()) {
          i.m().Q("photoVisibilityDialogShowed", Boolean.TRUE);
       }
       return;
    }
    public float sh(){
       return this.C;
    }
    public int th(){
       return 0x7f0d1506;
    }
}
