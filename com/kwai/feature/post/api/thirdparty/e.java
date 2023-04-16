package com.kwai.feature.post.api.thirdparty.e;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.thirdparty.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.net.Uri;
import ekd.w0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import lnc.p3;
import q87.c;
import java.lang.Integer;
import java.lang.StringBuilder;
import w46.b;
import java.lang.Throwable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.io.File;
import qkd.b;
import com.kwai.feature.post.api.thirdparty.ThirdPartyShareUtils$ShareMediaType;
import ekd.j0;
import java.util.List;
import com.google.common.collect.Lists;
import android.os.Parcelable;
import android.content.ContentResolver;
import android.content.Context;
import com.kuaishou.gifshow.files.a;
import com.kwai.feature.post.api.thirdparty.a;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$Profile;
import fg6.a;
import com.google.gson.Gson;
import java.util.Collection;
import ekd.q;
import wh5.c;
import e17.i;
import p46.a;
import r16.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.f0;
import p46.d;
import p46.e;
import erd.g;
import crd.b;
import com.kwai.feature.post.api.thirdparty.ThirdPartyShareUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$ShareFromOtherAppDetailPackage;
import q2b.h$b;
import k2b.u1;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import nf6.e;

public class e	// class@001458
{
    public d a;
    public ThirdPartyAuthConfig$Profile b;
    public WeakReference c;
    public String d;
    public a e;

