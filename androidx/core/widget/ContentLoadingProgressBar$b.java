package androidx.core.widget.ContentLoadingProgressBar$b;
import java.lang.Runnable;
import androidx.core.widget.ContentLoadingProgressBar;
import java.lang.Object;
import java.lang.System;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar$b implements Runnable	// class@000727
{
    public final ContentLoadingProgressBar b;

    public void ContentLoadingProgressBar$b(ContentLoadingProgressBar p0){
       this.b = p0;
       super();
    }
    public void run(){
       ContentLoadingProgressBar$b tb = this.b;
       tb.d = false;
       if (tb.e == null) {
          tb.b = System.currentTimeMillis();
          this.b.setVisibility(false);
       }
       return;
    }
}
