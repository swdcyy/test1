package ga.e;
import ea.a;
import ga.k;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.Resources;
import android.app.Activity;
import java.lang.String;
import android.widget.TextView;
import ga.c;
import android.view.View$OnClickListener;
import ga.d;
import da.a;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import lnc.a1;

public final class e implements a	// class@00205f
{
    public final k a;

    public void e(k p0){
       this.a = p0;
    }
    public final void a(View p0){
       LinearLayout$LayoutParams layoutParams;
       e ta = this.a;
       k o = (!TextUtils.isEmpty(ta.o))? ta.o: ta.d.getResources().getString(R.string.arg_RES_7f101cae);
       TextView textView = p0.findViewById(R.id.title);
       textView.setText(o);
       TextView textView1 = p0.findViewById(R.id.cancel);
       textView1.setOnClickListener(new c(ta));
       TextView textView2 = p0.findViewById(R.id.finish);
       textView2.setOnClickListener(new d(ta));
       k j = ta.j;
       if (j != null) {
          j.a(textView1, textView, textView2);
       }
       ViewGroup viewGroup = p0.findViewById(R.id.ll_picker_layout);
       if (viewGroup != null) {
          if (ta.r != null) {
             viewGroup.setBackgroundResource(R.drawable.arg_RES_7f082566);
          }else {
             viewGroup.setBackgroundResource(R.drawable.arg_RES_7f082567);
          }
       }
       View view = p0.findViewById(R.id.options1);
       float f = 20.00f;
       if (view != null && view.getLayoutParams() instanceof LinearLayout$LayoutParams) {
          layoutParams = view.getLayoutParams();
          layoutParams.width = (c.c(p0.getResources()).widthPixels / 2) - a1.e(f);
          view.setLayoutParams(layoutParams);
       }
       view = p0.findViewById(R.id.options2);
       if (view != null && view.getLayoutParams() instanceof LinearLayout$LayoutParams) {
          layoutParams = view.getLayoutParams();
          layoutParams.width = (c.c(p0.getResources()).widthPixels / 2) + a1.e(f);
          view.setLayoutParams(layoutParams);
       }
       k h = ta.h;
       if (h != null) {
          h.a(p0);
       }
       return;
    }
}
