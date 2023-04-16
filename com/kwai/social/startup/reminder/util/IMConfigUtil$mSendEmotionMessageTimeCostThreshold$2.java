package com.kwai.social.startup.reminder.util.IMConfigUtil$mSendEmotionMessageTimeCostThreshold$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.social.startup.reminder.model.IMConfigInfo;

public final class IMConfigUtil$mSendEmotionMessageTimeCostThreshold$2 extends Lambda implements a	// class@0018dd
{
    public static final IMConfigUtil$mSendEmotionMessageTimeCostThreshold$2 INSTANCE;

    static {
       IMConfigUtil$mSendEmotionMessageTimeCostThreshold$2.INSTANCE = new IMConfigUtil$mSendEmotionMessageTimeCostThreshold$2();
    }
    public void IMConfigUtil$mSendEmotionMessageTimeCostThreshold$2(){
       super(0);
    }
    public final Long invoke(){
       Object[] objArray = null;
       IMConfigInfo obj = PatchProxy.apply(objArray, this, IMConfigUtil$mSendEmotionMessageTimeCostThreshold$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          objArray = Long.valueOf(obj.mSendEmotionMessageTimeCostThreshold);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
