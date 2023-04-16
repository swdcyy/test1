package com.yxcorp.gifshow.profile.fragment.UserMentionedMeTabFragment;
import com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType;
import y8c.t;
import com.yxcorp.gifshow.profile.fragment.k;
import com.yxcorp.gifshow.profile.fragment.l;
import k3c.z1;
import fx5.h;
import s1c.r0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import lkd.b;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import l3c.a0;
import k3c.d2;
import java.util.Map;
import android.os.Bundle;
import com.yxcorp.gifshow.profile.fragment.j;
import crd.b;
import ok.h;
import lnc.b9;

public class UserMentionedMeTabFragment extends ProfilePhotoFragment	// class@00131b
{
    public a0 W0;
    public b X0;
    public static final int Y0;

    public void UserMentionedMeTabFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, UserMentionedMeTabFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       this.Q.addUserPresenter(obj);
       PatchProxy.onMethodExit(UserMentionedMeTabFragment.class, "2");
       return obj;
    }
    public t Bh(){
       a0 obj = PatchProxy.apply(null, this, UserMentionedMeTabFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       h oh = new h(this, this.G.d);
       oh.f(new k(this));
       oh.c(new l(this));
       oh.e(new z1(this));
       oh.h(this.getString(R.string.arg_RES_7f10024e));
       obj = new a0(oh);
       this.W0 = obj;
       return obj;
    }
    public int f(){
       return 283;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserMentionedMeTabFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, UserMentionedMeTabFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(UserMentionedMeTabFragment.class, new d2());
       }else {
          obj.put(UserMentionedMeTabFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserMentionedMeTabFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.X0 = b9.c(this.X0, new j(this));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, UserMentionedMeTabFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.X0);
       return;
    }
}
