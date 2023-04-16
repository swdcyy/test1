package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$d;
import t99.y;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$d$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import tkd.b;
import tkd.d;
import os5.l;
import java.lang.StringBuilder;
import u99.d;
import xf6.i;
import android.widget.TextView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import t99.w;
import ba9.a;
import android.view.View;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import t99.b;
import t99.w$a;
import t99.x;
import java.lang.Boolean;
import xl8.b;
import java.lang.System;
import java.util.Objects;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import android.graphics.Bitmap;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$d$a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;

public final class HomeLiveAutoPlayPresenter$d implements y	// class@0010c0
{
    public final HomeLiveAutoPlayPresenter$d$b b;
    public final HomeLiveAutoPlayPresenter c;

    public void HomeLiveAutoPlayPresenter$d(HomeLiveAutoPlayPresenter p0){
       this.c = p0;
       super();
       this.b = new HomeLiveAutoPlayPresenter$d$b(this);
    }
    public void a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(HomeLiveAutoPlayPresenter$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, HomeLiveAutoPlayPresenter$d.class, "9")) {
          return;
       }
       boolean b = true;
       if (this.c.p == b) {
          int i = -1492894991;
          if (!d.a(i).Z9(p2) && !d.a(i).kA(p2)) {
             this.c.W = false;
             this.b("onLivePlayerTypeChanged, type="+p2, p0, p1);
          }else if(d.a(i).Z9(p2)){
             this.c.W = b;
             this.b("onLivePlayerTypeChanged, type="+p2, p0, p1);
          }
          d.d("HomeLiveAutoPlayPresenter", "onLivePlayerTypeChanged isPkOrLine = "+this.c.W);
       }
       return;
    }
    public final void b(String p0,int p1,int p2){
       int i;
       HomeLiveAutoPlayPresenter$d uod = this;
       if (PatchProxy.isSupport(HomeLiveAutoPlayPresenter$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, HomeLiveAutoPlayPresenter$d.class, "7")) {
          return;
       }
       if (i.i()) {
          HomeLiveAutoPlayPresenter j = uod.c.J;
          if (j != null) {
             j.setVisibility(0);
          }
          j = uod.c.J;
          if (j != null) {
             j.setText(p0+"\nwidth="+p1+"\nheight="+p2+"\nmIsPkOrLine="+uod.c.W+"\nfixWidth="+(r1.g0(uod.c.Y8().mEntity) ^ 1));
          label_0083 :
             w$a a = w.a;
             View view = HomeLiveAutoPlayPresenter.P8(uod.c).getView();
             HomeLiveAutoPlayPresenter m = uod.c.M;
             if (m == null) {
                a.S("mPlayTextureView");
             }
             KwaiImageView kwaiImageVie = uod.c.W8();
             HomeLiveAutoPlayPresenter$d c = uod.c;
             HomeLiveAutoPlayPresenter a1 = c.A;
             HomeLiveAutoPlayPresenter z = c.z;
             boolean b = (c.W != null || !r1.g0(c.Y8().mEntity))? true: false;
             a.f(p1, p2, view, m, kwaiImageVie, a1, z, b, uod.b);
             return;
          }
       }
       i = p2;
       goto label_0083 ;
    }
    public void c(int p0,int p1,int p2){
       if (PatchProxy.isSupport(HomeLiveAutoPlayPresenter$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, HomeLiveAutoPlayPresenter$d.class, "8")) {
          return;
       }
       if (this.c.p == 1) {
          this.b("onVideoSizeChanged, type="+p2, p0, p1);
       }
       return;
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter$d.class, "4")) {
          return;
       }
       HomeLiveAutoPlayPresenter$d tc = this.c;
       tc.o9(tc.D);
       tc = this.c;
       tc.D = 0;
       tc.e9();
       return;
    }
    public void onAudioStart(){
       x.b(this);
    }
    public void onCachedPlayerResumePlay(){
       x.c(this);
    }
    public void onPlayTimeFinished(){
       x.e(this);
    }
    public void onPlayerCached(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter$d.class, "2")) {
          return;
       }
       HomeLiveAutoPlayPresenter f = this.c.F;
       if (f != null) {
          f.d(Boolean.FALSE);
       }
       this.c.D = System.currentTimeMillis();
       this.c.n9();
       this.c.c9();
       return;
    }
    public void onPlayerRetrieved(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter$d.class, "1")) {
          return;
       }
       HomeLiveAutoPlayPresenter f = this.c.F;
       if (f != null) {
          f.d(Boolean.TRUE);
       }
       this.c.Z8();
       this.c.d9();
       return;
    }
    public void onRenderStop(){
       HomeLiveAutoPlayPresenter f;
       w$a a;
       View[] viewArray;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeLiveAutoPlayPresenter$d.class, "5")) {
          return;
       }
       HomeLiveAutoPlayPresenter$d tc = this.c;
       if (tc.E != null) {
          f = tc.F;
          if (f != null) {
             f.d(Boolean.FALSE);
          }
       }
       tc = this.c;
       tc.E = false;
       tc.n9();
       tc = this.c;
       tc.o9(tc.D);
       b uob = d.a(-1492894991);
       a.o(uob, "PluginManager.get\(LivePlugin::class.java\)");
       if (!uob.h1()) {
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, HomeLiveAutoPlayPresenter.class, "22")) {
             a = w.a;
             HomeLiveAutoPlayPresenter r = tc.R;
             if (r == null) {
                a.S("mPlayModule");
             }
             int b = r.U();
             HomeLiveAutoPlayPresenter m = tc.M;
             if (m == null) {
                a.S("mPlayTextureView");
             }
             Bitmap uBitmap = a.c(b, m);
             b = 1;
             if (uBitmap != null) {
                viewArray = new View[b];
                viewArray[0] = tc.A;
                n.Z(false, viewArray);
                f = tc.A;
                if (f != null) {
                   f.setImageBitmap(uBitmap);
                }
             }else {
                viewArray = new View[b];
                viewArray[0] = tc.A;
                n.Z(4, viewArray);
             }
          }
       }
       this.c.k9();
       return;
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(HomeLiveAutoPlayPresenter$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, HomeLiveAutoPlayPresenter$d.class, "6")) {
          return;
       }
       boolean b = true;
       if (this.c.p == b) {
          LiveStageProto$LayoutConfig layoutConfig = d.a(-1492894991).HB(p0, p1, p2);
          HomeLiveAutoPlayPresenter$d tc = this.c;
          String str = 2;
          if (layoutConfig != null && (layoutConfig.bizType == str || (layoutConfig != null && (layoutConfig.bizType != 4 && (layoutConfig == null || (layoutConfig.bizType != b || layoutConfig.layoutType != str)))))) {
             b = false;
          }
       label_004d :
          tc.W = b;
          d.d("HomeLiveAutoPlayPresenter", "onSeiInfo: layoutConfig =  "+layoutConfig+','+" mIsPkOrLineLive = "+this.c.W);
          if (layoutConfig != null) {
             k1.o(new HomeLiveAutoPlayPresenter$d$a(this, layoutConfig));
          }
       }
       return;
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       x.k(this, p0, p1, p2);
    }
    public void onVideoStart(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter$d.class, "3")) {
          return;
       }
       HomeLiveAutoPlayPresenter$d tc = this.c;
       if (tc.E == null) {
          HomeLiveAutoPlayPresenter f = tc.F;
          if (f != null) {
             f.d(Boolean.TRUE);
          }
       }
       this.c.D = System.currentTimeMillis();
       this.c.Z8();
       this.c.j9();
       this.c.E = true;
       return;
    }
    public void onVideoStateChange(LiveAutoPlayerState p0){
       x.m(this, p0);
    }
}
