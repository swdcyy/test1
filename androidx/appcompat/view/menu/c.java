package androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.j;
import android.widget.AdapterView$OnItemClickListener;
import java.lang.Object;
import android.content.Context;
import android.view.LayoutInflater;
import android.os.Parcelable;
import android.os.Bundle;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j$a;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.c$a;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.f;
import android.os.IBinder;
import androidx.appcompat.view.menu.h;
import java.lang.String;
import android.util.SparseArray;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.k;
import ag6.a;
import androidx.appcompat.view.menu.ExpandedMenuView;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.MenuItem;

public class c implements j, AdapterView$OnItemClickListener	// class@0005a8
{
    public Context b;
    public LayoutInflater c;
    public e d;
    public ExpandedMenuView e;
    public int f;
    public int g;
    public int h;
    public j$a i;
    public c$a j;
    public int k;

    public void c(int p0,int p1){
       super();
       this.h = p0;
       this.g = p1;
    }
    public void c(Context p0,int p1){
       super(p1, 0);
       this.b = p0;
       this.c = LayoutInflater.from(p0);
    }
    public Parcelable a(){
       if (this.e == null) {
          return null;
       }
       Bundle uBundle = new Bundle();
       this.n(uBundle);
       return uBundle;
    }
    public void b(e p0,boolean p1){
       c ti = this.i;
       if (ti != null) {
          ti.b(p0, p1);
       }
       return;
    }
    public void c(Parcelable p0){
       this.i(p0);
    }
    public ListAdapter d(){
       if (this.j == null) {
          this.j = new c$a(this);
       }
       return this.j;
    }
    public void e(boolean p0){
       c tj = this.j;
       if (tj != null) {
          tj.notifyDataSetChanged();
       }
       return;
    }
    public boolean f(m p0){
       if (!p0.hasVisibleItems()) {
          return false;
       }
       new f(p0).d(null);
       c ti = this.i;
       if (ti != null) {
          ti.c(p0);
       }
       return true;
    }
    public boolean g(e p0,h p1){
       return false;
    }
    public int getId(){
       return this.k;
    }
    public boolean h(){
       return false;
    }
    public void i(Bundle p0){
       SparseArray sparseParcel = p0.getSparseParcelableArray("android:menu:list");
       if (sparseParcel != null) {
          this.e.restoreHierarchyState(sparseParcel);
       }
       return;
    }
    public boolean j(e p0,h p1){
       return false;
    }
    public void k(Context p0,e p1){
       if (this.g != null) {
          ContextThemeWrapper uContextThem = new ContextThemeWrapper(p0, this.g);
          this.b = uContextThem;
          this.c = LayoutInflater.from(uContextThem);
       }else if(this.b != null){
          this.b = p0;
          if (this.c == null) {
             this.c = LayoutInflater.from(p0);
          }
       }
       this.d = p1;
       c tj = this.j;
       if (tj != null) {
          tj.notifyDataSetChanged();
       }
       return;
    }
    public void l(j$a p0){
       this.i = p0;
    }
    public k m(ViewGroup p0){
       if (this.e == null) {
          this.e = a.c(this.c, 0x7f0d000d, p0, false);
          if (this.j == null) {
             this.j = new c$a(this);
          }
          this.e.setAdapter(this.j);
          this.e.setOnItemClickListener(this);
       }
       return this.e;
    }
    public void n(Bundle p0){
       SparseArray sparseArray = new SparseArray();
       c te = this.e;
       if (te != null) {
          te.saveHierarchyState(sparseArray);
       }
       p0.putSparseParcelableArray("android:menu:list", sparseArray);
       return;
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       this.d.O(this.j.b(p2), this, 0);
    }
}
