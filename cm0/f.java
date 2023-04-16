package cm0.f;
import java.lang.Object;
import zl0.a1;
import com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$AdInfo;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yx.j0;
import fg6.a;
import com.kuaishou.live.common.ad.social.LivePreviewSocialBean;
import com.google.gson.Gson;
import java.lang.Exception;

public class f	// class@0004e5
{

    public void f(){
       super();
    }
    public static LiveAdLogParamAppender a(a1 p0){
       LiveAdLogParamAppender liveAdLogPar;
       Object obj = p0;
       a1 obj1 = PatchProxy.applyOneRefs(obj, null, f.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = obj.k;
       a1 e = obj.e;
       if (e <= 0) {
          e = (long)obj.d;
       }
       a1 uoa1 = e;
       if (obj1 != null) {
          liveAdLogPar = e;
          LiveAdLogParamAppender liveAdLogPar1 = e;
          liveAdLogPar = new LiveAdLogParamAppender(obj.g, obj.b, uoa1, obj.h, obj1.mOrderId, obj1.mMissionId, obj1.mTaskId, obj1.mExtData, obj1.mChargeInfo, obj1.mAdInfo);
          return liveAdLogPar1;
       }else {
          liveAdLogPar = new LiveAdLogParamAppender(obj.g, obj.b, uoa1, obj.h, 0, 0, 0, "", "", null);
          return obj1;
       }
    }
    public static LiveAdLogParamAppender b(Map p0){
       String obj = p0;
       Object[] obj1 = null;
       String obj2 = PatchProxy.applyOneRefs(obj, obj1, f.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       if (obj != null) {
          obj2 = "socialData";
          if (!TextUtils.x(obj.get(obj2))) {
             obj = obj.get(obj2);
             Object[] objArray = new Object[0];
             try{
                j0.f(obj2, obj, objArray);
                LivePreviewSocialBean livePreviewS = a.a.h(obj, LivePreviewSocialBean.class);
                LivePreviewSocialBean mConversionT = livePreviewS.mConversionTypeInt;
                if (mConversionT - null <= 0) {
                   mConversionT = livePreviewS.mConversionType;
                }
                LiveAdLogParamAppender liveAdLogPar = new LiveAdLogParamAppender(livePreviewS.mSourceType, livePreviewS.mConversionId, mConversionT, livePreviewS.mSceneId, livePreviewS.mOrderId, livePreviewS.mMissionId, livePreviewS.mTaskId, livePreviewS.mExtData, livePreviewS.mChargeInfo, livePreviewS.mAdInfo);
                return mConversionT;
             }catch(java.lang.Exception e0){
                obj1 = new Object[0];
                j0.c(obj2, e0.getMessage(), obj1);
                return null;
             }
          }
       }
       return obj1;
    }
}
