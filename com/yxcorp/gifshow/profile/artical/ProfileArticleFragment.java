package com.yxcorp.gifshow.profile.artical.ProfileArticleFragment;
import com.yxcorp.gifshow.profile.fragment.ProfileTabItemFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e9c.k;
import y2c.p;
import y8c.q;
import e9c.i;
import hka.l;
import e9c.a;
import y2c.o;
import y2c.a;
import y8c.t;
import fx5.h;
import s1c.r0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.profile.artical.a;
import lkd.b;
import com.yxcorp.gifshow.profile.artical.b;
import lnc.a1;
import java.lang.CharSequence;
import l3c.a0;
import java.util.List;
import im8.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Map;
import java.lang.Boolean;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserOwnerCount;
import androidx.recyclerview.widget.RecyclerView;
import y1c.a;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$n;
import y8c.g;
import y1c.c;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import qvb.i;
import com.yxcorp.gifshow.profile.artical.d;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.artical.ProfileArticleFragment$a;
import qvb.q;
import qvb.a;

public class ProfileArticleFragment extends ProfileTabItemFragment	// class@001219
{
    public r0 F;
    public View G;
    public static final int H;

    public void ProfileArticleFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfileArticleFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new k());
       obj.U7(new p(this));
       obj.U7(new i(this));
       obj.U7(new a());
       obj.U7(new o());
       obj.U7(new a());
       PatchProxy.onMethodExit(ProfileArticleFragment.class, "5");
       return obj;
    }
    public t Bh(){
       h obj = PatchProxy.apply(null, this, ProfileArticleFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h(this, this.F.d);
       obj.f(a.a);
       obj.c(b.a);
       obj.h(a1.p(R.string.arg_RES_7f103970));
       return new a0(obj);
    }
    public void Fc(r0 p0){
       this.F = p0;
    }
    public List fg(){
       ProfileArticleFragment tF;
       Object[] obj = PatchProxy.apply(null, this, ProfileArticleFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this,tF,new c("FRAGMENT", this),tF.e};
       tF = this.F;
       return Lists.e(obj);
    }
    public int getLayoutResId(){
       return 0x7f0d11b7;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileArticleFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ProfileArticleFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       r0 obj = PatchProxy.apply(null, this, ProfileArticleFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F.d;
       if (obj.mIsPartOfDetailActivity != null && obj.mIsFullyShown == null) {
          return false;
       }
       return super.i0();
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, ProfileArticleFragment.class, "8")) {
          return;
       }
       super.th();
       View view = this.getView().findViewById(R.id.profile_article_divider);
       this.G = view;
       ProfileArticleFragment tF = this.F;
       if (tF != null) {
          r0 d = tF.d;
          if (d != null) {
             ProfileParam mUserProfile = d.mUserProfile;
             if (mUserProfile != null) {
                UserProfile mOwnerCount = mUserProfile.mOwnerCount;
                if (mOwnerCount != null && mOwnerCount.mArticlePublic > null) {
                   view.setVisibility(0);
                }
             }
          }
       }
       this.h0().addItemDecoration(new a(this.getContext()));
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ProfileArticleFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.F);
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, ProfileArticleFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NpaLinearLayoutManager(this.getContext());
    }
    public i yh(){
       d obj = PatchProxy.apply(null, this, ProfileArticleFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d(this.F.b.mId);
       obj.h(new ProfileArticleFragment$a(this));
       return obj;
    }
}
