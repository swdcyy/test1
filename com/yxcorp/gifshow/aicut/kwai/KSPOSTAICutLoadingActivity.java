package com.yxcorp.gifshow.aicut.kwai.KSPOSTAICutLoadingActivity;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.aicut.kwai.KSPOSTAICutLoadingActivity$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.logic.fetchframe.FetchFrameManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.util.h0;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Integer;
import com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingFragment;
import r69.g;
import android.os.Bundle;
import android.view.Window;
import android.graphics.drawable.Drawable;
import h69.g;
import q87.c;
import ekd.j0;
import s69.i;
import com.kuaishou.edit.draft.Workspace$From;
import l69.n;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import l69.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import h69.a;
import i69.f;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LocalIntelligentAlbumPackage;
import com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingFragment$a;
import s66.a;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import l69.g;
import q2b.h$b;
import k2b.e0;
import k2b.u1;

public final class KSPOSTAICutLoadingActivity extends BasePostActivity	// class@00194f
{
    public String O;
    public String P;
    public String Q;
    public AICutLoadingFragment R;
    public String S;
    public boolean T;
    public static boolean U;
    public static final KSPOSTAICutLoadingActivity$a V;

    static {
       KSPOSTAICutLoadingActivity.V = new KSPOSTAICutLoadingActivity$a(null);
    }
    public void KSPOSTAICutLoadingActivity(){
       super();
    }
    public int M(){
       return 4;
    }
    public void f3(){
       if (PatchProxy.applyVoid(null, this, KSPOSTAICutLoadingActivity.class, "5")) {
          return;
       }
       if (TextUtils.x(this.P)) {
          super.f3();
       }
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, KSPOSTAICutLoadingActivity.class, "1")) {
          return;
       }
       super.finish();
       FetchFrameManager.i().b();
       return;
    }
    public String getPageParams(){
       Object[] objArray = null;
       KSPOSTAICutLoadingActivity obj = PatchProxy.apply(objArray, this, KSPOSTAICutLoadingActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.S;
       if (obj != null) {
          return String.valueOf(obj);
       }
       String str = "task_id=";
       KSPOSTAICutLoadingActivity tO = this.O;
       if (tO == null) {
          a.S("mTaskId");
       }
       this.S = str+tO;
       Intent intent = this.getIntent();
       if (intent != null) {
          objArray = SerializableHook.getSerializableExtra(intent, "intent_key_data_list");
       }
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.collections.List<com.yxcorp.gifshow.models.QMedia>");
       str = h0.e(objArray);
       if (!TextUtils.x(str)) {
          this.S = a.C(this.S, '&'+str);
       }
       if (!TextUtils.x(this.P)) {
          this.S = a.C(this.S, "&app_id="+this.P);
       }
       return String.valueOf(this.S);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KSPOSTAICutLoadingActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "PRODUCE_AI_CUT_LOADING";
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KSPOSTAICutLoadingActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KSPOSTAICutLoadingActivity.class, "8")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 256 && !p1) {
          this.finish();
       }
       return;
    }
    public void onBackPressed(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSPOSTAICutLoadingActivity.class, "7")) {
          return;
       }
       KSPOSTAICutLoadingActivity tR = this.R;
       if (tR != null && !PatchProxy.applyVoid(objArray, tR, AICutLoadingFragment.class, "7")) {
          AICutLoadingFragment c = tR.c;
          if (c == null) {
             a.S("mViewModel");
          }
          c.p0();
       }
       return;
    }
    public void onCreate(Bundle p0){
       Intent obj;
       Object[] objArray1;
       String str9;
       e obj1;
       Bundle uBundle;
       AICutLoadingFragment uAICutLoadin;
       Intent intent;
       String str13;
       o a;
       String str = this;
       KSPOSTAICutLoadingActivity kSPOSTAICutL = KSPOSTAICutLoadingActivity.class;
       String str1 = "2";
       if (PatchProxy.applyVoidOneRefs(p0, str, kSPOSTAICutL, str1)) {
          return;
       }
       str.setTheme(R.style.arg_RES_7f110136);
       this.getWindow().addFlags(128);
       Drawable uDrawable = null;
       this.getWindow().setBackgroundDrawable(uDrawable);
       String str2 = "null cannot be cast to non-null type kotlin.collections.List<com.yxcorp.gifshow.models.QMedia>";
       String str3 = "intent";
       String str4 = "AICutLoadingActivity";
       int i = 0;
       if (!PatchProxy.applyVoid(uDrawable, str, kSPOSTAICutL, "4")) {
          objArray1 = new Object[i];
          g.D().w(str4, "initProject\(\) called", objArray1);
          intent = this.getIntent();
          a.o(intent, str3);
          Bundle extras1 = intent.getExtras();
          Drawable uDrawable1 = (extras1 != null)? extras1.get("intent_key_data_list"): uDrawable;
          Objects.requireNonNull(uDrawable1, str2);
          str9 = j0.f(this.getIntent(), "photo_task_id");
          if (TextUtils.x(str9)) {
             str13 = i.a.b();
          }else {
             a.m(str9);
             str13 = str9;
          }
          str.O = str13;
          Workspace$From uFrom = Workspace$From.forNumber(j0.b(this.getIntent(), "camera_page_from", i));
          n f = n.f;
          a.o(uFrom, "pageFrom");
          Objects.requireNonNull(f);
          String str14 = "pageFrom";
          Workspace$From uFrom1 = uFrom;
          Workspace$From uFrom2 = uFrom;
          if (!PatchProxy.applyVoidThreeRefs(uDrawable1, str9, uFrom1, f, n.class, "1")) {
             a.p(uDrawable1, "dataList");
             a.p(uFrom2, str14);
             Object[] objArray5 = new Object[0];
             g.D().w("KwaiAICutModule", "initAICutProject: ", objArray5);
             a = n.a;
             VideoTemplateProject videoTemplat = (a != null)? a.b(): 0;
             if (!videoTemplat instanceof AICutAnnualMemoryProject) {
                if (n.a != null) {
                   n.b.add(new WeakReference(n.a));
                }
                videoTemplat = new VideoTemplateProject(uDrawable1);
                a.b.b(videoTemplat);
                if (str9 == null) {
                   str9 = i.a.b();
                }
                o oo = new o(videoTemplat, str9, null, null, uFrom2, null, true, 44, null);
                n.a = uDrawable1;
             }
          }
       }
    label_010a :
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object[] objArray = null;
          if (PatchProxy.applyVoid(objArray, str, kSPOSTAICutL, "3")) {
             obj = str;
          }else {
             objArray1 = new Object[0];
             g.D().w(str4, "init\(\) called", objArray1);
             obj = this.getIntent();
             a.o(obj, str3);
             Bundle extras = obj.getExtras();
             Object[] objArray2 = (extras != null)? extras.get("intent_key_data_list"): objArray;
             Objects.requireNonNull(objArray2, str2);
             str2 = "intent_key_extra";
             String str5 = j0.f(this.getIntent(), str2);
             str.P = j0.f(this.getIntent(), "intent_key_share_app");
             str.Q = j0.f(this.getIntent(), "intent_key_share_app_id");
             str3 = j0.f(this.getIntent(), "tag");
             String str6 = j0.f(this.getIntent(), "pre_select_theme_id");
             String str7 = "pre_select_theme_id";
             int i1 = j0.b(this.getIntent(), "pre_select_template_type", 0);
             String str8 = "pre_select_template_type";
             str9 = "pre_select_music_id";
             String str10 = str1;
             String str11 = j0.f(this.getIntent(), "pre_select_music_id");
             a.d("AICutStyleId", str6);
             KSPOSTAICutLoadingActivity p = str.P;
             String str12 = "pre_select_music_type";
             str1 = "medias";
             int i2 = j0.b(this.getIntent(), "pre_select_music_type", 0);
             int i3 = 5;
             if (p != null) {
                AICutLoadingFragment$a j = AICutLoadingFragment.j;
                a.m(p);
                KSPOSTAICutLoadingActivity q = str.Q;
                Objects.requireNonNull(j);
                if (PatchProxy.isSupport(AICutLoadingFragment$a.class)) {
                   Object[] objArray3 = new Object[i3];
                   objArray3[0] = p;
                   objArray3[1] = q;
                   objArray3[2] = objArray2;
                   objArray3[3] = str3;
                   objArray3[4] = str5;
                   obj1 = PatchProxy.apply(objArray3, j, AICutLoadingFragment$a.class, "1");
                   if (obj1 != patchProxyRe) {
                   }
                }
                a.p(p, "appPackageName");
                a.p(objArray2, str1);
                uBundle = new Bundle();
                SerializableHook.putSerializable(uBundle, "intent_key_data_list", objArray2);
                uBundle.putString("intent_key_share_app", p);
                uBundle.putString("intent_key_share_app_id", q);
                if (!TextUtils.isEmpty(str3)) {
                   uBundle.putString("tag", str3);
                }
                if (!TextUtils.isEmpty(str5)) {
                   uBundle.putString(str2, str5);
                }
                uAICutLoadin = new AICutLoadingFragment();
                uAICutLoadin.setArguments(uBundle);
             label_0282 :
                obj1 = uAICutLoadin;
             }else {
                AICutLoadingFragment$a j1 = AICutLoadingFragment.j;
                Objects.requireNonNull(j1);
                if (PatchProxy.isSupport(AICutLoadingFragment$a.class)) {
                   Object[] objArray4 = new Object[i3];
                   objArray4[0] = objArray2;
                   objArray4[1] = str6;
                   objArray4[2] = Integer.valueOf(i1);
                   objArray4[3] = str11;
                   objArray4[4] = Integer.valueOf(i2);
                   obj1 = PatchProxy.apply(objArray4, j1, AICutLoadingFragment$a.class, str10);
                   if (obj1 != patchProxyRe) {
                   }
                }
                a.p(objArray2, str1);
                uBundle = new Bundle();
                SerializableHook.putSerializable(uBundle, "intent_key_data_list", objArray2);
                if (!TextUtils.x(str6)) {
                   uBundle.putString(str7, str6);
                   uBundle.putInt(str8, i1);
                }
                if (!TextUtils.x(str11)) {
                   uBundle.putString(str9, str11);
                }
                uBundle.putInt(str12, i2);
                uAICutLoadin = new AICutLoadingFragment();
                uAICutLoadin.setArguments(uBundle);
                goto label_0282 ;
             }
             kSPOSTAICutL = this;
             kSPOSTAICutL.R = obj1;
             obj1 = this.getSupportFragmentManager().beginTransaction();
             KSPOSTAICutLoadingActivity r = kSPOSTAICutL.R;
             a.m(r);
             obj1.v(0x1020002, r);
             obj1.m();
          }
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KSPOSTAICutLoadingActivity.class, "11")) {
          return;
       }
       n.f.g();
       super.onDestroy();
       return;
    }
    public void onResume(){
       g a;
       if (PatchProxy.applyVoid(null, this, KSPOSTAICutLoadingActivity.class, "6")) {
          return;
       }
       super.onResume();
       if (this.T == null && !TextUtils.x(this.P)) {
          KSPOSTAICutLoadingActivity tO = this.O;
          String str = "mTaskId";
          if (tO == null) {
             a.S(str);
          }
          if (!TextUtils.x(tO)) {
             boolean b = true;
             this.T = b;
             a = g.a;
             KSPOSTAICutLoadingActivity tO1 = this.O;
             if (tO1 == null) {
                a.S(str);
             }
             KSPOSTAICutLoadingActivity tP = this.P;
             a.m(tP);
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidThreeRefs(this, tO1, tP, a, g.class, "6")) {
                a.p(this, "page");
                a.p(tO1, "taskId");
                a.p(tP, "appId");
                u1.p0("2428640", this, h$b.e(b, "THIRD_SHARE_EDIT"));
             }
          }
       }
    label_0066 :
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, KSPOSTAICutLoadingActivity.class, "10")) {
          return;
       }
       super.onStop();
       Object[] objArray = new Object[0];
       g.D().w("AICutLoadingActivity", "onStop: ", objArray);
       KSPOSTAICutLoadingActivity.U = false;
       FetchFrameManager.i().b();
       return;
    }
    public boolean x3(){
       return true;
    }
}
