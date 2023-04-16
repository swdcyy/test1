package com.yxcorp.gifshow.camera.record.magic.sticker.c;
import t8c.c;
import mf9.a;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import com.yxcorp.gifshow.record.interactive.RecordVoteStickerData;
import tkd.b;
import tkd.d;
import voc.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q16.a$a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import com.yxcorp.gifshow.model.VoteConfig;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.camera.record.base.d;
import sg9.a;
import oc9.b0;
import oc9.a0;
import ce9.l;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import java.lang.Float;
import com.yxcorp.gifshow.record.interactive.RecordStickerBaseData;
import j4b.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import sg9.h;
import sg9.i;
import java.lang.Integer;
import java.lang.Number;
import android.content.Intent;
import mf9.h;
import com.yxcorp.gifshow.camera.record.base.b$a;
import android.view.ViewGroup;
import android.graphics.Rect;
import com.kwai.video.westeros.models.EffectDescription;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import android.view.View;
import t8c.b;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import java.util.Arrays;
import com.yxcorp.utility.TextUtils;

public class c extends d0 implements c, a	// class@000e5f
{
    public final b o;
    public final l p;
    public PresenterV2 q;
    public RecordVoteStickerData r;
    public VoteConfig s;
    public MagicEmoji$MagicFace t;
    public boolean u;
    public boolean v;

