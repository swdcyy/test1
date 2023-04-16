package lg9.f;
import om6.r;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import q0c.o2;
import u0c.a;
import q0c.i2;
import h16.n;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qm6.b$a;
import android.os.Bundle;
import j8c.a;
import q87.c;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkConfigManager;
import si9.f;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.System;
import pi9.c;
import java.lang.Boolean;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Handler;
import pi9.b;
import java.lang.Runnable;
import android.view.View;
import qm6.b;
import android.text.TextUtils;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import java.lang.Number;
import oa0.a;
import android.content.SharedPreferences;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.camera.init.module.RecordInitModule;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import uf9.a;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.util.PermissionUtils;
import kuaishou.perf.page.impl.d;
import java.lang.StringBuilder;
import h80.h;
import h80.k;
import vc9.b;
import com.kuaishou.android.post.PostArguments;
import z36.d;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import qm6.c;
import g46.a;
import qvb.s;
import e3a.a;
import com.kwai.feature.post.api.util.g;
import tkd.b;
import tkd.d;
import f26.a;
import i46.b;
import vma.c;
import com.yxcorp.gifshow.camera.record.viewbinder.AbsCameraActivityViewBinder;
import c35.c;
import com.kuaishou.viewbinder.IViewBinder;
import qxc.c;
import lnc.a1;
import lnc.s6;
import xf6.l;
import lg9.e;
import com.yxcorp.gifshow.activity.BasePostActivity;
import c35.o;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam$Builder;
import fw8.o;
import com.kuaishou.viewbinder.BaseViewBinder;
import qxc.a;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import com.kuaishou.ax2c.PreloadParam;
import java.io.File;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import lnc.f6;
import nm6.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import com.yxcorp.gifshow.camerasdk.j;
import com.yxcorp.gifshow.entity.QPhoto;
import nm6.d;
import lg9.f$a;
import r8c.g;
import r8c.h;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin$SendMessagePageInfo;
import java.util.Collection;
import ekd.q;
import w46.b;
import java.util.List;
import com.yxcorp.gifshow.camera.record.whatsup.TieTieActivity;
import com.yxcorp.gifshow.camera.record.whatsup.WhatsUpActivity;
import com.kuaishou.edit.draft.Workspace$From;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;
import bn8.a;
import pi9.p;
import com.yxcorp.gifshow.camera.record.d;
import rm6.a;
import rm6.c;
import rm6.d;
import yfc.j;
import android.content.SharedPreferences$Editor;
import oe6.g;
import rq.a;
import fn6.a;
import java.util.Collections;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.yxcorp.gifshow.camera.record.photo.TakeLiveAvatarActivity;
import com.yxcorp.gifshow.camera.record.photo.TakePictureActivity;
import ekd.j0;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lg9.f$b;
import q0c.h2;
import org.json.JSONObject;
import org.json.JSONArray;
import java.lang.Throwable;
import vc9.c;
import com.yxcorp.gifshow.camera.record.mix.StoryMixRecordActivity;
import gh9.i;
import androidx.fragment.app.Fragment;
import nm6.c$a;
import nm6.c$b;
import pm6.m;
import java.security.InvalidParameterException;
import in6.d;
import lq.i;

public class f implements r	// class@002de6
{
    public c b;

