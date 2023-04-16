package com.yxcorp.gifshow.profile.b;
import gx5.d;
import java.lang.Object;
import fx5.h;
import y8c.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mw4.a;
import android.content.SharedPreferences;
import com.kwai.framework.model.user.PhotoGuestConfig;
import z5c.k0;
import com.kwai.framework.model.user.QCurrentUser;
import tt7.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import s1c.a1;
import android.content.Context;
import z1.a;
import com.kwai.social.startup.follow.model.ProfileSetTopConfig;
import java.lang.StringBuilder;
import km8.b;
import java.lang.reflect.Type;
import com.kuaishou.krn.event.a;
import com.yxcorp.gifshow.profile.b$b;
import oj0.a;
import wxa.a;
import android.net.Uri$Builder;
import android.net.Uri;
import xh7.b;
import qh7.b;
import qh7.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import qvb.i;
import o3c.j;
import com.yxcorp.gifshow.profile.h;
import s1c.o;
import com.kwai.component.homepage_interface.fragment.LazyLoadFragmentContainer;
import com.yxcorp.gifshow.profile.http.l;
import wvb.e;
import com.yxcorp.gifshow.profile.b$a;
import wvb.e$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.io.File;
import gx5.h;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import com.kwai.framework.model.user.RecoUser;
import o3c.c0;
import brd.t;
import com.yxcorp.gifshow.profile.util.f;
import js6.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.c;
import java.lang.CharSequence;
import com.yxcorp.gifshow.profile.viewer.ProfilePhotoViewListFragment;
import com.yxcorp.gifshow.profile.collect.CommentCollectorListFragment;
import android.content.SharedPreferences$Editor;
import oe6.g;
import i3c.c;
import l3c.a0;
import wkd.b;
import o3c.l;
import com.yxcorp.gifshow.profile.util.e;
import erd.g;

public class b implements d	// class@001220
{

    public void b(){
       super();
    }
    public t DK(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.zK(p0, 0);
    }
    public boolean H9(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean("enableUserSpecifiedTopPhotoInProfile", false);
    }
    public PhotoGuestConfig Hj(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, k0.class, "16");
       if (obj != patchProxyRe) {
       }else {
          obj = k0.a.a(QCurrentUser.ME.getId());
       }
       return obj;
    }
    public boolean Jm(Fragment p0,int p1){
       boolean b = (p0 instanceof BaseProfileFragment || (p0 instanceof ProfilePhotoFragment && p1 < 2))? true: false;
       return b;
    }
    public boolean LP(){
       Object obj = PatchProxy.apply(null, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k0.b();
    }
    public boolean O6(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof a1) {
          return p0.Oa();
       }
       return true;
    }
    public boolean Od(String p0,Context p1,a p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, k0.class, "27");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          ProfileSetTopConfig profileSetTo = ProfileSetTopConfig.class;
          obj = a.a.getString(b.d("user")+"profileUserTopConfig", "");
          Object[] objArray = (obj == null || obj == "")? null: b.a(obj, profileSetTo);
          if (objArray != null && objArray.mEnableProfileUserCopyTop != null) {
             b = true;
          }else {
             b = false;
          }
       }
       if (!b) {
          return false;
       }else {
          a.b().a("KRNSocialProfileSetTopEvent", new b$b(p0, p2));
          Uri$Builder uBuilder = a.c.buildUpon();
          uBuilder.appendQueryParameter("photoId", p0);
          a.b(b.j(p1, uBuilder.build().toString()), null);
          return true;
       }
    }
    public i SA(QPhoto p0,Integer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(p0, p1);
    }
    public boolean VA(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return h.VA(p0, p1);
    }
    public boolean Wt(){
       Object obj = PatchProxy.apply(null, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return o.h();
    }
    public void ac(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       if (p0 instanceof LazyLoadFragmentContainer) {
          LazyLoadFragmentContainer j = p0.j;
          if (j instanceof BaseProfileFragment) {
             j.v7();
          }
       }else if(p0 instanceof BaseProfileFragment){
          p0.v7();
       }
       return;
    }
    public i bj(i p0){
       e obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof l) {
          obj = (p0.t != null)? 1: null;
          if (obj) {
             return new e(p0, new b$a(this), null);
          }
       }
       return p0;
    }
    public void gI(GifshowActivity p0,File p1,h p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "14")) {
          return;
       }
       ProfileBackgroundPublishManager.j.a().j(p0, p1, p2);
       return;
    }
    public i gx(RecoUser p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c0(p0, false, p1);
    }
    public boolean isAvailable(){
       return true;
    }
    public t jg(String p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return f.b(p0, p1);
    }
    public void k7(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "15")) {
          return;
       }
       a.b.GO("kKSUserProfileFinishStateSelectNotification", objArray);
       if (k0.b()) {
          RxBus.f.b(new c());
       }
       return;
    }
    public boolean kD(){
       Object obj = PatchProxy.apply(null, this, b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k0.h();
    }
    public String so(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ((p0.replace("ks://profile", "")).replace("/", "")).trim();
    }
    public Class sp(){
       return ProfilePhotoViewListFragment.class;
    }
    public Class w00(){
       return CommentCollectorListFragment.class;
    }
    public void xw(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "18")) {
          return;
       }
       SharedPreferences$Editor uEditor = o.a.edit();
       uEditor.putBoolean("profile_disable_manual_animated_cover", p0);
       g.a(uEditor);
       RxBus.f.b(new c());
       return;
    }
    public t zK(h p0,int p1){
       a0 obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a0(p0);
       obj.Y = p1;
       return obj;
    }
    public t zq(String p0,boolean p1){
       f obj;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "13");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = f.class;
       if (PatchProxy.isSupport(obj)) {
          ot = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, obj, "3");
          if (ot != patchProxyRe) {
          label_0044 :
             return ot;
          }
       }
       ot = b.a(0x37313f08).e(p0, p1).doOnNext(e.b);
       goto label_0044 ;
    }
}
