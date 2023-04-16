package bwb.d$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.TextView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.text.TextPaint;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;

public final class d$a implements ViewTreeObserver$OnPreDrawListener	// class@0004cd
{
    public final TextView b;
    public final String c;
    public final float d;

    public void d$a(TextView p0,String p1,float p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       if ((float)this.b.getMeasuredWidth() - (this.b.getPaint().measureText(this.b.getText().toString()) + (float)(this.b.getPaddingLeft() + this.b.getPaddingRight())) < 0 && a.g(this.b.getTag(), this.c)) {
          this.b.setTextSize(1, this.d);
       }
       return 1;
    }
}
