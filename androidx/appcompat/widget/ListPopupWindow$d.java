package androidx.appcompat.widget.ListPopupWindow$d;
import android.database.DataSetObserver;
import androidx.appcompat.widget.ListPopupWindow;

public class ListPopupWindow$d extends DataSetObserver	// class@000608
{
    public final ListPopupWindow a;

    public void ListPopupWindow$d(ListPopupWindow p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       if (this.a.d()) {
          this.a.show();
       }
       return;
    }
    public void onInvalidated(){
       this.a.dismiss();
    }
}
