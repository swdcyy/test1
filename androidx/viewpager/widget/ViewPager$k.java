package androidx.viewpager.widget.ViewPager$k;
import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

public class ViewPager$k extends DataSetObserver	// class@000a1b
{
    public final ViewPager a;

    public void ViewPager$k(ViewPager p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       this.a.dataSetChanged();
    }
    public void onInvalidated(){
       this.a.dataSetChanged();
    }
}
