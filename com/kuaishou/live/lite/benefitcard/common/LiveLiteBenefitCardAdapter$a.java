package com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import g93.h;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteBenefitCardAdapter$a extends ViewControllerAdapter$a	// class@001e91
{

    public void LiveLiteBenefitCardAdapter$a(ViewGroup p0,LifecycleOwner p1,Activity p2){
       a.p(p0, "itemView");
       a.p(p1, "parentLifecycleOwner");
       a.p(p2, "activity");
       super(p0, p1, p2);
       this.E2(p0, new h(this.b()));
    }
}
