package ip8.f;
import android.text.style.ReplacementSpan;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;
import android.graphics.Paint$FontMetricsInt;

public class f extends ReplacementSpan	// class@002709
{
    public final int b;

    public void f(int p0){
       super();
       this.b = p0;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       return this.b;
    }
}
