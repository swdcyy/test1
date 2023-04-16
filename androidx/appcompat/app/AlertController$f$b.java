package androidx.appcompat.app.AlertController$f$b;
import android.widget.CursorAdapter;
import androidx.appcompat.app.AlertController$f;
import android.content.Context;
import android.database.Cursor;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.AlertController;
import java.lang.String;
import android.view.View;
import android.widget.CheckedTextView;
import java.lang.CharSequence;
import android.widget.ListView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import ag6.a;

public class AlertController$f$b extends CursorAdapter	// class@000561
{
    public final int b;
    public final int c;
    public final AlertController$RecycleListView d;
    public final AlertController e;
    public final AlertController$f f;

    public void AlertController$f$b(AlertController$f p0,Context p1,Cursor p2,boolean p3,AlertController$RecycleListView p4,AlertController p5){
       this.f = p0;
       this.d = p4;
       this.e = p5;
       super(p1, p2, p3);
       Cursor cursor = this.getCursor();
       this.b = cursor.getColumnIndexOrThrow(p0.L);
       this.c = cursor.getColumnIndexOrThrow(p0.M);
    }
    public void bindView(View p0,Context p1,Cursor p2){
       p0.findViewById(0x1020014).setText(p2.getString(this.b));
       AlertController$f$b td = this.d;
       int position = p2.getPosition();
       boolean b = true;
       if (p2.getInt(this.c) == b) {
       }else {
          b = false;
       }
       td.setItemChecked(position, b);
       return;
    }
    public View newView(Context p0,Cursor p1,ViewGroup p2){
       return a.c(this.f.b, this.e.M, p2, false);
    }
}
