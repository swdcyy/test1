package c.t.m.g.ae;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;

public class ae	// class@000bb8
{
    public String a;
    public final String b;
    public Context c;
    public boolean d;

    public void ae(Context p0){
       super();
       this.b = "VivoDeviceIDHelper";
       this.d = false;
       this.a = null;
       this.c = p0;
    }
    public String a(){
       Cursor uCursor = this.c.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
       String str = null;
       if (uCursor != null) {
          if (uCursor.moveToNext()) {
             str = uCursor.getString(uCursor.getColumnIndex("value"));
          }
          uCursor.close();
       }
       return str;
    }
}
