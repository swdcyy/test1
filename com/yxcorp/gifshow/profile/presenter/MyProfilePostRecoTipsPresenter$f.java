package com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$f;
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
import java.util.Objects;
import s1c.q;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import q87.c;
import fg6.a;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoExtraParams;
import com.google.gson.Gson;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoPostParams;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.mediascene.MediaSceneInitParams;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import y36.b;
import lnc.x6;
import lnc.y6;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class MyProfilePostRecoTipsPresenter$f extends m	// class@00142f
{
    public final MyProfilePostRecoTipsPresenter c;
    public final ProfilePostRecoTip d;

    public void MyProfilePostRecoTipsPresenter$f(MyProfilePostRecoTipsPresenter p0,ProfilePostRecoTip p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfilePostRecoTipsPresenter$f.class, "1")) {
          return;
       }
       this.c.d9(false);
       y1.R(MyProfilePostRecoTipsPresenter.P8(this.c), this.d.getMaterialId(), this.d.getMaterialName(), "template");
       MyProfilePostRecoTipsPresenter$f tc = this.c;
       MyProfilePostRecoTipsPresenter$f td = this.d;
       Objects.requireNonNull(tc);
       MyProfilePostRecoTipsPresenter myProfilePos = MyProfilePostRecoTipsPresenter.class;
       if (!PatchProxy.applyVoidOneRefs(td, tc, myProfilePos, "16")) {
          String str = "MyProfilePostRecoTipsPresenter";
          if (td.getExtParams() == null) {
             q.C().e(str, "launchMediaScene\(\) no extParams", new IllegalArgumentException());
          }else {
             ProfilePostRecoPostParams postParams = a.a.h(td.getExtParams(), ProfilePostRecoExtraParams.class).getPostParams();
             if (postParams == null) {
                q.C().e(str, "launchMediaScene\(\) no postParams", new IllegalArgumentException());
             }else {
                MediaSceneInitParams mediaSceneIn = PatchProxy.applyOneRefs(postParams, tc, myProfilePos, "17");
                if (mediaSceneIn != PatchProxyResult.class) {
                }else {
                   mediaSceneIn = new MediaSceneInitParams();
                   mediaSceneIn.mServerParams = null;
                   MediaSceneLaunchParams mediaSceneLa = new MediaSceneLaunchParams();
                   mediaSceneLa.mTemplateId = postParams.getTemplateId();
                   mediaSceneLa.mSceneType = postParams.getVideoSceneType();
                   mediaSceneLa.mRequirePreview = postParams.getRequirePreview();
                   mediaSceneLa.mRequireAlbum = postParams.getRequireAlbum();
                   mediaSceneLa.mTopColor = postParams.getTopColor();
                   mediaSceneLa.mBottomColor = postParams.getBottomColor();
                   mediaSceneLa.mReturnOriginPage = postParams.getReturnOriginPage();
                   mediaSceneLa.mBizParams = postParams.getBizParams();
                   mediaSceneLa.mUseCommonInterface = postParams.getUseCommonInterface();
                   mediaSceneLa.mAllowJumpToolbox = postParams.getAllowJumpToolbox();
                   mediaSceneIn.mLaunchParams = mediaSceneLa;
                }
                b uob = y6.r(b.class);
                if (uob != null) {
                   MyProfilePostRecoTipsPresenter s = tc.s;
                   if (s == null) {
                      a.S("mBaseFragment");
                   }
                   FragmentActivity uFragmentAct = s.requireActivity();
                   a.o(uFragmentAct, "mBaseFragment.requireActivity\(\)");
                   uob.JQ(uFragmentAct, mediaSceneIn);
                }
             }
          }
       }
       return;
    }
}
