package com.yxcorp.gifshow.commercial.response.magnetic.LiveNeoPendentTasksResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.commercial.response.magnetic.LiveNeoPendentTasksResponse$LiveNeoPendentTasksData;
import java.util.List;

public class LiveNeoPendentTasksResponse implements Serializable	// class@001165
{
    public LiveNeoPendentTasksResponse$LiveNeoPendentTasksData mData;
    public static final long serialVersionUID = 0xf988c02a4d18237e;

    public void LiveNeoPendentTasksResponse(){
       super();
    }
    public boolean isValid(){
       boolean b;
       LiveNeoPendentTasksResponse obj = PatchProxy.apply(null, this, LiveNeoPendentTasksResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mData;
       if (obj != null) {
          LiveNeoPendentTasksResponse$LiveNeoPendentTasksData mStepList = obj.mStepList;
          if (mStepList != null && mStepList.size() > 0) {
             b = true;
          label_0025 :
             return b;
          }
       }
       b = false;
       goto label_0025 ;
    }
    public boolean shouldHidePendent(){
       boolean b;
       LiveNeoPendentTasksResponse obj = PatchProxy.apply(null, this, LiveNeoPendentTasksResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isValid()) {
          obj = this.mData;
          if (obj.mCurrentTaskFinished != null || obj.mTaskFinished != null) {
             b = true;
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
}
