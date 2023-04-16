package com.kuaishou.live.lite.adapter.component.chat.component.widget.LiveLiteUserWidgetViewModel$a;
import a73.c;
import com.kuaishou.live.lite.adapter.component.chat.component.widget.LiveLiteUserWidgetViewModel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import a73.c$a;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import ae1.b;

public final class LiveLiteUserWidgetViewModel$a implements c	// class@001d72
{
    public final LiveLiteUserWidgetViewModel a;

    public void LiveLiteUserWidgetViewModel$a(LiveLiteUserWidgetViewModel p0){
       this.a = p0;
       super();
    }
    public void d(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteUserWidgetViewModel$a.class, "1")) {
          return;
       }
       a.p(p0, "speakers");
       c$a.a(this, p0);
       LiveLiteUserWidgetViewModel$a ta = this.a;
       ta.c.setValue(Boolean.valueOf(ArraysKt___ArraysKt.P7(p0, ta.i)));
       return;
    }
    public void e(){
       PatchProxy.applyVoid(null, this, LiveLiteUserWidgetViewModel$a.class, "4");
    }
    public void f(){
       PatchProxy.applyVoid(null, this, LiveLiteUserWidgetViewModel$a.class, "3");
    }
    public void g(ChatInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteUserWidgetViewModel$a.class, "2")) {
          return;
       }
       String str = "chatInfo";
       a.p(p0, str);
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, c$a.class, "1")) {
          a.p(p0, str);
       }
       LiveLiteUserWidgetViewModel$a ta = this.a;
       ta.e.setValue(ta.u0(p0));
       return;
    }
}
