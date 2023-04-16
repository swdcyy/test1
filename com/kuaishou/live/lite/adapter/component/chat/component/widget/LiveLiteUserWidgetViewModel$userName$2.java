package com.kuaishou.live.lite.adapter.component.chat.component.widget.LiveLiteUserWidgetViewModel$userName$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.chat.component.widget.LiveLiteUserWidgetViewModel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;

public final class LiveLiteUserWidgetViewModel$userName$2 extends Lambda implements a	// class@001d73
{
    public final LiveLiteUserWidgetViewModel this$0;

    public void LiveLiteUserWidgetViewModel$userName$2(LiveLiteUserWidgetViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       UserInfo mName;
       LiveLiteUserWidgetViewModel obj = PatchProxy.apply(null, this, LiveLiteUserWidgetViewModel$userName$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.a;
       if (obj != null) {
          mName = obj.mName;
          if (mName != null) {
          label_001d :
             return mName;
          }
       }
       mName = "";
       goto label_001d ;
    }
}
