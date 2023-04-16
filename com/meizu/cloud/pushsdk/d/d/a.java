package com.meizu.cloud.pushsdk.d.d.a;
import com.meizu.cloud.pushsdk.d.d.d;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.d.b;
import java.util.Map;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.lang.Exception;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Long;
import com.meizu.cloud.pushsdk.d.a.a;
import com.meizu.cloud.pushsdk.d.f.c;
import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.DatabaseUtils;
import com.meizu.cloud.pushsdk.d.b.c;
import java.util.LinkedList;
import java.util.Iterator;
import com.meizu.cloud.pushsdk.d.a.c;

public class a implements d	// class@001519
{
    public SQLiteDatabase b;
    public final b c;
    public final String[] d;
    public long e;
    public final int f;
    public static final String a = "a";

    public void a(Context p0,int p1){
       super();
       String[] stringArray = new String[]{"id","eventData","dateCreated"};
       this.d = stringArray;
       this.e = -1;
       this.c = b.a(p0, this.a(p0));
       this.b();
       this.f = p1;
    }
    public static Map a(byte[] p0){
       try{
          ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
          ObjectInputStream objectInputS = new ObjectInputStream(uByteArrayIn);
          objectInputS.close();
          uByteArrayIn.close();
          return objectInputS.readObject();
       }catch(java.lang.ClassNotFoundException e2){
       }catch(java.io.IOException e2){
       }
       e2.printStackTrace();
       return null;
    }
    public static byte[] a(Map p0){
       try{
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          ObjectOutputStream objectOutput = new ObjectOutputStream(uByteArrayOu);
          objectOutput.writeObject(p0);
          objectOutput.close();
          uByteArrayOu.close();
          return uByteArrayOu.toByteArray();
       }catch(java.io.IOException e2){
          e2.printStackTrace();
          return null;
       }
    }
    public final String a(Context p0){
       String processName = MzSystemUtils.getProcessName(p0);
       if (TextUtils.isEmpty(processName)) {
          return "PushEvents.db";
       }
       return processName+"_"+"PushEvents.db";
    }
    public List a(int p0){
       return this.a(null, "id ASC LIMIT "+p0);
    }
    public List a(String p0,String p1){
       ArrayList uArrayList = new ArrayList();
       if (this.e()) {
          Cursor uCursor = this.b.query("events", this.d, p0, null, null, null, p1);
          uCursor.moveToFirst();
          while (!uCursor.isAfterLast()) {
             HashMap hashMap = new HashMap(4);
             hashMap.put("id", Long.valueOf(uCursor.getLong(0)));
             hashMap.put("eventData", a.a(uCursor.getBlob(1)));
             hashMap.put("dateCreated", uCursor.getString(2));
             uCursor.moveToNext();
             uArrayList.add(hashMap);
          }
          uCursor.close();
       }
       return uArrayList;
    }
    public void a(a p0){
       this.b(p0);
    }
    public boolean a(){
       return this.e();
    }
    public boolean a(long p0){
       int i = (this.e())? this.b.delete("events", "id="+p0, null): -1;
       int i1 = 0;
       Object[] objArray = new Object[i1];
       c.b(a.a, "Removed event from database: "+p0, objArray);
       if (i == 1) {
          i1 = true;
       }
       return i1;
    }
    public long b(a p0){
       if (this.e()) {
          ContentValues uContentValu = new ContentValues(2);
          uContentValu.put("eventData", a.a(p0.a()));
          this.e = this.b.insert("events", null, uContentValu);
       }
       Object[] objArray = new Object[0];
       c.b(a.a, "Added event to database: "+this.e, objArray);
       return this.e;
    }
    public void b(){
       if (!this.e()) {
          try{
             SQLiteDatabase writableData = this.c.getWritableDatabase();
             this.b = writableData;
             writableData.enableWriteAheadLogging();
          }catch(java.lang.Exception e0){
             Object[] objArray = new Object[0];
             c.a(a.a, " open database error "+e0.getMessage(), objArray);
          }
       }
    }
    public long c(){
       long l = (this.e())? DatabaseUtils.queryNumEntries(this.b, "events"): 0;
       return l;
    }
    public c d(){
       LinkedList linkedList = new LinkedList();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.a(this.f).iterator();
       while (iterator.hasNext()) {
          Map map = iterator.next();
          c uoc = new c();
          uoc.a(map.get("eventData"));
          linkedList.add(map.get("id"));
          uArrayList.add(uoc);
       }
       return new c(uArrayList, linkedList);
    }
    public boolean e(){
       a tb = this.b;
       boolean b = (tb != null && tb.isOpen())? true: false;
       return b;
    }
}
