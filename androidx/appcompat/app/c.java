package androidx.appcompat.app.c;
import android.widget.AdapterView$OnItemSelectedListener;
import androidx.appcompat.app.ActionBar$b;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;

public class c implements AdapterView$OnItemSelectedListener	// class@000588
{
    public final ActionBar$b b;

    public void c(ActionBar$b p0){
       super();
       this.b = p0;
    }
    public void onItemSelected(AdapterView p0,View p1,int p2,long p3){
       c tb = this.b;
       if (tb != null) {
          tb.a(p2, p3);
       }
       return;
    }
    public void onNothingSelected(AdapterView p0){
    }
}
