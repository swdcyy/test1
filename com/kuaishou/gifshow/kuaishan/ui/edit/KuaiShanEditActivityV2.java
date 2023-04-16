package com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$a;
import nsd.u;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$b;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import u80.d;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import u80.e;
import q87.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.content.Intent;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import n90.k;
import kotlin.jvm.internal.a;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import lq.i;
import java.io.Serializable;
import h90.d;
import java.util.Objects;
import org.json.JSONObject;
import lq.e;
import java.lang.StringBuilder;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import zsd.u;
import kotlin.text.StringsKt__StringsKt;
import com.kuaishou.android.post.topic.TagSourceUtils;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.ArrayList;
import n3d.a;
import com.kuaishou.gifshow.kuaishan.ui.album.KSPostAlbumProcessActivity;
import e17.i;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$d;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$e;
import java.lang.Runnable;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Integer;
import android.os.Bundle;
import lnc.r5;
import x80.g;
import g26.d;
import o90.b;
import android.net.Uri;
import android.text.TextUtils;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$b;
import lnc.c7;
import ekd.x0;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import t36.f;
import o90.g;
import ekd.k1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.HashSet;
import java.util.List;
import brd.t;
import y80.b;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$y;
import erd.o;
import t45.d;
import brd.z;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$z;
import erd.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$b0;
import erd.g;
import crd.b;
import crd.a;
import o90.h;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.DialogFragment;
import o90.i;
import android.view.View$OnClickListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import n90.g;

public class KuaiShanEditActivityV2 extends BasePostActivity	// class@001abb
{
    public boolean O;
    public boolean P;
    public ProgressFragment Q;
    public String R;
    public g S;
    public g T;
    public final KSDataManager U;
    public final KuaiShanEditActivityV2$b V;
    public static long W;
    public static final KuaiShanEditActivityV2$a X;

