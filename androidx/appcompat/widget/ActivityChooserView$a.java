package androidx.appcompat.widget.ActivityChooserView$a;
import android.database.DataSetObserver;
import androidx.appcompat.widget.ActivityChooserView;
import android.widget.BaseAdapter;

public class ActivityChooserView$a extends DataSetObserver	// class@0005d7
{
    public final ActivityChooserView a;

    public void ActivityChooserView$a(ActivityChooserView p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       super.onChanged();
       this.a.b.notifyDataSetChanged();
    }
    public void onInvalidated(){
       super.onInvalidated();
       this.a.b.notifyDataSetInvalidated();
    }
}
