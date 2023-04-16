package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentFansTopElement;
import s85.b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentFansTopElement$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentFansTopElement$mFansTopCommentTopBarInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.model.fanstop.FansTopCommentTopBarInfo;
import mz8.o;
import java.lang.reflect.Type;
import el.a;
import java.util.HashMap;
import cw.a;
import java.lang.Long;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.DateUtils;
import lnc.y0;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import com.kwai.component.commenttopbar.model.BaseElementModel$Style;
import com.kwai.component.commenttopbar.model.BaseElementModel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import com.kwai.component.commenttopbar.model.b;
import android.graphics.drawable.Drawable;
import g59.n;
import android.view.View;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import jyc.b;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import mz8.n;
import java.lang.System;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import mz8.m;
import java.util.Collection;
import java.lang.Iterable;
import java.lang.Comparable;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class ThanosAdCommentFansTopElement extends b	// class@001562
{
    public final p c;
    public final QPhoto d;
    public static final ThanosAdCommentFansTopElement$a e;

    static {
       ThanosAdCommentFansTopElement.e = new ThanosAdCommentFansTopElement$a(null);
    }
    public void ThanosAdCommentFansTopElement(QPhoto p0){
       super();
       this.d = p0;
       this.c = s.c(new ThanosAdCommentFansTopElement$mFansTopCommentTopBarInfo$2(this));
    }
    public boolean a(){
       Boolean uBoolean;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ThanosAdCommentFansTopElement thanosAdComm = ThanosAdCommentFansTopElement.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, thanosAdComm, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       QPhoto obj1 = PatchProxy.apply(objArray, this, thanosAdComm, "7");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(this.l() != null){
          HashMap hashMap = a.a(new o().getType());
          if (hashMap == null) {
             hashMap = 0;
          }else {
             thanosAdComm = this.d;
             String photoId = (thanosAdComm != null)? thanosAdComm.getPhotoId(): objArray;
             Long longx = hashMap.get(photoId);
             if (longx != null) {
                a.o(longx, "it");
                uBoolean = Boolean.valueOf(DateUtils.J(longx.longValue()));
             }else {
                uBoolean = objArray;
             }
             boolean b1 = y0.p(uBoolean);
          }
          thanosAdComm = this.d;
          if (thanosAdComm != null) {
             obj1 = thanosAdComm.mEntity;
             if (obj1 != null) {
                objArray = obj1.getPartData("COMMENT_FANSTOP_PROMOTE_SHOW_AGAIN");
             }
          }
          if (objArray != null || !hashMap) {
             b = true;
          }
       }
       return b;
    }
    public BaseElementModel$Style c(){
       return BaseElementModel$Style.SINGLE;
    }
    public boolean e(){
       return false;
    }
    public void f(BaseElementModel p0,GifshowActivity p1,Context p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, ThanosAdCommentFansTopElement.class, "5")) {
       }else {
          FansTopCommentTopBarInfo uFansTopComm = this.l();
          if (uFansTopComm != null && p0 != null) {
             p0.h(uFansTopComm.getMDisplayPrefix());
             p0.f(uFansTopComm.getMDisplaySuffix());
             p0.g(n.e(R.drawable.arg_RES_7f080511, 0x7f0607c1, false, 4, null));
          }
          PatchProxy.onMethodExit(ThanosAdCommentFansTopElement.class, "5");
       }
       return;
    }
    public void g(View p0,GifshowActivity p1){
       String mClickUrl;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ThanosAdCommentFansTopElement.class, "4")) {
          return;
       }
       if (p1 != null) {
          FansTopCommentTopBarInfo uFansTopComm = this.l();
          if (uFansTopComm != null) {
             String str = "photoId";
             String str1 = null;
             if (StringsKt__StringsKt.O2(uFansTopComm.getMClickUrl(), str, false, 2, str1)) {
                mClickUrl = uFansTopComm.getMClickUrl();
             }else {
                ThanosAdCommentFansTopElement td = this.d;
                mClickUrl = (td != null)? b.a(uFansTopComm.getMClickUrl(), str, td.getPhotoId()): str1;
             }
             if (mClickUrl != null) {
                StringBuilder str2 = "origin clickUrl: ";
                FansTopCommentTopBarInfo uFansTopComm1 = this.l();
                if (uFansTopComm1 != null) {
                   str1 = uFansTopComm1.getMClickUrl();
                }
                Object[] objArray = new Object[false];
                j0.f("ThanosAdCommentFansTopElement", str2+str1+", final clickUrl:"+mClickUrl, objArray);
                c.i(p1, KwaiYodaWebViewActivity.G3(p1, mClickUrl).a());
             }
          }
       }
       return;
    }
    public void j(GifshowActivity p0){
       ThanosAdCommentFansTopElement thanosAdComm = ThanosAdCommentFansTopElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, thanosAdComm, "3")) {
          return;
       }
       StringBuilder str = "fanstop top bar impression, feedId = ";
       ThanosAdCommentFansTopElement td = this.d;
       String photoId = (td != null)? td.getPhotoId(): null;
       Object[] objArray = new Object[0];
       j0.f("ThanosAdCommentFansTopElement", str+photoId, objArray);
       if (!PatchProxy.applyVoid(null, this, thanosAdComm, "8") && this.d != null) {
          HashMap hashMap = a.a(new n().getType());
          if (hashMap == null) {
             hashMap = new HashMap();
          }
          hashMap.put(this.d.getPhotoId(), Long.valueOf(System.currentTimeMillis()));
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("feedShowedLastTimeMap", b.e(hashMap));
          g.a(uEditor);
          this.d.mEntity.setPartData("COMMENT_FANSTOP_PROMOTE_SHOW_AGAIN", Boolean.TRUE);
       }
       return;
    }
    public void k(){
       ThanosAdCommentFansTopElement thanosAdComm = ThanosAdCommentFansTopElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, thanosAdComm, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, thanosAdComm, "9")) {
          HashMap hashMap = a.a(new m().getType());
          if (hashMap != null) {
             Collection uCollection = hashMap.values();
             a.o(uCollection, "feedShowedLastTimeMap.values");
             Long longx = CollectionsKt___CollectionsKt.B3(uCollection);
             if (longx != null) {
                a.o(longx, "it");
                if (!DateUtils.J(longx.longValue())) {
                   g.a(a.a.edit().remove("feedShowedLastTimeMap"));
                }
             }
          }
       }
       return;
    }
    public final FansTopCommentTopBarInfo l(){
       Object obj = PatchProxy.apply(null, this, ThanosAdCommentFansTopElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
}
