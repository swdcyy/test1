package androidx.appcompat.widget.ActivityChooserView$d;
import w0.m;
import androidx.appcompat.widget.ActivityChooserView;
import android.view.View;
import v0.e;
import androidx.appcompat.widget.ListPopupWindow;

public class ActivityChooserView$d extends m	// class@0005da
{
    public final ActivityChooserView k;

    public void ActivityChooserView$d(ActivityChooserView p0,View p1){
       this.k = p0;
       super(p1);
    }
    public e b(){
       return this.k.getListPopupWindow();
    }
    public boolean c(){
       this.k.c();
       return true;
    }
    public boolean d(){
       this.k.a();
       return true;
    }
}
