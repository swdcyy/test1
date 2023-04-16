package com.kuaishou.live.lite.adapter.component.multichat.LiveLiteMultiChatPresenterV2$onCreate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.multichat.LiveLiteMultiChatPresenterV2;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f83.e;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import kotlin.jvm.internal.a;
import xp1.b;
import up1.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;

public final class LiveLiteMultiChatPresenterV2$onCreate$1 extends Lambda implements a	// class@001df5
{
    public final LiveLiteMultiChatPresenterV2 this$0;

    public void LiveLiteMultiChatPresenterV2$onCreate$1(LiveLiteMultiChatPresenterV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final LayoutConfig invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLiteMultiChatPresenterV2 obj = PatchProxy.apply(objArray, this, LiveLiteMultiChatPresenterV2$onCreate$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.v;
       if (obj != null) {
          Object obj1 = PatchProxy.apply(objArray, obj, e.class, "2");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             e j = obj.j;
             if (j != null) {
                objArray = PatchProxy.apply(objArray, j, LiveAudienceMultiChatController.class, "13");
                if (objArray != patchProxyRe) {
                }else {
                   LiveAudienceMultiChatController j1 = j.j;
                   if (j1 == null) {
                      a.S("multiChatCoreModel");
                   }
                   objArray = j1.m().c().getValue();
                }
             }
          }
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
