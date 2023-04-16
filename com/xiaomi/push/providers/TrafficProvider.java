package com.xiaomi.push.providers.TrafficProvider;
import android.content.ContentProvider;
import java.lang.String;
import android.net.Uri;
import android.content.UriMatcher;
import android.content.ContentValues;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Object;
import xs8.a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ws8.b6;

public class TrafficProvider extends ContentProvider	// class@001141
{
    public SQLiteOpenHelper b;
    public static final Uri c;
    public static final UriMatcher d;

    static {
       TrafficProvider.c = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");
       UriMatcher uriMatcher = new UriMatcher(-1);
       TrafficProvider.d = uriMatcher;
       uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "traffic", 1);
       uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }
    public void TrafficProvider(){
       super();
    }
    public int bulkInsert(Uri p0,ContentValues[] p1){
       return 0;
    }
    public int delete(Uri p0,String p1,String[] p2){
       return 0;
    }
    public String getType(Uri p0){
       if (TrafficProvider.d.match(p0) == 1) {
          return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
       }
       throw new IllegalArgumentException("Unknown URI "+p0);
    }
    public Uri insert(Uri p0,ContentValues p1){
       return null;
    }
    public boolean onCreate(){
       this.b = new a(this.getContext());
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       Object c = a.c;
       _monitor_enter(c);
       if (TrafficProvider.d.match(p0) != 1) {
          throw new IllegalArgumentException("Unknown URI "+p0);
       }
       _monitor_exit(c);
       return this.b.getReadableDatabase().query("traffic", p1, p2, p3, null, null, p4);
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       if (TrafficProvider.d.match(p0) != 2) {
       }else if(p1 != null){
          String str = "imsi";
          if (p1.containsKey(str)) {
             b6.l(p1.getAsString(str));
          }
       }
       return 0;
    }
}
