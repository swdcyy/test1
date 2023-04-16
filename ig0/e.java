package ig0.e;
import java.lang.Object;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import yb6.d;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.CharSequence;
import zsd.u;
import java.util.Objects;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;
import android.text.TextUtils;
import android.net.Uri$Builder;
import android.util.Base64;
import zsd.d;
import java.nio.charset.Charset;
import fg6.a;
import com.google.gson.Gson;
import ig0.d;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import bg0.b;
import mrd.a;
import java.lang.Integer;

public final class e	// class@0028c5
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public static final boolean a(TaskCommonParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "params");
       long l = d.a();
       if (p0.getMExpireTime() <= 0 || p0.getMExpireTime() - l > 0) {
          return false;
       }
       TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "task expired, server time="+l+" , expireTime="+p0.getMExpireTime(), null, false, 12, null);
       return true;
    }
    public static final boolean b(TaskCommonParams p0){
       String mTaskTypeId;
       boolean b1;
       boolean b2;
       TaskPendantConfig obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       TaskUIConfig taskUIConfig = null;
       Object obj1 = PatchProxy.applyOneRefs(obj, taskUIConfig, uoe, "5");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       if (obj == null) {
          TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "isValidParam false, params null", null, false, 12, null);
          return false;
       }else {
          String mTaskToken = p0.getMTaskToken();
          mTaskToken = (mTaskToken == null || u.S1(mTaskToken))? 1: null;
          if (mTaskToken) {
             TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "isValidParam false, mTaskToken is empty", null, false, 12, null);
             return false;
          }else {
             mTaskToken = p0.getMTaskTypeId();
             boolean b = (mTaskToken == null || u.S1(mTaskToken))? true: false;
             if (b) {
                TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "isValidParam false, mTaskTypeId is empty", null, false, 12, null);
                return false;
             }else if(!p0.getMActivityTask()){
                TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "isValidParam false, mActivityTask is false", null, false, 12, null);
                return false;
             }else if(e.a(p0)){
                return false;
             }else {
                e a = e.a;
                mTaskTypeId = p0.getMTaskTypeId();
                a.m(mTaskTypeId);
                Objects.requireNonNull(a);
                Object obj2 = PatchProxy.applyOneRefs(mTaskTypeId, a, uoe, "7");
                String str = "live_chat_duration";
                String str1 = "watch_photo_count";
                String str2 = "watch_photo_duration";
                String str3 = "browse_page";
                String str4 = "browse_behind_page";
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else {
                   switch (mTaskTypeId.hashCode()){
                       case 0x887d9817:
                         if (mTaskTypeId.equals("watch_live_duration")) {
                         label_00df :
                            b1 = true;
                         }else {
                         label_00e1 :
                            b1 = false;
                         }
                         break;
                       case 0xccaa443f:
                         if (mTaskTypeId.equals(str4)) {
                            goto label_00df ;
                         }else {
                            goto label_00e1 ;
                         }
                         break;
                       case 0xd0cdfb24:
                         if (mTaskTypeId.equals(str3)) {
                            goto label_00df ;
                         }else {
                            goto label_00e1 ;
                         }
                         break;
                       case 0xd7afaa71:
                         if (mTaskTypeId.equals(str2)) {
                            goto label_00df ;
                         }else {
                            goto label_00e1 ;
                         }
                         break;
                       case 0x1cc36952:
                         if (mTaskTypeId.equals(str1)) {
                            goto label_00df ;
                         }else {
                            goto label_00e1 ;
                         }
                         break;
                       case 0x48c1a488:
                         if (mTaskTypeId.equals(str)) {
                            goto label_00df ;
                         }else {
                            goto label_00e1 ;
                         }
                         break;
                       default:
                         goto label_00e1 ;
                   }
                }
                if (!b1) {
                   TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "isValidParam false, not support task", null, false, 12, null);
                   return false;
                }else {
                   mTaskTypeId = p0.getMTaskTypeId();
                   a.m(mTaskTypeId);
                   Objects.requireNonNull(a);
                   Object obj3 = PatchProxy.applyOneRefs(mTaskTypeId, a, uoe, "8");
                   if (obj3 != patchProxyRe) {
                      b2 = obj3.booleanValue();
                   }else {
                      switch (mTaskTypeId.hashCode()){
                          case 0x887d9817:
                            if (mTaskTypeId.equals("watch_live_duration")) {
                            label_0140 :
                               b2 = true;
                            }else {
                            label_0142 :
                               b2 = false;
                            }
                            break;
                          case 0xccaa443f:
                            if (mTaskTypeId.equals(str4)) {
                               goto label_0140 ;
                            }else {
                               goto label_0142 ;
                            }
                            break;
                          case 0xd0cdfb24:
                            if (mTaskTypeId.equals(str3)) {
                               goto label_0140 ;
                            }else {
                               goto label_0142 ;
                            }
                            break;
                          case 0xd7afaa71:
                            if (mTaskTypeId.equals(str2)) {
                               goto label_0140 ;
                            }else {
                               goto label_0142 ;
                            }
                            break;
                          case 0x1cc36952:
                            if (mTaskTypeId.equals(str1)) {
                               goto label_0140 ;
                            }else {
                               goto label_0142 ;
                            }
                            break;
                          case 0x48c1a488:
                            if (mTaskTypeId.equals(str)) {
                               goto label_0140 ;
                            }else {
                               goto label_0142 ;
                            }
                            break;
                          default:
                            goto label_0142 ;
                      }
                   }
                   if (b2) {
                      if (p0.getMPendantConfig() != null) {
                         obj = p0.getMPendantConfig();
                         if (obj != null) {
                            taskUIConfig = obj.getMUiConfig();
                         }
                         if (taskUIConfig != null) {
                         label_0166 :
                            return true;
                         }
                      }
                      TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "isValidParam false, pendant ui config is null", null, false, 12, null);
                      return false;
                   }else {
                      goto label_0166 ;
                   }
                }
             }
          }
       }
    }
    public static final TaskCommonParams c(Activity p0){
       Object obj3;
       Intent obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object obj1 = null;
       Uri obj2 = PatchProxy.applyOneRefs(obj, obj1, uoe, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       if (PatchProxy.isSupport(uoe)) {
          obj2 = PatchProxy.applyTwoRefs(obj, Boolean.TRUE, obj1, uoe, "2");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else if(obj == null){
             TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "parseParam, activity is null", false, 4, null);
          }else {
             obj = p0.getIntent();
             if (obj == null) {
                TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "parseParam, intent is null", false, 4, null);
             }else {
                obj2 = obj.getData();
                e a = e.a;
                Objects.requireNonNull(a);
                if (PatchProxy.isSupport(uoe)) {
                   obj3 = PatchProxy.applyTwoRefs(obj2, Boolean.TRUE, a, uoe, "4");
                   if (obj3 != patchProxyRe) {
                   }else if(obj2 == null){
                      if (!obj2.isHierarchical()) {
                         TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "getTaskParam, uri.isHierarchical false", false, 4, null);
                      }else if(!TextUtils.isEmpty(w0.a(obj2, "activityWidgetParamsDeprecated"))){
                         TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "uri data is deprecated", false, 4, null);
                      }else {
                         TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "getTaskParam, uri is "+obj2, false, 4, null);
                         obj3 = w0.a(obj2, "widgetParams");
                      }
                   }
                   obj3 = obj1;
                }else {
                   goto label_0069 ;
                }
                if (TextUtils.isEmpty(obj3)) {
                   TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskCenterParamsUtil", "parseParam, parameter is null", false, 4, null);
                }else {
                   a.m(obj2);
                   obj.setData(obj2.buildUpon().appendQueryParameter("activityWidgetParamsDeprecated", "true").build());
                   obj1 = e.d(obj3);
                }
             }
          }
       }else {
          goto label_0027 ;
       }
       return obj1;
    }
    public static final TaskCommonParams d(String p0){
       TaskCenterDTHelper d;
       TaskCommonParams obj = null;
       TaskCommonParams obj1 = PatchProxy.applyOneRefs(p0, obj, e.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (TextUtils.isEmpty(p0)) {
          return obj;
       }
       byte[] uobyteArray = Base64.decode(p0, 8);
       a.o(uobyteArray, "Base64.decode\(params, Base64.URL_SAFE\)");
       String str = new String(uobyteArray, d.a);
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "TaskCenterParamsUtil", "parseParam, parameter="+str, false, 4, null);
       obj1 = a.a.h(str, TaskCommonParams.class);
       if (obj1 != null && !obj1.getMActivityTask()) {
          obj1 = d.b.a(str);
       }
       if (!e.b(obj1)) {
          TaskCenterLogUtil.a(b, "TaskCenterParamsUtil", "parseParam, invalid", null, false, 12, null);
          return obj;
       }else {
          d = TaskCenterDTHelper.d;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(str, d, TaskCenterDTHelper.class, "4")) {
             a.p(str, "taskParamsJsonStr");
             if (!d.d()) {
                d.b().b = str;
                d.c().onNext(Integer.valueOf(1));
             }
          }
          obj = obj1;
          return obj;
       }
    }
}
