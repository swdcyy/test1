package com.yxcorp.gifshow.reminder.friend.find.friend.card.FriendTabFindFriendFragment;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.content.Context;
import lnc.a1;
import java.util.Map;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import gdc.a;
import gdc.f;
import tda.m;
import yw6.g;
import yw6.j;
import rda.a;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import qvb.i;
import ok.o;
import bf5.e;
import gdc.e;
import gdc.i;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import ww6.a;
import ww6.a$a;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class FriendTabFindFriendFragment extends HomeMilanoBaseContainerFragment	// class@001a92
{

    public void FriendTabFindFriendFragment(){
       super();
    }
    public int Ah(){
       return 1;
    }
    public int M(){
       return 1;
    }
    public TabIdentifier Ua(){
       return b.i;
    }
    public ViewGroup dh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FriendTabFindFriendFragment.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setBackgroundColor(a1.a(R.color.arg_RES_7f061ec9));
       return uFrameLayout;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendTabFindFriendFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FriendTabFindFriendFragment.class, null);
       return objectsByTag;
    }
    public int identity(){
       Object obj = PatchProxy.apply(null, this, FriendTabFindFriendFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.hashCode();
    }
    public boolean lh(){
       return true;
    }
    public String o(){
       return "FRIEND_PYMK_PAGE";
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FriendTabFindFriendFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       HomeMilanoBaseContainerFragment tL = this.L;
       if (tL != null) {
          tL.h.h2();
       }
       return;
    }
    public m rh(){
       a uoa = PatchProxy.apply(null, this, FriendTabFindFriendFragment.class, "4");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(new f(this.o()));
       }
       return uoa;
    }
    public g sh(){
       Object obj = PatchProxy.apply(null, this, FriendTabFindFriendFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(this.L.h, new a(SlideMediaType.PHOTO, false));
    }
    public e th(){
       Object obj = PatchProxy.apply(null, this, FriendTabFindFriendFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e uoe = new e(this.L, new i(), this, this.getActivity(), this, this.G, this, this, this, this);
       return obj;
    }
    public a uh(){
       a$a obj = PatchProxy.apply(null, this, FriendTabFindFriendFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       obj.i(false);
       obj.b(true);
       obj.c(TextUtils.I(this.o()));
       return obj.a();
    }
    public NasaBizParam vh(){
       NasaBizParam obj = PatchProxy.apply(null, this, FriendTabFindFriendFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NasaBizParam();
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.r(false);
       uoa.P = true;
       obj.setNasaSlideParam(uoa.a());
       return obj;
    }
    public PhotoDetailParam wh(){
       PhotoDetailParam obj = PatchProxy.apply(null, this, FriendTabFindFriendFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoDetailParam();
       obj.setBizType(1);
       return obj;
    }
}
