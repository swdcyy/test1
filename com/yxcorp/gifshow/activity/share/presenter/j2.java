package com.yxcorp.gifshow.activity.share.presenter.j2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xw8.p0;
import com.yxcorp.gifshow.activity.share.presenter.h2;
import com.yxcorp.gifshow.activity.share.presenter.i2;
import erd.g;
import crd.b;
import brd.t;
import f66.i;
import jq.a;
import q87.c;
import android.widget.Button;
import com.yxcorp.gifshow.activity.share.presenter.j2$a;
import android.view.View$OnClickListener;
import java.io.File;
import xw8.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lq.i;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import okhttp3.MultipartBody$Part;
import ojd.e;
import dnc.a;
import java.lang.Long;
import qaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.android.model.mix.Location;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import k2b.u1;
import com.kuaishou.android.model.mix.HotspotParams;
import lnc.d7;
import java.lang.Integer;
import android.content.Intent;
import android.app.Activity;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import android.view.View;
import ekd.m1;
import bx8.k;

public class j2 extends PresenterV2	// class@0013f5
{
    public k p;
    public Button q;
    public EmojiEditText r;
    public EmojiEditText s;
    public QPhoto t;
    public p0 u;
    public String v;
    public GifshowActivity w;
    public AttrAnimProgressFragment x;
    public a y;
    public a z;

