package com.yxcorp.gifshow.profile.helper.guide.PendantAvatarProcessor;
import m3c.a;
import java.lang.Class;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.profile.helper.guide.PendantAvatarProcessor$mEmptyView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.social.profile.model.ProfilePostEmptyGuide;
import com.kwai.robust.PatchProxy;
import fx5.a;
import com.kwai.feature.api.social.profile.model.PendantAvatarContent;
import zf6.k;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.sdk.switchconfig.a;
import com.kwai.library.widget.sensormanager.KwaiSensorManager;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import v17.b;
import com.kwai.feature.api.social.profile.model.PendantAvatarContent$PendantAvatarButton;
import com.yxcorp.gifshow.profile.helper.guide.PendantAvatarProcessor$a;
import com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.robust.PatchProxyResult;

public final class PendantAvatarProcessor extends a	// class@00133f
{
    public KwaiImageView e;
    public KwaiImageView f;
    public TextView g;
    public KwaiGravityEffectButton h;
    public final p i;

    public void PendantAvatarProcessor(Class p0,BaseFragment p1,RecyclerFragment p2,ProfileParam p3){
       a.p(p0, "contentClass");
       a.p(p1, "baseFragment");
       a.p(p2, "recyclerFragment");
       a.p(p3, "profileParam");
       super(p0, p1, p2, p3);
       this.i = s.b(LazyThreadSafetyMode.NONE, new PendantAvatarProcessor$mEmptyView$2(this));
    }
    public void a(ProfilePostEmptyGuide p0){
       PendantAvatarContent mDefaultDark;
       a$a uoa;
       a$a uoa1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantAvatarProcessor.class, "3")) {
          return;
       }
       a.p(p0, "profilePostEmptyGuide");
       PendantAvatarContent pendantAvata = this.b(p0);
       if (pendantAvata != null) {
          a.o(pendantAvata, "getContent\(profilePostEmptyGuide\) ?: return");
          PendantAvatarProcessor te = this.e;
          String str = ":ks-features:ft-social:profile";
          String str1 = 1;
          boolean b = false;
          if (te != null) {
             mDefaultDark = (k.d())? pendantAvata.mDefaultDarkHeadUrls: pendantAvata.mDefaultHeadUrls;
             if (mDefaultDark != null) {
                int i = (!mDefaultDark.length)? 1: 0;
                if (!i) {
                   uoa = null;
                label_003e :
                   if (!uoa) {
                      uoa = a.d();
                      uoa.b(str);
                      te.X(mDefaultDark, uoa.a());
                   }
                }
             }
             uoa = 1;
             goto label_003e ;
          }
          te = this.f;
          if (te != null) {
             mDefaultDark = pendantAvata.mPendantUrls;
             if (mDefaultDark != null) {
                uoa1 = (!mDefaultDark.length)? 1: null;
                if (!uoa1) {
                   str1 = null;
                }
             }
             if (str1) {
                te.setVisibility(8);
             }else {
                te.setVisibility(b);
                uoa1 = a.d();
                uoa1.b(str);
                te.X(pendantAvata.mPendantUrls, uoa1.a());
             }
          }
          te = this.g;
          if (te != null) {
             te.setText(pendantAvata.mTitle);
          }
          te = this.h;
          if (te != null && a.t().d("enableGravityEffectButton", b)) {
             a tc = this.c;
             a.o(tc, "mRecyclerFragment");
             KwaiSensorManager.d().g(tc.getLifecycle(), te);
          }
          te = this.h;
          if (te != null) {
             te.setText(pendantAvata.mButton.mTitle);
             PendantAvatarContent$PendantAvatarButton mLinkUri = pendantAvata.mButton.mLinkUri;
             if (mLinkUri != null) {
                te.setOnClickListener(new PendantAvatarProcessor$a(mLinkUri, te, this, pendantAvata));
             }
          }
       }
    label_00bf :
       return;
    }
    public View c(ProfilePostEmptyGuide p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantAvatarProcessor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "profilePostEmptyGuide");
       View view = PatchProxy.apply(null, this, PendantAvatarProcessor.class, "1");
       if (view == PatchProxyResult.class) {
          view = this.i.getValue();
       }
       return view;
    }
}
