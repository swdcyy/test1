package androidx.core.widget.ContentLoadingProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.ContentLoadingProgressBar$a;
import androidx.core.widget.ContentLoadingProgressBar$b;
import java.lang.Runnable;

public class ContentLoadingProgressBar extends ProgressBar	// class@000728
{
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Runnable f;
    public final Runnable g;

    public void ContentLoadingProgressBar(Context p0){
       super(p0, null);
    }
    public void ContentLoadingProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.b = -1;
       this.c = false;
       this.d = false;
       this.e = false;
       this.f = new ContentLoadingProgressBar$a(this);
       this.g = new ContentLoadingProgressBar$b(this);
    }
    public final void a(){
       this.removeCallbacks(this.f);
       this.removeCallbacks(this.g);
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.a();
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.a();
    }
}
