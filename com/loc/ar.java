package com.loc.ar;
import java.util.HashMap;
import android.content.Context;
import com.loc.aq;
import java.lang.Object;
import com.loc.au;
import java.lang.String;
import java.lang.Throwable;
import com.loc.as;
import android.content.ContentValues;
import java.lang.Class;
import java.lang.reflect.Field;
import java.util.Map;
import android.database.Cursor;
import java.lang.reflect.Constructor;
import com.loc.at;
import java.lang.annotation.Annotation;
import java.lang.Long;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Short;
import android.database.sqlite.SQLiteDatabase;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalAccessException;
import android.database.sqlite.SQLiteOpenHelper;
import com.loc.ak;
import java.util.List;
import java.util.ArrayList;

public final class ar	// class@001376
{
    public au a;
    public SQLiteDatabase b;
    public aq c;
    public static Map d;

    static {
       ar.d = new HashMap();
    }
    public void ar(Context p0,aq p1){
       super();
       this.a = new au(p0.getApplicationContext(), p1.a(), p1);
       this.c = p1;
       return;
    }
    public static ContentValues a(Object p0,as p1){
       ContentValues uContentValu = new ContentValues();
       Field[] uFieldArray = ar.a(p0.getClass(), p1.b());
       int len = uFieldArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uFieldArray[i];
          oobject.setAccessible(true);
          ar.a(p0, oobject, uContentValu);
       }
       return uContentValu;
    }
    public static synchronized aq a(Class p0){
       _monitor_enter(ar.class);
       if (ar.d.get(p0) == null) {
          ar.d.put(p0, p0.newInstance());
       }
       _monitor_exit(ar.class);
       return ar.d.get(p0);
    }
    public static Object a(Cursor p0,Class p1,as p2){
       Short shortx;
       Field[] uFieldArray = ar.a(p1, p2.b());
       int i = 0;
       Class[] uClassArray = new Class[i];
       Constructor declaredCons = p1.getDeclaredConstructor(uClassArray);
       declaredCons.setAccessible(true);
       Object[] objArray = new Object[i];
       declaredCons = declaredCons.newInstance(objArray);
       int len = uFieldArray.length;
       while (i < len) {
          object oobject = uFieldArray[i];
          oobject.setAccessible(true);
          Annotation annotation = oobject.getAnnotation(at.class);
          if (annotation != null) {
             int columnIndex = p0.getColumnIndex(annotation.a());
             switch (annotation.b()){
                 case 1:
                   shortx = Short.valueOf(p0.getShort(columnIndex));
                label_0074 :
                   oobject.set(declaredCons, shortx);
                   break;
                 case 2:
                   shortx = Integer.valueOf(p0.getInt(columnIndex));
                   goto label_0074 ;
                   break;
                 case 3:
                   shortx = Float.valueOf(p0.getFloat(columnIndex));
                   goto label_0074 ;
                   break;
                 case 4:
                   shortx = Double.valueOf(p0.getDouble(columnIndex));
                   goto label_0074 ;
                   break;
                 case 5:
                   shortx = Long.valueOf(p0.getLong(columnIndex));
                   goto label_0074 ;
                   break;
                 case 6:
                   shortx = p0.getString(columnIndex);
                   goto label_0074 ;
                   break;
                 case 7:
                   oobject.set(declaredCons, p0.getBlob(columnIndex));
                   break;
                 default:
             }
          }
          i = i + 1;
       }
       return declaredCons;
    }
    public static String a(as p0){
       if (p0 == null) {
          return null;
       }
       return p0.a();
    }
    public static void a(SQLiteDatabase p0,Object p1){
       as uoas = ar.b(p1.getClass());
       String str = ar.a(uoas);
       if (TextUtils.isEmpty(str)) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.insert(str, null, ar.a(p1, uoas));
       return;
    }
    public static void a(Object p0,Field p1,ContentValues p2){
       Annotation annotation = p1.getAnnotation(at.class);
       if (annotation == null) {
          return;
       }
       try{
          switch (annotation.b()){
              case 1:
                p2.put(annotation.a(), Short.valueOf(p1.getShort(p0)));
                return;
              case 2:
                p2.put(annotation.a(), Integer.valueOf(p1.getInt(p0)));
                return;
              case 3:
                p2.put(annotation.a(), Float.valueOf(p1.getFloat(p0)));
                return;
              case 4:
                p2.put(annotation.a(), Double.valueOf(p1.getDouble(p0)));
                return;
              case 5:
                p2.put(annotation.a(), Long.valueOf(p1.getLong(p0)));
                return;
              case 6:
                p2.put(annotation.a(), p1.get(p0));
                return;
              case 7:
                p2.put(annotation.a(), p1.get(p0));
                break;
              default:
          }
       }catch(java.lang.IllegalAccessException e2){
          e2.printStackTrace();
       }
       return;
    }
    public static Field[] a(Class p0,boolean p1){
       if (p0 == null) {
          return null;
       }
       if (p1) {
          return p0.getSuperclass().getDeclaredFields();
       }
       return p0.getDeclaredFields();
    }
    public static as b(Class p0){
       Annotation annotation = p0.getAnnotation(as.class);
       int i = (annotation != null)? 1: 0;
       if (!i) {
          return null;
       }else {
          return annotation;
       }
    }
    public final SQLiteDatabase a(){
       if (this.b == null) {
          this.b = this.a.getReadableDatabase();
       }
       return this.b;
    }
    public final List a(String p0,Class p1){
       return this.b(p0, p1);
    }
    public final void a(Object p0){
       this.b(p0);
    }
    public final void a(Object p0,String p1){
       ar tc = this.c;
       _monitor_enter(tc);
       List list = this.a(p1, p0.getClass());
       if (list == null || !list.size()) {
          this.a(p0);
       }else {
          this.b(p1, p0);
       }
       _monitor_exit(tc);
       return;
    }
    public final void a(String p0,Object p1){
       ar tc = this.c;
       _monitor_enter(tc);
       if (p1 == null) {
          _monitor_exit(tc);
          return;
       }else {
          as uoas = ar.b(p1.getClass());
          String str = ar.a(uoas);
          if (TextUtils.isEmpty(str)) {
             _monitor_exit(tc);
             return;
          }else {
             p1 = ar.a(p1, uoas);
             SQLiteDatabase sQLiteDataba = this.b();
             this.b = sQLiteDataba;
             if (sQLiteDataba == null) {
                _monitor_exit(tc);
                return;
             }else {
                sQLiteDataba.update(str, p1, p0, null);
                ar tb = this.b;
                if (tb != null) {
                   tb.close();
                   this.b = null;
                }
                _monitor_exit(tc);
                return;
             }
          }
       }
    }
    public final SQLiteDatabase b(){
       ar tb = this.b;
       if (tb == null || tb.isReadOnly()) {
          tb = this.b;
          if (tb != null) {
             tb.close();
          }
          this.b = this.a.getWritableDatabase();
       }
       return this.b;
    }
    public final List b(String p0,Class p1){
       ar tb;
       ar tc = this.c;
       _monitor_enter(tc);
       ArrayList uArrayList = new ArrayList();
       as uoas = ar.b(p1);
       String str = ar.a(uoas);
       if (this.b == null) {
          this.b = this.a();
       }
       if (this.b != null && (TextUtils.isEmpty(str) || p0 == null)) {
          _monitor_exit(tc);
          return uArrayList;
       }else {
          Cursor uCursor = this.b.query(str, null, p0, null, null, null, null);
          if (uCursor == null) {
             this.b.close();
             this.b = null;
             if (uCursor != null) {
                uCursor.close();
             }
             tb = this.b;
             if (tb != null) {
                tb.close();
                this.b = null;
             }
             _monitor_exit(tc);
             return uArrayList;
          }else {
             while (uCursor.moveToNext()) {
                uArrayList.add(ar.a(uCursor, p1, uoas));
             }
             uCursor.close();
             tb = this.b;
             if (tb != null) {
                tb.close();
                this.b = null;
             }
          label_00b6 :
             _monitor_exit(tc);
             return uArrayList;
          }
       }
    }
    public final void b(Object p0){
       ar tc = this.c;
       _monitor_enter(tc);
       SQLiteDatabase sQLiteDataba = this.b();
       this.b = sQLiteDataba;
       if (sQLiteDataba == null) {
          _monitor_exit(tc);
          return;
       }else {
          ar.a(sQLiteDataba, p0);
          p0 = this.b;
          if (p0 != null) {
             p0.close();
             this.b = null;
          }
          _monitor_exit(tc);
          return;
       }
    }
    public final void b(String p0,Object p1){
       this.a(p0, p1);
    }
}