    public void f(){
       super();
    }
    public BeautifyConfig Ar(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!o2.b()) {
          return objArray;
       }
       return new a(new i2()).f();
    }
    public boolean B8(Activity p0){
       return p0 instanceof CameraActivity;
    }
    public void Er(GifshowActivity p0,b$a p1,Bundle p2){
       Intent intent;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("hwcfg_discardCurrentPostSessionRecordPluginImpl", "DPBenchmarkConfigManager stop", objArray);
       DPBenchmarkConfigManager.getInstance().stop();
       f c = f.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(null, c, f.class, "2")) {
          f.a = true;
          f.b.clear();
       }
       c.a("stage_start_activity", System.currentTimeMillis());
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.TRUE, null, c.class, "1")) {
          Intent obj = PatchProxy.applyOneRefs(p0, null, uoc, "5");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else {
             obj = p0.getIntent();
             if (obj != null && obj.getData() != null) {
                i = TextUtils.n(w0.a(obj.getData(), "ks_from"), "camera");
             }
          }
          if (i) {
             p1.i(0x4000000);
             intent = c.a(p1, p2, true);
             c.d(intent);
             p0.startActivity(intent);
             p0.setResult(-1);
             p0.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01010f);
             p0.V2().postDelayed(new b(p0), 100);
          }else {
             intent = c.a(p1, p2, true);
             c.d(intent);
             p0.startActivity(intent);
             p0.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100d4);
          }
       }
       return;
    }
    public View FB(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof CameraActivity) {
          return p0.findViewById(0x7f0a063c);
       }
       return null;
    }
    public void J20(Activity p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "28")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("hwcfg_RecordPluginImpl", "startPostEntranceActivity", objArray);
       b n1 = p1.N1;
       if (n1 == null || TextUtils.equals(n1.getAuthority(), "post")) {
          this.Um(p0, p1);
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("hwcfg_RecordPluginImpl", "startPostEntranceActivity with router", objArray1);
          a.b(b.j(p0, n1.toString()), null);
       }
       return;
    }
    public long JO(){
       Object obj = PatchProxy.apply(null, this, f.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.a.getLong("last_work_publish_time", 0);
    }
    public a Md(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecordInitModule();
    }
    public Intent NM(b p0){
       Intent obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("hwcfg_RecordPluginImpl", "DPBenchmarkConfigManager stop", objArray);
       DPBenchmarkConfigManager.getInstance().stop();
       PageMonitor.INSTANCE.onInit(StandardCameraFragment.class);
       Objects.requireNonNull(a.s);
       a.r = System.currentTimeMillis();
       objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, CameraLogger.class, "36")) {
          String str = "CameraLogger";
          if (PermissionUtils.a(a.a().a(), "android.permission.CAMERA") && PermissionUtils.a(a.a().a(), "android.permission.RECORD_AUDIO")) {
             CameraLogger.a = System.currentTimeMillis();
             d.d("postCameraOpenMonitor").n();
             d.d("postCameraOpenMonitor").g("clickToCameraFragmentCreate");
             Object[] objArray1 = new Object[i];
             a.D().w(str, "logClickCameraBtnTime "+CameraLogger.a, objArray1);
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w(str, "logClickCameraBtnTime Camera Unable", objArray2);
          }
       }
       if (k.c() == null) {
          k.f(new b());
       }
       obj = new Intent(p0.c, CameraActivity.class);
       p0.getArgs().getPageMonitorSource().set("CLICK_OR_BRIDGE");
       c.a(obj, p0);
       if (p0.mIPageCallBack == null) {
          p0.mIPageCallBack = this.jX();
       }
       s.b().d(i, p0);
       obj.putExtra("launch_time", System.currentTimeMillis());
       Activity uActivity = a.b(p0.c);
       if (uActivity != null) {
          g.u(uActivity, obj);
       }
       d.a(0x3b0a11d7).BN(obj);
       d.a(-1339848103).sD();
       AbsCameraActivityViewBinder uAbsCameraAc = c.a(p0.h, AbsCameraActivityViewBinder.class, objArray);
       long l = a1.k();
       if (s6.G()) {
          int i1 = (a.a().c() && l.c("KEY_POST_CAMERA_STARTUP_OPT_DISABLE_AC_X2C", i))? 1: 0;
          if (!i1) {
             i = true;
          }
       }
       e uoe = new e(l, p0);
       if (!PatchProxy.isSupport(BasePostActivity.class) || !PatchProxy.applyVoidThreeRefs(uAbsCameraAc, Boolean.valueOf(i), uoe, null, BasePostActivity.class, "1")) {
          uAbsCameraAc.p();
          PreLoader.getInstance().preload(new PreloadParam$Builder(a.a().a()).addLayoutId(uAbsCameraAc.p()).setUseAx2c(i).setUseMutableContext(true).setInflateListener(new o(uAbsCameraAc.p(), uAbsCameraAc, uoe)).build());
       }
       return obj;
    }
    public void Oo(Context p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "13")) {
          return;
       }
       f6.c(p0, p1, null, -1);
       return;
    }
    public void PN(c p0){
       this.b = p0;
    }
    public BaseFragment Pj(){
       Object obj = PatchProxy.apply(null, this, f.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TakePictureFragment();
    }
    public Object Q40(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof CameraActivity) {
          return p0.k();
       }
       return null;
    }
    public void S00(GifshowActivity p0,b$a p1,QPhoto p2,d p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecordPluginImpl", "startCameraActivityWithPhoto", objArray);
       h.b(p0, p2, p3, new f$a(this, p1, p3));
       return;
    }
    public Intent S7(Activity p0,RecordPostPlugin$SendMessagePageInfo p1){
       Object[] objArray1;
       Intent intent1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$a obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "30");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "RecordPluginImpl";
       a.D().w(str, "buildSendMessagePageActivity", objArray);
       Intent intent = null;
       if (q.f(p1.mTabs)) {
          objArray1 = new Object[i];
          a.D().t(str, "tabs is empty", objArray1);
          return intent;
       }else {
          obj = new b$a(i);
          if (PatchProxy.applyOneRefs(p1, obj, b$a.class, "89") != patchProxyRe) {
          }else {
             obj.Z1 = p1;
          }
          obj.N(p1.mMessageTargetName);
          obj.p(p0.getApplicationContext());
          boolean b = true;
          obj.Y(b);
          if (!TextUtils.isEmpty(p1.mTaskId)) {
             obj.h0(p1.mTaskId);
          }
          if (p1.mTabs.size() == b) {
             str = p1.mTabs.get(i);
             Objects.requireNonNull(str);
             switch (str.hashCode()){
                 case 0xbde15dfc:
                   if (str.equals("SOCIAL_WHATS_UP_PICTURE")) {
                   }
                   break;
                 case 0x72f74d6b:
                   if (str.equals("IM_SEND_MESSAGE")) {
                      i = 1;
                   }
                   break;
                 case 0x7ef374b1:
                   if (str.equals("SOCIAL_TIETIE_PICTURE")) {
                      i = 2;
                   }
                   break;
                 default:
                label_0082 :
                   i = -1;
             }
             switch (i){
                 case 0:
                   obj.l(21);
                   intent1 = new Intent(p0, WhatsUpActivity.class);
                   c.a(intent1, obj.f());
                   return intent1;
                 case 1:
                   return this.m70(p0, null, p1.mMessageTargetName, false, "");
                 case 2:
                   obj.l(22);
                   intent1 = new Intent(p0, TieTieActivity.class);
                   c.a(intent1, obj.f());
                   return intent1;
                 default:
                   return intent;
             }
          }else {
             int i1 = 19;
             obj.l(i1);
             obj.y(Workspace$From.IM_SEND_MESSAGE.ordinal());
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p1.mTabs.iterator();
             while (iterator.hasNext()) {
                String str1 = iterator.next();
                Objects.requireNonNull(str1);
                if (!str1.equals("SOCIAL_WHATS_UP_PICTURE")) {
                   if (!str1.equals("IM_SEND_MESSAGE")) {
                      continue ;
                   }else {
                      int i2 = 18;
                      uArrayList.add(Integer.valueOf(i2));
                      if ("IM_SEND_MESSAGE".equals(p1.mDefaultTab)) {
                         intent = Integer.valueOf(i2);
                      }
                   }
                }else {
                   uArrayList.add(Integer.valueOf(i1));
                   if ("SOCIAL_WHATS_UP_PICTURE".equals(p1.mDefaultTab)) {
                      intent = Integer.valueOf(i1);
                   }
                }
             }
             if (intent == null && !uArrayList.isEmpty()) {
                i1 = uArrayList.indexOf(Integer.valueOf(a.a.getInt("last_send_message_selected_tab_id", i)));
                if (i1 >= 0) {
                   Object[] objArray2 = new Object[i];
                   a.D().w(str, "select last tab", objArray2);
                   intent = uArrayList.get(i1);
                }else {
                   objArray1 = new Object[i];
                   a.D().w(str, "select first tab", objArray1);
                   intent = uArrayList.get(i);
                }
             }
             obj.v(uArrayList);
             if (intent != null) {
                obj.q(intent.intValue());
             }
             return this.NM(obj.f());
          }
       }
    }
    public void Um(Activity p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("hwcfg_RecordPluginImpl", "DPBenchmarkConfigManager stop", objArray);
       DPBenchmarkConfigManager.getInstance().stop();
       Intent intent = this.NM(p1);
       if (p.e(intent)) {
          d.h();
       }
       if (p1.E1 != null) {
          Object[] objArray1 = new Object[i];
          a.D().w("discardCurrentPostSession", "startCameraActivity", objArray1);
          intent.putExtra("discard_current_post_session", true);
       }
       p0.startActivityForResult(intent, p1.mRequestCode);
       return;
    }
    public d VI(a p0,c p1,b$a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(p0, p1, p2);
    }
    public d Wp(a p0,c p1,b$a p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, f.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(p0, p1, p2, p3);
    }
    public void Wv(){
       if (PatchProxy.applyVoid(null, this, f.class, "23")) {
          return;
       }
       long l = System.currentTimeMillis();
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong("last_work_publish_time", l);
       g.a(uEditor);
       a.Z(l);
       return;
    }
    public Intent XX(Activity p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, f.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m70(p0, p1, p2, false, p3);
    }
    public String ZG(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(p0);
    }
    public Intent e10(Activity p0,String p1,String p2,int p3,String p4){
       RecordPostPlugin$SendMessagePageInfo obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, uof, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new RecordPostPlugin$SendMessagePageInfo();
       obj.mTitle = p2;
       obj.mTabs = Collections.singletonList(p1);
       obj.mTaskId = p4;
       obj.mIconRes = p3;
       return this.S7(p0, obj);
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
    public Intent iz(Activity p0,TakePictureType p1,String p2){
       String this;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TakePictureType obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = TakePictureType.LIVE_AVATAR;
       Intent intent = (p1 == obj)? new Intent(p0, TakeLiveAvatarActivity.class): new Intent(p0, TakePictureActivity.class);
       if (p1 == obj) {
          this = "photo_task_id";
          String str = j0.f(p0.getIntent(), this);
          if (!TextUtils.isEmpty(str)) {
             intent.putExtra(this, str);
          }
       }
       SerializableHook.putExtra(intent, "TakePictureType", p1);
       if (!TextUtils.isEmpty(p2)) {
          intent.putExtra("tag", p2);
       }
       int i = 3;
       if (p1 == obj) {
          intent.putExtra("frame_mode", i);
       }
       if (PostExperimentUtils.H0()) {
          PreLoader instance = PreLoader.getInstance();
          PreloadParam$Builder uBuilder = new PreloadParam$Builder(p0);
          p0 = PatchProxy.applyOneRefs(p1, this, f.class, "11");
          if (p0 != patchProxyRe) {
             i1 = p0.intValue();
          }else {
             i1 = f$b.a[p1.ordinal()];
             if (i1 != 2 && (i1 != i && (i1 != 4 && i1 != 5))) {
                i1 = (i1 != 6)? 0x7f0d15b3: 0x7f0d15b5;
             }else {
                i1 = 0x7f0d0f5a;
             }
          }
          instance.preload(uBuilder.addLayoutId(i1).setUseMutableContext(true).build());
       }
       return intent;
    }
    public String jK(){
       List obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!o2.a()) {
          return "";
       }
       obj = new h2().b();
       if (q.f(obj)) {
          return "";
       }
       try{
          JSONObject jSONObject = new JSONObject();
          JSONArray jSONArray = new JSONArray();
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             jSONArray.put(iterator.next());
          }
          jSONObject.put("BEAUTY_YIMEI_STATUS", jSONArray);
          return jSONObject.toString();
       }catch(org.json.JSONException e0){
          a.D().e("RecordPluginImpl", "setBeautyYiMeiStatus error", e0);
          return "";
       }
    }
    public a jX(){
       Object obj = PatchProxy.apply(null, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
    public Intent lL(Activity p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m70(p0, null, p1, true, "");
    }
    public final Intent m70(Activity p0,String p1,String p2,boolean p3,String p4){
       b$a obj;
       int i;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, uof, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new b$a(0);
       obj.N(p2);
       if (p3) {
          obj.l(21);
          obj.y(Workspace$From.IM_SEND_MESSAGE_WHATS_UP.ordinal());
       }else if(TextUtils.isEmpty(p1)){
          i = 19;
       }else {
          i = 20;
       }
       obj.l(i);
       i = (TextUtils.isEmpty(p1))? Workspace$From.IM_SEND_MESSAGE.ordinal(): Workspace$From.IM_TAKE_IN_SAME.ordinal();
       obj.y(i);
       obj.p(p0.getApplicationContext());
       obj.Y(1);
       if (!TextUtils.isEmpty(p1)) {
          obj.M(p1);
          obj.d0(1);
          obj.L(1);
       }
       if (!TextUtils.isEmpty(p4)) {
          obj.I1 = p4;
       }
       Intent intent = new Intent(p0, StoryMixRecordActivity.class);
       c.a(intent, obj.f());
       return intent;
    }
    public boolean py(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.a(p0);
    }
    public boolean rB(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof TakePictureFragment) {
          return b;
       }
       if (p0.isVisible() && p0.E == null) {
          b = true;
       }
       return b;
    }
    public c sH(){
       c$a uoa = c$a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.b == null) {
          obj = new ArrayList();
          obj.add(new c$b(R.string.arg_RES_7f1004aa, 0x493e0, 4));
          obj.add(new c$b(p.b(2), m.a(2), 2));
          obj.add(new c$b(p.b(0), m.a(0), 0));
          c$a uoa1 = new c$a();
          Object obj1 = PatchProxy.applyOneRefs(obj, uoa1, uoa, "1");
          if (obj1 != patchProxyRe) {
             uoa1 = obj1;
          }else if(!q.f(obj)){
             if (obj.size() <= 4) {
                uoa1.a = new ArrayList(obj);
             }else {
                throw new InvalidParameterException("录制时长最多支持4个");
             }
          }else {
             uoa1.a = null;
          }
          uoa1.b = d.a;
          c uoc = PatchProxy.apply(null, uoa1, uoa, "3");
          if (uoc != patchProxyRe) {
          }else {
             uoc = new c(uoa1);
          }
          this.b = uoc;
       }
       return this.b;
    }
    public int uK(int p0){
       c obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uof = this.b;
       if (uof != null) {
          obj = uof.a;
          if (obj != null) {
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                c$b uob = iterator.next();
                if (uob.a() == p0) {
                   return uob.b;
                }
             }
          }
       }
       return m.b(p0);
    }
    public boolean y7(){
       Object obj = PatchProxy.apply(null, this, f.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.h();
    }
}
