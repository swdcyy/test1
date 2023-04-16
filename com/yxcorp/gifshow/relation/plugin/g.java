package com.yxcorp.gifshow.relation.plugin.g;
import nx5.c;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Iterator;
import hcc.t;
import android.app.Activity;
import dbc.a;
import cbc.a;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import com.google.gson.JsonElement;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.relation.feed.model.PymkBigCardUserMeta;
import com.google.gson.Gson;
import com.yxcorp.gifshow.relation.feed.model.PymkExtParam;
import gac.b;
import erd.g;
import java.lang.Boolean;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import com.kwai.framework.model.user.User;
import brd.t;
import mac.j;
import mac.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import wkd.b;
import xac.s;
import com.yxcorp.gifshow.relation.plugin.f;
import erd.o;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.relation.initmodule.RelationInitModule;
import hcc.f0;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import hcc.c0;
import hcc.a0;
import cjd.e;
import hcc.e0;
import hcc.d0;
import hcc.b0;
import y8c.g;
import com.yxcorp.gifshow.relation.util.c;
import android.content.Intent;
import com.yxcorp.gifshow.relation.explore.activity.ContactsListActivity;
import mrd.c;
import qvb.i;
import wbc.m;
import ibc.c;
import crd.b;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.intimate.helper.a;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Number;
import com.kwai.framework.model.user.RichTextMeta;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pw6.d;
import com.yxcorp.gifshow.relation.feed.model.GrootPymkCardDetailSlidePlayFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.relation.contacts.initmodule.ContactInitModule;
import rbc.r;

public class g implements c	// class@00193d
{

