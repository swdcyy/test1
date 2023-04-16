package com.kuaishou.live.core.show.profilecard.photo.h;
import y8c.g;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import lf2.m;
import java.util.ArrayList;
import lf2.a;
import lf2.c;
import ok.o;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.Number;
import java.util.List;
import android.view.ViewGroup;
import y8c.f;
import lf2.n;
import com.kwai.library.widget.specific.misc.LoadingView;
import android.content.Context;
import android.app.Activity;
import d61.y;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import ml8.c;
import i2b.a;
import android.widget.TextView;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserSettingOption;
import com.kwai.framework.model.user.UserInfo;
import android.graphics.drawable.Drawable;
import android.content.res.Configuration;
import android.content.res.Resources;
import pd6.b;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.profilecard.photo.h$c;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import com.kuaishou.live.core.show.profilecard.photo.h$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import java.lang.Boolean;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;

public class h extends g	// class@000de7
{
    public final a A;
    public final List B;
    public final List C;
    public boolean D;
    public h$b E;
    public final GifshowActivity w;
    public final LiveProfileParams x;
    public final ArrayList y;
    public final Fragment z;

    public void h(User p0,LiveProfileParams p1,GifshowActivity p2,Fragment p3,m p4){
       super();
       this.y = new ArrayList();
       this.B = new ArrayList();
       this.C = new ArrayList();
       this.D = false;
       this.z = p3;
       this.w = p2;
       this.x = p1;
       a uoa = new a(p2, p3, p1, p0, p4, new c(this));
       this.A = v0;
    }
    public Object N0(int p0){
       BaseFeed uBaseFeed;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          uBaseFeed = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "7");
          if (uBaseFeed != PatchProxyResult.class) {
          }else if(this.y1(p0) || this.x1(p0)){
             uBaseFeed = null;
          }else {
             p0 = p0 - this.u1();
             uBaseFeed = this.y.get(p0);
             r1.g5(uBaseFeed, p0);
          }
       }else {
          goto label_0019 ;
       }
       return uBaseFeed;
    }
    public int f0(int p0){
       h obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "4");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (this.y1(p0)) {
          return this.B.get(p0).intValue();
       }else if(this.x1(p0)){
          obj = this.C;
          Object obj1 = PatchProxy.apply(null, this, oh, "15");
          int i = (obj1 != patchProxyRe)? obj1.intValue(): this.B.size() + this.y.size();
          return obj.get((p0 - i)).intValue();
       }else {
          return 3;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, h.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.y.size() + this.B.size()) + this.C.size());
    }
    public f h1(ViewGroup p0,int p1){
       TextView obj;
       h tw;
       Drawable uDrawable;
       n on = n.class;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = -1;
       if (p1 == 1) {
          tw = this.w;
          LoadingView loadingView = PatchProxy.applyOneRefs(tw, null, on, "1");
          if (loadingView != PatchProxyResult.class) {
          }else {
             loadingView = new LoadingView(tw, 0x7f11020f);
             tw = (y.d(tw))? -1: a1.e(100.00f);
             loadingView.setLayoutParams(new RecyclerView$LayoutParams(i, tw));
          }
          return new f(loadingView, new PresenterV2());
       }else if(p1 == 2){
          tw = this.w;
          oh = this.x;
          obj = PatchProxy.applyTwoRefs(tw, oh, null, on, "2");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = a.a(tw, R.layout.arg_RES_7f0d0d57);
             Object obj1 = PatchProxy.applyOneRefs(oh, null, on, "4");
             if (obj1 != PatchProxyResult.class) {
                i = obj1.intValue();
             }else if(oh.getUserProfile().mUserSettingOption.isPrivacyUser != null && (oh.getUserProfile().isFollowing == null && !oh.getUserProfile().mProfile.isUserBanned())){
                i = 0x7f080605;
             }else if(oh.getUserProfile().isBlocked != null || oh.getUserProfile().mIsBlockedByOwner != null){
                i = 0x7f0813f5;
             }else if(oh.getUserProfile().mProfile.isUserBanned()){
                i = 0x7f080606;
             }else {
                i = 0x7f080603;
             }
             if (PatchProxy.isSupport(on)) {
                uDrawable = PatchProxy.applyTwoRefs(tw, Integer.valueOf(i), null, on, "3");
                if (uDrawable != PatchProxyResult.class) {
                label_0103 :
                   obj.setCompoundDrawablesWithIntrinsicBounds(null, uDrawable, null, null);
                   String str = PatchProxy.applyOneRefs(oh, null, on, "5");
                   if (str != PatchProxyResult.class) {
                   }else if(oh.getUserProfile().mUserSettingOption.isPrivacyUser != null && (oh.getUserProfile().isFollowing == null && !oh.getUserProfile().mProfile.isUserBanned())){
                      str = a1.p(R.string.arg_RES_7f103e67);
                   }else if(oh.getUserProfile().isBlocked != null || oh.getUserProfile().mIsBlockedByOwner != null){
                      str = a1.p(R.string.arg_RES_7f10011a);
                   }else if(oh.getUserProfile().mProfile.isUserBanned()){
                      str = a1.p(R.string.arg_RES_7f100359);
                   }else {
                      str = a1.p(R.string.arg_RES_7f100d28);
                   }
                   obj.setText(str);
                }
             }
             Configuration uConfigurati = new Configuration(tw.getResources().getConfiguration());
             uConfigurati.uiMode = (uConfigurati.uiMode & 0xcf) | 0x20;
             uDrawable = b.a(tw, uConfigurati).getResources().getDrawable(i);
             goto label_0103 ;
          }
          return new f(obj, new PresenterV2());
       }else if(p1 == 4){
          tw = this.w;
          View view = PatchProxy.applyOneRefs(tw, this, oh, "6");
          if (view != PatchProxyResult.class) {
          }else {
             view = new View(tw);
             view.setLayoutParams(new ViewGroup$LayoutParams(i, a1.e(8.00f)));
          }
          return new f(view, new PresenterV2());
       }else if(p1 == 3){
          return new f(a.k(p0, 0x7f0d0d56, false), new h$c(this));
       }else {
          return new f(new View(p0.getContext()), new PresenterV2());
       }
    }
    public void r1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       this.y.addAll(p0);
       return;
    }
    public void s1(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "12")) {
          return;
       }
       if (this.B.contains(Integer.valueOf(p0))) {
          return;
       }
       this.B.add(Integer.valueOf(p0));
       this.n0((this.B.size() - 1));
       return;
    }
    public void t1(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.y.clear();
       return;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "11")) {
          return;
       }
       super.u0(p0);
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (layoutManage instanceof GridLayoutManager) {
          layoutManage.m1(new h$a(this, layoutManage));
       }
       return;
    }
    public int u1(){
       Object obj = PatchProxy.apply(null, this, h.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.B.size();
    }
    public List v1(){
       return this.y;
    }
    public boolean w1(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       String str = "AD";
       if (p0.get(str) != null) {
          PhotoAdvertisement photoAdverti = p0.get(str);
          if (photoAdverti.mHideLabel == null) {
             photoAdverti = photoAdverti.mAdGroup;
             if (photoAdverti == PhotoAdvertisement$AdGroup.AD_SOCIAL || photoAdverti == PhotoAdvertisement$AdGroup.AD_SOCIAL_MERCHANT) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean x1(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 >= (this.B.size() + this.y.size()))? true: false;
       return b;
    }
    public boolean y1(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 < this.B.size())? true: false;
       return b;
    }
    public void z1(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "13")) {
          return;
       }
       if (!this.B.contains(Integer.valueOf(p0))) {
          return;
       }
       this.B.remove(Integer.valueOf(p0));
       this.t0(this.B.indexOf(Integer.valueOf(p0)));
       return;
    }
}
