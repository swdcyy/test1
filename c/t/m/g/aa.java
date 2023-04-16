package c.t.m.g.aa;
import android.content.Context;
import java.lang.Object;
import android.database.Cursor;
import java.lang.String;
import c.t.m.g.bt;
import c.t.m.g.x$a;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Throwable;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.pm.ProviderInfo;

public class aa	// class@000bb2
{
    public final String a;
    public Context b;

    public void aa(Context p0){
       super();
       this.a = "MeizuDeviceIDHelper";
       this.b = p0;
    }
    public final String a(Cursor p0){
       String str = null;
       if (p0 == null || p0.isClosed()) {
          bt.a("MEIZU :", "oaid null");
          return str;
       }else {
          p0.moveToFirst();
          int columnIndex = p0.getColumnIndex("value");
          if (columnIndex > 0) {
             str = p0.getString(columnIndex);
          }
          columnIndex = p0.getColumnIndex("code");
          if (columnIndex > 0) {
             p0.getInt(columnIndex);
          }
          columnIndex = p0.getColumnIndex("expired");
          if (columnIndex > 0) {
             p0.getLong(columnIndex);
          }
          return str;
       }
    }
    public void a(x$a p0){
       String str = "MeizuDeviceIDHelper";
       try{
          this.b.getPackageManager().getPackageInfo("com.meizu.flyme.openidsdk", 0);
       }catch(java.lang.Exception e2){
          bt.a(str, "getID", e2);
       }
       String[] stringArray = new String[]{"oaid"};
       Cursor uCursor = this.b.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, stringArray, null);
       String str1 = this.a(uCursor);
       boolean b = this.a();
       if (p0 != null) {
          p0.a(str1, b);
       }
       uCursor.close();
       return;
    }
    public boolean a(){
       boolean b = false;
       try{
          PackageManager packageManag = this.b.getPackageManager();
          if (packageManag != null && packageManag.resolveContentProvider("com.meizu.flyme.openidsdk", b) != null) {
             return true;
          }
       }catch(java.lang.Exception e1){
          bt.a("MeizuDeviceIDHelper", "isMeizuSupport", e1);
       }
       return b;
    }
}
