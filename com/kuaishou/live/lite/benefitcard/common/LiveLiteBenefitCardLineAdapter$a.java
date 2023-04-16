package com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardLineAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardRichTextElementViewController;
import androidx.lifecycle.LiveData;
import g93.i;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteBenefitCardLineAdapter$a extends ViewControllerAdapter$a	// class@001e97
{

    public void LiveLiteBenefitCardLineAdapter$a(ViewGroup p0,LifecycleOwner p1,Activity p2,int p3){
       ViewController viewControll;
       a.p(p0, "itemView");
       a.p(p1, "parentLifecycleOwner");
       a.p(p2, "activity");
       super(p0, p1, p2);
       if (p3 != 1) {
          viewControll = (p3 != 2)? null: new LiveLiteBenefitCardRichTextElementViewController(this.b());
       }else {
          viewControll = new i(this.b());
       }
       if (viewControll != null) {
          this.E2(p0, viewControll);
       }
       return;
    }
}
