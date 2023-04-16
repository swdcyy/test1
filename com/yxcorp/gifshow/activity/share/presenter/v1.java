package com.yxcorp.gifshow.activity.share.presenter.v1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import crd.a;
import zw8.q3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bx8.j;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import xw8.p0;
import java.util.Set;
import com.kuaishou.edit.draft.Workspace$Source;
import lnc.a1;
import android.widget.Button;
import elb.x;
import elb.w;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.net.Uri;
import com.yxcorp.image.request.a;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import tkd.b;
import tkd.d;
import w26.a;
import android.view.View;
import w26.c;
import com.yxcorp.gifshow.activity.share.presenter.v1$a;
import android.view.View$OnClickListener;
import zw8.p3;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import vw8.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import k2b.v1$d;
import kotlin.jvm.internal.a;
import k2b.v1$a;
import k2b.v1$f;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.BoolArg;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import f66.i;
import jq.a;
import q87.c;
import android.widget.EditText;
import com.yxcorp.gifshow.activity.share.presenter.s1;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import rw8.a;
import f6c.a;
import com.yxcorp.gifshow.activity.BasePostActivity;
import bba.b;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import wba.f0;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import android.app.Activity;
import android.content.Intent;
import kw8.m;
import fg6.a;
import com.google.gson.Gson;
import qvb.s;
import z36.d;
import android.content.Context;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kwai.video.clipkit.log.ClipEditImagePublishLog;
import com.kwai.video.clipkit.log.ClipEditLogger;
import kuaishou.perf.page.impl.d;
import brd.a;
import zw8.t3;
import erd.a;
import zw8.s3;
import brd.e;
import zw8.r3;
import brd.z;
import io.reactivex.android.schedulers.a;
import zw8.y3;
import brd.d;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.System;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import com.yxcorp.gifshow.postwork.e;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import qr4.i;
import qr4.m$k0;
import brd.t;
import zw8.u3;
import zw8.v3;
import com.yxcorp.gifshow.activity.share.presenter.t1;
import erd.g;
import crd.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.kuaishou.weapon.i.WeaponHI;
import w16.i;
import oa0.a;
import k2b.u1;
import wba.p0;
import wkd.b;
import dnc.k1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import vw8.a;
import com.kwai.framework.network.degrade.e;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import ou5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Iterator;
import xw8.p0$d;
import java.util.LinkedList;
import com.yxcorp.gifshow.encode.EncodeRequest;
import km6.f;
import java.lang.Long;
import lnc.p3;
import w46.b;
import qr4.e$h;
import qr4.m$n;
import java.lang.Iterable;
import android.text.TextUtils;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.IntArg;
import laa.m0;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.util.List;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import im8.f;
import com.kwai.kcube.TabIdentifier;
import wba.s;
import ow8.c;
import czb.b;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import xw8.p0$c;
import qaa.a;
import haa.a;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.CropOptions;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$UploadSource;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import lnc.d7;
import com.kuaishou.android.model.mix.HotspotParams;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import lnc.k9;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import c26.c;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import q2b.h$b;
import java.lang.NullPointerException;
import lnc.i1;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import f0c.w0;
import r26.b;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.postwork.PostStatus;
import dnc.x0;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$ShareFromOtherAppDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import gx8.e;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.activity.share.util.PublishFunnel$funnelPublish$$inlined$let$lambda$1;
import msd.l;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import java.util.Map;
import com.kuaishou.android.post.SerialArg;
import ekd.j0;

public class v1 extends PresenterV2	// class@00143d
{
    public long A;
    public String B;
    public List C;
    public String D;
    public KtvInfo E;
    public f F;
    public f G;
    public f H;
    public boolean I;
    public int J;
    public PublishPageSetting K;
    public HashMap L;
    public Map M;
    public a N;
    public Button O;
    public Button P;
    public EmojiEditText Q;
    public View R;
    public TextView S;
    public KwaiImageView T;
    public SizeAdjustableTextView U;
    public String U0;
    public f V;
    public p0$d V0;
    public boolean W;
    public j X;
    public String Y;
    public String Z;
    public RickonWholeUploadParams p;
    public VideoContext q;
    public String r;
    public BasePostActivity s;
    public String t;
    public c u;
    public boolean v;
    public String w;
    public p0 x;
    public EncodeRequest y;
    public long z;

