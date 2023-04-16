package com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils$autoOpenCameraAssistantLimit$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.r0;
import java.lang.Integer;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import zsd.u;
import java.lang.Number;
import com.yxcorp.gifshow.model.response.AssistantStartUpData;
import java.lang.Long;
import cc9.q;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.Boolean;
import oa0.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import ac9.g;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import lnc.a1;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class AssistantUtils	// class@001d1f
{
    public static final int a = 14;
    public static Map b;
    public static final p c;
    public static final AssistantUtils d;

    static {
       AssistantUtils.d = new AssistantUtils();
       AssistantUtils.c = s.c(AssistantUtils$autoOpenCameraAssistantLimit$2.INSTANCE);
    }
    public void AssistantUtils(){
       super();
    }
    public final String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AssistantUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CharSequence uCharSequenc = p0;
       int i = 0;
       int i1 = 1;
       Object[] objArray = new Object[i1];
       objArray[0] = Integer.valueOf(i);
       String str = "${%s}";
       String str1 = String.format(str, Arrays.copyOf(objArray, i1));
       String str2 = "java.lang.String.format\(format, *args\)";
       a.o(str1, str2);
       while (StringsKt__StringsKt.O2(uCharSequenc, str1, 0, 2, null)) {
          objArray = new Object[i1];
          objArray[0] = Integer.valueOf(i);
          str1 = String.format(str, Arrays.copyOf(objArray, i1));
          a.o(str1, str2);
          Object[] objArray1 = new Object[i1];
          i++;
          objArray1[0] = Integer.valueOf(i);
          str = String.format("%%%s$s", Arrays.copyOf(objArray1, i1));
          a.o(str, str2);
          String str3 = str1;
          str1 = str;
          uCharSequenc = u.g2(uCharSequenc, str3, str1, 0, 4, null);
       }
       return uCharSequenc;
    }
    public final long b(){
       long l;
       AssistantStartUpData obj = PatchProxy.apply(null, this, AssistantUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.e();
       if (obj != null) {
          obj = obj.floatWaitingShowDurMs;
          if (obj != null) {
             l = obj.longValue();
          label_0025 :
             return l;
          }
       }
       l = 5500;
       goto label_0025 ;
    }
    public final String c(q p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, AssistantUtils.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Integer integer = this.i(p0);
       obj = 1;
       if (integer != null && integer.intValue() == obj) {
          int i = (PostExperimentUtils.p())? 0x7f104192: 0x7f104191;
          str = this.l(i);
       }else {
          obj = 2;
          if (integer != null && integer.intValue() == obj) {
             str = this.l(R.string.arg_RES_7f104190);
          }else if(integer != null && integer.intValue() == 4){
             str = this.l(R.string.arg_RES_7f104193);
          }else {
             str = null;
          }
       }
       return str;
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, AssistantUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.a() >= 2)? true: false;
       return b;
    }
    public final AssistantStartUpData e(){
       Object[] objArray = null;
       AssistantStartUpData obj = PatchProxy.apply(objArray, this, AssistantUtils.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AssistantStartUpData.class;
       String str = a.a.getString("assist_startup_data", "null");
       Object[] objArray1 = (str == null || str == "")? objArray: b.a(str, obj);
       if (objArray1 != null) {
          objArray = objArray1;
       }
       return objArray;
    }
    public final long f(){
       Object obj = PatchProxy.apply(null, this, AssistantUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = AssistantUtils.c.getValue();
       }
       return obj.longValue();
    }
    public final g g(q p0){
       g obj = PatchProxy.applyOneRefs(p0, this, AssistantUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       if (p0.b() < 0 || p0.b() >= p0.f().size()) {
          return obj;
       }
       return p0.f().get(p0.b());
    }
    public final String h(q p0){
       String obj = PatchProxy.applyOneRefs(p0, this, AssistantUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       if (p0.b() < 0 || p0.b() >= p0.f().size()) {
          return obj;
       }
       return p0.f().get(p0.b()).getTitle();
    }
    public final Integer i(q p0){
       Integer obj = PatchProxy.applyOneRefs(p0, this, AssistantUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       if (p0.b() < 0 || p0.b() >= p0.f().size()) {
          return obj;
       }
       return Integer.valueOf(p0.f().get(p0.b()).getType());
    }
    public final boolean j(){
       Object obj = PatchProxy.apply(null, this, AssistantUtils.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean("need_show_assistant_dialog", true);
    }
    public final long k(){
       long l;
       AssistantStartUpData obj = PatchProxy.apply(null, this, AssistantUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.e();
       if (obj != null) {
          obj = obj.silentRecognitionStartTimeMs;
          if (obj != null) {
             l = obj.longValue();
          label_0025 :
             return l;
          }
       }
       l = 3000;
       goto label_0025 ;
    }
    public final String l(int p0){
       HashMap obj;
       Map b;
       String str;
       AssistantStartUpData assistantSid;
       Map map2;
       String str4;
       AssistantUtils uAssistantUt = AssistantUtils.class;
       if (PatchProxy.isSupport(uAssistantUt)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAssistantUt, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (AssistantUtils.b == null && !PatchProxy.applyVoid(null, this, uAssistantUt, "21")) {
          AssistantStartUpData uAssistantSt = this.e();
          obj = new HashMap();
          if (uAssistantSt != null) {
             assistantSid = uAssistantSt.assistantSideBarName;
             if (assistantSid != null) {
                obj.put(Integer.valueOf(R.string.arg_RES_7f10418e), assistantSid);
             }
          }
          if (uAssistantSt != null) {
             assistantSid = uAssistantSt.floatText;
             if (assistantSid != null) {
                obj.put(Integer.valueOf(R.string.arg_RES_7f1047de), assistantSid);
             }
          }
          if (uAssistantSt != null) {
             assistantSid = uAssistantSt.manualFloatText;
             if (assistantSid != null) {
                obj.put(Integer.valueOf(R.string.arg_RES_7f10418d), assistantSid);
             }
          }
          if (uAssistantSt != null) {
             assistantSid = uAssistantSt.manualFloatDeputyText;
             if (assistantSid != null) {
                obj.put(Integer.valueOf(R.string.arg_RES_7f10418c), assistantSid);
             }
          }
          if (uAssistantSt != null) {
             assistantSid = uAssistantSt.doubleLineTextMain;
             if (assistantSid != null) {
                obj.put(Integer.valueOf(R.string.arg_RES_7f10418b), assistantSid);
             }
          }
          if (uAssistantSt != null) {
             assistantSid = uAssistantSt.doubleLineTextDeputy;
             if (assistantSid != null) {
                obj.put(Integer.valueOf(R.string.arg_RES_7f10418a), assistantSid);
             }
          }
          int i = 1;
          if (uAssistantSt != null) {
             Map map = uAssistantSt.b();
             if (map != null) {
                String str1 = map.get(Integer.valueOf(i));
                if (str1 != null) {
                   obj.put(Integer.valueOf(R.string.arg_RES_7f10169f), AssistantUtils.d.a(str1));
                }
             }
          }
          int i1 = 2;
          if (uAssistantSt != null) {
             Map map1 = uAssistantSt.b();
             if (map1 != null) {
                String str2 = map1.get(Integer.valueOf(i1));
                if (str2 != null) {
                   obj.put(Integer.valueOf(R.string.arg_RES_7f10169e), AssistantUtils.d.a(str2));
                }
             }
          }
          if (uAssistantSt != null) {
             map2 = uAssistantSt.b();
             if (map2 != null) {
                String str3 = map2.get(Integer.valueOf(4));
                if (str3 != null) {
                   obj.put(Integer.valueOf(R.string.arg_RES_7f1016a0), AssistantUtils.d.a(str3));
                }
             }
          }
          if (uAssistantSt != null) {
             map2 = uAssistantSt.a();
             if (map2 != null) {
                str4 = map2.get(Integer.valueOf(i));
                if (str4 != null) {
                   int i2 = (PostExperimentUtils.p())? 0x7f104192: 0x7f104191;
                   obj.put(Integer.valueOf(i2), str4);
                }
             }
          }
          if (uAssistantSt != null) {
             Map map3 = uAssistantSt.a();
             if (map3 != null) {
                str4 = map3.get(Integer.valueOf(i1));
                if (str4 != null) {
                   obj.put(Integer.valueOf(R.string.arg_RES_7f104190), str4);
                }
             }
          }
          if (uAssistantSt != null) {
             b = uAssistantSt.a();
             if (b != null) {
                str = b.get(Integer.valueOf(4));
                if (str != null) {
                   obj.put(Integer.valueOf(R.string.arg_RES_7f104193), str);
                }
             }
          }
          AssistantUtils.b = obj;
       }
       b = AssistantUtils.b;
       if (b != null) {
          str = b.get(Integer.valueOf(p0));
          if (str != null) {
          label_0180 :
             return str;
          }
       }
       str = a1.p(p0);
       a.o(str, "CommonUtil.string\(stringId\)");
       goto label_0180 ;
    }
    public final String m(b p0){
       String taskId;
       Object obj = PatchProxy.applyOneRefs(p0, this, AssistantUtils.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getTaskId");
       if (p0.f() instanceof CameraFragment) {
          BaseFragment uBaseFragmen = p0.f();
          Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.video.CameraFragment");
          taskId = uBaseFragmen.getTaskId();
          a.o(taskId, "\(this.fragment as CameraFragment\).taskId");
       }else {
          taskId = "";
       }
       return taskId;
    }
    public final long n(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AssistantUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "fragment");
       if (p0.isResumed()) {
          return (long)300;
       }
       return 0;
    }
    public final void o(int p0){
       AssistantUtils uAssistantUt = AssistantUtils.class;
       if (PatchProxy.isSupport(uAssistantUt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAssistantUt, "5")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("assist_guide_has_show_promt_count", (a.a() + p0));
       g.a(uEditor);
       return;
    }
}
