package com.kwai.social.startup.reminder.util.IMConfigUtil$mEnableEmotionMessageOptimize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.social.startup.reminder.model.IMConfigInfo;

public final class IMConfigUtil$mEnableEmotionMessageOptimize$2 extends Lambda implements a	// class@0018db
{
    public static final IMConfigUtil$mEnableEmotionMessageOptimize$2 INSTANCE;

    static {
       IMConfigUtil$mEnableEmotionMessageOptimize$2.INSTANCE = new IMConfigUtil$mEnableEmotionMessageOptimize$2();
    }
    public void IMConfigUtil$mEnableEmotionMessageOptimize$2(){
       super(0);
    }
    public final Boolean invoke(){
       Object[] objArray = null;
       IMConfigInfo obj = PatchProxy.apply(objArray, this, IMConfigUtil$mEnableEmotionMessageOptimize$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          objArray = Boolean.valueOf(obj.mEnableEmotionMessageOptimize);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
