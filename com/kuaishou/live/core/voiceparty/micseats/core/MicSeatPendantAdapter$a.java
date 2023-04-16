package com.kuaishou.live.core.voiceparty.micseats.core.MicSeatPendantAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.core.voiceparty.micseats.core.MicSeatPendantAdapter;
import android.view.ViewGroup;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.util.Map;
import msd.l;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.core.MicSeatPendantAdapter$a$a;
import z0.a;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.viewcontroller.ViewController;
import rs2.d;

public final class MicSeatPendantAdapter$a extends ViewControllerAdapter$a	// class@00157a
{
    public final MicSeatPendantAdapter f;

    public void MicSeatPendantAdapter$a(MicSeatPendantAdapter p0,ViewGroup p1,Activity p2,LifecycleOwner p3,MicSeatPendantId p4){
       ViewController viewControll;
       a.p(p1, "viewContainer");
       a.p(p2, "activity");
       a.p(p3, "parentLifecycleOwner");
       a.p(p4, "pendantId");
       this.f = p0;
       super(p1, p3, p2);
       l ol = p0.j.get(p4);
       if (ol != null) {
          LiveData liveData = Transformations.map(this.b(), new MicSeatPendantAdapter$a$a());
          a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
          viewControll = ol.invoke(liveData);
          if (viewControll != null) {
          label_0043 :
             this.E2(p1, viewControll);
             return;
          }
       }
       viewControll = new d();
       goto label_0043 ;
    }
}
