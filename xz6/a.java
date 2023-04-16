package xz6.a;
import android.widget.BaseAdapter;
import android.database.DataSetObserver;
import java.lang.Exception;

public abstract class a extends BaseAdapter	// class@003d52
{

    public void a(){
       super();
    }
    public void unregisterDataSetObserver(DataSetObserver p0){
       if (p0 != null) {
          try{
             super.unregisterDataSetObserver(p0);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
       }
    }
}
