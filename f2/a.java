package f2.a;
import android.widget.Filterable;
import f2.b$a;
import android.widget.BaseAdapter;
import android.content.Context;
import android.database.Cursor;
import java.lang.CharSequence;
import java.lang.String;
import java.lang.Object;
import android.widget.FilterQueryProvider;
import android.view.View;
import f2.a$a;
import f2.a$b;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.view.ViewGroup;
import android.widget.Filter;
import f2.b;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import androidx.appcompat.widget.g;

public abstract class a extends BaseAdapter implements Filterable, b$a	// class@001fb1
{
    public boolean b;
    public boolean c;
    public Cursor d;
    public Context e;
    public int f;
    public a$a g;
    public DataSetObserver h;
    public b i;
    public FilterQueryProvider j;
    public static final int k = 1;

    public void a(Context p0,Cursor p1,boolean p2){
       super();
       int i = (p2)? 1: 2;
       this.e(p0, p1, i);
       return;
    }
    public CharSequence a(Cursor p0){
       String str = (p0 == null)? "": p0.toString();
       return str;
    }
    public void b(Cursor p0){
       p0 = this.i(p0);
       if (p0 != null) {
          p0.close();
       }
       return;
    }
    public Cursor c(CharSequence p0){
       a tj = this.j;
       if (tj != null) {
          return tj.runQuery(p0);
       }
       return this.d;
    }
    public abstract void d(View p0,Context p1,Cursor p2);
    public void e(Context p0,Cursor p1,int p2){
       boolean b = false;
       if ((p2 & 0x01) == 1) {
          p2 = p2 | 0x02;
          this.c = true;
       }else {
          this.c = b;
       }
       if (p1 != null) {
          b = true;
       }
       this.d = p1;
       this.b = b;
       this.e = p0;
       int columnIndexO = (b)? p1.getColumnIndexOrThrow("_id"): -1;
       this.f = columnIndexO;
       columnIndexO = 2;
       if ((p2 & columnIndexO) == columnIndexO) {
          this.g = new a$a(this);
          this.h = new a$b(this);
       }else {
          a$a uoa = null;
          this.g = uoa;
          this.h = uoa;
       }
       if (b) {
          a tg = this.g;
          if (tg != null) {
             p1.registerContentObserver(tg);
          }
          tg = this.h;
          if (tg != null) {
             p1.registerDataSetObserver(tg);
          }
       }
       return;
    }
    public View f(Context p0,Cursor p1,ViewGroup p2){
       return this.g(p0, p1, p2);
    }
    public abstract View g(Context p0,Cursor p1,ViewGroup p2);
    public int getCount(){
       if (this.b != null) {
          a td = this.d;
          if (td != null) {
             return td.getCount();
          }
       }
       return 0;
    }
    public Cursor getCursor(){
       return this.d;
    }
    public View getDropDownView(int p0,View p1,ViewGroup p2){
       if (this.b == null) {
          return null;
       }
       this.d.moveToPosition(p0);
       if (p1 == null) {
          p1 = this.f(this.e, this.d, p2);
       }
       this.d(p1, this.e, this.d);
       return p1;
    }
    public Filter getFilter(){
       if (this.i == null) {
          this.i = new b(this);
       }
       return this.i;
    }
    public Object getItem(int p0){
       if (this.b != null) {
          a td = this.d;
          if (td != null) {
             td.moveToPosition(p0);
             return this.d;
          }
       }
       return null;
    }
    public long getItemId(int p0){
       if (this.b != null) {
          a td = this.d;
          if (td != null && td.moveToPosition(p0)) {
             return this.d.getLong(this.f);
          }
       }
       return 0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       if (this.b == null) {
          throw new IllegalStateException("this should only be called when the cursor is valid");
       }
       if (!this.d.moveToPosition(p0)) {
          throw new IllegalStateException("couldn\'t move cursor to position "+p0);
       }
       if (p1 == null) {
          p1 = this.g(this.e, this.d, p2);
       }
       this.d(p1, this.e, this.d);
       return p1;
    }
    public void h(){
       if (this.c != null) {
          a td = this.d;
          if (td != null && !td.isClosed()) {
             this.b = this.d.requery();
          }
       }
       return;
    }
    public boolean hasStableIds(){
       return (this instanceof g ^ 0x01);
    }
    public Cursor i(Cursor p0){
       a tg;
       a td = this.d;
       if (p0 == td) {
          return null;
       }
       if (td != null) {
          tg = this.g;
          if (tg != null) {
             td.unregisterContentObserver(tg);
          }
          tg = this.h;
          if (tg != null) {
             td.unregisterDataSetObserver(tg);
          }
       }
       this.d = p0;
       if (p0 != null) {
          tg = this.g;
          if (tg != null) {
             p0.registerContentObserver(tg);
          }
          tg = this.h;
          if (tg != null) {
             p0.registerDataSetObserver(tg);
          }
          this.f = p0.getColumnIndexOrThrow("_id");
          this.b = true;
          this.notifyDataSetChanged();
       }else {
          this.f = -1;
          this.b = false;
          this.notifyDataSetInvalidated();
       }
       return td;
    }
}
