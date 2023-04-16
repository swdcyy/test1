package c75.d;
import c75.c;
import e75.b;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.database.sqlite.SQLiteOpenHelper;
import e75.c;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import g75.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import c75.e;
import java.lang.StringBuilder;
import java.lang.Integer;
import h75.i;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.ArrayList;
import c75.b;
import j75.b;
import java.lang.Boolean;
import f75.a;
import org.greenrobot.eventbus.a;
import java.util.Iterator;

public abstract class d implements c	// class@000426
{
    public b a;
    public c b;

    public void d(b p0,Context p1){
       super();
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "10")) {
       }else {
          d ta = this.a;
          if (ta != null) {
             ta.j();
          }
          this.a = p0;
          if (!PatchProxy.applyVoid(null, this, uod, "11") && this.b != null) {
             this.b.close();
          }
          this.b = new c(this.a, p1);
          if (ta != null) {
             ta.l();
          }
       }
       return;
    }
    public Cursor a(String p0,String[] p1){
       return this.o().rawQuery(p0, p1);
    }
    public int c(ContentValues p0,String p1,String[] p2){
       return this.s(p0, p1, p2, true);
    }
    public Cursor d(String[] p0,String p1,String[] p2,String p3,String p4,String p5,String p6){
       return this.o().query(this.a.e().g(), p0, p1, p2, p3, p4, p5, p6);
    }
    public int f(ContentValues[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.j(p0, true);
    }
    public int g(String p0,String[] p1){
       return this.k(p0, p1, true);
    }
    public List h(String p0,String[] p1,String p2,String p3,String p4,String p5){
       Object[] objArray;
       StringBuilder obj;
       int i;
       ArrayList uArrayList;
       d uod = this;
       d uod1 = d.class;
       if (PatchProxy.isSupport(uod1)) {
          objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, uod1, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = -1;
       if (e.a()) {
          i = i.j("DAO query "+this.n().c()).intValue();
       }
       try{
          objArray = null;
          d a = uod.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(objArray, a, b.class, "7")) {
             a.k();
             a.b.readLock().lock();
          }
          Cursor uCursor = this.o().query(uod.a.e().g(), uod.a.e().e(), p0, p1, p2, p3, p4, p5);
          if (uCursor != null && uCursor.moveToFirst()) {
             uArrayList = new ArrayList(uCursor.getCount());
             do {
                uArrayList.add(this.m(uCursor));
             } while (!uCursor.moveToNext());
          }
          b.a(uCursor);
          uod.a.k();
          if (e.a()) {
             i.i(Integer.valueOf(i));
          }
          return uArrayList;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean i(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.q(p0, true);
    }
    public abstract int j(ContentValues[] p0,boolean p1);
    public int k(String p0,String[] p1,boolean p2){
       List this = (p2)? this.h(p0, p1, null, null, null, null): null;
       String str = this.a.e().g();
       this.a.j();
       int i = this.p().delete(str, p0, p1);
       if (e.a()) {
          Object[] objArray = new Object[]{Integer.valueOf(i)};
          i.a(str+String.format(", delete %s data", objArray));
       }
       this.a.l();
       if (i > 0 && p2) {
          a uoa = new a(str, this.a.c());
          uoa.a(3, this);
          a.d().k(uoa);
       }
       return i;
    }
    public abstract b l(ContentValues p0);
    public abstract b m(Cursor p0);
    public b n(){
       return this.a;
    }
    public SQLiteDatabase o(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getReadableDatabase();
    }
    public SQLiteDatabase p(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getWritableDatabase();
    }
    public boolean q(b p0,boolean p1){
       int i1;
       int i = 1;
       if (p0 != null) {
          ContentValues[] uContentValu = new ContentValues[i];
          uContentValu[0] = p0.toContentValues();
          i1 = this.j(uContentValu, p1);
       }else {
          i1 = 0;
       }
       if (i1 <= 0) {
          i = false;
       }
       return i;
    }
    public boolean r(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && ((this.a.c()).equals(p0.c) && (this.a.e().g()).equals(p0.b)))? true: false;
       return b;
    }
    public int s(ContentValues p0,String p1,String[] p2,boolean p3){
       List this;
       if (p3) {
          this = this.h(p1, p2, null, null, null, null);
          if (this != null) {
             Iterator iterator = this.iterator();
             while (iterator.hasNext()) {
                iterator.next().updateByContentValues(p0);
             }
          }
       }else {
          this = null;
       }
       String str = this.a.e().g();
       this.a.j();
       int i = this.p().update(str, p0, p1, p2);
       if (e.a()) {
          Object[] objArray = new Object[]{Integer.valueOf(i)};
          i.a(str+String.format(", update %s data", objArray));
       }
       this.a.l();
       if (i > 0 && p3) {
          a uoa = new a(str, this.a.c());
          uoa.a(2, this);
          a.d().k(uoa);
       }
       return i;
    }
}
