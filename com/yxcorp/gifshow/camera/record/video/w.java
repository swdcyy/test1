package com.yxcorp.gifshow.camera.record.video.w;
import oc9.b0;
import oh9.v;
import com.yxcorp.gifshow.camera.record.magic.e;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import java.util.ArrayList;
import ed9.f;
import com.yxcorp.gifshow.camera.record.base.d;
import vc9.a;
import vc9.a$a;
import java.lang.Object;
import nd9.z;
import oc9.t;
import oc9.q;
import se9.a;
import com.yxcorp.gifshow.camera.record.magic.l;
import df9.a;
import pi9.p;
import pe9.e;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import oh9.o0;
import oh9.i1;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import bh9.u;
import oh9.f1;
import oh9.a;
import oh9.j1;
import vf9.y1;
import oh9.g1;
import ke9.a;
import oh9.h1;
import hd9.a;
import oh9.v0;
import erd.g;
import crd.b;
import oh9.e1;
import pc9.c;
import oh9.w0;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.List;
import java.util.Iterator;
import oc9.d0;
import xi9.n;
import qg9.a;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import ug9.c;
import wd9.a;
import wd9.b;
import oc9.a0;
import aj9.b;
import com.yxcorp.gifshow.camerasdk.q;
import android.widget.ImageView;
import vi9.a;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import ce9.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import w3b.p;
import zb9.p0;
import zb9.p0$a;
import hf9.b;
import hf9.b$a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import km6.d;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.camera.record.video.v;
import ekd.q$b;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import le9.g;
import le9.g$a;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.o5;
import java.util.UUID;
import qr4.k$e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import com.yxcorp.gifshow.model.RuntimeData;
import qr4.k$e$e;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import java.util.Objects;
import qr4.i;
import qr4.k$j;
import oh9.a3;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import yh9.j;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.kuaishou.edit.draft.RecordMagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Long;
import com.yxcorp.gifshow.model.MagicFaceIconTipMsg;
import com.kuaishou.edit.draft.RecordMusic;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.edit.draft.Url;
import com.kuaishou.edit.draft.VoteConfig;
import com.yxcorp.gifshow.model.VoteConfig;
import oc9.w;
import java.lang.Float;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import oh9.u;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import oh9.d1;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import q16.a$a;
import com.yxcorp.gifshow.camera.record.video.t;
import ok.o;
import com.google.common.base.Optional;
import com.google.common.collect.Iterators;
import je9.e;
import je9.e$a;
import com.yxcorp.gifshow.model.CustomMagicInfo;
import com.yxcorp.gifshow.model.CustomConfig;
import com.kwai.feature.post.api.core.model.EditCoverConfiguration;
import od9.c;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.media.util.c;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import w3b.l;
import j4b.e;
import oh9.a1;
import eoc.f;
import bd9.g;
import yc9.b;
import java.lang.StringBuilder;
import lnc.a1;
import e17.i;
import l5b.a;
import a2.i0;
import oh9.c1;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import android.view.MotionEvent;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import android.graphics.RectF;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import wc9.v;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.RecordMagicFace$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.RecordMusic$b;
import com.kuaishou.edit.draft.Url$b;
import com.kuaishou.edit.draft.VoteConfig$b;
import java.util.Arrays;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Asset$ShootInfo$a;
import je9.f;
import kotlin.jvm.internal.a;
import laa.m0;
import q5b.a;
import brd.a0;
import t45.d;
import brd.z;
import oh9.b1;
import com.yxcorp.gifshow.camera.record.video.u;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import oe6.e;
import hd9.n;
import nh9.a;
import ke9.b;
import ke9.b$a;
import lnc.n4;
import w3b.r;
import qi9.b;
import java.io.Serializable;
import lnc.c7;
import jg9.a1;
import jg9.a1$a;
import sg9.h;
import sg9.i;
import r5b.e;
import k2b.u1;
import rg9.a;
import oh9.k1;
import j4b.n;
import oh9.y0;
import vf9.g0;
import oh9.z0;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import oh9.x0;
import i4b.g;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class w extends e implements b0, v	// class@000f9b
{
    public final ArrayList A;
    public final ArrayList B;
    public final f C;
    public String D;
    public MagicEmoji$MagicFace E;
    public boolean F;
    public boolean G;
    public float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public g M;
    public int N;
    public long O;
    public String P;
    public View y;
    public final ArrayList z;

    public void w(b p0){
       CameraPageType vIDEO = CameraPageType.VIDEO;
       super(vIDEO, p0);
       this.z = new ArrayList();
       this.A = new ArrayList();
       this.B = new ArrayList();
       this.C = new f(vIDEO);
       this.H = 0;
       this.J = false;
       this.K = false;
       this.L = false;
       a$a f = a.f;
       if (this.d.d(f.a()).b != null) {
          this.L0(new z(vIDEO, p0));
       }
       if (this.d.d(f.a()).a != null) {
          this.L0(new a(vIDEO, p0, this.r));
       }
       this.L0(new a(vIDEO, p0));
       if (!p.c()) {
          this.L0(new e(vIDEO, p0));
       }
       if (this.D2()) {
          this.L0(new b(this.c, p0, this.r));
       }
       this.d.n(o0.class, new i1(this));
       this.d.n(u.class, new f1(this));
       this.d.n(a.class, new j1(this));
       this.d.n(y1.class, new g1(this));
       this.d.n(a.class, new h1(this));
       this.d.l(a.class, new v0(this));
       this.d.n(v.class, new e1(this));
       this.d.l(c.class, new w0(this));
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, w.class, "11")) {
          return;
       }
       this.r.c.setClickable(true);
       this.r.c.setPressed(false);
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof d0) {
             ot.A0();
          }
       }
       this.I2(this.t2());
       if (this.g != null && this.a2()) {
          this.g.l();
       }
       if (!a.a(this.d) && !this.z2()) {
          this.J2(true);
          n.Y(this.r.c, false, true);
       }
       return;
    }
    public final boolean A2(){
       Object obj = PatchProxy.apply(null, this, w.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("magicFace").equals(j0.f(this.e.getIntent(), "showPanelType"));
    }
    public final boolean B2(){
       d obj = PatchProxy.apply(null, this, w.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       boolean b = (obj != null && (obj.p0() && this.d.d(c.c).a == null))? true: false;
       return b;
    }
    public final boolean C2(){
       Object obj = PatchProxy.apply(null, this, w.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d.d(a.i).a != null || this.d.d(b.b).a != null)? true: false;
       return b;
    }
    public final boolean D2(){
       boolean b = (this.c == CameraPageType.VIDEO)? true: false;
       return b;
    }
    public void E0(){
       a0.n(this);
    }
    public final boolean E2(){
       d obj = PatchProxy.apply(null, this, w.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       boolean b = (obj != null && (!obj.B() || (!this.h.S() || this.H > 0)))? true: false;
       return b;
    }
    public final void F2(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "47")) {
          return;
       }
       if (p0) {
          this.g.K();
       }else {
          this.g.V();
       }
       if (this.I != null) {
          this.g.H(true);
       }
       return;
    }
    public final void H2(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "52")) {
          return;
       }
       this.I = p0;
       d tg = this.g;
       if (tg != null) {
          tg.H(p0);
       }
       return;
    }
    public final void I2(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "40")) {
          return;
       }
       if (p0) {
          this.r.d.setAlpha(0x3f800000);
       }else {
          this.r.d.setAlpha(0x3f000000);
       }
       return;
    }
    public void I7(){
       d tg;
       long l;
       l a;
       if (PatchProxy.applyVoid(null, this, w.class, "9")) {
          return;
       }
       if (!this.a2()) {
          tg = this.g;
          l = (tg != null)? (long)tg.getVideoLength().a(): 0;
          this.O = l;
       }
       if (!this.d.d(a.d.a()).a()) {
          this.m2();
       }
       boolean b = false;
       this.r.c.setClickable(b);
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof d0) {
             ot.I7();
          }
       }
       tg = this.h;
       if (tg != null && this.g != null) {
          if (tg.B()) {
             this.F2(true);
          }else if(this.g.Z()){
             this.F2(b);
          }
       }
       a = this.d.d(l.i).a;
       MagicEmoji$MagicFace magicFace = (a == null)? new MagicEmoji$MagicFace(): a.clone();
       this.B.add(magicFace.mId);
       this.z.add(magicFace);
       this.A.add(p.b().f(this.k2(), magicFace));
       this.J2(b);
       if (!this.d.d(p0.j.a()).c() && !this.d.d(b.c.a()).a()) {
          n.Y(this.r.c, 4, true);
       }
       return;
    }
    public final void J2(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "12")) {
          return;
       }
       if (!this.z2()) {
          l b = this.r.b;
          int i = (p0)? 0: 4;
          n.Y(b, i, true);
       }
       return;
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void L3(a p0){
       MagicEmoji$MagicFace this;
       v ov;
       int i3;
       boolean recordDurati;
       Iterator iterator1;
       d g;
       ArrayList uArrayList3;
       g og;
       String str1;
       Object obj = this;
       List list = p0;
       w ow = w.class;
       if (PatchProxy.applyVoidOneRefs(list, obj, ow, "20")) {
          return;
       }
       super.L3(p0);
       if (list == null) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = list.f.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod != null) {
             uod = uod.a;
             if (uod > null) {
                uArrayList.add(Integer.valueOf(uod));
             }
          }
       }
       a l = list.l;
       w a = obj.A;
       if (PatchProxy.applyVoidFourRefs(p0, l, uArrayList, a, this, w.class, "43") || (!q.f(l) && !q.f(uArrayList))) {
          list.e.n1(l, uArrayList, v.a, a, false);
          if (!PatchProxy.applyVoidTwoRefs(list, l, obj, ow, "44")) {
             ArrayList uArrayList2 = new ArrayList();
             iterator1 = l.iterator();
             while (iterator1.hasNext()) {
                MagicEmoji$MagicFace magicFace = iterator1.next();
                if (magicFace != null) {
                   uArrayList2.add(magicFace);
                }
             }
             g a1 = obj.d.d(g.d.a()).a;
             long l1 = o5.c(QCurrentUser.me().getId());
             String str = UUID.randomUUID().toString();
             k$e[] uoeArray = list.e.w();
             if (uoeArray == null || (uoeArray.length && uoeArray.length == uArrayList2.size())) {
                int i4 = 0;
                while (i4 < uArrayList2.size()) {
                   MagicEmoji$MagicFace magicFace1 = uArrayList2.get(i4);
                   object oobject = uoeArray[i4];
                   if (magicFace1 != null && (oobject != null && (!TextUtils.x(magicFace1.mId) && (!(magicFace1.mId).equals(oobject.b) || magicFace1.mExtraParams == null)))) {
                      uArrayList3 = uArrayList2;
                      og = a1;
                   }else if(TextUtils.x(a1.get(magicFace1.mId))){
                      str1 = "";
                   }else {
                      str1 = a1.get(magicFace1.mId);
                   }
                   MagicFaceExtraParams mRunTimeData = magicFace1.mExtraParams.mRunTimeData;
                   if (mRunTimeData != null) {
                      uArrayList3 = uArrayList2;
                      og = a1;
                      oobject.C = b.o(mRunTimeData.getUserId(), mRunTimeData.getUniqId(), mRunTimeData.getData());
                      oobject.D = b.o(l1, str, str1);
                   }else {
                      uArrayList3 = uArrayList2;
                      og = a1;
                      if (!TextUtils.x(str1)) {
                         oobject.C = b.o(l1, str, str1);
                      }
                   }
                   i4 = i4 + 1;
                   uArrayList2 = uArrayList3;
                   a1 = og;
                }
             }
          }
          g = obj.g;
          recordDurati = (g != null && g.D())? true: false;
          a e1 = list.e;
          Objects.requireNonNull(e1);
          VideoContext videoContext = VideoContext.class;
          if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Boolean.valueOf(recordDurati), e1, videoContext, "168") != PatchProxyResult.class) {
          }else {
             VideoContext.b();
             e1.a.c.n = recordDurati;
          }
       }
    label_0179 :
       if (!PatchProxy.applyVoidOneRefs(list, obj, ow, "24")) {
          a3 uoa3 = obj.d.d(a3.d);
          if (uoa3.a != null) {
             a3 c = uoa3.c;
             if (c != null && (c.v() != null && !uoa3.c.v().getAssetsList().isEmpty())) {
                uArrayList = new ArrayList();
                List assetsList = uoa3.c.v().getAssetsList();
                j oj = obj.d.d(j.i);
                int i = 0;
                while (i < assetsList.size()) {
                   Asset uAsset = assetsList.get(i);
                   this = null;
                   if (uAsset != null) {
                      RecordMagicFace recordMagicf = uAsset.getShootInfo().getRecordMagicface();
                      if (recordMagicf != RecordMagicFace.getDefaultInstance()) {
                         super();
                         this.mId = recordMagicf.getId();
                         this.mImage = recordMagicf.getImageUrl();
                         this.mVersion = recordMagicf.getVersion();
                         this.mName = recordMagicf.getName();
                         this.mResource = recordMagicf.getResourceUrl();
                         this.mResourceType = recordMagicf.getType();
                         if (!TextUtils.x(recordMagicf.getCheckSum())) {
                            this.mChecksum = Long.parseLong(recordMagicf.getCheckSum());
                         }
                         this.mTag = recordMagicf.getTag();
                         this.mSwitchable = recordMagicf.getSwitchable();
                         this.mHasMusic = recordMagicf.getHasAudio();
                         this.mIsOffline = recordMagicf.getOffline();
                         this.mGroupId = String.valueOf(recordMagicf.getGroupId());
                         this.mMagicEmojiIndex = recordMagicf.getSegmentIndex();
                         this.mRequestId = recordMagicf.getReqId();
                         if (!TextUtils.x(recordMagicf.getStrategyId())) {
                            MagicFaceIconTipMsg magicFaceIco = new MagicFaceIconTipMsg();
                            this.mMagicFaceIconTipMsg = magicFaceIco;
                            magicFaceIco.mStrategyId = o5.b(recordMagicf.getStrategyId(), 0);
                         }
                         RecordMusic music = recordMagicf.getMusic();
                         Music music1 = new Music();
                         music1.mId = music.getId();
                         music1.mType = MusicType.valueOf(music.getType());
                         music1.mName = music.getName();
                         this.mMusic = music1;
                         this.setActivityId(recordMagicf.getActivityId());
                         if (recordMagicf.getIsImmerseMode()) {
                            if (this.mExtraParams == null) {
                               this.mExtraParams = new MagicFaceExtraParams();
                            }
                            this.mExtraParams.mIsImmerseMode = true;
                         }
                         CDNUrl[] uCDNUrlArray = new CDNUrl[recordMagicf.getImageUrlsList().size()];
                         this.mImages = uCDNUrlArray;
                         for (int i1 = 0; i1 < recordMagicf.getImageUrlsList().size(); i1 = i1 + 1) {
                            CDNUrl uCDNUrl = new CDNUrl();
                            Url imageUrls = recordMagicf.getImageUrls(i1);
                            uCDNUrl.mCdn = imageUrls.getCdn();
                            uCDNUrl.mUrl = imageUrls.getUrl();
                            this.mImages[i1] = uCDNUrl;
                         }
                         uCDNUrlArray = new CDNUrl[recordMagicf.getResourceUrlsList().size()];
                         this.mResources = uCDNUrlArray;
                         for (i1 = 0; i1 < recordMagicf.getResourceUrlsList().size(); i1 = i1 + 1) {
                            Url resourceUrls = recordMagicf.getResourceUrls(i1);
                            CDNUrl uCDNUrl1 = new CDNUrl();
                            uCDNUrl1.mCdn = resourceUrls.getCdn();
                            uCDNUrl1.mUrl = resourceUrls.getUrl();
                            this.mResources[i1] = uCDNUrl1;
                         }
                         if (recordMagicf.getVoteConfig() != VoteConfig.getDefaultInstance()) {
                            VoteConfig voteConfig = new VoteConfig();
                            voteConfig.mQuestion = recordMagicf.getVoteConfig().getQuestion();
                            String[] stringArray = new String[0];
                            voteConfig.mOptions = recordMagicf.getVoteConfig().getOptionsList().toArray(stringArray);
                            float[] uofloatArray = new float[2]{0,0};
                            int i2 = 1;
                            if (recordMagicf.getVoteConfig().getPositionList().size() > i2) {
                               i3 = 0;
                               uofloatArray[i3] = recordMagicf.getVoteConfig().getPosition(i3);
                               uofloatArray[i2] = recordMagicf.getVoteConfig().getPosition(i2);
                            }else {
                               i3 = false;
                            }
                            voteConfig.mPosition = uofloatArray;
                            voteConfig.mIsAdded = i3;
                            this.mVoteConfig = voteConfig;
                         label_0374 :
                            if (this != null) {
                               uArrayList.add(this);
                            }
                            i = i + 1;
                         }
                      }
                   }
                   ov = null;
                   goto label_0374 ;
                }
                if (!uArrayList.isEmpty()) {
                   list.l = uArrayList;
                }
                if (!uArrayList.isEmpty()) {
                   recordDurati = obj.d.b().getRecordDuration();
                   j f = oj.f;
                   if (f > 0) {
                      recordDurati = (int)((float)recordDurati / (0x3f800000 - f));
                   }
                   ArrayList uArrayList1 = new ArrayList();
                   iterator1 = oj.b.iterator();
                   while (iterator1.hasNext()) {
                      float f1 = iterator1.next().floatValue();
                      if (f1 > 0) {
                         f1 = f1 * (float)recordDurati;
                         uArrayList1.add(Integer.valueOf((int)f1));
                      }
                   }
                   a e = list.e;
                   ov = v.a;
                   Objects.requireNonNull(e);
                   if (PatchProxy.applyFourRefs(uArrayList, uArrayList1, ov, null, e, VideoContext.class, "70") != PatchProxyResult.class) {
                   }else {
                      e.n1(uArrayList, uArrayList1, ov, null, true);
                   }
                }
             }
          }
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, w.class, "13")) {
          return;
       }
       this.O = 0;
       this.r.c.setClickable(true);
       this.r.c.setPressed(false);
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof d0) {
             ot.P1();
          }
       }
       if (this.g != null) {
          this.F2(false);
       }
       this.B.clear();
       this.z.clear();
       this.A.clear();
       this.I2(true);
       this.J2(true);
       if (!this.z2()) {
          n.Y(this.r.c, false, false);
       }
       return;
    }
    public boolean R0(){
       Iterator obj = PatchProxy.apply(null, this, w.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.n(this.y2(this.E()), this.D)) {
          return true;
       }
       obj = this.getChildren().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          t ot = obj.next();
          if (ot instanceof b0 && ot.R0()) {
             break ;
          }
       }
       return true;
    }
    public void T1(boolean p0){
       a0.l(this, p0);
    }
    public void W(c p0){
       u.a(this, p0);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       d tg;
       if (PatchProxy.isSupport(w.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, w.class, "7")) {
          return;
       }
       super.X0(p0, p1, p2, p3);
       this.D = this.y2(this.E());
       if (this.I != null) {
          tg = this.g;
          if (tg != null && !TextUtils.x(tg.getAudioPath())) {
             this.g.H(true);
          }
       }
       tg = this.g;
       if (tg != null && (tg.r() && !this.C.a())) {
          String str = "RecordMagicController";
          int i = 0;
          if (this.u2(p0)) {
             Object[] objArray = new Object[i];
             a.D().w(str, "showMagicEmoji by AutoApplyMagicFace with MagicEmojiFragmentExtraView", objArray);
             this.P = this.E().mId;
             this.s2(i);
          }else if(this.L != null){
             Object[] objArray1 = new Object[i];
             a.D().w(str, "show MagicfaceBubbleWithMusic", objArray1);
             c uoc = this.d.b().V7();
             Intent intent = this.e.getIntent();
             objArray1 = j0.g(intent, "magic_face");
             boolean b = j0.g(intent, "music");
             if (objArray1 && (b && uoc != null)) {
                b uob = new b(RecordBubbleItem.USED_ORIGINAL_VIDEO_MAGIC).n(this.r.d);
                int i1 = (PostExperimentUtils.p())? 0x7f104fc1: 0x7f104fc0;
                uoc.n(uob.A(i1).z(new d1(this, objArray1, b)));
             }
          }
       }
       if (p0 == null && !this.z2()) {
          this.P = null;
       }
       return;
    }
    public void X7(int p0,float p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, ow, "10")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.X7(p0, p1);
          }
       }
       return;
    }
    public void d5(int p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ow, "33")) {
          return;
       }
       this.N = p0;
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof d0) {
             ot.d5(p0);
          }
       }
       return;
    }
    public void de(a$a p0,a p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       w ow = w.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ow, "17")) {
          return;
       }
       super.de(p0, p1);
       if (p1 == null) {
          if (p.f(this.d)) {
             MagicEmoji$MagicFace magicFace = this.E();
             if (magicFace != null) {
                p0.J(magicFace);
             }
          }
          return;
       }else if(!this.B.isEmpty() && this.d.d(a3.d).c == null){
          p0.K1 = this.B;
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, ow, "19") && !q.f(p1.l)) {
             MagicEmoji$MagicFace magicFace1 = Iterators.t(p1.l.iterator(), t.b).orNull();
             if (magicFace1 != null) {
                CustomMagicInfo uCustomMagic = this.d.d(e.c.a()).a().get(magicFace1.mId);
                if (uCustomMagic != null && (!TextUtils.x(uCustomMagic.getMagicId()) && uCustomMagic.getCustomConfig() != null)) {
                   p0.p(uCustomMagic);
                }
             label_0092 :
                if (!TextUtils.x(magicFace1.mChildId)) {
                   p0.k(magicFace1.mChildId);
                }
             }
          }
       }
       boolean b = false;
       if (!q.f(p1.l)) {
          a l = p1.l;
          p0.J(l.get((l.size() - 1)));
          d obj = PatchProxy.apply(null, this, ow, "39");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = this.g;
             b1 = (obj != null && obj.v0())? true: false;
          }
          if (b1) {
             p0.o(new EditCoverConfiguration((p1.f.size() - 1), 0x3ff0000000000000, b));
          }
       }
       if (this.g != null) {
          if (this.d.d(c.b).a == null && !this.B2()) {
             Object obj1 = PatchProxy.apply(null, this, ow, "18");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(!PostExperimentUtils.Q()){
                a uoa = this.d.d(a.f);
                if (uoa.b != null && (uoa.e != null && uoa.c == null)) {
                   b = true;
                }
             }
             if (!b) {
             }
          }
       label_0130 :
          String audioPath = this.g.getAudioPath();
          if (this.g.D() && !TextUtils.x(audioPath)) {
             try{
                p1.h = c.o(new File(audioPath), p1.c, PostUtils.h()).getAbsolutePath();
                p0.P(MusicSource.MAGICFACE_OWN_MUSIC);
             }catch(java.io.IOException e10){
                a.D().e("RecordMagicController", "repeatAudioIfNeed error", e10);
             }
          }
       }
    }
    public void e2(){
       if (PatchProxy.applyVoid(null, this, w.class, "14")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof d0) {
             ot.e2();
          }
       }
       return;
    }
    public MagicBusinessId g2(){
       Object obj = PatchProxy.apply(null, this, w.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.d(l.f(this.c, this.C2(), false, false));
    }
    public l h2(){
       l obj = PatchProxy.apply(null, this, w.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.h2();
       if (this.N == 5) {
          return obj;
       }
       l ol = new l(obj.a, obj.b, obj.c, this.z, this.r.g(), this.A, p.b().f(this.k2(), obj.a), this.g2());
       return v1;
    }
    public long ie(){
       return a0.a(this);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       super.k(p0);
       this.Y1(f.a(e.class, new a1(this)));
       this.y = p0.findViewById(0x7f0a0086);
       this.J = false;
       this.M = this.d.c(g.class);
       if (this.A2()) {
          b uob = this.d.d(b.b());
          if (uob.a() || !uob.c()) {
             this.d.b().V7().s(RecordBubbleItem.BLOCK_ANY);
          }else {
             this.v2();
          }
       }
       return;
    }
    public String k2(){
       Object obj = PatchProxy.apply(null, this, w.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "magic-"+this.e;
    }
    public void o2(){
       if (PatchProxy.applyVoid(null, this, w.class, "30")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("magic-log", "onMagicEmojiBtnClick\(\)", objArray);
       if (this.E2() && !this.t2()) {
          int i = (PostExperimentUtils.p())? 0x7f100a59: 0x7f100a58;
          i.e(R.style.arg_RES_7f11066a, a1.p(i), 3000);
          return;
       }else {
          super.o2();
          return;
       }
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(w.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, w.class, "4")) {
          return;
       }
       super.onActivityCallback(p0, p1, p2);
       if (p0 == 291) {
          a.c(true);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, w.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.z.clear();
       this.A.clear();
       this.B.clear();
       a.c(false);
       return;
    }
    public void onResume(){
       w ow = w.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ow, "3")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, ow, "50") && (this.A2() || this.F != null)) {
          this.v2();
          this.G = true;
          View view = this.e.findViewById(R.id.camera_tab_scroll_container);
          if (view != null && !i0.Y(view)) {
             f.G(view, new c1(this));
          }else {
             this.s2(false);
             this.G = false;
          }
       }
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       w obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "25");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.M;
       if (obj == null) {
          return super.onTouch(p0, p1);
       }
       Objects.requireNonNull(obj);
       g obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, g.class, "3");
       if (obj1 != patchProxyRe) {
       }else if(p0 instanceof CameraView){
          g a = obj.a;
          if (a != null && (a.right - a.left > 0 && a.bottom - a.top > 0)) {
             if (!a.contains(p1.getX(), p1.getY())) {
                obj1 = null;
             }else {
                obj1 = obj.a;
                g a1 = obj.a;
                obj1 = obj.b;
                obj1[0] = (float)p0.getWidth() * ((p1.getX() - obj1.left) / obj1.width());
                obj1[1] = (float)p0.getHeight() * ((p1.getY() - a1.top) / a1.height());
             label_0092 :
                obj1 = obj.b;
             }
          }
       }
       obj.b[0] = p1.getX();
       obj.b[1] = p1.getY();
       goto label_0092 ;
       if (obj1 == null) {
          return false;
       }else {
          p1 = MotionEvent.obtain(p1);
          p1.setLocation(obj1[0], obj1[1]);
          p1.recycle();
          return super.onTouch(p0, p1);
       }
    }
    public void p2(PanelShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "31")) {
          return;
       }
       super.p2(p0);
       if (p0.b != this.c) {
          return;
       }
       if (!PanelShowEvent.a(this.e, p0)) {
          return;
       }
       if (p0.c == PanelShowEvent$PanelType.MORE_OPTION) {
          return;
       }
       a uoa = this.d.d(a.i);
       if (p0.c == PanelShowEvent$PanelType.KTV_OPTION && (uoa.a != null && uoa.c != null)) {
          return;
       }
       this.C.c(p0);
       p0 = p0.c;
       if (p0 == PanelShowEvent$PanelType.SAME_FRAME_LAYOUT_PANEL || p0 == PanelShowEvent$PanelType.BREAKPOINT) {
          if (this.C.a()) {
             n.W(this.y, 4, 0);
          }else {
             n.Y(this.y, 0, 0);
          }
       }
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, w.class, "16")) {
          return;
       }
       this.m2();
       this.r.c.setClickable(false);
       if (this.d.d(v.e).c == null && (!this.d.d(p0.j.a()).c() && !this.d.d(b.c.a()).a())) {
          n.Y(this.r.c, 4, true);
       }
    label_0056 :
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof d0) {
             ot.q1();
          }
       }
       return;
    }
    public boolean q2(){
       Iterator obj = PatchProxy.apply(null, this, w.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getChildren().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          t ot = obj.next();
          if (ot instanceof d0 && !ot.q2()) {
             break ;
          }
       }
       return false;
    }
    public void qb(){
       a0.e(this);
    }
    public void r0(int p0,Asset$b p1,b p2){
       SimpleMagicFace mId;
       RecordMagicFace$b obj;
       boolean b;
       int len;
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, w.class, "21")) {
          return;
       }
       l a = p2.d(l.i).a;
       if (a != null) {
          if (p1 != null && !a.isVoteMagic()) {
             obj = RecordMagicFace.newBuilder();
             obj.d(a.mId);
             obj.e(TextUtils.k(a.mImage));
             obj.copyOnWrite();
             obj.instance.setVersion(a.mVersion);
             obj.f(TextUtils.k(a.mName));
             obj.g(TextUtils.k(a.mResource));
             obj.h(a.mResourceType);
             obj.copyOnWrite();
             obj.instance.setCheckSum(String.valueOf(a.mChecksum));
             obj.copyOnWrite();
             obj.instance.setTag(TextUtils.k(a.mTag));
             obj.copyOnWrite();
             obj.instance.setSwitchable(a.mSwitchable);
             obj.copyOnWrite();
             obj.instance.setHasAudio(a.mHasMusic);
             obj.copyOnWrite();
             obj.instance.setIsImmerseMode(MagicEmoji$MagicFace.isImmerseMagicFace(a));
             obj.copyOnWrite();
             obj.instance.setOffline(a.mIsOffline);
             int i = 0;
             int i1 = (TextUtils.x(a.mGroupId))? 0: Integer.parseInt(a.mGroupId);
             obj.c(i1);
             obj.copyOnWrite();
             obj.instance.setSegmentIndex(a.mMagicEmojiIndex);
             obj.copyOnWrite();
             obj.instance.setReqId(TextUtils.k(a.mRequestId));
             MagicEmoji$MagicFace mMagicFaceIc = a.mMagicFaceIconTipMsg;
             String str = (mMagicFaceIc != null)? String.valueOf(mMagicFaceIc.mStrategyId): "";
             obj.copyOnWrite();
             obj.instance.setStrategyId(str);
             obj.a(a.getActivityId());
             RecordMusic$b uob = RecordMusic.newBuilder();
             uob.copyOnWrite();
             uob.instance.setId(a.getMagicMusicId());
             uob.copyOnWrite();
             uob.instance.setType(a.getMagicMusicType());
             uob.copyOnWrite();
             uob.instance.setName(a.getMagicMusicName());
             obj.copyOnWrite();
             obj.instance.setMusic(uob.build());
             obj.build();
             mId = a.mImages;
             if (mId != null) {
                len = mId.length;
                for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                   object oobject = mId[i2];
                   Url$b uob1 = Url.newBuilder();
                   uob1.a(oobject.mCdn);
                   uob1.b(oobject.mUrl);
                   Url url = uob1.build();
                   obj.copyOnWrite();
                   obj.instance.addImageUrls(url);
                }
             }
             MagicBaseConfig mResources = a.mResources;
             if (mResources != null) {
                len = mResources.length;
                for (; i < len; i = i + 1) {
                   object oobject1 = mResources[i];
                   Url$b uob2 = Url.newBuilder();
                   uob2.a(oobject1.mCdn);
                   uob2.b(oobject1.mUrl);
                   Url url1 = uob2.build();
                   obj.copyOnWrite();
                   obj.instance.addResourceUrls(url1);
                }
             }
             if (!TextUtils.x(a.mChildId)) {
                obj.b(a.mChildId);
             }
             if (a.isVoteMagic() && a.mVoteConfig != null) {
                VoteConfig$b uob3 = VoteConfig.newBuilder();
                uob3.copyOnWrite();
                uob3.instance.setIsAdded(a.mVoteConfig.mIsAdded);
                uob3.copyOnWrite();
                uob3.instance.setQuestion(a.mVoteConfig.mQuestion);
                uob3.a(Arrays.asList(a.mVoteConfig.mOptions));
                uob3.a(Arrays.asList(a.mVoteConfig.mOptions));
                obj.copyOnWrite();
                obj.instance.setVoteConfig(uob3.build());
             }
             Asset$ShootInfo$a shootInfo$a = p1.getShootInfo().toBuilder();
             shootInfo$a.g(obj);
             p1.t(shootInfo$a);
          }
          a3 uoa3 = this.d.d(a3.d);
          if (uoa3.c != null && !TextUtils.x(a.mId)) {
             f a1 = f.a;
             mId = a.mId;
             Objects.requireNonNull(a1);
             obj = PatchProxy.applyTwoRefs(mId, p2, a1, f.class, "1");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                a.p(mId, "id");
                a.p(p2, "callerContext");
                b = p2.d(e.c.a()).a().containsKey(mId);
             }
             if (b) {
                uoa3 = uoa3.c;
                SimpleMagicFace mId1 = a.mId;
                if (!PatchProxy.isSupport(ow) || !PatchProxy.applyVoidThreeRefs(uoa3, mId1, Integer.valueOf(p0), this, w.class, "22")) {
                   File uFile = new File(uoa3.f0().getAbsolutePath());
                   CustomMagicInfo uCustomMagic = this.d.d(e.c.a()).a().get(mId1);
                   if (uCustomMagic == null || (TextUtils.x(uCustomMagic.getMagicId()) || (uCustomMagic.getCustomConfig() != null && !uCustomMagic.isDefault()))) {
                      this.Y1(a.a.b(mId1, uFile, uCustomMagic.getCoverPath(), uCustomMagic.getCustomConfig()).T(d.c).G(d.a).R(new b1(uoa3, p0, mId1), u.b));
                   }
                }
             }
          }
       }
    label_02da :
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, w.class, "15")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof d0) {
             ot.s0();
          }
       }
       int i = this.z.size() - 1;
       if (i >= 0) {
          this.z.remove(i);
       }
       i = this.A.size() - 1;
       if (i >= 0) {
          this.A.remove(i);
       }
       i = this.B.size() - 1;
       if (i >= 0) {
          this.B.remove(i);
       }
       this.I2(this.t2());
       return;
    }
    public void s2(boolean p0){
       boolean b;
       boolean b1;
       boolean b3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "27")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("magic-log", "showMagicEmoji:"+p0, objArray);
       MagicEmojiPageConfig$b uob = this.i2();
       if (uob == null) {
          Object[] objArray1 = new Object[0];
          a.D().t("RecordMagicController", "MagicHandler.getMagicEmojiBuilder is null  !!!", objArray1);
          return;
       }else if(this.H - null > 0 || this.E2()){
          b = true;
       }else {
          b = false;
       }
       uob.e(b);
       uob.d = this.C2();
       uob.i(0);
       uob.h(this.a2());
       uob.f(e.k());
       b obj = PatchProxy.apply(null, this, ow, "55");
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(this.d.d(c.c).a != null || (this.d.d(n.j).a != null || (a.a(this.d) || j0.b(this.e.getIntent(), "camera_page_source", 0) == 3))){
          b1 = false;
       }else {
          b1 = true;
       }
       uob.g(b1);
       obj = this.d.d(b.e.a());
       boolean b2 = (this.G != null && n4.c(this.e.getIntent()))? true: false;
       if (b2 && !PatchProxy.applyVoid(null, this, ow, "28")) {
          MagicEmoji$MagicFace magicFace = n4.i(this.e.getIntent());
          if (magicFace == null && n4.j(this.e.getIntent()) != null) {
             magicFace = new MagicEmoji$MagicFace();
             magicFace.mId = n4.j(this.e.getIntent());
          }
          if (magicFace != null) {
             r.a = magicFace;
          }
       }
    label_0119 :
       uob.m(obj.b());
       uob.o = b2;
       uob.A = this.d.d(a.d.a()).c();
       uob.r = this.n2(this.E());
       uob.B = b.a();
       a1$a obj1 = PatchProxy.apply(null, this, ow, "29");
       if (obj1 != patchProxyRe) {
          b3 = obj1.booleanValue();
       }else {
          Intent intent = this.e.getIntent();
          if (intent != null) {
             Boolean uBoolean = j0.e(intent, "enable_magic_use_reco_feature");
             if (!Boolean.FALSE.equals(uBoolean) && (!this.C2() && (this.c == CameraPageType.VIDEO && (c7.a.b(intent) || Boolean.TRUE.equals(uBoolean))))) {
                b3 = true;
             }
          }
       label_018f :
          b3 = false;
       }
       uob.C = b3;
       obj1 = 5;
       b3 = (this.N == obj1)? true: false;
       uob.c = b3;
       if (this.D2()) {
          w tN = this.N;
          if (tN != 6 && (tN != obj1 || !this.d.d(a1.j.a()).c())) {
             b3 = true;
          label_01c0 :
             uob.d(b3);
             b3 = this.d.d(i.a()).a();
             b3 = (uob.s != null && !b3)? true: false;
             uob.d(b3);
             super.s2(p0);
             if (this.J == null) {
                b3 = this.K ^ 1;
                e uoe = e.class;
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b3), null, uoe, "11")) {
                   if (b3) {
                      u1.R("magic_face_panel_data_source", "local", 2);
                   }else {
                      u1.R("magic_face_panel_data_source", "server", 2);
                   }
                }
                this.J = true;
             }
             if (p0) {
                w tE = this.E;
                if (tE != null) {
                   e.d(tE, 0);
                   this.E = null;
                }
             }
             return;
          }
       }
       b3 = false;
       goto label_01c0 ;
    }
    public final boolean t2(){
       List obj = PatchProxy.apply(null, this, w.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w2();
       if (obj.isEmpty()) {
          return true;
       }
       if (obj.size() > 1) {
          return true;
       }
       return obj.get(0).mSwitchable;
    }
    public final boolean u2(EffectDescription p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       w ow = w.class;
       b obj = PatchProxy.applyOneRefs(p0, this, ow, "54");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.C.a()) {
          return b;
       }
       obj = this.d.d(b.e.a());
       MagicEmoji$MagicFace magicFace = (!obj.a() || obj.a() == 2)? obj.b(): null;
       SimpleMagicFace simpleMagicF = (!obj.a())? 1: null;
       if (magicFace != null && (magicFace.equals(this.E()) && (simpleMagicF || !TextUtils.n(magicFace.mId, this.P)))) {
          Object obj1 = PatchProxy.apply(null, this, ow, "57");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.d.d(p0.j.a()).c() || this.d.d(b.c.a()).a()){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1 && this.l2(p0, magicFace)) {
             b = true;
          }
       }
    label_00a6 :
       return b;
    }
    public final void v2(){
       if (PatchProxy.applyVoid(null, this, w.class, "49")) {
          return;
       }
       this.e.getIntent().putExtra("showPanelType", null);
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, w.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecordMagicController", "onCameraOpened", objArray);
       super.w();
       boolean b = true;
       if (this.C2() || this.d.d(c.c).a != null) {
          this.I = b;
       }else if(this.d.d(n.j).g != null){
          this.I = b;
       }
       d tg = this.g;
       if (tg != null) {
          tg.H(this.I);
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       super.w1(p0);
       this.F = j0.a(p0, "show_magic_face_select", this.F);
       MagicEmojiPageConfig$b uob = this.i2();
       boolean b = true;
       if (uob == null) {
          Object[] objArray = new Object[0];
          a.D().t("RecordMagicController", "MagicHandler.getMagicEmojiBuilder is null  !!!", objArray);
       }else {
          uob.i(0);
          uob.h(this.a2());
          uob.f(e.k());
          boolean b1 = (this.E2() && !this.w2().isEmpty())? true: false;
          uob.e(b1);
          String str = j0.f(p0, "magicAutoSearchKeyword");
          uob.w = str;
          if (!TextUtils.x(str)) {
             this.e.getIntent().putExtra("showPanelType", "magicFace");
             this.r.f().y = 6;
             uob.x = j0.b(p0, "magicAutoSearchSourceType", 0);
          }
       }
       if (j0.e(this.e.getIntent(), "music_source") != MusicSource.TAG) {
          b = false;
       }
       this.L = b;
       this.d.l(a.class, new k1(this));
       this.d.l(n.class, new y0(this));
       this.d.l(g0.class, new z0(this));
       this.d.l(MagicEmojiResponse.class, new x0(this));
       return;
    }
    public final List w2(){
       ArrayList obj = PatchProxy.apply(null, this, w.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.z.iterator();
       while (iterator.hasNext()) {
          MagicEmoji$MagicFace magicFace = iterator.next();
          SimpleMagicFace mId = magicFace.mId;
          if (mId == null || uArrayList.contains(mId)) {
             continue ;
          }else {
             uArrayList.add(magicFace.mId);
             obj.add(magicFace);
          }
       }
       return obj;
    }
    public final String y2(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String absolutePath = (p0 != null)? g.j(p0).getAbsolutePath(): null;
       return absolutePath;
    }
    public final boolean z2(){
       d obj = PatchProxy.apply(null, this, w.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (!this.d.d(p0.j.a()).c() && (!this.d.d(b.c.a()).a() && j0.b(this.d.a().getIntent(), "camera_page_source", i) != 21)) {
          obj = this.c;
          if (obj != CameraPageType.TIE_TIE && obj != CameraPageType.WHATS_UP) {
          label_005c :
             return i;
          }
       }
    label_005b :
       i = true;
       goto label_005c ;
    }
}
