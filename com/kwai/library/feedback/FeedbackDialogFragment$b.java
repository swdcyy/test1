package com.kwai.library.feedback.FeedbackDialogFragment$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.feedback.FeedbackDialogFragment$b$a;
import nsd.u;
import xv6.b;
import com.kwai.library.feedback.FeedbackDialogFragment$c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.library.feedback.FeedbackDialogFragment$b$b;
import java.lang.Integer;
import xv6.a;
import java.util.Objects;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import qrd.l1;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import com.kwai.library.feedback.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;

public final class FeedbackDialogFragment$b extends RecyclerView$Adapter	// class@000822
{
    public final b e;
    public final FeedbackDialogFragment$c f;
    public static final FeedbackDialogFragment$b$a g;

    static {
       FeedbackDialogFragment$b.g = new FeedbackDialogFragment$b$a(null);
    }
    public void FeedbackDialogFragment$b(b p0,FeedbackDialogFragment$c p1){
       a.p(p0, "feedbackData");
       super();
       this.e = p0;
       this.f = p1;
    }
    public int getItemCount(){
       List obj = PatchProxy.apply(null, this, FeedbackDialogFragment$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e.a();
       int i = (obj != null)? obj.size(): 0;
       if (i > 6) {
          i = 6;
       }
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       FeedbackDialogFragment$b$b a;
       FeedbackDialogFragment$b uob = FeedbackDialogFragment$b.class;
       String str = "2";
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, str)) {
          a.p(p0, "holder");
          List list = this.e.a();
          String str1 = null;
          a uoa = (list != null)? list.get(p1): str1;
          Objects.requireNonNull(p0);
          FeedbackDialogFragment$b$b uob$b = FeedbackDialogFragment$b$b.class;
          if (!PatchProxy.isSupport(uob$b) || !PatchProxy.applyVoidTwoRefs(uoa, Integer.valueOf(p1), p0, uob$b, str)) {
             a = p0.a;
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setShape(0);
             gradientDraw.setColor(a1.a(R.color.arg_RES_7f06173e));
             gradientDraw.setCornerRadius((float)a1.e(27.00f));
             GradientDrawable gradientDraw1 = new GradientDrawable();
             gradientDraw1.setShape(0);
             gradientDraw1.setColor(a1.a(R.color.arg_RES_7f06173e));
             gradientDraw1.setAlpha(127);
             gradientDraw1.setCornerRadius((float)a1.e(27.00f));
             StateListDrawable stateListDra = new StateListDrawable();
             int[] ointArray = new int[]{0x10100a7};
             stateListDra.addState(ointArray, gradientDraw1);
             int[] ointArray1 = new int[0];
             stateListDra.addState(ointArray1, gradientDraw);
             a.setBackground(stateListDra);
             TextPaint paint = a.getPaint();
             a.o(paint, "paint");
             paint.setFakeBoldText(1);
             if (uoa != null) {
                str1 = uoa.c();
             }
             a.setText(str1);
             a.setOnClickListener(new a(p0, uoa, p1));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       FeedbackDialogFragment$b$b uob$b;
       FeedbackDialogFragment$b uob = FeedbackDialogFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          uob$b = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uob$b != PatchProxyResult.class) {
          label_0031 :
             return uob$b;
          }
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d043d);
       a.o(view, "view");
       uob$b = new FeedbackDialogFragment$b$b(view, this.f);
       goto label_0031 ;
    }
}
