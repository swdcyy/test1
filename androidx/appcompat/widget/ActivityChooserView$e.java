package androidx.appcompat.widget.ActivityChooserView$e;
import android.database.DataSetObserver;
import androidx.appcompat.widget.ActivityChooserView;

public class ActivityChooserView$e extends DataSetObserver	// class@0005db
{
    public final ActivityChooserView a;

    public void ActivityChooserView$e(ActivityChooserView p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       super.onChanged();
       this.a.e();
    }
}
