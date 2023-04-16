package bh8.g;
import android.widget.TextView$OnEditorActionListener;
import bh8.m;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import java.util.Objects;
import android.text.Editable;
import android.widget.EditText;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.Spanned;
import om.f;
import om.p;

public final class g implements TextView$OnEditorActionListener	// class@000365
{
    public final m a;

    public void g(m p0){
       this.a = p0;
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       int b;
       g ta = this.a;
       Objects.requireNonNull(ta);
       if (p1 == 6) {
          Editable text = ta.e.getText();
          if (text != null && (TextUtils.isEmpty(text.toString()) || TextUtils.isEmpty((text.toString()).trim()))) {
             p.a(R.string.arg_RES_7f103598);
             b = true;
          label_0046 :
             return b;
          }else {
             b = ta.a(text);
             text = b / 2;
             if ((text + (b % 2)) > 20) {
                p.a(R.string.arg_RES_7f103597);
             }
          }
       }
       b = false;
       goto label_0046 ;
    }
}
