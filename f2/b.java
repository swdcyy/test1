package f2.b;
import android.widget.Filter;
import f2.b$a;
import java.lang.Object;
import java.lang.CharSequence;
import android.database.Cursor;
import android.widget.Filter$FilterResults;

public class b extends Filter	// class@001fb3
{
    public b$a a;

    public void b(b$a p0){
       super();
       this.a = p0;
    }
    public CharSequence convertResultToString(Object p0){
       return this.a.a(p0);
    }
    public Filter$FilterResults performFiltering(CharSequence p0){
       Cursor uCursor = this.a.c(p0);
       Filter$FilterResults uFilterResul = new Filter$FilterResults();
       if (uCursor != null) {
          uFilterResul.count = uCursor.getCount();
          uFilterResul.values = uCursor;
       }else {
          uFilterResul.count = 0;
          uFilterResul.values = 0;
       }
       return uFilterResul;
    }
    public void publishResults(CharSequence p0,Filter$FilterResults p1){
       Cursor cursor = this.a.getCursor();
       p1 = p1.values;
       if (p1 != null && p1 != cursor) {
          this.a.b(p1);
       }
       return;
    }
}
