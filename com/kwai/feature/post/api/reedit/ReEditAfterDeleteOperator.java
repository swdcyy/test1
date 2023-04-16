package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import l46.a;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$expiredTimePeriod$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$reEditAfterDeleteDialogTitle$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.reedit.PublishedBackUpInfo;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import android.content.SharedPreferences;
import q46.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.reflect.Type;
import km8.b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import androidx.fragment.app.FragmentActivity;
import com.kwai.library.widget.popup.common.c;
import ko5.d;
import ko5.c;
import wq6.l;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$a;
import fr6.d;
import java.lang.Number;
import java.lang.Long;
import java.lang.System;
import java.lang.Math;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$b;
import u07.u;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$c;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.config.PopupOrientation;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.android.post.PostArguments;
import nsd.u;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import om6.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$f;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$g;
import erd.g;
import crd.b;
import com.kwai.framework.activitycontext.ActivityContext;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.activitycontext.ActivityContext$a;

public final class ReEditAfterDeleteOperator implements a	// class@001435
{
    public static final p a;
    public static final p b;
    public static String c;
    public static final ReEditAfterDeleteOperator d;

    static {
       ReEditAfterDeleteOperator.d = new ReEditAfterDeleteOperator();
       ReEditAfterDeleteOperator.a = s.c(ReEditAfterDeleteOperator$expiredTimePeriod$2.INSTANCE);
       ReEditAfterDeleteOperator.b = s.c(ReEditAfterDeleteOperator$reEditAfterDeleteDialogTitle$2.INSTANCE);
       ReEditAfterDeleteOperator.c = "";
    }
    public void ReEditAfterDeleteOperator(){
       super();
    }
    public static final boolean m(String p0){
       PublishedBackUpInfo publishedBac = null;
       Object obj = PatchProxy.applyOneRefs(p0, publishedBac, ReEditAfterDeleteOperator.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "draftId");
       PublishedBackUpInfo publishedBac1 = ReEditAfterDeleteOperator.d.c(p0);
       if (publishedBac1 != null) {
          if (publishedBac1.isAutoSave()) {
             publishedBac = publishedBac1;
          }
          if (publishedBac != null) {
             return true;
          }
       }
       return false;
    }
    public boolean a(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, ReEditAfterDeleteOperator.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "draftId");
       PublishedBackUpInfo publishedBac = this.c(p0);
       int i = 0;
       if (publishedBac == null) {
          return i;
       }
       obj = new Object[i];
       p3.D().w("ReEditAfterDeleteOperator", "isNotExpiredAsPublishedBackup: publishedBackUpInfo  "+publishedBac, obj);
       return (ReEditAfterDeleteOperator.d.n(publishedBac.getPublishedDate()) ^ 0x01);
    }
    public boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReEditAfterDeleteOperator.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "draftId");
       PublishedBackUpInfo publishedBac = this.c(p0);
       if (publishedBac != null) {
          return (publishedBac.isAutoSave() ^ 0x01);
       }
       return false;
    }
    public PublishedBackUpInfo c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReEditAfterDeleteOperator.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "draftId");
       p0 = l.g().getString("PUBLISHED_WS"+p0, "");
       if (TextUtils.x(p0)) {
          return null;
       }
       PublishedBackUpInfo publishedBac = b.a(p0, PublishedBackUpInfo.class);
       Object[] objArray = new Object[0];
       p3.D().w("ReEditAfterDeleteOperator", "getPublishedBackupInfoByDraftId: find matched info "+publishedBac, objArray);
       return publishedBac;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditAfterDeleteOperator.class, "11")) {
          return;
       }
       a.p(p0, "draftId");
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("ReEditAfterDeleteOperator", "clearPublishedBackupInfo\(\) called with: draftId = "+p0, objArray);
       PublishedBackUpInfo publishedBac = this.c(p0);
       if (publishedBac != null) {
          Object[] objArray1 = new Object[i];
          p3.D().w("ReEditAfterDeleteOperator", "clearPublishedBackupInfo\(\) clear:"+publishedBac+' ', objArray1);
          g.a(l.g().edit().remove("PUBLISHED_PHOTO"+publishedBac.getPhotoId()).remove("PUBLISHED_WS"+p0));
       }
       return;
    }
    public void e(String p0,PublishedBackUpInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReEditAfterDeleteOperator.class, "9")) {
          return;
       }
       a.p(p0, "draftId");
       a.p(p1, "publishedBackUpInfo");
       Object[] objArray = new Object[0];
       p3.D().w("ReEditAfterDeleteOperator", "recordPublishedBackupInfo\(\) called with: draftId = "+p0+", publishedBackUpInfo = "+p1, objArray);
       g.a(l.g().edit().putString("PUBLISHED_WS"+p0, b.e(p1)).putString("PUBLISHED_PHOTO"+p1.getPhotoId(), p0));
       return;
    }
    public boolean f(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, ReEditAfterDeleteOperator.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "draftId");
       PublishedBackUpInfo publishedBac = this.c(p0);
       int i = 0;
       if (publishedBac == null) {
          return i;
       }
       obj = new Object[i];
       p3.D().w("ReEditAfterDeleteOperator", "isExpiredAsPublishedBackup: publishedBackUpInfo  "+publishedBac, obj);
       return ReEditAfterDeleteOperator.d.n(publishedBac.getPublishedDate());
    }
    public boolean g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReEditAfterDeleteOperator.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "draftId");
       int i = 0;
       if (a.g(ReEditAfterDeleteOperator.c, p0)) {
          Object[] objArray = new Object[i];
          p3.D().w("ReEditAfterDeleteOperator", "dialog is showing, as not expired  "+p0, objArray);
          return i;
       }else {
          PublishedBackUpInfo publishedBac = this.c(p0);
          if (publishedBac != null) {
             Object[] objArray1 = new Object[i];
             p3.D().w("ReEditAfterDeleteOperator", "isExpiredAndNeedDelete: publishedBackUpInfo  "+publishedBac, objArray1);
             if (!publishedBac.isAutoSave() && ReEditAfterDeleteOperator.d.n(publishedBac.getPublishedDate())) {
                i = true;
             }
          }
          return i;
       }
    }
    public PublishedBackUpInfo h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReEditAfterDeleteOperator.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photoId");
       p0 = this.i(p0);
       if (p0 != null) {
          return this.c(p0);
       }
       return null;
    }
    public String i(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, ReEditAfterDeleteOperator.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photoId");
       obj = l.g().getString("PUBLISHED_PHOTO"+p0, "");
       if (!TextUtils.x(obj)) {
          return obj;
       }
       Object[] objArray = new Object[0];
       p3.D().w("ReEditAfterDeleteOperator", "getDraftIdByPhotoId: cant find matched draft id, photoId "+p0, objArray);
       return null;
    }
    public final void j(FragmentActivity p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReEditAfterDeleteOperator.class, "6")) {
          return;
       }
       d uod = c.a(p0);
       a.o(uod, "IKCubeHomeTabDataStore.get\(homeActivity\)");
       l ol = uod.d();
       if (ol != null) {
          Object[] objArray = new Object[0];
          p3.D().w("ReEditAfterDeleteOperator", "init tab change listener, cube", objArray);
          ol.a(new ReEditAfterDeleteOperator$a(ol, p1));
       }
       return;
    }
    public final double k(){
       Object obj = PatchProxy.apply(null, this, ReEditAfterDeleteOperator.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = ReEditAfterDeleteOperator.a.getValue();
       }
       return obj.doubleValue();
    }
    public final String l(){
       Object obj = PatchProxy.apply(null, this, ReEditAfterDeleteOperator.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReEditAfterDeleteOperator.b.getValue();
    }
    public final boolean n(long p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ReEditAfterDeleteOperator reEditAfterD = ReEditAfterDeleteOperator.class;
       if (PatchProxy.isSupport(reEditAfterD)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, reEditAfterD, "20");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       double d = (double)Math.abs((System.currentTimeMillis() - p0));
       Object obj1 = PatchProxy.apply(null, this, reEditAfterD, "7");
       double d1 = (obj1 != patchProxyRe)? obj1.doubleValue(): this.k() * (double)0x36ee80;
       boolean b = (d - d1 > 0)? true: false;
       return b;
    }
    public final void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditAfterDeleteOperator.class, "3")) {
          return;
       }
       a.p(p0, "draftId");
       Object[] objArray = new Object[0];
       p3.D().w("ReEditAfterDeleteOperator", "currentPhotoId "+ReEditAfterDeleteOperator.c, objArray);
       ReEditAfterDeleteOperator.c = p0;
       return;
    }
    public final void p(GifshowActivity p0,QPhoto p1){
       String taskId;
       ReEditAfterDeleteOperator reEditAfterD = ReEditAfterDeleteOperator.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, reEditAfterD, "4")) {
          return;
       }
       a.p(p0, "currentActivity");
       a.p(p1, "photo");
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("ReEditAfterDeleteOperator", "showReeditAfterDeletedDialog", objArray);
       GifshowActivity gifshowActiv = this.r();
       if (gifshowActiv != null) {
          String photoId = p1.getPhotoId();
          a.o(photoId, "photo.photoId");
          PublishedBackUpInfo publishedBac = PatchProxy.applyOneRefs(photoId, this, reEditAfterD, "10");
          if (publishedBac != PatchProxyResult.class) {
          }else {
             a.p(photoId, "photoId");
             taskId = this.i(photoId);
             publishedBac = (taskId != null)? this.c(taskId): null;
          }
          taskId = (publishedBac != null)? publishedBac.getTaskId(): null;
          d uod = new d(gifshowActiv);
          uod.Z0(175);
          uod.b1(KwaiDialogOption.e);
          uod.W0(R.string.arg_RES_7f10421f);
          uod.S0(R.string.arg_RES_7f10421d);
          uod.A(i);
          uod.w0(true);
          uod.P(true);
          uod.T(5000);
          uod.u0(new ReEditAfterDeleteOperator$b(p0, taskId, p1));
          uod.w(new ColorDrawable(a1.a(R.color.arg_RES_7f06202f)));
          uod.W(i);
          uod.x(i);
          uod.G(null);
          uod.O(ReEditAfterDeleteOperator$c.a);
          uod.L(new ReEditAfterDeleteOperator$d(gifshowActiv, R.layout.arg_RES_7f0d0308));
          uod.U(PopupOrientation.ORIENTATION_PORTRAIT);
          uod.Y(new ReEditAfterDeleteOperator$e(p0, taskId));
       }
       return;
    }
    public final void q(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditAfterDeleteOperator.class, "19")) {
          return;
       }
       a.p(p0, "photo");
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("ReEditAfterDeleteOperator", "startReeditPhotoAfterDelete:  "+p0.getPhotoId(), objArray);
       GifshowActivity gifshowActiv = this.r();
       if (gifshowActiv != null) {
          PostArguments postArgument = new PostArguments(i, 1, null);
          postArgument.getEditQPhoto().set(p0);
          y6.s(d.class, LoadPolicy.DIALOG).R(new ReEditAfterDeleteOperator$f(p0, gifshowActiv, postArgument), ReEditAfterDeleteOperator$g.b);
       }
       return;
    }
    public final GifshowActivity r(){
       ActivityContext obj = PatchProxy.apply(null, this, ReEditAfterDeleteOperator.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ActivityContext.g();
       a.o(obj, "ActivityContext.getInstance\(\)");
       List list = obj.d();
       int i = 0;
       if (!q.f(list)) {
          int i1 = list.size() - 2;
          ActivityContext$a uoa = (i1 >= 0)? list.get(i1): list.get(i);
          a.o(uoa, "if \(index >= 0\) {\n      ¡­StackWithState[0]\n      }");
          Activity uActivity = uoa.a();
          if (uActivity instanceof GifshowActivity && !uActivity.isFinishing()) {
             return uActivity;
          }
       }
    label_004f :
       Object[] objArray = new Object[i];
       p3.D().A("ReEditAfterDeleteOperator", "tryToFindHomeActivity, cant find homeActivity", objArray);
       return null;
    }
}
