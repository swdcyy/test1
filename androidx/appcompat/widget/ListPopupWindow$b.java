package androidx.appcompat.widget.ListPopupWindow$b;
import android.widget.AdapterView$OnItemSelectedListener;
import androidx.appcompat.widget.ListPopupWindow;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import androidx.appcompat.widget.DropDownListView;

public class ListPopupWindow$b implements AdapterView$OnItemSelectedListener	// class@000606
{
    public final ListPopupWindow b;

    public void ListPopupWindow$b(ListPopupWindow p0){
       this.b = p0;
       super();
    }
    public void onItemSelected(AdapterView p0,View p1,int p2,long p3){
       if (p2 != -1) {
          ListPopupWindow d = this.b.d;
          if (d != null) {
             d.setListSelectionHidden(false);
          }
       }
       return;
    }
    public void onNothingSelected(AdapterView p0){
    }
}