    public void e(Intent p0,GifshowActivity p1){
       int b;
       e ta;
       Uri data;
       Object[] objArray1;
       String str6;
       d uod = d.class;
       super();
       this.c = new WeakReference(p1);
       this.d = UUID.randomUUID().toString();
       this.a = new d();
       Object[] obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       String str = "targetPage";
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.getData() != null && !TextUtils.x(w0.a(p0.getData(), str))){
          b = true;
       }else {
          b = false;
       }
       String str1 = "ThirdPartyShareResolved";
       String str2 = "from";
       String str3 = "tag";
       if (b) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, uod, "6")) {
             obj = new Object[0];
             p3.D().w(str1, "resolveMediaShareIntentFromShareSdk", obj);
             if (ta.b(p0, ta)) {
                data = p0.getData();
                if (data == null) {
                   ta.d();
                }else {
                   ta.c = w0.a(data, str2);
                   ta.e = true;
                   ta.i = data.getBooleanQueryParameter("forceTarget", 0);
                   ta.l = w0.a(data, "coverFile");
                   ta.k = w0.a(data, "extraInfo");
                   ta.f = w0.a(data, str3);
                   ta.h = Integer.valueOf(w0.a(data, str)).intValue();
                   ta.m = w0.a(data, "sessionId");
                   p3 op3 = p3.D();
                   str = "resolveMediaShareIntentFromShareSdk mShareAppPackage="+ta.c+" ";
                   Object[] objArray = new Object[0];
                   try{
                      op3.t(str1, str, objArray);
                      ta.n = Integer.parseInt(w0.a(data, "sdkVersion"));
                   }catch(java.lang.NumberFormatException e0){
                      objArray = new Object[0];
                      p3.D().u("ThirdPartyShareResolvedData", new Throwable("new share sdk send wrong sdk version"), objArray);
                   }
                   ta.c(p0.getData());
                   String str4 = w0.a(e0, "multiMediaPaths");
                   if (!TextUtils.isEmpty(str4)) {
                      ArrayList uArrayList = new ArrayList();
                      String[] stringArray = str4.split(",");
                      b = stringArray.length;
                      int i = 0;
                      while (true) {
                         if (i < b) {
                            File uFile = new File(Uri.decode(stringArray[i]));
                            if (b.S(uFile)) {
                               uArrayList.add(uFile);
                               i = i + 1;
                            }else {
                               objArray1 = new Object[0];
                               p3.D().t(str1, "resolveMediaShareIntentFromShareSdk file invalid", objArray1);
                               ta.d();
                            }
                         }else {
                            ta.j = uArrayList;
                            if (uArrayList.size() == 1) {
                               ta.a = ThirdPartyShareUtils$ShareMediaType.fromMediaFileName(uArrayList.get(0).getAbsolutePath());
                            }else {
                               ta.a = ThirdPartyShareUtils$ShareMediaType.Video;
                            }
                         }
                      }
                   }
                }
             }
          }
       }else {
          e ta1 = this.a;
          Objects.requireNonNull(ta1);
          if (!PatchProxy.applyVoidTwoRefs(p1, p0, ta1, uod, "5")) {
             ta1.f = j0.f(p0, str3);
             String str5 = j0.f(p0, "m2uExtraInfo");
             ta1.d = str5;
             ta1.k = str5;
             if (p0.getData() == null || p0.getData().getPathSegments() == null) {
                Object[] objArray2 = new Object[0];
                p3.D().w(str1, "resolveMediaShareIntent share by intent", objArray2);
                data = p0.getParcelableExtra("android.intent.extra.STREAM");
                try{
                   str6 = a.d(p1.getContentResolver(), data);
                }catch(java.lang.Exception e0){
                   str6 = null;
                }
                Object[] objArray3 = new Object[0];
                p3.D().w(str1, "resolveMediaShareIntent\(\) filePath="+str6, objArray3);
                if (!TextUtils.isEmpty(str6)) {
                   File[] uFileArray = new File[true];
                   uFileArray[0] = new File(Uri.decode(str6));
                   ta1.j = Lists.e(uFileArray);
                }
                if (("android.intent.action.SEND").equals(p0.getAction())) {
                   ta1.a = ThirdPartyShareUtils$ShareMediaType.fromMediaTypeText(p0.getType());
                }
                ta1.b = false;
                str6 = "shareFromOtherApp";
                ta1.c = (j0.g(p0, str6))? j0.f(p0, str6): j0.f(p0, str2);
                ta1.e = j0.a(p0, "goHomeAfterPost", true) ^ true;
             }else {
                objArray1 = new Object[0];
                p3.D().w(str1, "resolveMediaShareIntent share by scheme", objArray1);
                if (ta1.b(p0, ta1)) {
                   str6 = w0.a(p0.getData(), "mediaPath");
                   File[] uFileArray1 = new File[true];
                   uFileArray1[0] = new File(Uri.decode(str6));
                   ta1.j = Lists.e(uFileArray1);
                   ta1.c = w0.a(p0.getData(), str2);
                   ta1.a = ThirdPartyShareUtils$ShareMediaType.fromMediaFileName(str6);
                   ta1.b = true;
                   ta1.e = true;
                   ta1.c(p0.getData());
                }
             }
          }
       }
       d c = this.a.c;
       ta = PatchProxy.applyOneRefs(c, null, a.class, "1");
       if (ta != PatchProxyResult.class) {
       }else {
          ta = a.a.h(a.c(c), ThirdPartyAuthConfig$Profile.class);
       }
       this.b = ta;
       return;
    }
    public GifshowActivity a(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.get();
    }
    public d b(){
       return this.a;
    }
    public String c(){
       return this.d;
    }
    public ThirdPartyAuthConfig$Profile d(){
       return this.b;
    }
    public boolean e(Intent p0){
       LoadPolicy loadPolicy;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj == null) {
          Object[] objArray = new Object[0];
          p3.D().t("ThirdPartyShareRouterWrapper", "isValidShareVideoOrPhotoIntent mShareResolvedData is null", objArray);
          return 0;
       }else if(obj.a != ThirdPartyShareUtils$ShareMediaType.Unknown && !q.f(obj.j)){
          loadPolicy = 1;
       }else {
          loadPolicy = null;
       }
       if (loadPolicy) {
          if (!c.g()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
             this.g(1004);
             return true;
          }else {
             e te = this.e;
             if (te != null) {
                te.a();
             }else {
                y6.s(d.class, LoadPolicy.DIALOG).g(this.a().E2(ActivityEvent.DESTROY)).R(new d(this), new e(this));
             }
             return true;
          }
       }else if(p0.getData() != null){
          Uri data = p0.getData();
          Object obj1 = PatchProxy.applyOneRefs(data, null, ThirdPartyShareUtils.class, "1");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): ThirdPartyShareUtils.a.matcher(data.toString()).find();
          if (b) {
             b = 1;
          label_00ac :
             if (b) {
                this.g(1001);
                return true;
             }else {
                return 0;
             }
          }
       }
       b = 0;
       goto label_00ac ;
    }
    public void f(String p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "6")) {
          return;
       }
       ClientTaskDetail$ShareFromOtherAppDetailPackage shareFromOth = new ClientTaskDetail$ShareFromOtherAppDetailPackage();
       if (TextUtils.isEmpty(p0)) {
          p0 = "";
       }
       shareFromOth.sourceApp = p0;
       h$b uob = h$b.d(p1, 47);
       uob.r(u1.g("share_app_session_id"));
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.shareFromOtherAppDetailPackage = shareFromOth;
       uob.s(taskDetailPa);
       u1.r0(uob);
       return;
    }
    public void g(int p0){
       GifshowActivity gifshowActiv;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "4")) {
          return;
       }
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "5")) {
          if (TextUtils.x(this.a.c) || this.a.h == -1) {
             Object[] objArray = new Object[0];
             p3.D().t("ThirdPartyShareRouterWrapper", "onShareSdkFailCall app package is null or old version", objArray);
          }else {
             Intent intent = new Intent();
             intent.setClassName(this.a.c, this.a.c+".kwai.KwaiShareHandlerActivity");
             intent.putExtra("errorCode", p0);
             intent.putExtra("errorMessage", "share failed");
             intent.putExtra("sessionId", this.a.m);
             this.f(this.a.c, 8);
             e.b(intent);
             gifshowActiv = this.c.get();
             if (gifshowActiv != null) {
                gifshowActiv.startActivity(intent);
             }
          }
       }
       gifshowActiv = this.c.get();
       if (gifshowActiv != null) {
          gifshowActiv.finish();
       }
       return;
    }
}
