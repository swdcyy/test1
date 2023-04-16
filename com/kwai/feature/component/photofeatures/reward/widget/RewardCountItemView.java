package com.kwai.feature.component.photofeatures.reward.widget.RewardCountItemView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kwai.feature.component.photofeatures.reward.widget.RewardCountItemView$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.kwai.feature.component.photofeatures.reward.widget.RewardCountItemView$CornerPosition;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.GradientDrawable;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import qz5.a;
import java.lang.Enum;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.text.TextPaint;
import android.graphics.Typeface;
import ekd.d0;

public final class RewardCountItemView extends ConstraintLayout	// class@00126c
{
    public TextView B;
    public TextView C;
    public View D;
    public static final float E;
    public static final RewardCountItemView$a F;

    static {
       RewardCountItemView.F = new RewardCountItemView$a(null);
       RewardCountItemView.E = (float)a1.d(0x7f07031b);
    }
    public void RewardCountItemView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void RewardCountItemView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void RewardCountItemView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public final void L(RewardCountItemView$CornerPosition p0){
       int[] ointArray;
       float[] uofloatArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardCountItemView.class, "5")) {
          return;
       }
       String str = "type";
       a.p(p0, str);
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(a1.a(R.color.arg_RES_7f06202f));
       GradientDrawable gradientDraw1 = PatchProxy.applyOneRefs(p0, this, RewardCountItemView.class, "6");
       if (gradientDraw1 != PatchProxyResult.class) {
       }else {
          a.p(p0, str);
          gradientDraw1 = new GradientDrawable();
          gradientDraw1.setColor(a1.a(R.color.arg_RES_7f062033));
          int i = a.a[p0.ordinal()];
          ointArray = null;
          if (i != 1) {
             int i1 = 7;
             int i2 = 8;
             if (i != 2) {
                if (i != 3) {
                   if (i == 4) {
                      gradientDraw1.setCornerRadius(RewardCountItemView.E);
                   }
                }else {
                   uofloatArray = new float[i2];
                   uofloatArray[0] = ointArray;
                   uofloatArray[1] = ointArray;
                   uofloatArray[2] = ointArray;
                   uofloatArray[3] = ointArray;
                   float e = RewardCountItemView.E;
                   uofloatArray[4] = e;
                   uofloatArray[5] = e;
                   uofloatArray[6] = e;
                   uofloatArray[i1] = e;
                   gradientDraw1.setCornerRadii(uofloatArray);
                }
             }else {
                uofloatArray = new float[i2];
                float e1 = RewardCountItemView.E;
                uofloatArray[0] = e1;
                uofloatArray[1] = e1;
                uofloatArray[2] = e1;
                uofloatArray[3] = e1;
                uofloatArray[4] = ointArray;
                uofloatArray[5] = ointArray;
                uofloatArray[6] = ointArray;
                uofloatArray[i1] = ointArray;
                gradientDraw1.setCornerRadii(uofloatArray);
             }
          }else {
             gradientDraw1.setCornerRadius(ointArray);
          }
       }
       StateListDrawable stateListDra = new StateListDrawable();
       ointArray = new int[]{0x10100a7};
       stateListDra.addState(ointArray, gradientDraw1);
       ointArray = new int[]{-16842919};
       stateListDra.addState(ointArray, gradientDraw);
       this.setBackground(stateListDra);
       return;
    }
    public final View getMDivider(){
       RewardCountItemView obj = PatchProxy.apply(null, this, RewardCountItemView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.D;
       if (obj == null) {
          a.S("mDivider");
       }
       return obj;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, RewardCountItemView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       View view = this.findViewById(R.id.reward_count_item_num);
       a.o(view, "findViewById\(R.id.reward_count_item_num\)");
       this.B = view;
       view = this.findViewById(R.id.reward_count_item_desc);
       a.o(view, "findViewById\(R.id.reward_count_item_desc\)");
       this.C = view;
       view = this.findViewById(R.id.reward_count_item_divider);
       a.o(view, "findViewById\(R.id.reward_count_item_divider\)");
       this.D = view;
       RewardCountItemView tB = this.B;
       String str = "mNum";
       if (tB == null) {
          a.S(str);
       }
       TextPaint paint = tB.getPaint();
       a.o(paint, "mNum.paint");
       paint.setFakeBoldText(true);
       tB = this.B;
       if (tB == null) {
          a.S(str);
       }
       tB.setTypeface(d0.a("alte-din.ttf", a1.c()));
       return;
    }
}
