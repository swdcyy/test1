package com.yxcorp.gifshow.custom.ShareCustomFragment;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment;
import com.yxcorp.gifshow.custom.ShareCustomFragment$a;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
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
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import pt9.o;
import androidx.lifecycle.ViewModel;
import pt9.c;
import lnc.a1;
import pt9.f;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ex8.a;
import pt9.d;
import android.view.View;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;

public final class ShareCustomFragment extends ShareDialogContainerFragment	// class@00128f
{
    public final PresenterV2 A;
    public final float y;
    public o z;
    public static final ShareCustomFragment$a B;

    static {
       ShareCustomFragment.B = new ShareCustomFragment$a(null);
    }
    public void ShareCustomFragment(){
       super();
       this.y = 0.40f;
       this.A = new PresenterV2();
    }
    public String E7(){
       return "ShareMoreOption";
    }
    public void onActivityCreated(Bundle p0){
       FragmentActivity activity;
       ViewModel viewModel;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareCustomFragment.class, "1")) {
          return;
       }
       super.onActivityCreated(p0);
       String str = "ShareCustomFragment";
       if (this.getActivity() == null) {
          PostUtils.D(str, "activity is not allow null", new IllegalArgumentException("activity is not allow null"));
          return;
       }else {
          Object[] objArray = new Object[0];
          a.b().w(str, "onActivityCreated init viewModel", objArray);
          activity = this.getActivity();
          a.m(activity);
          viewModel = ViewModelProviders.of(activity).get(o.class);
          a.o(viewModel, "ViewModelProviders.of\(ac¡­tomViewModel::class.java\)");
          this.z = viewModel;
          String str1 = a1.p(R.string.arg_RES_7f10402f);
          a.o(str1, "CommonUtil.string\(R.stri¡­ublish_page_more_setting\)");
          this.A.U7(new c(this, str1));
          FragmentActivity activity1 = this.getActivity();
          Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          this.A.U7(new f(this, activity1));
          activity1 = this.getActivity();
          Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          this.A.U7(new a(activity1));
          activity1 = this.getActivity();
          Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          this.A.U7(new d(activity1));
          this.A.f(this.uh());
          Object[] objArray1 = new Object[0];
          this.A.i(objArray1);
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ShareCustomFragment.class, "2")) {
          return;
       }
       super.onDestroy();
       this.A.destroy();
       return;
    }
    public float sh(){
       return this.y;
    }
    public int th(){
       return 0x7f0d14e1;
    }
}
