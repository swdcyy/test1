package androidx.appcompat.app.AlertController$h;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.lang.CharSequence;
import java.lang.Object;

public class AlertController$h extends ArrayAdapter	// class@000567
{

    public void AlertController$h(Context p0,int p1,int p2,CharSequence[] p3){
       super(p0, p1, p2, p3);
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public boolean hasStableIds(){
       return true;
    }
}
