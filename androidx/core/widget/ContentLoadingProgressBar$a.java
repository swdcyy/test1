package androidx.core.widget.ContentLoadingProgressBar$a;
import java.lang.Runnable;
import androidx.core.widget.ContentLoadingProgressBar;
import java.lang.Object;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar$a implements Runnable	// class@000726
{
    public final ContentLoadingProgressBar b;

    public void ContentLoadingProgressBar$a(ContentLoadingProgressBar p0){
       this.b = p0;
       super();
    }
    public void run(){
       ContentLoadingProgressBar$a tb = this.b;
       tb.c = false;
       tb.b = -1;
       tb.setVisibility(8);
    }
}
