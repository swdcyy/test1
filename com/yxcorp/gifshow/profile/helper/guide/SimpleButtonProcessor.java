package com.yxcorp.gifshow.profile.helper.guide.SimpleButtonProcessor;
import m3c.a;
import java.lang.Class;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.profile.helper.guide.SimpleButtonProcessor$mEmptyView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.social.profile.model.ProfilePostEmptyGuide;
import com.kwai.robust.PatchProxy;
import fx5.a;
import fx5.i;
import k2b.e0;
import java.util.Map;
import z5c.y1;
import zf6.k;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.text.Spanned;
import y1.b;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.sdk.switchconfig.a;
import com.kwai.library.widget.sensormanager.KwaiSensorManager;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import v17.b;
import com.yxcorp.gifshow.profile.helper.guide.SimpleButtonProcessor$a;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.robust.PatchProxyResult;

public final class SimpleButtonProcessor extends a	// class@001342
{
    public KwaiImageView e;
    public TextView f;
    public KwaiGravityEffectButton g;
    public boolean h;
    public final p i;

    public void SimpleButtonProcessor(Class p0,BaseFragment p1,RecyclerFragment p2,ProfileParam p3){
       a.p(p0, "contentClass");
       a.p(p1, "baseFragment");
       a.p(p2, "recyclerFragment");
       super(p0, p1, p2, p3);
       this.i = s.b(LazyThreadSafetyMode.NONE, new SimpleButtonProcessor$mEmptyView$2(this));
    }
    public void a(ProfilePostEmptyGuide p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleButtonProcessor.class, "3")) {
          return;
       }
       a.p(p0, "profilePostEmptyGuide");
       i oi = this.b(p0);
       if (oi != null) {
          a.o(oi, "getContent\(profilePostEmptyGuide\) ?: return");
          int i = 0;
          if (this.h == null) {
             b = true;
             this.h = b;
             y1.Z(this.b, b, i, p0.b);
          }
          b = k.d();
          SimpleButtonProcessor te = this.e;
          if (te != null) {
             i mIconDarkUrl = (b)? oi.mIconDarkUrl: oi.mIconLightUrl;
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-social:profile");
             uoa.d(ImageSource.ICON);
             te.M(mIconDarkUrl, uoa.a());
          }
          te = this.f;
          if (te != null) {
             i mTitleDark = (b)? oi.mTitleDark: oi.mTitleLight;
             te.setText(b.a(mTitleDark, i));
          }
          SimpleButtonProcessor tg = this.g;
          if (tg != null) {
             if (a.t().d("enableGravityEffectButton", i)) {
                a tc = this.c;
                a.o(tc, "mRecyclerFragment");
                KwaiSensorManager.d().g(tc.getLifecycle(), tg);
             }
             if (oi.mButtonLinkUri != null) {
                tg.setOnClickListener(new SimpleButtonProcessor$a(this, oi, p0));
             }
             tg.setText(oi.mButtonTitle);
          }
       }
       return;
    }
    public View c(ProfilePostEmptyGuide p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleButtonProcessor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "profilePostEmptyGuide");
       View view = PatchProxy.apply(null, this, SimpleButtonProcessor.class, "1");
       if (view == PatchProxyResult.class) {
          view = this.i.getValue();
       }
       return view;
    }
}
