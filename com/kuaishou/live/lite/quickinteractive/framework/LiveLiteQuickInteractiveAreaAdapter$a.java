package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaAdapter;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType$a;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import vc3.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.ViewController;
import java.util.Map;
import vc3.j;
import vc3.f;

public final class LiveLiteQuickInteractiveAreaAdapter$a extends ViewControllerAdapter$a	// class@000ac1
{
    public final LiveLiteQuickInteractiveAreaAdapter f;

    public void LiveLiteQuickInteractiveAreaAdapter$a(LiveLiteQuickInteractiveAreaAdapter p0,ViewGroup p1,LifecycleOwner p2,Activity p3,int p4){
       a.p(p1, "itemView");
       a.p(p2, "parentLifecycleOwner");
       a.p(p3, "activity");
       this.f = p0;
       super(p1, p2, p3);
       LiveLiteQuickInteractiveAreaItemType liveLiteQuic = LiveLiteQuickInteractiveAreaItemType.Companion.a(p4);
       if (liveLiteQuic != null) {
          LiveLiteQuickInteractiveAreaAdapter j = p0.j;
          LiveData liveData = this.b();
          p0 = p0.k;
          Objects.requireNonNull(j);
          ViewController viewControll = PatchProxy.applyThreeRefs(liveLiteQuic, liveData, p0, j, l.class, "2");
          if (viewControll != PatchProxyResult.class) {
          }else {
             a.p(liveLiteQuic, "areaItemType");
             a.p(liveData, "data");
             a.p(p0, "delegate");
             j oj = j.a.get(liveLiteQuic);
             ViewController viewControll1 = (oj != null)? oj.b(liveData, p0): 0;
             viewControll = viewControll1;
          }
          if (viewControll != null) {
             this.E2(p1, viewControll);
          }
       }
       return;
    }
}