    public void c(CameraPageType p0,b p1,b p2,l p3){
       super(p0, p1);
       this.o = p2;
       this.p = p3;
    }
    public void A1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onOptionRightChanged:"+p0, objArray);
       c tr = this.r;
       if (tr != null) {
          tr.getOptionList().set(1, p0);
       }
       return;
    }
    public void M0(){
       if (PatchProxy.applyVoid(null, this, c.class, "22")) {
          return;
       }
       if (this.v == null) {
          this.o.i2();
       }
       return;
    }
    public void N0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onVoteQuestionChanged:"+p0, objArray);
       c tr = this.r;
       if (tr != null) {
          tr.setQuestion(p0);
       }
       return;
    }
    public void X(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "preContainerUpdate", objArray);
       if (this.q != null) {
          d.a(0x27ab2faf).ER(this.q);
       }
       return;
    }
    public void de(a$a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       if (this.i2()) {
          this.s = this.h2();
          this.t = this.g2();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onDelete", objArray);
       this.u = false;
       this.d.m(new a(1));
       return;
    }
    public void e0(){
       if (PatchProxy.applyVoid(null, this, c.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onSelect", objArray);
       return;
    }
    public void e2(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       a0.f(this);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "26")) {
          l d = this.d.d(l.i).d;
          if (!q.f(d)) {
             VoteConfig voteConfig = this.h2();
             Iterator iterator = d.iterator();
             while (iterator.hasNext()) {
                MagicEmoji$MagicFace magicFace = iterator.next();
                if (magicFace.isVoteMagic()) {
                   if (voteConfig != null) {
                      magicFace.mVoteConfig = voteConfig;
                   }else {
                      magicFace = magicFace.mVoteConfig;
                      if (magicFace != null) {
                         magicFace.mIsAdded = false;
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void f0(){
       if (PatchProxy.applyVoid(null, this, c.class, "25")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onUnSelect", objArray);
       return;
    }
    public void f1(float p0,float p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoc, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onPositionChanged, centerX:"+p0+" , centerY:"+p1, objArray);
       uoc = this.r;
       if (uoc != null) {
          uoc.setCenterX(p0);
          this.r.setCenterY(p1);
       }
       if (this.p.l()) {
          this.d.m(new d());
       }
       return;
    }
    public final MagicEmoji$MagicFace g2(){
       Object obj = PatchProxy.apply(null, this, c.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.i();
    }
    public final VoteConfig h2(){
       Object[] objArray = null;
       VoteConfig obj = PatchProxy.apply(objArray, this, c.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.i2() || this.r == null) {
          return objArray;
       }
       obj = new VoteConfig();
       obj.mIsAdded = this.u;
       obj.mQuestion = this.r.getQuestion();
       String[] stringArray = new String[0];
       obj.mOptions = this.r.getOptionList().toArray(stringArray);
       float[] uofloatArray = new float[]{this.r.getCenterX(),this.r.getCenterY()};
       obj.mPosition = uofloatArray;
       return obj;
    }
    public boolean hasSticker(){
       int i1;
       l obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d.d(l.i);
       l d = obj.d;
       obj = obj.a;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("VoteStickerController", "hasSticker:"+d+" , curMagicFace:"+obj, objArray);
       if (d != null) {
          Iterator iterator = d.iterator();
          i1 = 0;
          while (iterator.hasNext()) {
             i1 = i1 | iterator.next().isVoteMagic();
          }
       }else {
          i1 = 0;
       }
       int i2 = (obj != null && obj.isVoteMagic())? 1: 0;
       i2 = i2 | i1;
       if (!this.d.d(i.a()).a()) {
          i = i2;
       }
       return i;
    }
    public final boolean i2(){
       MagicEmoji$MagicFace obj = PatchProxy.apply(null, this, c.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g2();
       boolean b = (obj != null && obj.isVoteMagic())? true: false;
       return b;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onEndEdit", objArray);
       this.v = false;
       this.o.k2(true);
       return;
    }
    public void j1(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onContainerUpdate", objArray);
       if (this.q != null) {
          d.a(0x27ab2faf).FM(this.q, 1, p0, p1);
       }
       return;
    }
    public final void k2(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "removeVoteSticker", objArray);
       if (this.q != null && this.u != null) {
          d.a(0x27ab2faf).bd(this.q);
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onAdd", objArray);
       this.u = true;
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, c.class, "21")) {
          return;
       }
       if (this.v == null) {
          this.o.m2();
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onStartEdit", objArray);
       this.v = true;
       if (this.p.l()) {
          this.d.m(new d());
       }
       this.o.n2(true);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.onDestroyView();
       if (this.i2()) {
          this.s = this.h2();
          this.t = this.g2();
       }
       this.k2();
       c tq = this.q;
       if (tq != null) {
          tq.unbind();
          this.q.destroy();
       }
       this.r = null;
       this.q = null;
       this.u = false;
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, c.class, "20")) {
          return;
       }
       if (this.v == null) {
          this.o.i2();
       }
       return;
    }
    public void r1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteStickerController", "onOptionLeftChanged:"+p0, objArray);
       c tr = this.r;
       if (tr != null) {
          tr.getOptionList().set(0, p0);
       }
       return;
    }
    public void u0(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "23")) {
          return;
       }
       if (this.v == null) {
          this.o.m2();
       }
       uoc = this.r;
       if (uoc != null) {
          uoc.setScale(p0);
       }
       return;
    }
    public float v(){
       c obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.r;
       float f = (obj == null)? 0x3f800000: obj.getScale();
       return f;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.n(VoteConfig.class, new h(this));
       return;
    }
    public void z1(ViewGroup p0,Rect p1,EffectDescription p2){
       VoteConfig mIsAdded;
       c uoc = this;
       Object obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "7")) {
          return;
       }
       a uoa = a.D();
       StringBuilder str = "onEffectUpdate, container:"+obj+" , limitRect:"+obj1+" , description:";
       int b = (p2 != null)? true: false;
       Object[] objArray = new Object[0];
       uoa.s("VoteStickerController", str+b, objArray);
       if (this.hasSticker() && obj != null) {
          if (p2 != null && (this.i2() && (uoc.t != null && (!uoc.t.equals(this.g2()) || uoc.u == null)))) {
             uoc.r = null;
             this.k2();
             if (!PatchProxy.applyVoidTwoRefs(obj, obj1, uoc, c.class, "10")) {
                Object[] objArray1 = new Object[0];
                a.D().s("VoteStickerController", "addVoteSticker", objArray1);
                if (uoc.l != null && uoc.e != null) {
                   c s = uoc.s;
                   c t = uoc.t;
                   if (uoc.q == null) {
                      PresenterV2 presenterV2 = d.a(0x27ab2faf).ka(uoc.d.f(), 1, p0, p1, true);
                      uoc.q = presenterV2;
                      presenterV2.f(obj);
                      objArray1 = new Object[0];
                      uoc.q.i(objArray1);
                   }
                   d.a(0x27ab2faf).fE(uoc.q, uoc);
                   MagicEmoji$MagicFace magicFace = this.g2();
                   MagicFaceExtraParams mVoteConfig = magicFace.mExtraParams.mVoteConfig;
                   if (t != null && (t.equals(magicFace) && s != null)) {
                      mIsAdded = s.mIsAdded;
                   }else {
                      s = mVoteConfig;
                      mIsAdded = 1;
                   }
                   ArrayList uArrayList = new ArrayList();
                   VoteConfig mOptions = s.mOptions;
                   if (mOptions != null) {
                      uArrayList.addAll(Arrays.asList(mOptions));
                   }
                   mOptions = s.mPosition;
                   int i = 0x3f000000;
                   if (mOptions != null && mOptions.length > 1) {
                      i = mOptions[0];
                      b = mOptions[1];
                   }else {
                      float f = 0x3f000000;
                   }
                   uoc.r = new RecordVoteStickerData(TextUtils.k(s.mQuestion), uArrayList, i, b);
                   Object[] i1 = new Object[0];
                   a.D().s("VoteStickerController", "addRecordVoteSticker:"+uoc.r, i1);
                   if (mIsAdded != null) {
                      d.a(0x27ab2faf).eG(uoc.q, uoc.r);
                   }
                }
             }
          }
       }else {
          this.k2();
          uoc.r = null;
       }
       uoc.t = null;
       uoc.s = null;
       return;
    }
}
