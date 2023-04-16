package ib.c;
import android.provider.ContactsContract;
import android.net.Uri;
import java.lang.String;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import java.io.File;
import android.net.Uri$Builder;
import java.lang.Object;
import android.provider.MediaStore$Images$Media;

public class c	// class@002194
{
    public static final Uri a;

    static {
       c.a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");
    }
    public static AssetFileDescriptor a(ContentResolver p0,Uri p1){
       if (c.h(p1)) {
          return p0.openAssetFileDescriptor(p1, "r");
       }
       return v1;
    }
    public static String b(ContentResolver p0,Uri p1){
       String str = null;
       if (c.h(p1)) {
          Cursor uCursor = p0.query(p1, null, null, null, null);
          if (uCursor != null && uCursor.moveToFirst()) {
             int columnIndex = uCursor.getColumnIndex("_data");
             if (columnIndex != -1) {
                str = uCursor.getString(columnIndex);
             }
          }
          if (uCursor != null) {
             uCursor.close();
          }
       }else if(c.i(p1)){
          str = p1.getPath();
       }
       return str;
    }
    public static String c(Uri p0){
       String str = (p0 == null)? null: p0.getScheme();
       return str;
    }
    public static Uri d(File p0){
       return Uri.fromFile(p0);
    }
    public static Uri e(int p0){
       return new Uri$Builder().scheme("res").path(String.valueOf(p0)).build();
    }
    public static boolean f(Uri p0){
       return ("asset").equals(c.c(p0));
    }
    public static boolean g(Uri p0){
       String str = p0.toString();
       boolean b = (str.startsWith(MediaStore$Images$Media.EXTERNAL_CONTENT_URI.toString()) || str.startsWith(MediaStore$Images$Media.INTERNAL_CONTENT_URI.toString()))? true: false;
       return b;
    }
    public static boolean h(Uri p0){
       return ("content").equals(c.c(p0));
    }
    public static boolean i(Uri p0){
       return ("file").equals(c.c(p0));
    }
    public static boolean j(Uri p0){
       return ("res").equals(c.c(p0));
    }
    public static boolean k(Uri p0){
       String str = c.c(p0);
       boolean b = (("https").equals(str) || ("http").equals(str))? true: false;
       return b;
    }
    public static Uri l(String p0){
       Uri uri = (p0 != null)? Uri.parse(p0): null;
       return uri;
    }
}
