package com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardRichTextElementViewController$onCreate$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Objects;

public final class LiveLiteBenefitCardRichTextElementViewController$onCreate$1 extends Lambda implements p	// class@001e9a
{
    public final TextView $textView;

    public void LiveLiteBenefitCardRichTextElementViewController$onCreate$1(TextView p0){
       this.$textView = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0.intValue(), p1.intValue()));
    }
    public final boolean invoke(int p0,int p1){
       ViewGroup$LayoutParams obj;
       if (PatchProxy.isSupport(LiveLiteBenefitCardRichTextElementViewController$onCreate$1.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveLiteBenefitCardRichTextElementViewController$onCreate$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 < a1.e(70.00f)) {
          return false;
       }else {
          LiveLiteBenefitCardRichTextElementViewController$onCreate$1 t$textView = this.$textView;
          obj = t$textView.getLayoutParams();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
          obj.width = -1;
          t$textView.setLayoutParams(obj);
          return true;
       }
    }
}
