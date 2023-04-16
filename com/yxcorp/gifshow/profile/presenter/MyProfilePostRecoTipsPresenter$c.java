package com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoTip;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import z5c.y1;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import o79.i;
import java.lang.CharSequence;
import e17.i;
import kotlin.jvm.internal.a;

public final class MyProfilePostRecoTipsPresenter$c extends m	// class@00142c
{
    public final MyProfilePostRecoTipsPresenter c;
    public final ProfilePostRecoTip d;

    public void MyProfilePostRecoTipsPresenter$c(MyProfilePostRecoTipsPresenter p0,ProfilePostRecoTip p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfilePostRecoTipsPresenter$c.class, "1")) {
          return;
       }
       this.c.d9(false);
       y1.R(MyProfilePostRecoTipsPresenter.P8(this.c), "", "", "annual_album");
       String scheme = this.d.getScheme();
       if (scheme != null) {
          KwaiYodaWebViewActivity.L3(this.c.getContext(), scheme);
       }else {
          a.o(i.d(R.style.arg_RES_7f110668, i.p(R.string.arg_RES_7f1031f5)), "KSToast.applyStyle\(R.sty¡­emory_network_error_tip\)\)");
       }
       return;
    }
}
