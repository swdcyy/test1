package com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardRichTextElementViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.widget.LiveShrinkableFrameLayout;
import android.widget.TextView;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardRichTextElementViewController$onCreate$1;
import msd.p;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardRichTextElementViewController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class LiveLiteBenefitCardRichTextElementViewController extends ViewController	// class@001e9b
{
    public final LiveData j;

    public void LiveLiteBenefitCardRichTextElementViewController(LiveData p0){
       a.p(p0, "dataProvider");
       super();
       this.j = p0;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBenefitCardRichTextElementViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0975);
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type com.kuaishou.live.common.core.basic.widget.LiveShrinkableFrameLayout");
       TextView textView = this.A2(R.id.lite_benefit_card_rich_text_element_text_view);
       view.setTryShrinkListener(new LiveLiteBenefitCardRichTextElementViewController$onCreate$1(textView));
       this.j.observe(this, new LiveLiteBenefitCardRichTextElementViewController$a(textView));
       return;
    }
}
