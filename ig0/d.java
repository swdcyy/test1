package ig0.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.taskcenter.model.TaskParamsAdaptConfig;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.model.OldTaskParams;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import java.lang.Boolean;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.utility.TextUtils;
import ekd.j;
import java.util.Objects;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;
import com.yxcorp.gifshow.pendant.response.PendantLocationParam;
import com.yxcorp.gifshow.model.CDNUrl;
import qrd.l1;

public final class d	// class@0028c4
{
    public static TaskParamsAdaptConfig a;
    public static final d b;

    static {
       d uod = new d();
       d.b = uod;
       TaskParamsAdaptConfig taskParamsAd = PatchProxy.apply(null, uod, d.class, "6");
       if (taskParamsAd != PatchProxyResult.class) {
       }else {
          String[] stringArray = new String[]{"200000000"};
          String[] stringArray1 = new String[]{"widget_browse_behind_page","widget_browse_behind_detail_page","widget_browse_page","widget_watch_photo_count","widget_browse_live"};
          taskParamsAd = new TaskParamsAdaptConfig(CollectionsKt__CollectionsKt.P(stringArray), CollectionsKt__CollectionsKt.P(stringArray1));
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterOldParamsAdaptUtil", "initAdaptConfig config="+taskParamsAd, false, 4, null);
       }
       d.a = taskParamsAd;
    }
    public void d(){
       super();
    }
    public final TaskCommonParams a(String p0){
       boolean b1;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uod, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "parameter");
       obj = PatchProxy.applyOneRefs(p0, this, uod, "4");
       TaskCommonParams taskCommonPa = null;
       if (obj != patchProxyRe) {
       }else {
          obj = a.a.h(p0, OldTaskParams.class);
       }
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "TaskCenterOldParamsAdaptUtil", "adaptOldTaskParams oldTaskParams="+obj, false, 4, null);
       String obj1 = PatchProxy.applyOneRefs(obj, this, uod, "5");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(obj == null || obj.getMActivityTask()){
          obj1 = obj.getMBizId();
          TaskCenterLogUtil taskCenterLo = (obj1 == null || u.S1(obj1))? 1: null;
          if (taskCenterLo) {
             TaskCenterLogUtil.d(b, "TaskCenterOldParamsAdaptUtil", "isValidParams biz id null", false, 4, null);
          }else if(!CollectionsKt___CollectionsKt.H1(d.a.getBizIdWhiteList(), obj.getMBizId())){
             TaskCenterLogUtil.d(b, "TaskCenterOldParamsAdaptUtil", "isValidParams bizIdWhiteList not contains", false, 4, null);
          }else {
             obj1 = obj.getMEventId();
             taskCenterLo = (obj1 == null || u.S1(obj1))? 1: null;
             if (taskCenterLo) {
                TaskCenterLogUtil.d(b, "TaskCenterOldParamsAdaptUtil", "isValidParams event id null", false, 4, null);
             }else if(!CollectionsKt___CollectionsKt.H1(d.a.getTaskTypeWhiteList(), obj.getMEventId())){
                TaskCenterLogUtil.d(b, "TaskCenterOldParamsAdaptUtil", "isValidParams taskTypeWhiteList not contains", false, 4, null);
             }else if(TextUtils.n(obj.getMEventId(), "widget_browse_behind_detail_page") && !j.g(obj.getMSectionIntervals())){
                TaskCenterLogUtil.d(b, "TaskCenterOldParamsAdaptUtil", "isValidParams sectionIntervals not empty", false, 4, null);
             }else {
                b1 = true;
             }
          }
       }
       b1 = false;
       if (!b1) {
          TaskCenterLogUtil.d(b, "TaskCenterOldParamsAdaptUtil", "adaptOldTaskParams invalid", false, 4, null);
          return taskCommonPa;
       }else {
          a.m(obj);
          taskCommonPa = PatchProxy.applyOneRefs(obj, this, uod, "2");
          if (taskCommonPa != patchProxyRe) {
          }else {
             TaskCenterLogUtil.d(b, "TaskCenterOldParamsAdaptUtil", "convertOldTaskToNew", false, 4, null);
             taskCommonPa = new TaskCommonParams();
             taskCommonPa.setMActivityTask(true);
             taskCommonPa.setMIsFallback(true);
             taskCommonPa.setMBizId(obj.getMBizId());
             taskCommonPa.setMTaskToken(obj.getMTaskId());
             taskCommonPa.setMActivityId(obj.getMActivityId());
             d b2 = d.b;
             obj1 = obj.getMEventId();
             Objects.requireNonNull(b2);
             b2 = PatchProxy.applyOneRefs(obj1, b2, uod, "3");
             if (b2 != patchProxyRe) {
             }else if(obj1 == null){
                switch (obj1.hashCode()){
                    case 0x9556bc06:
                      if (obj1.equals("widget_browse_live")) {
                         b2 = "watch_live_duration";
                      }
                      break;
                    case 0x95586da9:
                      if (obj1.equals("widget_browse_page")) {
                         b2 = "browse_page";
                      }
                      break;
                    case 0xd3cd2417:
                      if (obj1.equals("widget_watch_photo_count")) {
                         b2 = "watch_photo_count";
                      }
                      break;
                    case 0xf6d7e21a:
                      if (obj1.equals("widget_browse_behind_page")) {
                         b2 = "browse_behind_page";
                      }
                      break;
                    case 0x7e4f8bd2:
                      if (obj1.equals("widget_browse_behind_detail_page")) {
                         b2 = "watch_photo_duration";
                      }
                      break;
                    default:
                }
             }
             b2 = "";
             taskCommonPa.setMTaskTypeId(b2);
             taskCommonPa.setMCurrentProgress(obj.getMCurrentCount());
             taskCommonPa.setMTargetProgress(obj.getMTargetCount());
             taskCommonPa.setMIgnoreLastProgress(obj.getMDisableStoreProgress());
             taskCommonPa.setMCheckValue(obj.getMCheckValue());
             taskCommonPa.setMExpireTime(obj.getMWidgetExpireTime());
             taskCommonPa.setMDisableStoreTask(obj.getMDisableStoreProgress());
             TaskPendantConfig taskPendantC = new TaskPendantConfig();
             taskPendantC.setMShowPageList(obj.getMShowPages());
             taskPendantC.setMShowPage2List(obj.getMShowPages2());
             taskPendantC.setMInProgressLinkUrl(obj.getMTaskInProgressUrl());
             taskPendantC.setMCompleteLinkUrl(obj.getMTaskCompleteUrl());
             taskPendantC.setMDisappearSecondsIfComplete(obj.getMDisappearFewSeconds());
             TaskUIConfig taskUIConfig = new TaskUIConfig();
             taskUIConfig.setMStyle(666);
             PendantLocationParam mWidInitialP = obj.getMWidgetInitialPosition();
             mWidInitialP = (mWidInitialP != null)? mWidInitialP.mSide: 0;
             taskUIConfig.setMInitSide(mWidInitialP);
             mWidInitialP = obj.getMWidgetInitialPosition();
             mWidInitialP = (mWidInitialP != null)? mWidInitialP.mSide: 255;
             taskUIConfig.setMInitY(mWidInitialP);
             taskUIConfig.setMWidth(80);
             taskUIConfig.setMHeight(80);
             taskUIConfig.setMTextBgHeight(27);
             taskUIConfig.setMTextBgBottom(0);
             taskUIConfig.setMTextSize(10);
             taskUIConfig.setMTextColor(obj.getMTextColor());
             taskUIConfig.setMInProgressText(obj.getMTaskDesc());
             taskUIConfig.setMCompleteText(obj.getMWidgetTaskCompleteText());
             CDNUrl uCDNUrl = new CDNUrl();
             uCDNUrl.mUrl = obj.getMIconUrl();
             CDNUrl[] uCDNUrlArray = new CDNUrl[true];
             uCDNUrlArray[0] = uCDNUrl;
             taskUIConfig.setMIconUrls(uCDNUrlArray);
             uCDNUrl = new CDNUrl();
             uCDNUrl.mUrl = obj.getMCompleteIconUrl();
             uCDNUrlArray = new CDNUrl[true];
             uCDNUrlArray[0] = uCDNUrl;
             taskUIConfig.setMCompleteIconUrls(uCDNUrlArray);
             taskUIConfig.setMAnimResUrl(obj.getMAnimationResourceUrl());
             taskUIConfig.setMAnimFrameDuration(obj.getMAnimationFramePMs());
             taskUIConfig.setMXPolicy(obj.getMXPolicy());
             taskUIConfig.setMCloseDialogText(obj.getMCloseDialogText());
             taskPendantC.setMUiConfig(taskUIConfig);
             taskCommonPa.setMPendantConfig(taskPendantC);
          }
          return taskCommonPa;
       }
    }
}
