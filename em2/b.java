package em2.b;
import java.lang.Runnable;
import android.widget.TextView;
import java.lang.String;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.text.TextPaint;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import java.lang.CharSequence;
import em2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import java.lang.StringBuilder;
import android.graphics.Paint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import em2.a;

public final class b implements Runnable	// class@00278a
{
    public final TextView b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final View$OnClickListener g;

    public void b(TextView p0,String p1,int p2,int p3,String p4,View$OnClickListener p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       StaticLayout staticLayout2;
       SpannableString spannableStr;
       b uob = this;
       b b = uob.b;
       b c = uob.c;
       b d = uob.d;
       b e = uob.e;
       b f = uob.f;
       b g = uob.g;
       TextPaint paint = b.getPaint();
       int i = (b.getWidth() - b.getPaddingLeft()) - b.getPaddingRight();
       StaticLayout staticLayout = v8;
       int i1 = i;
       StaticLayout staticLayout1 = v8;
       int i2 = i;
       staticLayout = new StaticLayout(c, paint, i1, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, 1);
       if (staticLayout1.getLineCount() > d) {
          d uod = d.class;
          int i3 = 1;
          i1 = 0;
          if (PatchProxy.isSupport(uod)) {
             Object[] objArray = new Object[]{c,staticLayout2,paint,Integer.valueOf(i2),Integer.valueOf(d),Integer.valueOf(e),f};
             staticLayout2 = staticLayout1;
             spannableStr = PatchProxy.apply(objArray, null, uod, "2");
             if (spannableStr != PatchProxyResult.class) {
             label_0121 :
                b.setText(spannableStr);
                if (g != null) {
                   b.setOnClickListener(g);
                }else {
                   b.setOnClickListener(new a(b, c));
                }
             }
          }else {
             staticLayout2 = staticLayout1;
          }
          String str = c.substring(i1, staticLayout2.getLineStart(d));
          String str1 = "..."+f;
          int lineStart = staticLayout2.getLineStart((d - 1));
          while (lineStart <= str.length()) {
             int i4 = i2;
             if (paint.measureText(str.substring(lineStart)+str1) - (float)i4 >= 0) {
                int i5 = str.length() - i3;
                str = str.substring(i1, i5);
                i2 = i4;
             }else if(str.endsWith("\n")){
                str = str.substring(i1, (str.length() - i3))+str1;
             }else {
                str = str+str1;
             }
             SpannableString spannableStr1 = new SpannableString(str);
             if (!TextUtils.isEmpty(f)) {
                spannableStr1.setSpan(new ForegroundColorSpan(e), (str.length() - f.length()), str.length(), 33);
             }
             spannableStr = spannableStr1;
             goto label_0121 ;
          }
       }else {
          b.setText(c);
          b.setOnClickListener(g);
       }
       return;
    }
}
