package com.yxcorp.gifshow.util.o;
import com.yxcorp.gifshow.entity.QPhoto;
import mhc.n1;
import gic.l;
import djc.y0;
import gic.f;
import gic.p;
import gic.n;
import lnc.x1;
import java.util.Map;
import java.util.Collection;
import com.yxcorp.gifshow.util.n;
import ok.o;
import com.google.common.collect.e;
import com.yxcorp.gifshow.util.o$a;
import ok.h;
import com.google.common.collect.ImmutableList$a;
import java.lang.Iterable;
import com.google.common.collect.ImmutableCollection$b;
import com.google.common.collect.ImmutableCollection$a;
import mhc.g2;
import mhc.g2$a;
import java.lang.String;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.gifshow.activity.GifshowActivity;
import uo7.b0;
import com.yxcorp.gifshow.util.o$b;
import lnc.z1;
import com.google.gson.JsonObject;
import yic.p0;
import kp.r1;
import lnc.i3;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import lnc.s6;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import pm6.q;
import com.kuaishou.android.model.feed.VideoFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPreInfo;
import r16.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import lnc.a2;
import lnc.b2;
import erd.g;
import crd.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class o	// class@001f94
{

    public static l a(QPhoto p0,n1 p1,boolean p2){
       return o.b(p0, p1, p2, null);
    }
    public static l b(QPhoto p0,n1 p1,boolean p2,y0 p3){
       l ol = (p2)? new l(o.f(p0), p1, new p(), p3): new l(new x1(p0), p1, new p(), p3);
       return ol;
    }
    public static Collection c(Map p0,boolean p1){
       ImmutableList$a uoa = new ImmutableList$a();
       uoa.b(e.f(e.c(p0.values(), n.b), new o$a()));
       uoa.h(g2.X.c().b());
       return uoa.i();
    }
    public static Collection d(QPhoto p0,boolean p1){
       if (p0.isMine() && !p0.isPublic()) {
          return ImmutableList.of("WECHAT_WOW", "WEIBO", "COPY_LINK", "IM");
       }
       if (!p1 && (!p0.isSinglePhoto() && (p0.isAtlasPhotos() || p0.isLongPhotos()))) {
          return ImmutableList.of("WECHAT_WOW");
       }
       if (p0.getUser().isPrivate()) {
          return ImmutableList.of("THIRD_PARTY_ELEMENTS");
       }
       if (w.g0(p0.mEntity, 8)) {
          return ImmutableList.of("THIRD_PARTY_ELEMENTS", "APP_INNER_ELEMENTS", "MORE", "COPY_LINK");
       }
       return ImmutableList.of();
    }
    public static b0 e(QPhoto p0,GifshowActivity p1){
       return new o$b(p0.mEntity);
    }
    public static f f(QPhoto p0){
       return new z1(p0);
    }
    public static JsonObject g(QPhoto p0){
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("et", p0.getExpTag());
       jsonObject.c0("urlParams", "");
       jsonObject.c0("extTransientParams", p0.a(p0.mEntity));
       jsonObject.c0("photoAuthorId", r1.U1(p0.mEntity));
       i3 oi3 = i3.f();
       oi3.d("serverExpTag", p0.getServerExpTag());
       oi3.d("expTagList", b.a(0xe0ff4fb).d());
       oi3.d("shareScene", p0.getShareScene());
       jsonObject.c0("logExt", oi3.e());
       jsonObject.c0("sharePassingParam", p0.getSharePassingParam());
       return jsonObject;
    }
    public static JsonObject h(QPhoto p0){
       return o.g(p0);
    }
    public static JsonObject i(QPhoto p0){
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("sourcePage", p0.getSource());
       return jsonObject;
    }
    public static Collection j(QPhoto p0,boolean p1){
       if (p0.isMine() && !p0.isPublic()) {
          return ImmutableList.of("WECHAT_WOW", "WEIBO", "COPY_LINK", "IM");
       }
       if (!p1 && (!p0.isSinglePhoto() && (p0.isAtlasPhotos() || p0.isLongPhotos()))) {
          return ImmutableList.of("WECHAT_WOW");
       }
       if (w.g0(p0.mEntity, 8)) {
          return ImmutableList.of("THIRD_PARTY_ELEMENTS", "APP_INNER_ELEMENTS", "MORE", "COPY_LINK");
       }
       return ImmutableList.of();
    }
    public static boolean k(QPhoto p0){
       CDNUrl[] atlasMusicCd;
       boolean b2;
       boolean b = false;
       boolean b1 = (s6.q() || p0.recreationSetting() == 1)? true: false;
       if (p0 == null || (p0.getPhotoMeta() == null || (p0.isRecreationPhoto() || (p0.getPhotoMeta().mPostWorkInfoId < null && b1)))) {
          b1 = p0.isVideoAndNotKtv();
          int i = (!p0.isAtlasPhotos() && (p0.isLongPhotos() || p0.isSinglePhoto()))? 1: 0;
          if (p0.getMusic() == null && p0.getSoundTrack() == null) {
             if (p0.getAtlasInfo() != null) {
                atlasMusicCd = p0.getAtlasMusicCdn();
             }else if(p0.getSinglePicture() != null){
                atlasMusicCd = p0.getSinglePictureMusicCdn();
             }else if(p0.isKtvSong()){
                atlasMusicCd = p0.getKtvMusicCdn();
             }else {
                atlasMusicCd = null;
             }
             if (atlasMusicCd != null) {
                b2 = true;
             label_0078 :
                if (b1 || (i && (!b2 && q.a()))) {
                   b = true;
                }
             }
          }
       label_0077 :
          b2 = false;
          goto label_0078 ;
       }
    label_0085 :
       return b;
    }
    public static String l(QPhoto p0){
       int i = (p0.isVideoType() && p0.getEntity().isPayCourse())? 1: 0;
       if (!p0.isPublic()) {
          return "PHOTO_PRIVACY";
       }else if(i){
          return "PHOTO_COURSE";
       }else {
          return "PHOTO";
       }
    }
    public static String m(QPhoto p0){
       String str;
       if (p0.isVideoType()) {
          str = "VIDEO";
       }else if(p0.isImageType()){
          str = "IMAGE";
       }else {
          str = "UNKNOWN";
       }
       return str;
    }
    public static void n(BaseFragment p0,QPhoto p1,boolean p2){
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLAYER_PANEL_VIDEO_SHARE_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("button_type", Integer.valueOf(6));
       oi3.c("is_simplify_screen", Integer.valueOf(p2));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p1 != null) {
          p1 = p1.mEntity;
          if (p1 != null) {
             uContentPack.photoPackage = w1.f(p1);
          }
       }
       u1.M("", p0, 1, uElementPack, uContentPack, null);
       return;
    }
    public static void o(Activity p0,QPhoto p1,QPreInfo p2){
       if (p0 instanceof GifshowActivity) {
          y6.s(d.class, LoadPolicy.DIALOG).R(new a2(p0, p1, p2), new b2(p1));
       }else {
          Log.d("FeedShareUtils", "startVideoRecreation: activity is "+p0);
       }
       return;
    }
}
