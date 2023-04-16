package com.kuaishou.live.lite.adapter.component.chat.component.widget.LiveLiteUserWidgetViewModel;
import yh3.a;
import a73.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import java.util.Map;
import ae1.a;
import com.kuaishou.live.lite.adapter.component.chat.component.widget.LiveLiteUserWidgetViewModel$userName$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import ae1.b;
import com.kuaishou.live.lite.adapter.component.chat.component.widget.LiveLiteUserWidgetViewModel$a;
import a73.c;
import androidx.lifecycle.ViewModel;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.lifecycle.LiveData;

public final class LiveLiteUserWidgetViewModel extends a	// class@001d74
{
    public final UserInfo a;
    public final p b;
    public final MutableLiveData c;
    public final LiveData d;
    public final MutableLiveData e;
    public final LiveData f;
    public final LiveLiteUserWidgetViewModel$a g;
    public final a h;
    public final String i;

    public void LiveLiteUserWidgetViewModel(a p0,String p1){
       a.p(p0, "liveMultiChatModel");
       a.p(p1, "guestId");
       super();
       this.h = p0;
       this.i = p1;
       ChatInfo uChatInfo = p0.p();
       a uoa = PatchProxy.applyOneRefs(uChatInfo, this, LiveLiteUserWidgetViewModel.class, "2");
       if (uoa != PatchProxyResult.class) {
       }else if(uChatInfo != null && uChatInfo.b().containsKey(p1)){
          p1 = uChatInfo.b().get(p1);
          a.m(p1);
          uoa = p1.e;
       }else {
          uoa = null;
       }
       this.a = uoa;
       this.b = s.c(new LiveLiteUserWidgetViewModel$userName$2(this));
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.FALSE);
       this.c = mutableLiveD;
       this.d = mutableLiveD;
       mutableLiveD = new MutableLiveData(this.u0(p0.p()));
       this.e = mutableLiveD;
       this.f = mutableLiveD;
       LiveLiteUserWidgetViewModel$a uoa1 = new LiveLiteUserWidgetViewModel$a(this);
       this.g = uoa1;
       p0.q(uoa1);
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveLiteUserWidgetViewModel.class, "4")) {
          return;
       }
       super.onCleared();
       this.h.r(this.g);
       return;
    }
    public final b u0(ChatInfo p0){
       b obj = PatchProxy.applyOneRefs(p0, this, LiveLiteUserWidgetViewModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          List list = p0.j();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                String str = obj1.a();
                int i = 1;
                if (str == null || str.equals(this.i) != i) {
                   i = 0;
                }
                if (i) {
                   obj = obj1;
                   break ;
                }
             }
          }
       }
       return obj;
    }
    public final LiveData v0(){
       return this.f;
    }
}
