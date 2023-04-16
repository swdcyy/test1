package com.kuaishou.live.core.voiceparty.micseats.core.viewmanager.MicSeatViewAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.core.voiceparty.micseats.core.viewmanager.MicSeatViewAdapter;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import rs2.a;
import androidx.lifecycle.LiveData;
import java.util.Map;
import com.kuaishou.live.viewcontroller.ViewController;

public final class MicSeatViewAdapter$a extends ViewControllerAdapter$a	// class@00158e
{
    public final MicSeatViewAdapter f;

    public void MicSeatViewAdapter$a(MicSeatViewAdapter p0,ViewGroup p1,LifecycleOwner p2,Activity p3){
       a.p(p1, "viewContainer");
       a.p(p2, "parentLifecycleOwner");
       a.p(p3, "activity");
       this.f = p0;
       super(p1, p2, p3);
       this.E2(p1, new a(p0.j, this.b()));
    }
}
