package ga.j0;
import ea.a;
import ga.n0;
import android.content.Context;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.Resources;
import java.lang.String;
import android.widget.TextView;
import ga.h0;
import android.view.View$OnClickListener;
import ga.i0;
import da.a;
import android.view.ViewGroup;

public final class j0 implements a	// class@002068
{
    public final n0 a;
    public final Context b;

    public void j0(n0 p0,Context p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(View p0){
       j0 ta = this.a;
       j0 tb = this.b;
       String str = (TextUtils.isEmpty(ta.h))? tb.getResources().getString(R.string.arg_RES_7f1009df): ta.h;
       TextView textView = p0.findViewById(R.id.title);
       textView.setText(str);
       TextView textView1 = p0.findViewById(R.id.cancel);
       textView1.setOnClickListener(new h0(ta));
       TextView textView2 = p0.findViewById(R.id.finish);
       textView2.setOnClickListener(new i0(ta));
       n0 n = ta.n;
       if (n != null) {
          n.a(textView1, textView, textView2);
       }
       ViewGroup viewGroup = p0.findViewById(R.id.ll_picker_layout);
       if (viewGroup != null) {
          if (ta.l != null) {
             viewGroup.setBackgroundResource(R.drawable.arg_RES_7f082566);
          }else {
             viewGroup.setBackgroundResource(R.drawable.arg_RES_7f082567);
          }
       }
       return;
    }
}
