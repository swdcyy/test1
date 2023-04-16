package com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment;
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
import t1c.d;
import y2c.a;
import y8c.t;
import l3c.a0;
import fx5.h;
import kotlin.jvm.internal.a;
import s1c.r0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment$b;
import lkd.b;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment$c;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import java.util.List;
import im8.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map;
import java.lang.Boolean;
import java.util.HashMap;
import y8c.g;
import t1c.b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import qvb.i;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunPageList;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment$a;
import qvb.q;
import qvb.a;

public final class ProfileAcFunFragment extends ProfileTabItemFragment	// class@0011ec
{
    public r0 F;
    public HashMap G;

    public void ProfileAcFunFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfileAcFunFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new k());
       obj.U7(new p(this));
       obj.U7(new i(this));
       obj.U7(new a());
       obj.U7(new o());
       obj.U7(new d());
       obj.U7(new a());
       PatchProxy.onMethodExit(ProfileAcFunFragment.class, "6");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ProfileAcFunFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ProfileAcFunFragment tF = this.F;
       if (tF == null) {
          a.S("mProfilePageParam");
       }
       h oh = new h(this, tF.d);
       oh.f(new ProfileAcFunFragment$b(this));
       oh.c(ProfileAcFunFragment$c.a);
       oh.h(this.getResources().getString(R.string.arg_RES_7f103f73));
       return new a0(oh);
    }
    public void Fc(r0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileAcFunFragment.class, "3")) {
          return;
       }
       a.p(p0, "profilePageParam");
       this.F = p0;
       return;
    }
    public final r0 Gh(){
       ProfileAcFunFragment obj = PatchProxy.apply(null, this, ProfileAcFunFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj == null) {
          a.S("mProfilePageParam");
       }
       return obj;
    }
    public boolean Xg(){
       return false;
    }
    public List fg(){
       Object[] obj = PatchProxy.apply(null, this, ProfileAcFunFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[4];
       obj[0] = this;
       int i = 1;
       ProfileAcFunFragment tF = this.F;
       String str = "mProfilePageParam";
       if (tF == null) {
          a.S(str);
       }
       obj[i] = tF;
       i = 2;
       tF = this.F;
       if (tF == null) {
          a.S(str);
       }
       obj[i] = tF.e;
       obj[3] = new c("FRAGMENT", this);
       return CollectionsKt__CollectionsKt.L(obj);
    }
    public int getLayoutResId(){
       return 0x7f0d11b4;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileAcFunFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ProfileAcFunFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       boolean b;
       ProfileAcFunFragment obj = PatchProxy.apply(null, this, ProfileAcFunFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       if (obj == null) {
          a.S("mProfilePageParam");
       }
       if (obj.d.mIsPartOfDetailActivity != null) {
          obj = this.F;
          if (obj == null) {
             a.S("mProfilePageParam");
          }
          if (obj.d.mIsFullyShown == null) {
             b = false;
          label_0036 :
             return b;
          }
       }
       b = super.i0();
       goto label_0036 ;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, ProfileAcFunFragment.class, "12")) {
       }else {
          ProfileAcFunFragment tG = this.G;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ProfileAcFunFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ProfileAcFunFragment tF = this.F;
       if (tF == null) {
          a.S("mProfilePageParam");
       }
       return new b(tF);
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, ProfileAcFunFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NpaLinearLayoutManager(this.getContext());
    }
    public i yh(){
       ProfileAcFunPageList obj = PatchProxy.apply(null, this, ProfileAcFunFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ProfileAcFunFragment tF = this.F;
       if (tF == null) {
          a.S("mProfilePageParam");
       }
       r0 b = tF.b;
       a.o(b, "mProfilePageParam.mUser");
       String id = b.getId();
       a.o(id, "mProfilePageParam.mUser.id");
       obj = new ProfileAcFunPageList(id);
       obj.h(new ProfileAcFunFragment$a(this));
       return obj;
    }
}
