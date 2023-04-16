package bq4.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bq4.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import rp4.n;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.text.Layout;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.widget.FrameLayout;
import android.view.ViewTreeObserver;

public class a$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0003b4
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       String str1;
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       if (this.b.u.getWidth() > 0 && this.b.u.getHeight() > 0) {
          int lineCount = this.b.u.getLineCount();
          String str = "StoryDecorationContainerViewPresenter";
          int i = 1;
          a$b uob = 8;
          int i1 = 0;
          if (lineCount > uob) {
             a u = this.b.u;
             if (PatchProxy.isSupport(n.class)) {
                str1 = PatchProxy.applyThreeRefs(u, Integer.valueOf(i1), Integer.valueOf(7), null, n.class, "20");
                if (str1 != PatchProxyResult.class) {
                }else {
                label_0056 :
                   int lineStart = u.getLayout().getLineStart(i1);
                   int lineEnd = u.getLayout().getLineEnd(7);
                   Editable text = u.getText();
                   str1 = (text == null)? "": (text.toString()).substring(lineStart, lineEnd);
                }
             }else {
                goto label_0056 ;
             }
             if (str1.endsWith("\n")) {
                str1 = str1.substring(i1, (str1.length() - i));
             }
             Object[] objArray = new Object[i1];
             a.D().w(str, "onBind out of limit lineCount:"+lineCount+",subText:"+str1, objArray);
             this.b.u.setText(str1);
             return;
          }else {
             this.b.x = i;
             Object[] objArray1 = new Object[i1];
             a.D().w(str, "onBind mIsDefaultDrawerInitialized:"+this.b.w, objArray1);
             a$b tb = this.b;
             if (tb.w != null) {
                tb.P8();
                this.b.v.setVisibility(uob);
             }
             this.b.u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          }
       }
       return;
    }
}