    public void v1(){
       super();
       this.M = new HashMap();
       this.N = new a();
       this.V0 = new q3(this);
    }
    public void E8(){
       int i;
       b a;
       w d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "3")) {
          return;
       }
       String str = "FEED_PAGE";
       if (str.equals(this.w)) {
          return;
       }
       v1 tu = this.u;
       boolean b = false;
       if (tu != null) {
          v1 tq = this.q;
          if (tq != null) {
             j oj = new j(tu, tq);
             this.X = oj;
             oj.b(b);
          }
       }
       this.x.r.add(this.V0);
       tu = this.u;
       if (tu != null && tu.T0() == Workspace$Source.JUXING) {
          i = 0x7f104f9a;
          this.U0 = a1.p(i);
          this.O.setText(i);
       }else {
          this.U0 = a1.p(0x7f10400f);
          this.O.setText(R.string.arg_RES_7f10400f);
          if (x.e()) {
             w ow = x.d();
             if (ow != null) {
                d = ow.d;
                ow = ow.e;
                if (!TextUtils.x(d) && !TextUtils.x(ow)) {
                   this.U0 = "";
                   this.O.setText("");
                   this.S.setText(d);
                   a uoa1 = a.t(Uri.parse(ow));
                   uoa1.x(b);
                   d uod = Fresco.newDraweeControllerBuilder();
                   uod.w(uoa1.q());
                   AbstractDraweeController uAbstractDra = uod.e();
                   this.T.setController(uAbstractDra);
                   this.S.setVisibility(b);
                   this.T.setVisibility(b);
                }
             }
          }
          d.a(0x27e26f6e).Qb(this.R, this.O);
       }
       this.O.setVisibility(b);
       this.O.setOnClickListener(new v1$a(this));
       this.x.p.observe(this.s, new p3(this));
       tu = this.u;
       if (tu == null || tu.T0() != Workspace$Source.JUXING) {
          a = b.a;
          String str1 = String.valueOf(this.S8());
          Objects.requireNonNull(a);
          v1$a uoa = PatchProxy.applyOneRefs(str1, a, b.class, "5");
          if (uoa != PatchProxyResult.class) {
          }else {
             a.p(str1, "buttonContent");
             uoa = new v1$a().j(true).k(6).h("PUBLISH_PHOTO").g("button_content", str1);
          }
          uoa.show();
       }
       if (i.g().getDisableShareCaptionEdit().get(Boolean.FALSE).booleanValue()) {
          Object[] objArray1 = new Object[b];
          a.b().w("SharePublishPresenter", "onBind: set editor disable", objArray1);
          this.Q.setFocusable(b);
          this.Q.setClickable(true);
          this.Q.setOnClickListener(s1.b);
       }
       return;
    }
    public void P8(int p0){
       boolean b;
       v1 tu;
       v1 ov1 = v1.class;
       if (PatchProxy.isSupport(ov1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov1, "17")) {
          return;
       }
       RxBus.f.b(new a());
       int i = 1;
       if (i.h()) {
          b = i.m().B();
          Object[] objArray = new Object[0];
          a.b().w("SharePublishPresenter", "Publish and finish PostSession.", objArray);
          i.m().d0(i);
          a.l();
       }else {
          b = true;
       }
       a.i(p0);
       if (b) {
          this.s.finishAffinity();
          tu = this.u;
          PhotoVisibility photoVisibil = (tu == null)? null: f0.a(tu.Q0());
          a.a.f(this.s, photoVisibil);
          this.s.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       }else {
          Intent intent = new Intent();
          intent.putExtra("video_file_upload_id", p0);
          intent.putExtra(m.a, b);
          intent.putExtra("conversionTaskList", a.a.q(this.x.z));
          s.b().c(2, null, this.s, 0, intent);
       }
       tu = this.u;
       if (tu != null && (tu.a1() != Workspace$Type.ATLAS && (this.u.a1() == Workspace$Type.LONG_PICTURE || this.u.a1() == Workspace$Type.SINGLE_PICTURE))) {
          ClipEditImagePublishLog uClipEditIma = new ClipEditImagePublishLog();
          uClipEditIma.mSuccess = i;
          ClipEditLogger.reportImagePublishLog(this.r, uClipEditIma);
       }
       d.d("postPublishMonitor").h("publishToFinish");
       d.d("postPublishMonitor").c();
       return;
    }
    public final void R8(int p0){
       v1 ov1 = v1.class;
       if (PatchProxy.isSupport(ov1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov1, "12")) {
          return;
       }
       boolean b = i.h();
       if (b) {
          b = i.m();
          b.Q("POST_WORK_INFO_ID", Integer.valueOf(p0));
       }
       b = TextUtils.x(this.Y);
       s3 os3 = null;
       if (!b) {
          if (!PatchProxy.isSupport(ov1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov1, "13")) {
             a uoa = a.g();
             boolean b1 = true;
             if (this.u == null) {
                uoa = uoa.l(new t3(this, p0));
             }else {
                uoa = uoa.b(a.z(new s3(this, p0)));
                os3 = 1;
             }
             if (!TextUtils.x(this.Y)) {
                a uoa1 = PatchProxy.apply(null, this, ov1, "14");
                if (uoa1 != PatchProxyResult.class) {
                }else {
                   uoa1 = a.z(new r3(this));
                }
                uoa = uoa.b(uoa1);
             }else {
                b1 = os3;
             }
             uoa.s(a.c()).a(new y3(this, b1, p0));
          }
          return;
       }else if(this.u != null){
          AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
          uAttrAnimPro.setCancelable(os3);
          uAttrAnimPro.show(this.s.getSupportFragmentManager(), "SavePublish");
          d.d("postPublishMonitor").h("clickToPublish");
          d.d("postPublishMonitor").g("publishToFinish");
          long l = System.currentTimeMillis();
          Object[] objArray = new Object[os3];
          a.b().s("EditCost", "开始转菊花，发布时存草稿.", objArray);
          boolean b2 = DraftFileManager.E().H(this.u).exists();
          if (p0 >= 0) {
             this.u.j1(Phase.POST);
             a uoa2 = d.a(-273232199).a20().L0(p0);
             if (uoa2 != null) {
                e.a().e(uoa2.getSessionId());
                if (uoa2.getEncodeInfo() != null) {
                   v1 tq = this.q;
                   if (tq != null) {
                      tq.F().b.g0 = uoa2.getEncodeInfo().isHdExport();
                   }
                }
             }
          }
          v1 tN = this.N;
          t ot = (b2)? DraftFileManager.E().b(this.u): t.just(this.u);
          u3 ou3 = new u3(this, b2, l, uAttrAnimPro, p0);
          tN.c(ot.observeOn(a.c()).doAfterTerminate(v11).subscribe(new v3(l), t1.b));
       }else {
          this.P8(p0);
       }
       return;
    }
    public final CharSequence S8(){
       CharSequence obj = PatchProxy.apply(null, this, v1.class, "21");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.O.getText();
       boolean b = TextUtils.x(obj);
       if (b) {
          obj = (!this.U.getVisibility())? this.U.getText(): this.S.getText();
       }
    label_0031 :
       i oi = a.b();
       Object[] objArray = new Object[0];
       oi.w("SharePublishPresenter", "getPublishText text = "+obj+", mV2PublishButton: :"+this.O.getText()+", mPublishOneDayView: "+this.U.getText()+", mTextView: "+this.S.getText(), objArray);
       return obj;
    }
    public final boolean V8(){
       Object obj = PatchProxy.apply(null, this, v1.class, "11");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = (this.v != null && (!TextUtils.x(this.t) && (this.t).endsWith(".mp4")))? true: false;
       return b;
    }
    public final void W8(){
       v1 u1;
       v1 a;
       String str8;
       String str10;
       Workspace workspace;
       int b2;
       j d;
       Object[] obj;
       int i4;
       Object[] objArray5;
       e a1;
       int i5;
       PostWorkInfo postWorkInfo1;
       ClientTaskDetail$ShareFromOtherAppDetailPackage shareFromOth;
       h$b uob;
       ClientTaskDetail$TaskDetailPackage taskDetailPa;
       m$k0 w;
       i oi1;
       int i6;
       String str = this;
       v1 ov1 = v1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, str, ov1, "7")) {
          return;
       }
       boolean i = 0;
       Object[] objArray1 = new Object[i];
       String str1 = "SharePublishPresenter";
       a.b().w(str1, "点击发布", objArray1);
       v1 q = str.Q;
       if (q != null) {
          WeaponHI.setP(12, q.j(), str.Q.length());
       }
       RxBus.f.b(new i(str.q.F()));
       a.B1(System.currentTimeMillis());
       if (TextUtils.x(str.r)) {
          str.r = u1.f();
       }
       q = str.u;
       int b = true;
       if (q != null) {
          p0.e(q, b);
       }
       CharSequence uCharSequenc = this.S8();
       b.a(0x6223c5ca).g(str.r);
       GifshowActivity activity = this.getActivity();
       v1 q1 = str.q;
       String str2 = "";
       String str3 = (q1 != null)? q1.i(): str2;
       v1 u = str.u;
       Workspace$Source source = (u != null)? u.T0(): objArray;
       a.y(activity, str3, source, String.valueOf(uCharSequenc), str2);
       int i1 = -1;
       if (b.a(-1538291188).e().mDelayUpload != null) {
          i.a(R.style.arg_RES_7f110668, 0x7f104f9c);
          str.R8(i1);
          return;
       }else {
          str3 = "review";
          if (!QCurrentUser.me().isLogined()) {
             String str4 = a.a().a().getString(R.string.arg_RES_7f103082);
             if (!TextUtils.x(str.w) && (str.w).contains(str3)) {
                d.a(-1712118428).ne(str.s, "share", "share_finish", 22, str4, null, null, null, null).h();
             }else {
                d.a(-1712118428).ne(str.s, "share", "share_finish", 36, str4, null, null, null, null).h();
             }
             return;
          }else if(str.q == null && str.u != null){
             ExceptionHandler.handleCaughtException(new DraftEditException("VideoContext is not passed along with workspace "+str.u.D0()+" "+str.s.getUrl()));
             str.q = str.u.d1();
          }
          Iterator iterator = str.x.r.iterator();
          while (iterator.hasNext()) {
             iterator.next().j7(str.q);
          }
          PhotoVisibility photoVisibil = str.x.d();
          boolean b1 = (photoVisibil != PhotoVisibility.PRIVATE)? true: false;
          Object[] objArray2 = new Object[i];
          a.b().w(str1, "visible action isPublic? : "+b1, objArray2);
          LinkedList linkedList = new LinkedList();
          LinkedList linkedList1 = new LinkedList();
          int i2 = 0x7f101c05;
          if (b1) {
             linkedList1.add(str.n8(i2));
          }
          String[] stringArray = new String[linkedList.size()];
          stringArray = linkedList.toArray(stringArray);
          u1 = str.u;
          Workspace$Type type = (u1 != null)? u1.a1(): Workspace$Type.UNKNOWN;
          v1 y = str.y;
          EncodeRequest mOutputPath = (y != null)? y.mOutputPath: str.t;
          if (TextUtils.x(mOutputPath)) {
             StringBuilder str5 = "Output path is empty. Encode request ";
             String str6 = (str.y != null)? "not null.": "null.";
             ExceptionHandler.handleCaughtException(new DraftEditException(str5+str6+str.s.getUrl()));
             str.R8(i1);
             return;
          }else {
             String str7 = str1;
             Object[] objArray3 = new Object[i];
             a.b().w(str7, "realshare\(\) mFromThirdPartyApp="+str.v+" outputPath "+mOutputPath+" duration "+str.A, objArray3);
             if (str.v != null) {
                v1 q2 = str.q;
                if (q2 != null) {
                   a = str.A;
                   if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(q2, mOutputPath, Long.valueOf(a), null, f.class, "8")) {
                   label_034f :
                      str8 = str2;
                   }else {
                      a.p(mOutputPath, "path");
                      str8 = str2;
                      obj = new Object[0];
                      str10 = "VideoContextExt";
                      p3.D().w(str10, "setThirdPartyImportPartEdit duration="+a+' '+mOutputPath, obj);
                      if (q2 == null) {
                         objArray3 = new Object[0];
                         p3.D().w(str10, "setThirdPartyImportPartEdit context is null", objArray3);
                      }else {
                         i oi = q2.F();
                         if (oi != null) {
                            oi = oi.b;
                            if (oi != null) {
                               w = oi.w;
                            label_02a3 :
                               if (w == null) {
                                  objArray3 = new Object[0];
                                  p3.D().t(str10, "setThirdPartyImportPartEdit no thirdParty", objArray3);
                               }else if(q2.F().d == null){
                                  q2.F().d = new e$h();
                               }
                               m$n on = new m$n();
                               e$h h = q2.F().d.H;
                               if (h != null) {
                                  if (!h.length) {
                                     oi1 = 1;
                                     i6 = 1;
                                  }else {
                                     oi1 = 1;
                                     i6 = 0;
                                  }
                                  if ((i6 ^ 0x01) == oi1) {
                                     on = q2.F().d.H[0];
                                     a.o(on, "photoMeta.edit.importPartEdit[0]");
                                     m$n g = on.g;
                                     a.o(g, "part.filePath");
                                     Integer integer = (g.length() > 0)? 1: null;
                                     if (integer) {
                                        objArray3 = new Object[0];
                                        p3.D().w(str10, "setThirdPartyImportPartEdit importPartEdit has been init", objArray3);
                                     }
                                  }
                               }
                            label_0312 :
                               on.g = mOutputPath;
                               on.o = q2.F().b.w;
                               if (a - null > 0) {
                                  on.b = a;
                               }
                               b2 = 0;
                               Object[] objArray6 = new Object[b2];
                               p3.D().w(str10, "setThirdPartyImportPartEdit "+on, objArray6);
                               m$n[] onArray = new m$n[]{on};
                               q2.F().d.H = onArray;
                            }
                         }
                         w = null;
                         goto label_02a3 ;
                      }
                   }
                }else {
                   goto label_034f ;
                }
             }else {
                goto label_034f ;
             }
             v1 x = str.X;
             if (x != null) {
                Objects.requireNonNull(x);
                if (!PatchProxy.applyVoid(null, x, j.class, "1")) {
                   objArray3 = new Object[0];
                   a.b().w("AuditInfoUploadManager", "file upload", objArray3);
                   x.c(x.e, x.d);
                }
             }
             String str9 = (!stringArray.length)? str.n8(R.string.arg_RES_7f101c05): TextUtils.join(", ", linkedList1);
             str10 = i.g().getThirdPartyPubInfo().get();
             b = i.g().getUploadMockFeedOption().get(Integer.valueOf(0)).intValue();
             boolean i3 = i.g().getUploadStrictMode().get(Integer.valueOf(0)).intValue();
             i1 = i.g().getUploadNoSystemNotification().get(Boolean.FALSE).booleanValue();
             String str11 = str3;
             Object[] objArray4 = new Object[0];
             a.b().w(str7, "realShare\(\) sharePub="+str10+" mockFeedOption="+b+" uploadLimit="+i3+" noSystemNote="+i1, objArray4);
             q1 = str.u;
             PhotoVisibility photoVisibil1 = (q1 == null)? null: f0.a(q1.Q0());
             v1 y1 = str.y;
             EncodeRequest mWorkspaceDi = (y1 != null)? y1.mWorkspaceDirectory: null;
             if (mWorkspaceDi == null) {
                v1 u2 = str.u;
                if (u2 != null) {
                   mWorkspaceDi = u2.f0();
                }
             }
             UploadRequest$a uoa = UploadRequest.newBuilder();
             uoa.U(QCurrentUser.me().getId());
             uoa.b(QCurrentUser.me().getName());
             uoa.j(mOutputPath);
             v1 u3 = str.u;
             workspace = (u3 != null)? u3.v(): null;
             uoa.Y(workspace);
             uoa.Z(mWorkspaceDi);
             uoa.a.mForwardTokens = stringArray;
             uoa.D(str9);
             uoa.X(photoVisibil);
             uoa.i(str.z);
             Workspace$Type lONG_VIDEO = Workspace$Type.LONG_VIDEO;
             b2 = (type == lONG_VIDEO)? true: false;
             uoa.p(b2);
             uoa.r(str.E);
             uoa.W(str.A);
             uoa.J(str.D);
             uoa.K(str10);
             uoa.E(System.currentTimeMillis());
             i = (str.y != null)? true: false;
             uoa.O(i);
             uoa.I(str.r);
             uoa.m(str.C);
             v1 x1 = str.X;
             d = (x1 != null)? x1.d: str8;
             uoa.a0(d);
             uoa.H(str.p);
             uoa.R(i3);
             uoa.w(b);
             uoa.A(i1);
             boolean b3 = (photoVisibil == PhotoVisibility.PUBLIC)? str.V.get().booleanValue(): false;
             uoa.M(b3);
             uoa.x(a.a(photoVisibil1));
             uoa.S(a.e());
             uoa.C(a.d());
             uoa.v(s.b(str.q, str.u));
             uoa.k(c.n(str.q));
             uoa.h(s.a.a(str.u));
             b3 = (i.h() && i.m().B())? true: false;
             uoa.G(b3);
             b.c.a(uoa);
             x.b(uoa);
             q = str.u;
             if (q != null && q.T0() == Workspace$Source.JUXING) {
                uoa.Q(IUploadRequest$UploadPostType.JUXING);
                b3 = true;
                uoa.l(b3);
             }else {
                b3 = true;
             }
             if (!TextUtils.x(str.Z)) {
                uoa.n(b3);
                uoa.F(str.Z);
             }
             if (type != Workspace$Type.VIDEO && (type != Workspace$Type.KTV_MV && (type != lONG_VIDEO && (type != Workspace$Type.PHOTO_MOVIE && (type != Workspace$Type.KUAISHAN && (type != Workspace$Type.ALBUM_MOVIE && type != Workspace$Type.AI_CUT)))))) {
                if (type == Workspace$Type.KTV_SONG) {
                   x = str.E;
                   if (x != null && x.getKaraokeType() == 3) {
                   label_057a :
                      uoa.o(true);
                   label_057e :
                      Iterator iterator1 = str.x.q.iterator();
                      while (iterator1.hasNext()) {
                         iterator1.next().e1(uoa);
                      }
                      x = str.q;
                      q = str.u;
                      InteractStickerInfo interactStic = null;
                      b = 2;
                      if (!PatchProxy.applyVoidTwoRefs(x, q, interactStic, ov1, "9") && (q != null && (p0.a(q.T0()) && x != null))) {
                         x.Y1(b);
                         x.w1(b);
                         x.g(true);
                      }
                   label_05bd :
                      if (str.F.get().booleanValue() && str.G.get() != null) {
                         uoa.f(str.G.get());
                      }
                      if (str.F.get().booleanValue() && str.H.get() != null) {
                         uoa.B(str.H.get());
                      }
                      x = str.u;
                      if (x != null) {
                         Cover uCover = a.f(x).v();
                         Size size = (uCover != null && !TextUtils.x(uCover.getVideoCoverParam().getVideoCoverRatio()))? new Size(uCover.getVideoCoverParam().getCropOptions().getWidth(), uCover.getVideoCoverParam().getCropOptions().getHeight()): interactStic;
                         uoa.g(size);
                      }
                      if (str.I != null && str.v != null) {
                         uoa.a.mSource = IUploadInfo$UploadSource.SOURCE_THIRD_APP;
                      }
                      x = str.q;
                      if (x != null) {
                         x.T1(c.o());
                         f.a(str.q);
                         x = str.q;
                         UploadRequest uploadReques = uoa.a();
                         if (!PatchProxy.applyVoidTwoRefs(x, uploadReques, str, ov1, "19")) {
                            List list = c.d(uploadReques.getCaption(), new HashMap());
                            if (!q.f(list)) {
                               String[] stringArray1 = new String[list.size()];
                               for (i1 = 0; i1 < list.size(); i1 = i1 + 1) {
                                  stringArray1[i1] = list.get(i1).getId();
                               }
                               x.F().b.T0 = stringArray1;
                            }
                         }
                      }
                      uoa.V(str.q);
                      uoa.q(true);
                      b3 = -2001546430;
                      str10 = 7;
                      if (str.J >= null) {
                         PostWorkInfo postWorkInfo = d.a(-273232199).a20().L0(str.J);
                         if (postWorkInfo != null) {
                            if (!q.f(str.C)) {
                               interactStic = str.C.get(0);
                            }
                            postWorkInfo.setPhotoEditInfo(k9.b(str.u, interactStic, d7.a.c()));
                            if (postWorkInfo.getEncodeInfo() != null) {
                               if (postWorkInfo.getEncodeInfo().mResult != null) {
                                  EditorSdk2MvCreationResult uEditorSdk2M = postWorkInfo.getEncodeInfo().mResult.g();
                                  if (!PatchProxy.applyVoidOneRefs(uEditorSdk2M, str, ov1, "8") && uEditorSdk2M != null) {
                                     Iterator iterator2 = uEditorSdk2M.getReplaceableMvAssets().iterator();
                                     while (true) {
                                        if (iterator2.hasNext()) {
                                           if (iterator2.next().getInsertFrameParam() != null) {
                                              str1 = 1;
                                           }
                                        }else {
                                           str1 = null;
                                        }
                                        if (str1) {
                                           u1.r0(h$b.e(str10, "INSERT_FRAME_EXPORT"));
                                        }
                                     }
                                  }
                               }
                               PostEncodeInfo encodeInfo = postWorkInfo.getEncodeInfo();
                               obj = PatchProxy.applyOneRefs(encodeInfo, str, ov1, "15");
                               if (obj != PatchProxyResult.class) {
                                  i3 = obj.booleanValue();
                               }else if(encodeInfo.isSupportHdExport() && encodeInfo.isHdExport() != a.I()){
                                  i3 = true;
                               }else {
                                  i3 = false;
                               }
                               if (i3) {
                                  x = str.J;
                                  if (!PatchProxy.isSupport(ov1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(x), uoa, str, ov1, "16")) {
                                     a uoa1 = d.a(-273232199).a20();
                                     if (uoa1 == null) {
                                        i1.c(new NullPointerException("postWorkManager is null"));
                                     }else if(str.y == null){
                                        i1.c(new NullPointerException("mEncodeRequest is null"));
                                     }else {
                                        uoa1.Y3(x, true, 18);
                                        EncodeRequest$a uoa2 = new EncodeRequest$a(str.y);
                                        uoa2.l(a.I());
                                        uoa2.k(false);
                                        i4 = d.a(-273232199).a20().q0(new w0(uoa2.a()));
                                        uoa.q(true);
                                        if (d.a(-273232199).a20().X3(uoa.a(), i4)) {
                                           objArray5 = new Object[0];
                                           u1.onEvent(str.s.getUrl(), "share", objArray5);
                                           str.R8(i4);
                                        }else {
                                           i1.c(new IllegalStateException("create upload request error"));
                                        }
                                     }
                                  }
                                  return;
                               }else {
                                  postWorkInfo.getEncodeInfo().setIsHidden(false);
                               }
                            }
                            postWorkInfo.setIsPublished(true);
                         }
                         if (postWorkInfo != null && (postWorkInfo.getStatus() == PostStatus.ENCODE_PENDING || postWorkInfo.getStatus() == PostStatus.ENCODING)) {
                            d.a(-273232199).a20().l3(postWorkInfo.getId(), true);
                            if (d.a(-273232199).a20().X3(uoa.a(), postWorkInfo.getId())) {
                               objArray5 = new Object[0];
                               u1.onEvent(str.s.getUrl(), "share", objArray5);
                               str.R8(postWorkInfo.getId());
                               return;
                            }
                         }else if(new File(mOutputPath).exists()){
                            if (postWorkInfo != null && b.a(b3).n(postWorkInfo.getEncodeInfo(), postWorkInfo.getUploadInfo())) {
                               d.a(-273232199).a20().l3(postWorkInfo.getId(), true);
                               if (d.a(-273232199).a20().X3(uoa.a(), postWorkInfo.getId())) {
                                  objArray5 = new Object[0];
                                  u1.onEvent(str.s.getUrl(), "share", objArray5);
                                  str.R8(postWorkInfo.getId());
                                  return;
                               }
                            }else {
                               uoa.o(false);
                               i4 = (postWorkInfo != null)? postWorkInfo.getId(): -1;
                               if (d.a(-273232199).a20().X3(uoa.a(), i4)) {
                                  objArray5 = new Object[0];
                                  u1.onEvent(str.s.getUrl(), "share", objArray5);
                                  str.R8(i4);
                                  return;
                               }
                            }
                         }
                      }
                   label_08ec :
                      if (str.q == null) {
                         str.q = new VideoContext();
                         if (!TextUtils.x(str.w) && (str.w).contains(str11)) {
                            x = str.q;
                            Objects.requireNonNull(x);
                            VideoContext videoContext = VideoContext.class;
                            if (!PatchProxy.isSupport(videoContext) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, x, videoContext, "183")) {
                               VideoContext.b();
                               x.f0();
                               x.a.b.C = true;
                            }
                         }
                      }
                      if (!TextUtils.isEmpty(str.w)) {
                         try{
                            str.q.Z0(str.w);
                         }catch(java.lang.Exception e0){
                            PostUtils.D(str7, "realShare setFromPage", e0);
                         }
                      }
                   }
                }
                if (this.V8()) {
                   goto label_057a ;
                }else {
                   goto label_057e ;
                }
             }else {
                goto label_057a ;
             }
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v1.class, "2")) {
          return;
       }
       this.P = m1.f(p0, 0x7f0a1716);
       this.Q = m1.f(p0, 0x7f0a0ca8);
       this.O = m1.f(p0, 0x7f0a3316);
       this.R = m1.f(p0, 0x7f0a3e1c);
       this.S = m1.f(p0, 0x7f0a3319);
       this.T = m1.f(p0, 0x7f0a3318);
       this.U = m1.f(p0, 0x7f0a331b);
       return;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "1")) {
          return;
       }
       this.q = this.t8("SHARE_VIDEO_CONTEXT");
       this.r = this.r8("PHOTO_TASK_ID");
       this.s = this.r8("SHARE_ACTIVITY");
       this.t = this.t8("DIRECT_SHARE_PATH");
       this.u = this.t8("WORKSPACE");
       Boolean fALSE = Boolean.FALSE;
       this.v = i.g().getFromThirdParty().get(fALSE).booleanValue();
       this.w = this.t8("SHARE_FROM_PAGE");
       this.x = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.y = this.t8("SHARE_ENCODE_REQUEST");
       this.z = this.r8("ENCODE_CONFIG_ID").longValue();
       this.A = this.r8("SHARE_VIDEO_DURATION").longValue();
       this.B = this.t8("PUBLISH_PARAM");
       this.C = this.t8("INTERACT_STICKER_INFO");
       this.D = i.g().getThirdPartyAppPackage().get();
       this.E = this.t8("SHARE_KTV_INFO");
       this.F = this.x8("SHARE_COVER_NEED_UPLOAD");
       this.G = this.x8("SHARE_COVER_FILE");
       this.H = this.x8("SHARE_ORIGIN_COVER_FILE");
       this.I = this.r8("WONT_START_HOME_IF_LAST_ACTIVITY").booleanValue();
       this.J = this.r8("SHARE_PRE_ENCODE_ID").intValue();
       this.K = this.r8("share_page_setting_kswtich");
       this.L = this.r8("selected_user_map");
       this.M = this.r8("LISTENERS_MAP");
       this.p = i.g().getUploadParamArg().get();
       this.V = this.x8("PUBLISH_FLOW_FEEDBACK");
       this.Y = j0.f(this.s.getIntent(), "relay_draft_id");
       return;
    }
}
