package com.yxcorp.utility.m;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.lang.StringBuilder;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.database.SQLException;
import qkd.b;
import java.lang.UnsupportedOperationException;
import java.util.List;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.database.Cursor;
import com.yxcorp.utility.m$a;
import java.lang.Integer;
import android.database.sqlite.SQLiteDatabase$CursorFactory;

public final class m	// class@0009d1
{
    public String a;
    public String b;
    public String c;
    public final Context d;
    public SQLiteDatabase e;
    public int f;
    public boolean g;
    public static final int h = 2;

    public void m(Context p0,String p1,String p2){
       File uFile;
       String absolutePath;
       super();
       this.g = true;
       this.b = p1;
       this.c = p2;
       this.d = p0;
       this.a = p0.getDatabasePath(p1).getParentFile().getAbsolutePath();
       this.b();
       if (this.f()) {
          this.e.execSQL("create table if not exists "+this.c+"\("+"id integer primary key autoincrement,"+"groupid integer,"+"value text not null,"+"time timestamp not null default CURRENT_TIMESTAMP"+"\)");
          int version = this.e.getVersion();
          this.f = version;
          if (version != 2) {
             try{
                this.h();
             }catch(android.database.SQLException e3){
                Log.e("StorageUtil", "db upgrade exception", e3);
             }
          }
       }else {
          Log.d("StorageUtil", "StorageUtil.init openDB fail");
          throw new UnsupportedOperationException();
       }
    }
    public final void a(){
       if (this.g != null) {
          this.b();
       }
       return;
    }
    public final void b(){
       m te = this.e;
       if (te != null) {
          te.close();
       }
       this.e = null;
       return;
    }
    public synchronized List c(long p0,int p1,String p2){
       ArrayList uArrayList = new ArrayList();
       String[] stringArray = null;
       this.f();
       if (!TextUtils.isEmpty(p2)) {
          p2 = " and "+p2;
       }
       Cursor uCursor = this.e.rawQuery("select id,value,time from "+this.c+" where "+"groupid"+" = "+p0+p2+" order by "+"time"+" desc limit "+p1, stringArray);
       while (uCursor != null && uCursor.moveToNext()) {
          uArrayList.add(new m$a(uCursor.getInt(0), uCursor.getString(1), uCursor.getLong(2)));
       }
       Log.l("StorageUtil", "getDatasByGroupId success groupId="+p0+",cnt "+uArrayList.size());
       if (uCursor != null) {
          uCursor.close();
       }
       this.a();
       return uArrayList;
    }
    public synchronized String d(int p0){
       this.f();
       String[] stringArray = new String[]{"value"};
       String[] stringArray1 = new String[]{String.valueOf(p0)};
       Cursor uCursor = this.e.query(this.c, stringArray, "id=?", stringArray1, null, null, null, null);
       if (uCursor != null && uCursor.moveToNext()) {
          uCursor.close();
          this.a();
          return uCursor.getString(0);
       }else {
          Log.l("StorageUtil", "getDataById success id="+p0);
          if (uCursor != null) {
             uCursor.close();
          }
       label_0052 :
          this.a();
          return "";
       }
    }
    public synchronized List e(){
       ArrayList uArrayList = new ArrayList();
       this.f();
       String[] stringArray = new String[]{"id"};
       Cursor uCursor = this.e.query(this.c, stringArray, null, null, null, null, null);
       while (uCursor != null && uCursor.moveToNext()) {
          uArrayList.add(Integer.valueOf(uCursor.getInt(0)));
       }
       Log.l("StorageUtil", "getIds success,cnt "+uArrayList.size());
       if (uCursor != null) {
          uCursor.close();
       }
    label_0051 :
       this.a();
       return uArrayList;
    }
    public final boolean f(){
       if (this.e != null && this.g == null) {
          return true;
       }
       this.b();
       m ta = this.a;
       String str = ta+"/"+this.b;
       File uFile = new File(ta);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       File uFile1 = new File(str);
       if (!uFile1.exists()) {
          uFile1.createNewFile();
       }
       this.e = SQLiteDatabase.openOrCreateDatabase(uFile1, null);
       return true;
    }
    public void finalize(){
       super.finalize();
       this.b();
    }
    public synchronized int g(int p0){
       this.f();
       String[] stringArray = new String[]{String.valueOf(p0)};
       int i = this.e.delete(this.c, "id = ?", stringArray);
       Log.l("StorageUtil", "removeDataById success id="+p0+",cnt "+i);
       this.a();
       return i;
    }
    public final void h(){
       String str2;
       int version = this.e.getVersion();
       this.f = version;
       String str = "isDelayedLog";
       String str1 = 1;
       if (version) {
          if (version != str1) {
          label_0124 :
             return;
          }
       }else {
          str2 = "alter table \""+this.c+"\" add column \""+str+"\" integer default 0;";
          Log.g("StorageUtil", "upgrade0To1 : "+str2);
          this.e.execSQL(str2);
          this.f = str1;
          this.e.setVersion(str1);
       }
       this.e.execSQL("alter table "+this.c+" rename to "+"StorageUtil_temp"+";");
       str2 = "create table if not exists "+this.c+"\(id integer primary key autoincrement,groupid long,value text not null,time timestamp not null default CURRENT_TIMESTAMP,isDelayedLog integer default 0\)";
       Log.g("StorageUtil", "createNewTableForVersion2£º"+str2);
       this.e.execSQL(str2);
       str2 = "insert into "+this.c+" "+"select "+"null, "+"groupid"+", "+"value"+", "+"time"+", "+str+" "+"from "+"StorageUtil_temp"+";";
       Log.g("StorageUtil", "upgrade1To2 : "+str2);
       this.e.execSQL(str2);
       this.e.execSQL("drop table StorageUtil_temp;");
       this.f = 2;
       this.e.setVersion(2);
       goto label_0124 ;
    }
}
