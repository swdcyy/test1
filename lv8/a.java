package lv8.a;
import java.lang.Object;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams;
import android.widget.TextView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.ColorStateList;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Color;

public class a	// class@002da9
{
    public ColorStateList a;

    public void a(){
       this.a = null;
    }
    public void a(JsPageButtonParams p0,TextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.a = p1.getTextColors();
       }
       p1.setText(p0.mText);
       if (!TextUtils.isEmpty(p0.mTextColor)) {
          try{
             p1.setTextColor(Color.parseColor(p0.mTextColor));
          }catch(java.lang.Exception e0){
          }
       }else {
          a ta = this.a;
          if (ta != null) {
             p1.setTextColor(ta);
          }
       }
       return;
    }
}
