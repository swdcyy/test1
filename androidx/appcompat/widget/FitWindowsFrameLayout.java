package androidx.appcompat.widget.FitWindowsFrameLayout;
import androidx.appcompat.widget.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import androidx.appcompat.widget.d$a;
import android.view.View;

public class FitWindowsFrameLayout extends FrameLayout implements d	// class@000601
{
    public d$a b;

    public void FitWindowsFrameLayout(Context p0){
       super(p0);
    }
    public void FitWindowsFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean fitSystemWindows(Rect p0){
       FitWindowsFrameLayout tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       return super.fitSystemWindows(p0);
    }
    public void setOnFitSystemWindowsListener(d$a p0){
       this.b = p0;
    }
}
