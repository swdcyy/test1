package com.kuaishou.weapon.ks.ah;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.weapon.ks.ah$a;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.String;
import com.kuaishou.weapon.ks.aa;
import android.content.ContentValues;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.weapon.ks.v;
import android.content.pm.ActivityInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.database.Cursor;
import java.util.ArrayList;
import com.kuaishou.weapon.ks.w;
import java.util.HashMap;
import java.lang.Throwable;
import com.kuaishou.weapon.ks.d;
import java.util.Map;
import com.kuaishou.weapon.ks.bs;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.weapon.ks.z;
import java.io.File;

public class ah	// class@0011c4
{
    public int B;
    public String C;
    public String D;
    public ah$a E;
    public SQLiteDatabase F;
    public Context G;
    public static ah H;

    public void ah(Context p0){
       super();
       this.B = 1;
       this.C = "create table wp\(k INTEGER PRIMARY KEY ON CONFLICT ABORT,p TEXT UNIQUE ON CONFLICT ABORT,v TEXT,n INTEGER,s INTEGER,i INTEGER,u INTEGER,el INTEGER,c INTEGER,r INTEGER,aps INTEGER,dp TEXT,pcn TEXT,b TEXT,m TEXT,ail BLOB,pst INTEGER,d INTEGER,at INTEGER,dm TEXT,rm INTEGER,l TEXT,pc INTEGER DEFAULT -1,a TEXT,cbl INTEGER\)";
       this.D = "create table wc\(_id INTEGER primary key autoincrement,k INTEGER,v TEXT,ctc INTEGER\)";
       this.G = p0.getApplicationContext();
       ah$a uoa = new ah$a(this, p0.getApplicationContext());
       this.E = uoa;
       this.F = uoa.getWritableDatabase();
    }
    public static int a(ah p0){
       return p0.B;
    }
    public static ah a(){
       return ah.H;
    }
    public static synchronized ah a(Context p0){
       _monitor_enter(ah.class);
       if (ah.H == null) {
          ah.H = new ah(p0);
       }
       _monitor_exit(ah.class);
       return ah.H;
    }
    public static String b(ah p0){
       return p0.C;
    }
    public static String c(ah p0){
       return p0.D;
    }
    public long a(aa p0){
       long l = 0;
       if (p0 == null) {
          return l;
       }
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("n", Integer.valueOf(p0.b));
       uContentValu.put("aps", Integer.valueOf(p0.p));
       uContentValu.put("p", p0.c);
       uContentValu.put("a", p0.e);
       uContentValu.put("l", p0.h);
       uContentValu.put("v", p0.d);
       uContentValu.put("dp", p0.n);
       uContentValu.put("a", p0.e);
       uContentValu.put("pcn", p0.o);
       uContentValu.put("pst", Long.valueOf(p0.t));
       uContentValu.put("rm", Integer.valueOf(p0.x));
       uContentValu.put("at", Integer.valueOf(p0.q));
       uContentValu.put("pc", Integer.valueOf(p0.y));
       uContentValu.put("cbl", Integer.valueOf(p0.z));
       aa l1 = p0.l;
       if (l1 != null) {
          uContentValu.put("ail", new v(l1).a());
       }
       if (!TextUtils.isEmpty(p0.j)) {
          uContentValu.put("dm", p0.j);
       }
       if (this.b(p0.a)) {
          l = (long)this.F.update("wp", uContentValu, "k="+p0.a, null);
       }else {
          uContentValu.put("k", Integer.valueOf(p0.a));
          l = this.F.insert("wp", null, uContentValu);
       }
       return l;
    }
    public aa a(int p0){
       aa uoaa = null;
       Cursor uCursor = this.F.query("wp", null, "k="+p0, null, null, null, null);
       if (uCursor != null && uCursor.moveToFirst()) {
          aa uoaa1 = new aa();
          uoaa1.a = p0;
          uoaa1.b = uCursor.getInt(uCursor.getColumnIndex("n"));
          uoaa1.c = uCursor.getString(uCursor.getColumnIndex("p"));
          uoaa1.e = uCursor.getString(uCursor.getColumnIndex("a"));
          uoaa1.h = uCursor.getString(uCursor.getColumnIndex("l"));
          uoaa1.d = uCursor.getString(uCursor.getColumnIndex("v"));
          uoaa1.n = uCursor.getString(uCursor.getColumnIndex("dp"));
          uoaa1.p = uCursor.getInt(uCursor.getColumnIndex("aps"));
          uoaa1.o = uCursor.getString(uCursor.getColumnIndex("pcn"));
          uoaa1.q = uCursor.getInt(uCursor.getColumnIndex("at"));
          uoaa1.t = uCursor.getLong(uCursor.getColumnIndex("pst"));
          uoaa1.u = uCursor.getInt(uCursor.getColumnIndex("d"));
          uoaa1.x = uCursor.getInt(uCursor.getColumnIndex("rm"));
          uoaa1.j = uCursor.getString(uCursor.getColumnIndex("dm"));
          uoaa1.y = uCursor.getInt(uCursor.getColumnIndex("pc"));
          int i = 0;
          int b = true;
          if (uCursor.getInt(uCursor.getColumnIndex("cbl")) != b) {
             b = false;
          }
          uoaa1.z = b;
          byte[] blob = uCursor.getBlob(uCursor.getColumnIndex("ail"));
          if (blob != null) {
             ArrayList uArrayList = v.a(blob);
             if (uArrayList != null) {
                b = uArrayList.size();
                if (b > 0) {
                   ActivityInfo[] uActivityInf = new ActivityInfo[b];
                   uoaa1.l = uActivityInf;
                   for (; i < b; i = i + 1) {
                      ActivityInfo uActivityInf1 = new ActivityInfo();
                      uActivityInf1.theme = uArrayList.get(i).a;
                      uActivityInf1.name = uArrayList.get(i).k;
                      uActivityInf1.configChanges = uArrayList.get(i).h;
                      uActivityInf1.flags = uArrayList.get(i).f;
                      uActivityInf1.labelRes = uArrayList.get(i).m;
                      uActivityInf1.launchMode = uArrayList.get(i).b;
                      uActivityInf1.nonLocalizedLabel = uArrayList.get(i).n;
                      uActivityInf1.packageName = uArrayList.get(i).l;
                      uActivityInf1.permission = uArrayList.get(i).c;
                      uActivityInf1.screenOrientation = uArrayList.get(i).g;
                      uActivityInf1.softInputMode = uArrayList.get(i).i;
                      uActivityInf1.targetActivity = uArrayList.get(i).e;
                      uActivityInf1.taskAffinity = uArrayList.get(i).d;
                      uoaa1.l[i] = uActivityInf1;
                   }
                }
             }
          }
          uoaa = uoaa1;
       }
       if (uCursor != null && !uCursor.isClosed()) {
          uCursor.close();
       }
    label_01e7 :
       return uoaa;
    }
    public void a(int p0,int p1){
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("s", Integer.valueOf(p1));
       this.F.update("wp", uContentValu, "k="+p0+" and "+"n"+"=1", null);
    }
    public void a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       String[] stringArray = new String[]{p0};
       this.F.delete("wp", "p=?", stringArray);
       return;
    }
    public void a(String p0,int p1){
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("s", Integer.valueOf(p1));
       String[] stringArray = new String[]{p0};
       this.F.update("wp", uContentValu, "p=? and n=1", stringArray);
    }
    public int b(int p0,int p1){
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("u", Integer.valueOf(p1));
       return this.F.update("wp", uContentValu, "k="+p0, null);
    }
    public aa b(String p0){
       aa uoaa = null;
       if (TextUtils.isEmpty(p0)) {
          return uoaa;
       }
       int i = 1;
       String[] stringArray = new String[i];
       int i1 = 0;
       stringArray[i1] = p0;
       Cursor uCursor = this.F.query("wp", null, "p=?", stringArray, null, null, null);
       if (uCursor != null && uCursor.moveToFirst()) {
          aa uoaa1 = new aa();
          uoaa1.a = uCursor.getInt(uCursor.getColumnIndex("k"));
          uoaa1.b = uCursor.getInt(uCursor.getColumnIndex("n"));
          uoaa1.c = uCursor.getString(uCursor.getColumnIndex("p"));
          uoaa1.e = uCursor.getString(uCursor.getColumnIndex("a"));
          uoaa1.h = uCursor.getString(uCursor.getColumnIndex("l"));
          uoaa1.d = uCursor.getString(uCursor.getColumnIndex("v"));
          uoaa1.n = uCursor.getString(uCursor.getColumnIndex("dp"));
          uoaa1.p = uCursor.getInt(uCursor.getColumnIndex("aps"));
          uoaa1.o = uCursor.getString(uCursor.getColumnIndex("pcn"));
          uoaa1.q = uCursor.getInt(uCursor.getColumnIndex("at"));
          uoaa1.t = uCursor.getLong(uCursor.getColumnIndex("pst"));
          uoaa1.u = uCursor.getInt(uCursor.getColumnIndex("d"));
          uoaa1.x = uCursor.getInt(uCursor.getColumnIndex("rm"));
          uoaa1.j = uCursor.getString(uCursor.getColumnIndex("dm"));
          uoaa1.y = uCursor.getInt(uCursor.getColumnIndex("pc"));
          if (uCursor.getInt(uCursor.getColumnIndex("cbl")) != i) {
             i = false;
          }
          uoaa1.z = i;
          byte[] blob = uCursor.getBlob(uCursor.getColumnIndex("ail"));
          if (blob != null) {
             ArrayList uArrayList = v.a(blob);
             if (uArrayList != null) {
                int i2 = uArrayList.size();
                if (i2 > 0) {
                   ActivityInfo[] uActivityInf = new ActivityInfo[i2];
                   uoaa1.l = uActivityInf;
                   for (; i1 < i2; i1 = i1 + 1) {
                      ActivityInfo uActivityInf1 = new ActivityInfo();
                      uActivityInf1.theme = uArrayList.get(i1).a;
                      uActivityInf1.name = uArrayList.get(i1).k;
                      uActivityInf1.configChanges = uArrayList.get(i1).h;
                      uActivityInf1.flags = uArrayList.get(i1).f;
                      uActivityInf1.labelRes = uArrayList.get(i1).m;
                      uActivityInf1.launchMode = uArrayList.get(i1).b;
                      uActivityInf1.nonLocalizedLabel = uArrayList.get(i1).n;
                      uActivityInf1.packageName = uArrayList.get(i1).l;
                      uActivityInf1.permission = uArrayList.get(i1).c;
                      uActivityInf1.screenOrientation = uArrayList.get(i1).g;
                      uActivityInf1.softInputMode = uArrayList.get(i1).i;
                      uActivityInf1.targetActivity = uArrayList.get(i1).e;
                      uActivityInf1.taskAffinity = uArrayList.get(i1).d;
                      uoaa1.l[i1] = uActivityInf1;
                   }
                }
             }
          }
          uoaa = uoaa1;
       }
       if (uCursor != null && !uCursor.isClosed()) {
          uCursor.close();
       }
    label_01b8 :
       return uoaa;
    }
    public List b(){
       ArrayList uArrayList = new ArrayList();
       Cursor uCursor = this.F.query("wp", null, null, null, null, null, null);
       if (uCursor != null) {
          while (uCursor.moveToNext()) {
             aa uoaa = new aa();
             uoaa.a = uCursor.getInt(uCursor.getColumnIndex("k"));
             uoaa.c = uCursor.getString(uCursor.getColumnIndex("p"));
             uoaa.e = uCursor.getString(uCursor.getColumnIndex("a"));
             uoaa.h = uCursor.getString(uCursor.getColumnIndex("l"));
             uoaa.d = uCursor.getString(uCursor.getColumnIndex("v"));
             uoaa.t = uCursor.getLong(uCursor.getColumnIndex("pst"));
             uoaa.u = uCursor.getInt(uCursor.getColumnIndex("d"));
             uoaa.x = uCursor.getInt(uCursor.getColumnIndex("rm"));
             uoaa.y = uCursor.getInt(uCursor.getColumnIndex("pc"));
             boolean b = true;
             if (uCursor.getInt(uCursor.getColumnIndex("cbl")) != b) {
                b = false;
             }
             uoaa.z = b;
             uArrayList.add(uoaa);
          }
       }
       if (uCursor != null && !uCursor.isClosed()) {
          uCursor.close();
       }
    label_00b8 :
       return uArrayList;
    }
    public boolean b(int p0){
       boolean b = false;
       String[] stringArray = new String[]{"p"};
       Cursor uCursor = this.F.query("wp", stringArray, "k="+p0, null, null, null, null);
       if (uCursor != null && uCursor.getCount() > 0) {
          b = true;
       }
       if (uCursor != null && !uCursor.isClosed()) {
          uCursor.close();
       }
    label_0045 :
       return b;
    }
    public int c(int p0){
       int i = 0;
       String[] stringArray = new String[]{"n"};
       Cursor uCursor = this.F.query("wp", stringArray, "k="+p0, null, null, null, null);
       if (uCursor != null && uCursor.moveToFirst()) {
          i = uCursor.getInt(uCursor.getColumnIndex("n"));
       }
       if (uCursor != null && !uCursor.isClosed()) {
          uCursor.close();
       }
    label_004c :
       return i;
    }
    public void c(){
       aa uoaa;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          uoaa = iterator.next();
          if (!bs.a(uoaa.e)) {
             uArrayList.add(uoaa);
          }
       }
       z oz = z.a();
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          uoaa = iterator1.next();
          if (oz != null) {
             oz.a(uoaa.e);
          }
          this.F.delete("wp", "k="+uoaa.a, null);
          List b = z.b;
          if (b != null && !b.contains(Integer.valueOf(uoaa.a))) {
             bs.c(this.G.getFilesDir().getCanonicalPath()+"/."+uoaa.a);
          }
          if (oz.c() != null && oz.c().get(uoaa.c) != null) {
             bs.c(this.G.getFileStreamPath(uoaa.c).getAbsolutePath());
          }
       }
       return;
    }
    public void c(int p0,int p1){
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("n", Integer.valueOf(p1));
       this.F.update("wp", uContentValu, "k="+p0, null);
    }
    public void d(){
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("n", Integer.valueOf(0));
       this.F.update("wp", uContentValu, "n=-1", null);
    }
    public void d(int p0,int p1){
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("pc", Integer.valueOf(p1));
       this.F.update("wp", uContentValu, "k="+p0, null);
    }
    public boolean d(int p0){
       String str = "u";
       boolean b = false;
       String[] stringArray = new String[]{str};
       Cursor uCursor = this.F.query("wp", stringArray, "k="+p0, null, null, null, null);
       if (uCursor != null && (uCursor.moveToFirst() && uCursor.getInt(uCursor.getColumnIndex(str)) == 1)) {
          b = true;
       }
    label_0039 :
       if (uCursor != null && !uCursor.isClosed()) {
          uCursor.close();
       }
    label_004f :
       return b;
    }
    public void e(){
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("u", Integer.valueOf(0));
       this.F.update("wp", uContentValu, "u=1", null);
    }
    public boolean e(int p0){
       String str = "s";
       boolean b = false;
       String[] stringArray = new String[]{str};
       Cursor uCursor = this.F.query("wp", stringArray, "k="+p0, null, null, null, null);
       if (uCursor != null && (uCursor.moveToFirst() && uCursor.getInt(uCursor.getColumnIndex(str)) == 1)) {
          b = true;
       }
    label_0039 :
       if (uCursor != null && !uCursor.isClosed()) {
          uCursor.close();
       }
    label_004f :
       return b;
    }
    public void f(int p0){
       if (p0 <= 0) {
          return;
       }
       this.F.delete("wp", "k="+p0, null);
       return;
    }
}
