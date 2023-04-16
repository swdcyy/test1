package b4d.q$c;
import tyc.u4;
import b4d.q;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import com.yxcorp.gifshow.widget.EmojiEditText;
import uid.g;
import android.widget.TextView;
import java.lang.CharSequence;
import android.content.Context;
import androidx.core.content.ContextCompat;

public class q$c extends u4	// class@000389
{
    public final q b;

    public void q$c(q p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       q v;
       if (PatchProxy.applyVoidOneRefs(p0, this, q$c.class, "1")) {
          return;
       }
       q$c tb = this.b;
       if (tb.v == null) {
          return;
       }
       int i = (tb.p.mForceNewEditorStyle != null)? g.a(tb.t): p0.length();
       tb = this.b;
       q p = tb.p;
       if (p.mForceNewEditorStyle != null && p.mEnableTextCountDownTipShow != null) {
          if (i >= (p.mTextLimit - 10)) {
             if (tb.v.getVisibility() == 8) {
                this.b.v.setVisibility(0);
             }
             tb = this.b;
             tb.v.setText(String.valueOf((tb.p.mTextLimit - i)));
             tb = this.b;
             BaseEditorFragment$Arguments mTextLimit = tb.p.mTextLimit;
             if (i > mTextLimit) {
                v = tb.v;
                v.setTextColor(ContextCompat.getColor(v.getContext(), R.color.arg_RES_7f0607c5));
             }else if(i >= (mTextLimit - 10)){
                v = tb.v;
                v.setTextColor(ContextCompat.getColor(v.getContext(), R.color.arg_RES_7f0607d6));
             }
          }else {
             tb.v.setVisibility(8);
          }
       }else if(p.mEnableTextLimitTipShow != null && i > p.mTextLimit){
          if (tb.v.getVisibility() == 8) {
             this.b.v.setVisibility(0);
          }
          tb = this.b;
          tb.v.setText(String.valueOf((tb.p.mTextLimit - i)));
       }else {
          tb.v.setVisibility(8);
       }
       return;
    }
}
