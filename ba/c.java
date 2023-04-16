package ba.c;
import ea.a;
import ba.d;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.Resources;
import java.lang.String;
import android.widget.TextView;
import da.a;
import zf6.j;
import ba.a;
import android.view.ViewGroup;
import android.view.View$OnClickListener;

public class c implements a	// class@000b07
{
    public final d a;

    public void c(d p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       c ta = this.a;
       ta.g = p0;
       String str = (TextUtils.isEmpty(ta.h))? p0.getResources().getString(R.string.arg_RES_7f1009de): ta.h;
       TextView textView = p0.findViewById(R.id.tvTitle);
       textView.setText(str);
       str = (TextUtils.isEmpty(ta.i))? p0.getResources().getString(R.string.arg_RES_7f1051f9): ta.i;
       TextView textView1 = p0.findViewById(R.id.btnCancel);
       textView1.setText(str);
       str = (TextUtils.isEmpty(ta.j))? p0.getResources().getString(R.string.arg_RES_7f1051fa): ta.j;
       TextView textView2 = p0.findViewById(R.id.btnSubmit);
       textView2.setText(str);
       d k = ta.k;
       if (k != null) {
          k.a(textView1, textView, textView2);
       }
       ta.o(j.d(p0, R.color.arg_RES_7f060c33));
       ta.p(j.d(p0, R.color.arg_RES_7f060c33));
       ta.f(j.d(p0, R.color.arg_RES_7f060c27));
       ta.q(0, 0, 0);
       ta.i(2.60f);
       ViewGroup viewGroup = ta.g.findViewById(R.id.ll_picker_layout);
       if (viewGroup != null) {
          if (ta.f != null) {
             viewGroup.setBackgroundResource(R.drawable.arg_RES_7f082566);
          }else {
             viewGroup.setBackgroundResource(R.drawable.arg_RES_7f082567);
          }
       }
       p0.findViewById(R.id.btnCancel).setOnClickListener(ta);
       p0.findViewById(R.id.btnSubmit).setOnClickListener(ta);
       return;
    }
}