    static {
       KuaiShanEditActivityV2.X = new KuaiShanEditActivityV2$a(null);
    }
    public void KuaiShanEditActivityV2(){
       super();
       this.R = "";
       this.U = KSDataManager.q.a();
       this.V = new KuaiShanEditActivityV2$b(this);
    }
    public static final boolean I3(KSLaunchParams p0,d p1,Activity p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, KuaiShanEditActivityV2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KuaiShanEditActivityV2.X.a(p0, p1, p2);
    }
    public String B3(){
       return "KUAISHAN";
    }
    public final void G3(){
       if (PatchProxy.applyVoid(null, this, KuaiShanEditActivityV2.class, "7")) {
          return;
       }
       this.setResult(0);
       this.finish();
       return;
    }
    public final void H3(){
       if (PatchProxy.applyVoid(null, this, KuaiShanEditActivityV2.class, "15")) {
          return;
       }
       KuaiShanEditActivityV2 tQ = this.Q;
       if (tQ != null && tQ.isAdded()) {
          Object[] objArray = new Object[0];
          e.D().s("KuaiShanEditActivityV2", "dismissProgressFragment\(\)", objArray);
          tQ.dismiss();
       }
       this.Q = null;
       return;
    }
    public final void J3(Intent p0,o1 p1,boolean p2){
       Intent intent;
       String str1;
       int i;
       String this;
       String str2;
       Object[] objArray;
       k a;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       KuaiShanEditActivityV2 kuaiShanEdit = KuaiShanEditActivityV2.class;
       if (PatchProxy.isSupport(kuaiShanEdit) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, KuaiShanEditActivityV2.class, "13")) {
          return;
       }
       k ok = k.class;
       Object[] obj3 = null;
       String str = "intent";
       if (!PatchProxy.applyVoidTwoRefs(obj1, obj2, obj3, ok, "2")) {
          a.p(obj1, str);
          a.p(obj2, "ksProject");
          str2 = "photo_task_id";
          this = j0.f(obj1, str2);
          if (TextUtils.x(this)) {
             this = u1.f();
             obj1.putExtra(str2, this);
          }
          a.m(this);
          m1.w0().f = this;
          if (i.h()) {
             i oi = i.m().Q("key_nearby_community_params", j0.e(obj1, "key_nearby_community_params")).Q("conversionTaskList", j0.f(obj1, "conversionTaskList"));
             a.o(oi, "PostSession.current\(\)\n  ¡­ts.CONVERSION_DATA_LIST\)\)");
             oi.b0(j0.a(obj1, "INTENT_GO_HOME_ON_POST_COMPLETE", true));
          }
          d uod = p1.C0();
          a = k.a;
          Objects.requireNonNull(a);
          JSONObject jSONObject = PatchProxy.apply(obj3, a, ok, "4");
          if (jSONObject != PatchProxyResult.class) {
          }else if(!i.h()){
             jSONObject = new JSONObject();
          }else {
             str1 = i.m().k().c();
             e a1 = e.D();
             String str3 = "getActivityObj: activity = "+str1;
             objArray = new Object[0];
             String str4 = "KuaiShanAlbumHelper";
             try{
                a1.w(str4, str3, objArray);
                if (!TextUtils.x(str1)) {
                   a.m(str1);
                   jSONObject = new JSONObject(str1);
                }else {
                   jSONObject = new JSONObject();
                }
             }catch(org.json.JSONException e0){
                Object[] objArray1 = new Object[0];
                e.D().u(str4, e0, objArray1);
                jSONObject = new JSONObject();
             }
          }
       }
       if (!PatchProxy.applyVoid(obj3, obj, kuaiShanEdit, "10")) {
          m1 om1 = m1.w0();
          a.o(om1, "KuaiShanManager.getInstance\(\)");
          o1 oo1 = om1.v0();
          if (oo1 != null) {
             KSTemplateDetailInfo kSTemplateDe = oo1.k0();
             if (kSTemplateDe != null) {
                KSTemplateDetailInfo mTopicTag = kSTemplateDe.mTopicTag;
                if (mTopicTag != null) {
                   intent = this.getIntent();
                   a.o(intent, str);
                   str1 = i.m().k().n(intent);
                   i = 2;
                   this = "#";
                   if (!TextUtils.x(str1) && !u.q2(str1, this, 0, i, obj3)) {
                      str1 = this+str1;
                   }
                   str2 = this+mTopicTag;
                   objArray = new Object[0];
                   e.D().w("KuaiShanEditActivityV2", "tempTag: "+str2+" , initTag: "+str1, objArray);
                   kSTemplateDe = (StringsKt__StringsKt.O2(str2, str1, 0, i, obj3))? mTopicTag: mTopicTag+" "+str1;
                   this.getIntent().putExtra("tag", kSTemplateDe);
                   i.m().k().x(kSTemplateDe);
                   TagSourceUtils.c(TagSourceUtils.b, mTopicTag, "KUAISHAN", null, false, 8, null);
                }
             }
          }
       }
       if (!KSPostAlbumProcessActivity.C3(this, p1, null, obj1.getByteArrayExtra("current_video_context"), false, false, p2, j0.f(obj1, "INTENT_KEY_ALBUM_TASK_IMPL"), new KuaiShanEditActivityV2$c(obj))) {
          obj3 = new Object[0];
          e.D().t("KuaiShanEditActivityV2", "onCreate: launch KSPostAlbumProcessActivity too frequently", obj3);
          obj.setResult(0);
          this.finish();
       }
       return;
    }
    public final void K3(KSTemplateDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaiShanEditActivityV2.class, "8")) {
          return;
       }
       m1 om1 = m1.w0();
       a.o(om1, "KuaiShanManager.getInstance\(\)");
       o1 oo1 = om1.v0();
       if (oo1 == null) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          this.G3();
          return;
       }else {
          KuaiShanEditActivityV2 tQ = this.Q;
          if (tQ != null) {
             tQ.Nh(100);
          }
          this.H3();
          Intent intent = this.getIntent();
          if (e.q(p0) && e.z()) {
             e.C(this, new KuaiShanEditActivityV2$d(this, intent, oo1), new KuaiShanEditActivityV2$e(this), p0.mPrivacyPolicyTitle, p0.mPrivacyPolicyUrl);
             return;
          }else {
             a.o(intent, "intent");
             this.J3(intent, oo1, false);
             return;
          }
       }
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KuaiShanEditActivityV2.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KuaiShanEditActivityV2.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KuaiShanEditActivityV2.class, "5")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 != 100 && !this.isFinishing()) {
          this.finish();
       }
       return;
    }
    public void onCreate(Bundle p0){
       Intent intent;
       boolean b;
       Object[] objArray;
       Object[] objArray3;
       boolean b1;
       Uri data;
       Boolean uBoolean;
       KuaiShanEditActivityV2 kuaiShanEdit = KuaiShanEditActivityV2.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, kuaiShanEdit, str)) {
          return;
       }
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }
       String str1 = j0.f(this.getIntent(), "INTENT_KEY_ALBUM_TASK_IMPL");
       if (str1 == null) {
          str1 = "";
       }
       a.o(str1, "IntentUtils.getStringExt\x20\x02EY_ALBUM_TASK_IMPL\) ?: \"\"\x00");
       this.T = r5.b().a(str1, g.class);
       String str2 = "intent";
       if (i.h()) {
          intent = this.getIntent();
          a.o(intent, str2);
          this.R = i.m().k().n(intent);
       }
       if (!d.b()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101bca);
          this.finish();
          return;
       }else {
          Intent intent1 = this.getIntent();
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          b uob = b.class;
          Object[] obj = PatchProxy.applyOneRefs(intent1, null, uob, "2");
          String str3 = "intent_ks_launch_param";
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             KSLaunchParams$b obj1 = PatchProxy.applyOneRefs(intent1, null, uob, str);
             String str5 = "uri";
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(intent1 != null){
                data = intent1.getData();
                if (data != null) {
                   a.o(data, str5);
                   b1 = (TextUtils.equals(data.getAuthority(), "ksalbum") || TextUtils.equals(data.getAuthority(), "ksalbumkrn"))? true: false;
                   uBoolean = Boolean.valueOf(b1);
                }else {
                   uBoolean = null;
                }
                if (uBoolean != null) {
                   b1 = uBoolean.booleanValue();
                }
             }
             b1 = false;
             if (b1 && intent1 != null) {
                data = intent1.getData();
                if (data != null) {
                   objArray3 = new Object[0];
                   e.D().w("KSAlbumSchemeParser", "parser\(\) ksalbum scheme: "+data, objArray3);
                   obj1 = new KSLaunchParams$b();
                   a.o(data, str5);
                   c7.a.c(data, intent1);
                   str5 = x0.a(data, "flashTemplateId");
                   if (str5 != null) {
                      obj1.h(str5);
                   }
                   str5 = x0.a(data, "flashGroupId");
                   if (str5 != null) {
                      obj1.c(str5);
                   }
                   String str6 = x0.a(data, "templateSrc");
                   if (str6 != null) {
                      obj1.i(str6);
                   }
                   str6 = intent1.getStringExtra("photo_task_id");
                   if (str6 != null && !TextUtils.isEmpty(str6)) {
                      obj1.g(str6);
                   }
                   intent1.putExtra("INTENT_GO_HOME_ON_POST_COMPLETE", (intent1.getBooleanExtra("returnToOriginalPage", 0) ^ true));
                   SerializableHook.putExtra(intent1, str3, obj1.a());
                   b = true;
                }
             }
             b = false;
          }
          if (b || this.getIntent().hasExtra(str3)) {
             if (!PatchProxy.applyVoid(null, this, kuaiShanEdit, "11")) {
                this.setContentView(R.layout.arg_RES_7f0d071a);
                KSLaunchParams kSLaunchPara = j0.e(this.getIntent(), str3);
                obj = new Object[0];
                e.D().w("KuaiShanEditActivityV2", "prepareLaunchAlbumFromPlc\(\) KSAlbumSchemeParser parse ksLaunchParams: "+kSLaunchPara, obj);
                this.U.d(this.V);
                str2 = (kSLaunchPara != null)? kSLaunchPara.getTemplateId(): null;
                if (str2 == null) {
                   objArray = new Object[0];
                   e.D().A("KuaiShanEditActivityV2", "prepareLaunchAlbumFromPlc\(\) KSAlbumSchemeParser scheme no templateId", objArray);
                }else if(a.g(kSLaunchPara.getTemplateId(), "0")){
                   k1.r(new g(this), 0);
                }else if(a.g(str, kSLaunchPara.getTemplateSrc())){
                   str2 = kSLaunchPara.getTemplateId();
                   a.o(str2, "ksLaunchParams.templateId");
                   this.U.K(str2);
                }else {
                   KuaiShanEditActivityV2 tU = this.U;
                   String[] stringArray = new String[true];
                   stringArray[0] = kSLaunchPara.getTemplateId();
                   ArrayList uArrayList = CollectionsKt__CollectionsKt.r(stringArray);
                   Objects.requireNonNull(tU);
                   if (!PatchProxy.applyVoidOneRefs(uArrayList, tU, KSDataManager.class, "10")) {
                      a.p(uArrayList, "templateIds");
                      String str4 = "Fetch template ids "+uArrayList;
                      str3 = "KSDataManager";
                      if (tU.i.contains(str4)) {
                         Object[] objArray2 = new Object[0];
                         e.D().w(str3, "Request is in process", objArray2);
                      }else {
                         objArray3 = new Object[0];
                         e.D().w(str3, "fetchTemplatesByIds templateIds: "+uArrayList, objArray3);
                         tU.i.add(str4);
                         tU.g.c(tU.k.g(uArrayList).map(KSDataManager$y.b).observeOn(d.a).doFinally(new KSDataManager$z(tU, str4)).subscribe(new KSDataManager$a0(tU), new KSDataManager$b0(tU, uArrayList)));
                      }
                   }
                }
                if (!PatchProxy.applyVoid(null, this, kuaiShanEdit, "14")) {
                   if (this.Q != null) {
                      Object[] objArray1 = new Object[0];
                      e.D().A("KuaiShanEditActivityV2", "showProgressFragment: mProgressFragment is not null", objArray1);
                      this.H3();
                   }
                   ProgressFragment progressFrag = new ProgressFragment();
                   this.Q = progressFrag;
                   a.m(progressFrag);
                   progressFrag.Fh(0, 100, true);
                   kuaiShanEdit = this.Q;
                   a.m(kuaiShanEdit);
                   kuaiShanEdit.oh(new h(this));
                   kuaiShanEdit = this.Q;
                   a.m(kuaiShanEdit);
                   kuaiShanEdit.setCancelable(0);
                   kuaiShanEdit = this.Q;
                   a.m(kuaiShanEdit);
                   kuaiShanEdit.zh(0);
                   kuaiShanEdit = this.Q;
                   a.m(kuaiShanEdit);
                   kuaiShanEdit.xh(new i(this));
                   kuaiShanEdit = this.Q;
                   a.m(kuaiShanEdit);
                   kuaiShanEdit.Ih(R.string.arg_RES_7f100b7e);
                   kuaiShanEdit = this.Q;
                   a.m(kuaiShanEdit);
                   kuaiShanEdit.vh(R.string.cancel);
                   kuaiShanEdit = this.Q;
                   a.m(kuaiShanEdit);
                   kuaiShanEdit.show(this.getSupportFragmentManager(), "KuaiShanEditActivityV2");
                }
                i.m().Q("camera_page_source", Integer.valueOf(kSLaunchPara.getPageSource()));
                this.overridePendingTransition(R.anim.arg_RES_7f010049, 0x7f010049);
             }
             return;
          }else {
             m1 om1 = m1.w0();
             a.o(om1, "KuaiShanManager.getInstance\(\)");
             o1 oo1 = om1.v0();
             if (oo1 == null) {
                objArray = new Object[0];
                e.D().t("KuaiShanEditActivityV2", "onCreate: project is null ", objArray);
                this.setResult(0);
                this.finish();
                return;
             }else {
                Intent intent2 = this.getIntent();
                a.o(intent2, str2);
                this.J3(intent2, oo1, 0);
                return;
             }
          }
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KuaiShanEditActivityV2.class, "4")) {
          return;
       }
       this.getIntent().putExtra("tag", this.R);
       if (i.h()) {
          i.m().k().x(this.R);
       }
       super.onDestroy();
       KuaiShanEditActivityV2 tS = this.S;
       if (tS != null) {
          tS.a();
          this.S = null;
       }
       this.U.c(this.V);
       this.H3();
       m1.w0().a();
       m1 om1 = m1.w0();
       a.o(om1, "KuaiShanManager.getInstance\(\)");
       o1 oo1 = om1.v0();
       if (oo1 != null) {
          oo1.close();
       }
       om1 = m1.w0();
       a.o(om1, "KuaiShanManager.getInstance\(\)");
       om1.y0(null);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, KuaiShanEditActivityV2.class, "3")) {
          return;
       }
       super.onPause();
       this.O = false;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, KuaiShanEditActivityV2.class, "2")) {
          return;
       }
       super.onResume();
       this.O = true;
       return;
    }
}
