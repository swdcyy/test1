package com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$imageListeners$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$progressListeners$2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.io.File;
import android.content.Intent;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$d;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.HashSet;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$e;
import com.middleware.security.MXSec;
import t38.a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoCropActivity;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Objects;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoCropActivity$a;
import android.content.Context;
import android.app.Activity;
import java.lang.NullPointerException;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.ArrayList;
import ekd.j;
import qrd.l1;
import lnc.i3;
import kp.r1;
import java.lang.Integer;
import java.lang.Number;
import exc.l;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.v7;
import a2c.l;
import a2c.m;
import gx5.h;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$b;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$f;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.fragment.d;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import java.lang.Throwable;
import ekd.k1;
import w69.i$a;
import w69.b$a;
import w69.b;
import w69.k$a;
import lnc.a1;
import w69.k;
import w69.f$a;
import o79.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MediaRatioFilter;
import com.yxcorp.gifshow.album.repo.filter.FilterType;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.i;
import wkd.b;
import j80.c;
import com.kwai.framework.abtest.f;
import z5c.k0;
import wh5.c;
import z5c.k2;
import com.tbruyelle.rxpermissions2.g;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$g;
import z5c.l0;

public final class ProfileBackgroundPublishManager	// class@001236
{
    public final p a;
    public final p b;
    public ProfileBgVideoInfo c;
    public ProfileBgVideoInfo d;
    public File e;
    public ProfileBackgroundPublishManager$b f;
    public l$d g;
    public boolean h;
    public static final ProfileBackgroundPublishManager i;
    public static final ProfileBackgroundPublishManager$c j;

