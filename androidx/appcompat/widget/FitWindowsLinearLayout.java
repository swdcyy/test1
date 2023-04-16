package androidx.appcompat.widget.FitWindowsLinearLayout;
import androidx.appcompat.widget.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import androidx.appcompat.widget.d$a;
import android.view.View;

public class FitWindowsLinearLayout extends LinearLayout implements d	// class@000602
{
    public d$a b;

    public void FitWindowsLinearLayout(Context p0){
       super(p0);
    }
    public void FitWindowsLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean fitSystemWindows(Rect p0){
       FitWindowsLinearLayout tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       return super.fitSystemWindows(p0);
    }
    public void setOnFitSystemWindowsListener(d$a p0){
       this.b = p0;
    }
}
