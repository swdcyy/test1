package ek9.n1;
import lnc.o7;
import android.text.style.ClickableSpan;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.text.TextPaint;
import o56.a;
import android.content.Context;
import ync.a;

public abstract class n1 extends ClickableSpan implements o7	// class@002195
{
    public int b;
    public int c;
    public boolean d;
    public static int e;

    public void n1(){
       super();
    }
    public void a(View p0,boolean p1){
       if (PatchProxy.isSupport(n1.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, n1.class, "2")) {
          return;
       }
       this.d = p1;
       p0.invalidate();
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n1.class, "1")) {
          return;
       }
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       if (!n1.e) {
          n1.e = a.d(a.B);
       }
       n1 tb = this.b;
       if (tb == null && this.c == null) {
          p0.setColor(n1.e);
       }else if(this.d != null){
          n1 tc = this.c;
          if (tc != null) {
             tb = tc;
          }
       }
       p0.setColor(tb);
       return;
    }
}