    static {
       ProfileBackgroundPublishManager.j = new ProfileBackgroundPublishManager$c(null);
       ProfileBackgroundPublishManager.i = new ProfileBackgroundPublishManager();
    }
    public void ProfileBackgroundPublishManager(){
       super();
       RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new ProfileBackgroundPublishManager$a(this));
       this.a = s.c(ProfileBackgroundPublishManager$imageListeners$2.INSTANCE);
       this.b = s.c(ProfileBackgroundPublishManager$progressListeners$2.INSTANCE);
    }
    public static void d(ProfileBackgroundPublishManager p0,GifshowActivity p1,File p2,Intent p3,BaseFeed p4,int p5,Object p6){
       p0.c(p1, p2, p3, null);
    }
    public final boolean a(ProfileBackgroundPublishManager$d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundPublishManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "listenerImage");
       return this.g().add(p0);
    }
    public final boolean b(ProfileBackgroundPublishManager$e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundPublishManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "listenerVideo");
       return this.h().add(p0);
    }
    public final void c(GifshowActivity p0,File p1,Intent p2,BaseFeed p3){
       String str3;
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, ProfileBackgroundPublishManager.class, "7")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       a.p(p2, "intent");
       String str1 = null;
       MXSec.get().getMXWrapper().h("26", "0", null, str1, null);
       String str2 = "video";
       if (p2.hasExtra(str2)) {
          ProfileBackgroundVideoCropActivity$a z = ProfileBackgroundVideoCropActivity.z;
          Serializable serializable = SerializableHook.getSerializableExtra(p2, str2);
          if (serializable != null) {
             Objects.requireNonNull(z);
             if (!PatchProxy.applyVoidThreeRefs(p0, serializable, p3, z, ProfileBackgroundVideoCropActivity$a.class, "1")) {
                a.p(p0, str);
                a.p(serializable, "videoInfo");
                p2 = new Intent(p0, ProfileBackgroundVideoCropActivity.class);
                SerializableHook.putExtra(p2, "PROFILE_PREVIEW_VIDEO_INFO", serializable);
                if (p3 != null) {
                   SerializableHook.putExtra(p2, "PROFILE_PREVIEW_PHOTO_FEED", p3);
                }
                p0.startActivity(p2);
             }
             PatchProxy.onMethodExit(ProfileBackgroundPublishManager.class, "7");
             return;
          }else {
             PatchProxy.onMethodExit(ProfileBackgroundPublishManager.class, "7");
             throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.models.QMedia");
          }
       }else if(p1 == null){
          PatchProxy.onMethodExit(ProfileBackgroundPublishManager.class, "7");
          return;
       }else {
          this.e = p1;
          if (!PatchProxy.applyVoidOneRefs(p1, this, ProfileBackgroundPublishManager.class, "8")) {
             g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "image onImageSelect "+p1.getAbsolutePath());
             Iterator iterator = this.g().iterator();
             while (iterator.hasNext()) {
                iterator.next().c(p1);
             }
          }
          if (this.f()) {
             if (p3 != null) {
                if (!PatchProxy.applyVoidTwoRefs(p1, p3, this, ProfileBackgroundPublishManager.class, "12")) {
                   ProfileBgVideoInfo profileBgVid = new ProfileBgVideoInfo();
                   String absolutePath = p1.getAbsolutePath();
                   a.o(absolutePath, "background.absolutePath");
                   profileBgVid.setPath(absolutePath);
                   CDNUrl[] uCDNUrlArray = new CDNUrl[]{new CDNUrl(str3, profileBgVid.getPath())};
                   str3 = "";
                   profileBgVid.setCoverUrls(j.a(uCDNUrlArray));
                   profileBgVid.setLocalVideo(1);
                   profileBgVid.setFeed(p3);
                   this.d = profileBgVid;
                   i3 oi3 = i3.f();
                   oi3.d("photoId", p3.getId());
                   absolutePath = r1.U1(p3);
                   if (absolutePath != null) {
                      str3 = absolutePath;
                   }
                   oi3.d("authorId", str3);
                   oi3.c("mediaType", Integer.valueOf(6));
                   str1.s(l.class, LoadPolicy.DIALOG).R(new l(this, p1, oi3.e()), m.b);
                }
             }else {
                this.j(p0, p1, null);
             }
          }
          PatchProxy.onMethodExit(ProfileBackgroundPublishManager.class, "7");
          return;
       }
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, ProfileBackgroundPublishManager.class, "28")) {
          return;
       }
       if (this.h == null) {
          l ol = v7.r(l.class, null);
          if (ol != null) {
             ol.YU();
             this.h = true;
          }
       }
       return;
    }
    public final boolean f(){
       ProfileBackgroundPublishManager obj = PatchProxy.apply(null, this, ProfileBackgroundPublishManager.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       boolean b = true;
       if (obj == null || obj.b != b) {
          b = false;
       }
       return b;
    }
    public final HashSet g(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundPublishManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final HashSet h(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundPublishManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final ProfileBgVideoInfo i(){
       Object[] objArray = null;
       ProfileBackgroundPublishManager obj = PatchProxy.apply(objArray, this, ProfileBackgroundPublishManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          objArray = obj.deepClone();
       }
       return objArray;
    }
    public final void j(GifshowActivity p0,File p1,h p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ProfileBackgroundPublishManager.class, "13")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "background");
       ProfileBackgroundPublishManager$f uof = new ProfileBackgroundPublishManager$f(this, p1, p2, p0, p0);
       Void[] voidArray = new Void[0];
       v0.t(R.string.arg_RES_7f100351).c(voidArray);
       return;
    }
    public final void k(ProfileBgVideoInfo p0,int p1,String p2,Throwable p3){
       if (PatchProxy.isSupport(ProfileBackgroundPublishManager.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, ProfileBackgroundPublishManager.class, "26")) {
          return;
       }
       a.p(p0, "videoInfo");
       g.d(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "upload failed\n errorCode="+p1+", errorMsg:"+p2, p3);
       this.t();
       Iterator iterator = this.h().iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0, p1, p2, p3);
       }
       this.g = null;
       return;
    }
    public final void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileBackgroundPublishManager.class, "11")) {
          return;
       }
       g.d(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "image modify fail", objArray);
       Iterator iterator = this.g().iterator();
       while (iterator.hasNext()) {
          iterator.next().onFail();
       }
       return;
    }
    public final void m(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundPublishManager.class, "25")) {
          return;
       }
       g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "onModifyBgSuccess: "+p0.getZtPhotoId());
       this.r();
       p0.setModifyTimeStamp(k1.i());
       p0.setStatus(4);
       Iterator iterator = this.h().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       this.g = null;
       return;
    }
    public final void n(ProfileBgVideoInfo p0,int p1,int p2){
       if (PatchProxy.isSupport(ProfileBackgroundPublishManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProfileBackgroundPublishManager.class, "22")) {
          return;
       }
       g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "onProgress: "+p1);
       Iterator iterator = this.h().iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0, p1, p2);
       }
       return;
    }
    public final void o(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundPublishManager.class, "21")) {
          return;
       }
       g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "onStart: "+p0.getPath());
       p0.setStatus(1);
       Iterator iterator = this.h().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public final boolean p(ProfileBackgroundPublishManager$d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundPublishManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "listenerImage");
       return this.g().remove(p0);
    }
    public final boolean q(ProfileBackgroundPublishManager$e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundPublishManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "listenerVideo");
       return this.h().remove(p0);
    }
    public final void r(){
       this.e = null;
    }
    public final void s(){
       this.d = null;
    }
    public final void t(){
       this.c = null;
    }
    public final void u(ProfileBackgroundPublishManager$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundPublishManager.class, "6")) {
          return;
       }
       a.p(p0, "config");
       this.f = p0;
       return;
    }
    public final b v(ProfileBackgroundPublishManager$b p0,GifshowActivity p1){
       b$a uoa;
       k$a uoa1;
       AlbumLimitOption$Builder uBuilder;
       i oi;
       f$a obj = PatchProxy.applyTwoRefs(p0, p1, this, ProfileBackgroundPublishManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "config");
       a.p(p1, "activity");
       this.f = p0;
       int i = 0x7f104604;
       int i1 = 0x7f103a83;
       boolean b = false;
       boolean b1 = true;
       if (p0.a == b1) {
          uoa = new b$a();
          uoa.c(b1);
          uoa1 = new k$a();
          uoa1.f(a1.p(i1));
          obj = new f$a();
          obj.g(a.e);
          obj.h(b);
          uBuilder = new AlbumLimitOption$Builder();
          uBuilder.p(b1);
          uBuilder.k(b1);
          MediaRatioFilter mediaRatioFi = new MediaRatioFilter(FilterType.SELECT, a1.p(0x7f103fb2), 0, 0, 12, null);
          oi = new i$a().a(uoa.a()).m(uoa1.c(a1.p(i)).b()).d(obj.a()).f(uBuilder.o(i1).d()).b();
       }else {
          uoa = new b$a();
          uoa.c(b1);
          uoa1 = new k$a();
          uoa1.f(a1.p(i1));
          obj = new f$a();
          obj.g(a.c);
          obj.h(b);
          uBuilder = new AlbumLimitOption$Builder();
          uBuilder.p(b1);
          oi = new i$a().a(uoa.a()).m(uoa1.c(a1.p(i)).b()).d(obj.a()).f(uBuilder.d()).b();
       }
       File uFile = new File(b.a(-1504323719).o(), "background.jpg");
       if (f.a("backgroundPostAdr") && (!k0.u() && !c.b())) {
          b = true;
       }
    label_0120 :
       k2 ok2 = (b)? new k2(p1, new g(p1), uFile): new ImageSelectSupplier(p1, new g(p1), uFile);
       ProfileBackgroundPublishManager tf = this.f;
       ImageSelectSupplier$c uoc = (tf != null)? tf.a(): null;
       if (uoc != null) {
          tf = this.f;
          uoc = (tf != null)? tf.a(): null;
          ok2.g(uoc);
          tf = this.f;
          if (tf != null) {
             tf.c = null;
          }
       }
       ok2.h(57.00f);
       ok2.j(3.00f);
       ImageSelectSupplier$ImageSelectType bACKGROUND_R = (k0.s())? ImageSelectSupplier$ImageSelectType.BACKGROUND_REDESIGN: ImageSelectSupplier$ImageSelectType.BACKGROUND;
       b uob = ok2.f(oi, bACKGROUND_R).subscribe(new ProfileBackgroundPublishManager$g(this, p1, uFile), l0.a("ProfileBackgroundVideoPublishManager"));
       a.o(uob, "imageSelectSupplier.requ¡­leExt.errorConsumer\(TAG\)\)");
       return uob;
    }
}
