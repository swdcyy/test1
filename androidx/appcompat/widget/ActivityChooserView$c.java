package androidx.appcompat.widget.ActivityChooserView$c;
import android.view.View$AccessibilityDelegate;
import androidx.appcompat.widget.ActivityChooserView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import b2.d;

public class ActivityChooserView$c extends View$AccessibilityDelegate	// class@0005d9
{
    public final ActivityChooserView a;

    public void ActivityChooserView$c(ActivityChooserView p0){
       this.a = p0;
       super();
    }
    public void onInitializeAccessibilityNodeInfo(View p0,AccessibilityNodeInfo p1){
       super.onInitializeAccessibilityNodeInfo(p0, p1);
       d.G0(p1).X(true);
    }
}
