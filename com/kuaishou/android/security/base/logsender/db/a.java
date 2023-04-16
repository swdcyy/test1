package com.kuaishou.android.security.base.logsender.db.a;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.android.security.base.logsender.db.a$a;
import com.kuaishou.android.security.base.cloudconfig.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import java.lang.StringBuilder;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.android.security.base.logsender.info.a;
import android.content.ContentValues;
import java.lang.Long;
import com.kuaishou.android.security.KSecurity;
import android.util.Base64;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;

public class a	// class@000ee2
{
    public a$a a;
    public c b;
    public SQLiteDatabase c;
    public Context d;
    public int e;
    public static a r;

    public void a(Context p0){
       super();
       this.e = 100;
       this.d = p0;
       this.a = new a$a(this, p0);
       this.b = new c(p0);
       this.e();
    }
    public static synchronized a a(Context p0){
       _monitor_enter(a.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(a.class);
          return obj;
       }else if(a.r == null){
          a.r = new a(p0);
       }
       _monitor_exit(a.class);
       return a.r;
    }
    public int a(){
       String str = "f";
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = System.currentTimeMillis();
       String[] stringArray = new String[]{String.valueOf((l - (long)(this.b.k() * 0x5265c00)))};
       int i = this.c.delete("r", "\(d <= ? or \(d < \("+l+"-"+str+"*"+0x36ee80+"\) and "+str+"!= 0\)\) and "+"i"+" != 5 ", stringArray);
       return i;
    }
    public int a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       String[] stringArray = new String[]{p0+""};
       int i = this.c.delete("r", "a=?", stringArray);
       return i;
    }
    public int a(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.c.beginTransaction();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.a(iterator.next().intValue());
       }
       a tc = this.c;
       try{
          tc.setTransactionSuccessful();
          this.c.endTransaction();
       }catch(java.lang.Exception e3){
          d.a(e3);
       }
       return -1;
    }
    public long a(a p0){
       String str;
       ContentValues obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = new ContentValues();
       obj.put("b", p0.b);
       obj.put("c", Integer.valueOf(p0.c));
       obj.put("d", Long.valueOf(p0.e));
       obj.put("e", Integer.valueOf(p0.g));
       obj.put("g", Integer.valueOf(p0.f));
       obj.put("f", Integer.valueOf(p0.h));
       obj.put("i", Integer.valueOf(p0.i));
       obj.put("j", p0.j);
       try{
          p0 = p0.d;
          str = Base64.encodeToString(KSecurity.uEncrypt(p0.getBytes()), 0);
       }catch(java.lang.Exception e1){
          d.a(e1);
       }
       long l = -1;
       if (TextUtils.isEmpty(str)) {
          return l;
       }
       obj.put("h", str);
       l = this.c.insert("r", null, obj);
       return l;
    }
    public List a(boolean p0,int p1){
       String obj;
       a tc;
       String str = "r";
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ArrayList uArrayList = new ArrayList();
       long l = System.currentTimeMillis();
       StringBuilder str1 = (p0)? "\(d < \("+l+"-"+"f"+"*"+0x36ee80+"\) and "+"f"+"!= 0\)": "d<="+(l - 0xf731400);
       String str2 = str1;
       if (p1 == 2) {
          tc = this.c;
          uoa = this.e;
       }else {
          this.b.q();
          tc = this.c;
          uoa = this.e;
       }
       String str3 = Integer.toString(uoa);
       uoa = tc;
       Cursor uCursor = uoa.query(str, null, str2, null, null, null, "d desc", str3);
       if (uCursor != null) {
          while (uCursor.moveToNext()) {
             tc = new a();
             tc.a = uCursor.getInt(uCursor.getColumnIndex("a"));
             tc.b = uCursor.getString(uCursor.getColumnIndex("b"));
             tc.c = uCursor.getInt(uCursor.getColumnIndex("c"));
             tc.e = uCursor.getLong(uCursor.getColumnIndex("d"));
             tc.f = uCursor.getInt(uCursor.getColumnIndex("g"));
             tc.g = uCursor.getInt(uCursor.getColumnIndex("e"));
             tc.h = uCursor.getInt(uCursor.getColumnIndex("f"));
             tc.i = uCursor.getInt(uCursor.getColumnIndex("i"));
             tc.j = uCursor.getString(uCursor.getColumnIndex("j"));
             obj = uCursor.getString(uCursor.getColumnIndex("h"));
             try{
                str = 0;
                obj = new String(KSecurity.uDecrypt(Base64.decode(obj, str)));
             }catch(java.lang.Exception e1){
                d.a(e1);
             }
             tc.d = obj;
             uArrayList.add(tc);
          }
       }
       if (uCursor != null) {
          try{
             uCursor.close();
          }catch(java.lang.Exception e12){
             d.a(e12);
          }
       }
    }
    public int b(){
       Cursor uCursor;
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       try{
          uCursor = this.c.query("r", null, null, null, null, null, null, null);
          if (uCursor != null) {
             i = uCursor.getCount();
          label_002a :
             if (uCursor != null) {
             }
          }else {
             goto label_002a ;
          }
       }catch(java.lang.Exception e2){
          d.a(e2);
          if (uCursor) {
          }
       }
       try{
          uCursor.close();
       }catch(java.lang.Exception e1){
          d.a(e1);
       }
    }
    public List b(int p0){
       String obj1;
       a c;
       Object obj = this;
       int i = p0;
       String str = "r";
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoa, "6");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       ArrayList uArrayList = new ArrayList();
       long l = System.currentTimeMillis();
       int i1 = 0x36ee80;
       int i2 = obj.b.h() * i1;
       String str1 = "\) or ";
       String str2 = "*";
       String str3 = "-";
       String str4 = "\(d <= \(";
       obj1 = (i == 2)? str4+l+str3+"e"+str2+i1+str1+"e"+"=0 \)": str4+l+str3+"e"+str2+i1+str1+"e"+"=0 \) and \("+"g"+"!="+2+" or "+"d"+"<="+(l - (long)i2)+"\)";
       String str5 = obj1;
       if (i == 2) {
          c = obj.c;
          uoa = obj.e;
       }else {
          obj.b.q();
          c = obj.c;
          uoa = obj.e;
       }
       str4 = Integer.toString(uoa);
       uoa = c;
       Cursor uCursor = uoa.query(str, null, str5, null, null, null, "d desc", str4);
       if (uCursor != null) {
          while (uCursor.moveToNext()) {
             uoa = new a();
             uoa.a = uCursor.getInt(uCursor.getColumnIndex("a"));
             uoa.b = uCursor.getString(uCursor.getColumnIndex("b"));
             uoa.c = uCursor.getInt(uCursor.getColumnIndex("c"));
             uoa.e = uCursor.getLong(uCursor.getColumnIndex("d"));
             uoa.f = uCursor.getInt(uCursor.getColumnIndex("g"));
             uoa.g = uCursor.getInt(uCursor.getColumnIndex("e"));
             uoa.h = uCursor.getInt(uCursor.getColumnIndex("f"));
             uoa.i = uCursor.getInt(uCursor.getColumnIndex("i"));
             uoa.j = uCursor.getString(uCursor.getColumnIndex("j"));
             str = uCursor.getString(uCursor.getColumnIndex("h"));
             try{
                c = 0;
                str = new String(KSecurity.uDecrypt(Base64.decode(str, c)));
             }catch(java.lang.Exception e0){
                d.a(e0);
             }
             uoa.d = str;
             uArrayList.add(uoa);
          }
       }
       if (uCursor != null) {
          try{
             uCursor.close();
          }catch(java.lang.Exception e0){
             d.a(e0);
          }
       }
    }
    public SQLiteDatabase c(){
       return this.c;
    }
    public List d(){
       int i;
       ArrayList obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Cursor uCursor = this.c.query("r", null, "i=5", null, null, null, "d desc", Integer.toString(this.e));
       if (uCursor != null) {
          d.b("getReportPriorData "+uCursor.getCount());
          while (uCursor.moveToNext()) {
             a uoa = new a();
             uoa.a = uCursor.getInt(uCursor.getColumnIndex("a"));
             uoa.b = uCursor.getString(uCursor.getColumnIndex("b"));
             uoa.c = uCursor.getInt(uCursor.getColumnIndex("c"));
             uoa.e = uCursor.getLong(uCursor.getColumnIndex("d"));
             uoa.f = uCursor.getInt(uCursor.getColumnIndex("g"));
             uoa.g = uCursor.getInt(uCursor.getColumnIndex("e"));
             uoa.h = uCursor.getInt(uCursor.getColumnIndex("f"));
             uoa.i = uCursor.getInt(uCursor.getColumnIndex("i"));
             uoa.j = uCursor.getString(uCursor.getColumnIndex("j"));
             String str = uCursor.getString(uCursor.getColumnIndex("h"));
             try{
                i = 0;
                str = new String(KSecurity.uDecrypt(Base64.decode(str, i)));
             }catch(java.lang.Exception e4){
                d.a(e4);
             }
             uoa.d = str;
             obj.add(uoa);
          }
       }
       if (uCursor != null) {
          try{
             uCursor.close();
          }catch(java.lang.Exception e1){
             d.a(e1);
          }
       }
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.c = this.a.getWritableDatabase();
       return;
    }
}
