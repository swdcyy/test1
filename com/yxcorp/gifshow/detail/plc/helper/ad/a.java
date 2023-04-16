package com.yxcorp.gifshow.detail.plc.helper.ad.a;
import f4a.k;
import android.app.Activity;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$a;
import f4a.b0;
import java.lang.Object;
import java.lang.String;
import f4a.m;
import com.yxcorp.gifshow.detail.plc.helper.ad.a$a;
import tkd.b;
import tkd.d;
import nl9.d;
import com.yxcorp.download.DownloadTask;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData;
import android.app.Application;
import o56.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import z1.a;
import f4a.j;
import java.lang.Number;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.google.common.base.Optional;
import g4a.a;
import ok.h;
import java.lang.Integer;
import yx.j0;
import nl9.u;
import com.yxcorp.gifshow.detail.plc.helper.ad.PlcAdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.entity.QPhoto;
import f4a.u;
import com.kuaishou.webkit.URLUtil;
import com.kwai.framework.model.feed.BaseFeed;
import lnc.a1;
import java.util.HashMap;
import xh7.b;
import xh7.a;
import g4a.b;
import qh7.b;
import qh7.a;

public class a implements k	// class@001672
{
    public final Activity a;
    public final PlcEntryDataAdapter b;
    public final ApkDownloadHelper$a c;
    public final b d;
    public final b0 e;
    public DownloadTask f;

    public void a(Activity p0,PlcEntryDataAdapter p1,ApkDownloadHelper$a p2,b0 p3){
       super();
       m.g(p1.getDownloadUrl(), p1.getFileName());
       this.a = p0;
       this.c = p2;
       this.b = p1;
       a$a uoa = new a$a(this, p3);
       this.d = uoa;
       this.e = p3;
       d.a(0x4bd38ddd).by();
       if (this.n() != null) {
          b[] uobArray = new b[]{uoa};
          DownloadManager.n().b(this.n().getId(), uobArray);
       }
       return;
    }
    public static boolean k(PlcEntryStyleInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(a.m(p0)) ^ 0x01);
    }
    public static boolean l(PlcEntryStyleInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null || (p0.mBizType != b || !a.k(p0))) {
          b = false;
       }
       return b;
    }
    public static String m(PlcEntryStyleInfo p0){
       PlcEntryStyleInfo obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mAdData;
          if (obj != null) {
             if (!TextUtils.x(obj.mSpecializedMidPageUrl) && (p0.mStyleInfo != null && SystemUtil.M(a.b(), p0.mStyleInfo.mPackageName))) {
                return p0.mAdData.mSpecializedMidPageUrl;
             }else {
                return p0.mAdData.mMidPageUrl;
             }
          }
       }
       return "";
    }
    public static boolean p(PlcEntryStyleInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.l(p0);
    }
    public static boolean q(PlcEntryStyleInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.k(p0);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       if (this.o(objArray)) {
          return;
       }
       if (this.n() != null) {
          DownloadManager.n().z(this.n().getId());
       }
       return;
    }
    public int b(long p0,long p1,int p2){
       return j.a(this, p0, p1, p2);
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Optional.fromNullable(m.e(this.b.getDownloadUrl())).transform(new a(this)).or(Integer.valueOf(0)).intValue();
    }
    public boolean d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.o(null)) {
          if (p0 != null) {
             p0.accept(Integer.valueOf(12));
          }
          return true;
       }else if(this.n() != null){
          if (p0 != null) {
             p0.accept(Integer.valueOf(0));
          }
          DownloadManager.n().D(this.n().getId());
          return true;
       }else {
          return 0;
       }
    }
    public void e(){
       j.d(this);
    }
    public void f(Activity p0,String p1,a p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "9")) {
          return;
       }
       p0 = PatchProxy.apply(null, this, a.class, "10");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else if(this.b.getPlcEntryStyleInfo() != null && (this.b.getPlcEntryStyleInfo().mAdData != null && this.b.getPlcEntryStyleInfo().mAdData.mEnableOpenAppFirstJump != null)){
          b = true;
       }else {
          b = false;
       }
       if (!b && this.o(p2)) {
          Object[] objArray = new Object[0];
          j0.f("AdDownloader", "open navigate mid page success", objArray);
          return;
       }else {
          b[] uobArray = new b[]{this.d};
          d.a(-1694791652).LU(this.a, new PlcAdDataWrapper(this.b), true, p2, uobArray);
          return;
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       int i = 0x4bd38ddd;
       if (this.n() != null) {
          DownloadManager.n().B(this.n().getId(), this.d);
          this.b.getDownloadUrl();
          d.a(i).LA();
       }
       d.a(i).fc(this.b.getDownloadUrl(), this.d);
       return;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.q(this.b.getPlcEntryStyleInfo());
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       if (this.o(p0)) {
          return;
       }
       b[] uobArray = new b[]{this.d};
       d.a(-1694791652).LU(this.a, new PlcAdDataWrapper(this.b), true, p0, uobArray);
       return;
    }
    public void j(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       b[] uobArray = new b[]{this.d};
       d.a(-1694791652).LU(this.a, new PlcAdDataWrapper(this.b), true, p1, uobArray);
       return;
    }
    public final DownloadTask n(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          return obj;
       }
       Integer integer = DownloadManager.n().p(this.b.getDownloadUrl());
       if (integer == null) {
          return objArray;
       }
       DownloadTask uDownloadTas = DownloadManager.n().l(integer.intValue());
       this.f = uDownloadTas;
       return uDownloadTas;
    }
    public final boolean o(a p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       HashMap obj1 = PatchProxy.apply(null, this, uoa, "16");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          PlcEntryStyleInfo plcEntryStyl = this.b.getPlcEntryStyleInfo();
          if (a.l(plcEntryStyl)) {
             d.a(0x4bd38ddd).MH(this.b.getDownloadUrl(), this.d);
             if (!u.f(this.b.getPhoto())) {
                String str = a.m(plcEntryStyl);
                if (URLUtil.isNetworkUrl(str)) {
                   d.a(-1694791652).RQ(this.a, this.b.getPhoto().mEntity, str);
                }else if(!a1.i(this.a)){
                   obj1 = new HashMap();
                   obj1.put("QPhoto", this.b.getPhoto());
                   a te = this.e;
                   String str1 = "SOURCE_PAGE_FROM_PLC";
                   if (te != null) {
                      obj1.put(str1, te.z());
                   }
                   b uob = b.j(this.a, str);
                   uob.h("EXTRA_CONTEXT_MAP", obj1);
                   if (obj1.containsKey(str1)) {
                      uob.h("codSourcePage", obj1.get(str1));
                   }
                   a.b(uob, new b(str));
                }
             }
             b = true;
          }
          b = false;
       }
       if (b) {
          if (p0 != null) {
             p0.accept(Integer.valueOf(12));
          }
          return true;
       }else {
          return false;
       }
    }
}
