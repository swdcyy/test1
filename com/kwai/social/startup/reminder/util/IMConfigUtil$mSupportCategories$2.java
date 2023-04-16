package com.kwai.social.startup.reminder.util.IMConfigUtil$mSupportCategories$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.social.startup.reminder.model.IMConfigInfo;

public final class IMConfigUtil$mSupportCategories$2 extends Lambda implements a	// class@0018de
{
    public static final IMConfigUtil$mSupportCategories$2 INSTANCE;

    static {
       IMConfigUtil$mSupportCategories$2.INSTANCE = new IMConfigUtil$mSupportCategories$2();
    }
    public void IMConfigUtil$mSupportCategories$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Object[] objArray = null;
       IMConfigInfo obj = PatchProxy.apply(objArray, this, IMConfigUtil$mSupportCategories$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IMConfigUtil.i.r();
       if (obj != null) {
          obj = obj.mCategoryAggregationConfig;
          if (obj != null) {
             if (obj.isEmpty() ^ 0x01) {
                objArray = obj;
             }
             if (objArray != null) {
             label_002a :
                return objArray;
             }
          }
       }
       objArray = IMConfigUtil.b;
       goto label_002a ;
    }
}
