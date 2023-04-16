package com.tencent.open.b.g;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.String;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import com.tencent.open.utils.f;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.lang.Object;
import java.io.Serializable;
import java.lang.Throwable;
import com.tencent.open.log.SLog;
import android.content.ContentValues;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class g extends SQLiteOpenHelper	// class@000f4a
{
    public static final String[] a;
    public static g b;

    static {
       String[] stringArray = new String[]{"key"};
       g.a = stringArray;
    }
    public void g(Context p0){
       super(p0, "sdk_report.db", null, 2);
    }
    public static synchronized g a(){
       _monitor_enter(g.class);
       if (g.b == null) {
          g.b = new g(f.a());
       }
       _monitor_exit(g.class);
       return g.b;
    }
    public synchronized List a(String p0){
       ObjectInputStream objectInputS;
       Serializable serializable;
       List list = Collections.synchronizedList(new ArrayList());
       if (TextUtils.isEmpty(p0)) {
          return list;
       }
       SQLiteDatabase readableData = this.getReadableDatabase();
       if (readableData == null) {
          return list;
       }
       int i = 0;
       try{
          String[] stringArray = new String[]{p0};
          Cursor uCursor = readableData.query("via_cgi_report", null, "type = ?", stringArray, null, null, null);
          if (uCursor != null && uCursor.getCount() > 0) {
             uCursor.moveToFirst();
             do {
                byte[] blob = uCursor.getBlob(uCursor.getColumnIndex("blob"));
                try{
                   ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(blob);
                   try{
                      objectInputS = new ObjectInputStream(uByteArrayIn);
                      serializable = objectInputS.readObject();
                      objectInputS.close();
                      try{
                         uByteArrayIn.close();
                      }catch(java.io.IOException e0){
                      }
                   }catch(java.lang.Exception e0){
                      if (objectInputS) {
                         objectInputS.close();
                      }
                      uByteArrayIn.close();
                      serializable = i;
                   }
                }catch(java.lang.Exception e0){
                   try{
                      objectInputS = i;
                      goto label_006a ;
                   }catch(java.io.IOException e0){
                   }catch(java.lang.Exception e2){
                   label_0082 :
                      Cursor uCursor1 = uCursor;
                   }catch(java.io.IOException e0){
                   }
                }catch(java.io.IOException e0){
                }catch(java.lang.Exception e2){
                }
                SLog.e("openSDK_LOG.ReportDatabaseHelper", "getReportItemFromDB has exception.", e2);
                if (i) {
                   i.close();
                }
             } while (!uCursor.moveToNext());
          label_0085 :
             if (uCursor != null) {
                uCursor.close();
             }
          }else {
             goto label_0085 ;
          }
          readableData.close();
          return list;
       }catch(java.lang.Exception e2){
          goto label_0091 ;
       }catch(java.lang.Exception e2){
       }
    }
    public synchronized void a(String p0,List p1){
       int i2;
       ObjectOutputStream objectOutput;
       int i = p1.size();
       if (!i) {
          return;
       }
       if (i > 20) {
          i = 20;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }else {
          this.b(p0);
          SQLiteDatabase writableData = this.getWritableDatabase();
          if (writableData == null) {
             return;
          }else {
             try{
                writableData.beginTransaction();
                ContentValues uContentValu = new ContentValues();
                for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                   Serializable serializable = p1.get(i1);
                   if (serializable != null) {
                      uContentValu.put("type", p0);
                      ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(512);
                      try{
                         i2 = 0;
                         try{
                            objectOutput = new ObjectOutputStream(uByteArrayOu);
                            try{
                               objectOutput.writeObject(serializable);
                               objectOutput.close();
                            }catch(java.io.IOException e0){
                            }catch(java.lang.Exception e0){
                               SLog.e("openSDK_LOG.ReportDatabaseHelper", "saveReportItemToDB has exception.");
                               writableData.endTransaction();
                            }
                            writableData.close();
                            return;
                         }catch(java.io.IOException e0){
                            if (objectOutput) {
                               objectOutput.close();
                            }
                         }
                      }catch(java.io.IOException e0){
                         try{
                            objectOutput = i2;
                            goto label_0060 ;
                         }catch( e0){
                         }
                      }
                      try{
                         uByteArrayOu.close();
                         uContentValu.put("blob", uByteArrayOu.toByteArray());
                         writableData.insert("via_cgi_report", i2, uContentValu);
                      }catch(java.io.IOException e0){
                      }
                   }
                   uContentValu.clear();
                }
                writableData.setTransactionSuccessful();
                writableData.endTransaction();
                goto label_0080 ;
             }catch(java.lang.Exception e0){
             }
          }
       }
    }
    public synchronized void b(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       SQLiteDatabase writableData = this.getWritableDatabase();
       if (writableData == null) {
          return;
       }
       try{
          String[] stringArray = new String[]{p0};
          writableData.delete("via_cgi_report", "type = ?", stringArray);
       }catch(java.lang.Exception e6){
          SLog.e("openSDK_LOG.ReportDatabaseHelper", "clearReportItem has exception.", e6);
       }
       writableData.close();
       return;
    }
    public void onCreate(SQLiteDatabase p0){
       p0.execSQL("CREATE TABLE IF NOT EXISTS via_cgi_report\( _id INTEGER PRIMARY KEY,key TEXT,type TEXT,blob BLOB\);");
    }
    public void onUpgrade(SQLiteDatabase p0,int p1,int p2){
       p0.execSQL("DROP TABLE IF EXISTS via_cgi_report");
       this.onCreate(p0);
    }
}