    public void g(){
       super();
    }
    public void AW(GifshowActivity p0,List p1,int p2,List p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, g.class, "25")) {
          return;
       }
       StringBuilder str = "";
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          str = str+iterator.next()+",";
       }
       str.deleteCharAt((str.length() - 1));
       t.b(p0, p0.f(), str, p2, p3);
       return;
    }
    public void C8(Activity p0,String p1,int p2,List p3,List p4){
       Object[] objArray;
       g og = g.class;
       int i = 1;
       if (PatchProxy.isSupport(og)) {
          objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, og, "19")) {
             return;
          }
       }
       if (PatchProxy.isSupport(a.class)) {
          objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, a.class, "2")) {
          label_0068 :
             return;
          }
       }
       p1 = a.c(p1, p2);
       a.a("scheme:"+p1);
       a.b(b.j(p0, p1), null);
       goto label_0068 ;
    }
    public Pair EH(JsonElement p0,String p1){
       PymkRecoBigCardFeed obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PymkRecoBigCardFeed();
       obj.mHideCardCloseButton = true;
       CommonMeta uCommonMeta = new CommonMeta();
       obj.mCommonMeta = uCommonMeta;
       uCommonMeta.mType = PhotoType.REMINDER_FRIEND_PYMK_BIGCARD_FEED.toInt();
       PymkBigCardUserMeta pymkBigCardU = new PymkBigCardUserMeta();
       obj.mRecommendUserMeta = pymkBigCardU;
       pymkBigCardU.mPhotoId = String.valueOf(this.hashCode());
       obj.mCustomPageLogName = p1;
       if (p0 != null) {
          p1.mPymkExtParam = new Gson().c(p0, PymkExtParam.class);
          obj.mPymkPageList = new b(obj.mRecommendUserMeta.mPymkExtParam.recoPortal);
       }
       return Pair.create(obj, obj.mPymkPageList);
    }
    public String GU(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.b(p0);
    }
    public void IY(Activity p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "23")) {
          return;
       }
       a.d(p0, p1);
       return;
    }
    public String JD(String p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.a(p0, p1);
    }
    public void M9(String p0,int p1,boolean p2,int p3,g p4,g p5){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, og, "12")) {
             return;
          }
       }
       i.a(p0, p1, p2, p3, p4, p5);
       return;
    }
    public t Uf(GifshowActivity p0,User p1,boolean p2,boolean p3,String p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, og, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = j.a(p0, p1, p2, p3, p4);
       if (p3) {
          String id = p1.getId();
          if (!PatchProxy.applyVoidTwoRefs(id, p4, null, k.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 0x7685;
             u1.A(k.c(p4), "", 1, uElementPack, k.b(id));
          }
       }
       return ot;
    }
    public t V1(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1334121008).V1(p0, p1, p2);
    }
    public void Xn(Context p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, g.class, "18")) {
          return;
       }
       a.e(p0, p1, p2, p3);
       return;
    }
    public t Y1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1334121008).Y1(p0).map(f.b);
    }
    public a Zr(){
       Object obj = PatchProxy.apply(null, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RelationInitModule();
    }
    public t eU(Context p0,User p1,int p2,boolean p3,boolean p4){
       f0 obj;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, og, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new f0(p1, p2, p3);
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          ot = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p4), obj, uof0, "1");
          if (ot != patchProxyRe) {
          }else {
          label_004f :
             uof0 = obj.a;
             User mMissUInfo = uof0.mMissUInfo;
             if (mMissUInfo == null) {
                ot = t.just(uof0);
             }else {
                UserProfileMissUInfo mShowAlready = mMissUInfo.mShowAlreadyMissUStatus;
                ot = (mShowAlready != null)? t.just(uof0).doOnNext(new c0(obj, p4, mShowAlready)).doOnError(new a0(obj, p0)): b.a(-1334121008).addMissU(obj.a.getId(), obj.b).map(new e()).map(new e0(obj)).doOnNext(new d0(obj, p4, mShowAlready)).doOnError(new b0(obj, p0));
             }
          }
       }else {
          goto label_004f ;
       }
       return ot;
    }
    public void ej(GifshowActivity p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "26")) {
          return;
       }
       c.j(p0, p1, null);
       return;
    }
    public Intent g4(Context p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ContactsListActivity.u3(p0, p1);
    }
    public i h6(int p0,c p1){
       m obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, og, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new m(p0, "");
       p1.subscribe(new c(obj));
       return obj;
    }
    public boolean isAvailable(){
       return true;
    }
    public String jS(String p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.c(p0, p1);
    }
    public void sz(String p0,int p1,boolean p2,String p3,g p4,g p5){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, og, "11")) {
             return;
          }
       }
       i.c(p0, p1, p2, p3, p4, p5);
       return;
    }
    public t tQ(GifshowActivity p0,User p1,boolean p2,boolean p3,String p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, og, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = j.b(p0, p1, p2, p3, p4);
       if (p3) {
          String id = p1.getId();
          if (!PatchProxy.applyVoidTwoRefs(id, p4, null, k.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 0x7686;
             u1.A(k.c(p4), "", 1, uElementPack, k.b(id));
          }
       }
       return ot;
    }
    public void vJ(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, g.class, "13")) {
          return;
       }
       a.b(p0, p1, p2);
       PatchProxy.onMethodExit(g.class, "13");
       return;
    }
    public void vy(User p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0.mExtraInfo == null) {
          p0.mExtraInfo = new UserExtraInfo();
       }
       p0.mRecoTextScene = p1;
       return;
    }
    public int w20(User p0){
       UserExtraInfo obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          p0 = p0.mExtraInfo;
          if (p0 != null) {
             obj = p0.mRecoTextScene;
             if (obj != null) {
                return obj;
             }else {
                UserExtraInfo mRecoTextInf = p0.mRecoTextInfo;
                if (mRecoTextInf != null && !TextUtils.x(mRecoTextInf.mRawText)) {
                   return 4;
                }
             }
          }
       }
       return 5;
    }
    public d x(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrootPymkCardDetailSlidePlayFragment obj = PatchProxy.apply(null, this, g.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, GrootPymkCardDetailSlidePlayFragment.class, "20");
       if (obj != patchProxyRe) {
       }else {
          obj = new GrootPymkCardDetailSlidePlayFragment();
          obj.setArguments(new Bundle());
       }
       return obj;
    }
    public void x4(Context p0,String p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, g.class, "21")) {
          return;
       }
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, a.class, "8")) {
          p1 = a.a(p1, p2);
          a.a("scheme:"+p1);
          b uob = b.j(p0, p1);
          a.b(uob, null);
       }
       return;
    }
    public a yu(){
       Object obj = PatchProxy.apply(null, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ContactInitModule();
    }
    public i z2(int p0,int p1,String p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, g.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new r(p0, p1, p2);
    }
}
