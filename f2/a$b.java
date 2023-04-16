package f2.a$b;
import android.database.DataSetObserver;
import f2.a;
import android.widget.BaseAdapter;

public class a$b extends DataSetObserver	// class@001fb0
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       a$b ta = this.a;
       ta.b = true;
       ta.notifyDataSetChanged();
    }
    public void onInvalidated(){
       a$b ta = this.a;
       ta.b = false;
       ta.notifyDataSetInvalidated();
    }
}