    public void j2(){
       super();
       this.y = new a();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j2.class, "3")) {
          return;
       }
       if (!("FEED_PAGE").equals(this.v)) {
          return;
       }
       this.X7(this.u.i.subscribe(new h2(this), i2.b));
       int i = 0;
       Object[] objArray = new Object[i];
       a.b().w("ShareUpdatePhotoPresenter", "from feedPage", objArray);
       j2 tq = this.q;
       if (tq == null) {
          Object[] objArray1 = new Object[i];
          a.b().t("ShareUpdatePhotoPresenter", "onBind mV2PublishButton is null", objArray1);
          return;
       }else {
          tq.setText(R.string.arg_RES_7f100f10);
          this.q.setOnClickListener(new j2$a(this));
          return;
       }
    }
    public final a P8(File p0,boolean p1,a p2){
       String obj;
       boolean this;
       a uoa1;
       MultipartBody$Part part1;
       Long longx1;
       String str2;
       MultipartBody$Part part2;
       Long longx2;
       boolean b;
       VideoContext videoContext;
       j2 oj2 = this;
       File uFile = p0;
       a uoa = p2;
       if (PatchProxy.isSupport(j2.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, j2.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = null;
       int i = 0;
       c uoc = (i.m().y().isEmpty())? str: i.m().y().get(i);
       obj = "";
       if (uoc != null) {
          this = true;
          if (uFile) {
             MultipartBody$Part part = e.d("cover", uFile);
             Long longx = Long.valueOf(a.a(p0.getAbsolutePath()));
             String absolutePath = p0.getAbsolutePath();
             uoa1 = (uoc.s0() != null && (uoc.s0().v() != null && !TextUtils.x(uoc.s0().v().getVideoCoverParam().getVideoCoverRatio())))? 1: null;
             part1 = part;
             obj = absolutePath;
             longx1 = longx;
          }else {
             part1 = str;
             longx1 = part1;
             uoa1 = null;
          }
          i oi = a.b();
          StringBuilder str1 = "cover file is null? ";
          if (uFile != null) {
             this = false;
          }
          Object[] objArray = new Object[i];
          oi.w("ShareUpdatePhotoPresenter", str1+this+", cover crc32: "+longx1+", coverFilePath: "+obj, objArray);
          str2 = obj;
          part2 = part1;
          longx2 = longx1;
          b = uoa1;
       }else {
          str2 = obj;
          part2 = str;
          longx2 = part2;
          b = false;
       }
       Location location = oj2.u.c();
       obj = oj2.r.getText().toString();
       KSTextDisplayHandler kSTextDispla = oj2.r.getKSTextDisplayHandler();
       if (kSTextDispla instanceof ShareEditorTextDisplayHandler) {
          obj = kSTextDispla.v();
       }
       if (TextUtils.x(obj)) {
          obj = "...";
       }
       String str3 = obj;
       long l = 0;
       j2 t = oj2.t;
       if (t != null) {
          l = Long.valueOf(t.getPhotoId()).longValue();
       }
       long l1 = l;
       t = oj2.s;
       if (t != null) {
          str = t.getText().toString();
       }
       String str4 = str;
       if (PatchProxy.isSupport(j2.class)) {
          videoContext = PatchProxy.applyThreeRefs(uoc, Boolean.valueOf(p1), location, this, j2.class, "10");
          if (videoContext != PatchProxyResult.class) {
             int i1 = p1;
          }else if(uoc != null){
             videoContext = uoc.d1();
          }else {
             videoContext = new VideoContext();
             videoContext.U1(u1.f());
          }
          videoContext.R1(oj2.u.f());
          videoContext.k1(oj2.u.G);
          if (d7.k(oj2.u.I)) {
             videoContext.a1(oj2.u.I.getId(), oj2.u.I.getConnectType());
          }
          videoContext.g(p1);
          if (location != null) {
             videoContext.D1(location);
          }
       }else {
          goto label_0146 ;
       }
       Object obj1 = videoContext;
       a uoa2 = new a(part2, str2, obj1, longx2, location, str3, l1, b, p1, str4);
       if (uoa) {
          uoa1.k = uoa.k;
       }
       return uoa1;
    }
    public final void R8(int p0){
       j2 oj2 = j2.class;
       if (PatchProxy.isSupport(oj2) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj2, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareUpdatePhotoPresenter", "finishMe", objArray);
       Intent intent = this.w.getIntent();
       intent.putExtra("share_qphoto", b.c(this.t));
       this.w.setResult(p0, intent);
       this.w.finish();
       this.w.overridePendingTransition(0, R.anim.arg_RES_7f01010d);
       return;
    }
    public final File S8(){
       Object[] objArray1;
       c uoc;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, j2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       obj = (i.m().y().isEmpty())? objArray: i.m().y().get(i);
       if (obj == null) {
          objArray1 = new Object[i];
          a.b().w("ShareUpdatePhotoPresenter", "getCoverFileFromDraft draft is null", objArray1);
          return objArray;
       }else {
          a uoa = a.f(obj);
          if (!uoa.E() && (uoa.v() == null || TextUtils.x(uoa.v().getOutputFile()))) {
             objArray1 = new Object[i];
             a.b().A("ShareUpdatePhotoPresenter", "getCoverFileFromDraft no cover info", objArray1);
             return objArray;
          }else {
             File uFile = DraftFileManager.E().v(obj.s0());
             if (uFile == null) {
                objArray1 = new Object[i];
                a.b().A("ShareUpdatePhotoPresenter", "getCoverFileFromDraft draft coverFile is null", objArray1);
                return objArray;
             }else {
                objArray1 = new Object[i];
                a.b().w("ShareUpdatePhotoPresenter", "getCoverFileFromDraft: "+uFile.getAbsolutePath(), objArray1);
                return uFile;
             }
          }
       }
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, j2.class, "6")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.b().w("ShareUpdatePhotoPresenter", "hideLoading", objArray);
       j2 tx = this.x;
       if (tx != null) {
          tx.dismiss();
       }
       tx = this.q;
       if (tx == null) {
          Object[] objArray1 = new Object[i];
          a.b().t("ShareUpdatePhotoPresenter", "hideLoading mV2PublishButton is null", objArray1);
          return;
       }else {
          tx.setText(R.string.arg_RES_7f100f10);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j2.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3316);
       this.r = m1.f(p0, 0x7f0a0ca8);
       this.s = m1.f(p0, 0x7f0a3f52);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j2.class, "1")) {
          return;
       }
       this.t = this.t8("SHARE_QPHOTO");
       this.u = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.v = this.t8("SHARE_FROM_PAGE");
       this.w = this.r8("SHARE_ACTIVITY");
       this.p = this.t8("RE_EDIT_REPO");
       return;
    }
}
