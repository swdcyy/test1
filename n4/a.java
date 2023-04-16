package n4.a;
import android.content.ContentResolver;
import android.net.Uri;
import java.lang.String;
import android.database.Cursor;
import android.content.Context;
import java.lang.Exception;
import java.lang.Object;

public class a	// class@0026b7
{

    public static String a(ContentResolver p0,Uri p1){
       Cursor uCursor = p0.query(p1, null, null, null, null);
       uCursor.moveToFirst();
       int columnIndex = uCursor.getColumnIndex("_display_name");
       if (columnIndex < 0) {
          return null;
       }
       uCursor.close();
       return uCursor.getString(columnIndex);
    }
    public static String b(Context p0,Uri p1,String p2,String[] p3){
       Cursor uCursor;
       String[] stringArray = new String[]{"_data"};
       String str = null;
       try{
          uCursor = p0.getContentResolver().query(p1, stringArray, p2, p3, null);
          if (uCursor != null && uCursor.moveToFirst()) {
             str = uCursor.getString(uCursor.getColumnIndexOrThrow("_data"));
          }
          if (uCursor != null) {
             uCursor.close();
          }
          return str;
       }catch(java.lang.Exception e9){
          uCursor = str;
       }catch(java.lang.Exception e9){
       }
       e9.printStackTrace();
       if (uCursor) {
          uCursor.close();
       }
       return str;
    }
    public static boolean c(Uri p0){
       return ("com.android.providers.downloads.documents").equals(p0.getAuthority());
    }
    public static boolean d(Uri p0){
       return ("com.android.externalstorage.documents").equals(p0.getAuthority());
    }
    public static boolean e(Uri p0){
       return ("com.google.android.apps.photos.content").equals(p0.getAuthority());
    }
    public static boolean f(Uri p0){
       return ("com.android.providers.media.documents").equals(p0.getAuthority());
    }
}
