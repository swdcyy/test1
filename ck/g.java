package ck.g;
import androidx.appcompat.view.menu.j;
import java.lang.Object;
import ck.g$a;
import android.content.res.ColorStateList;
import ck.g$c;
import android.os.Parcelable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.lang.String;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j$a;
import android.view.View;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.h;
import a2.u0;
import a2.i0;
import android.content.Context;
import android.view.LayoutInflater;
import android.content.res.Resources;
import cw9.c;
import androidx.appcompat.view.menu.k;
import ag6.a;
import com.google.android.material.internal.NavigationMenuView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.drawable.Drawable;

public class g implements j	// class@000d27
{
    public NavigationMenuView b;
    public LinearLayout c;
    public j$a d;
    public e e;
    public int f;
    public g$c g;
    public LayoutInflater h;
    public int i;
    public boolean j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final View$OnClickListener r;

    public void g(){
       super();
       this.r = new g$a(this);
    }
    public void A(ColorStateList p0){
       this.l = p0;
       this.e(false);
    }
    public void B(int p0){
       this.i = p0;
       this.j = true;
       this.e(false);
    }
    public void C(ColorStateList p0){
       this.k = p0;
       this.e(false);
    }
    public void D(boolean p0){
       g tg = this.g;
       if (tg != null) {
          tg.S0(p0);
       }
       return;
    }
    public Parcelable a(){
       SparseArray sparseArray;
       Bundle uBundle = new Bundle();
       if (this.b != null) {
          sparseArray = new SparseArray();
          this.b.saveHierarchyState(sparseArray);
          uBundle.putSparseParcelableArray("android:menu:list", sparseArray);
       }
       g tg = this.g;
       if (tg != null) {
          uBundle.putBundle("android:menu:adapter", tg.K0());
       }
       if (this.c != null) {
          sparseArray = new SparseArray();
          this.c.saveHierarchyState(sparseArray);
          uBundle.putSparseParcelableArray("android:menu:header", sparseArray);
       }
       return uBundle;
    }
    public void b(e p0,boolean p1){
       g td = this.d;
       if (td != null) {
          td.b(p0, p1);
       }
       return;
    }
    public void c(Parcelable p0){
       if (p0 instanceof Bundle) {
          SparseArray sparseParcel = p0.getSparseParcelableArray("android:menu:list");
          if (sparseParcel != null) {
             this.b.restoreHierarchyState(sparseParcel);
          }
          Bundle bundle = p0.getBundle("android:menu:adapter");
          if (bundle != null) {
             this.g.Q0(bundle);
          }
          SparseArray sparseParcel1 = p0.getSparseParcelableArray("android:menu:header");
          if (sparseParcel1 != null) {
             this.c.restoreHierarchyState(sparseParcel1);
          }
       }
       return;
    }
    public void d(View p0){
       this.c.addView(p0);
       g tb = this.b;
       tb.setPadding(0, 0, 0, tb.getPaddingBottom());
    }
    public void e(boolean p0){
       g tg = this.g;
       if (tg != null) {
          tg.T0();
       }
       return;
    }
    public boolean f(m p0){
       return false;
    }
    public boolean g(e p0,h p1){
       return false;
    }
    public int getId(){
       return this.f;
    }
    public boolean h(){
       return false;
    }
    public void i(u0 p0){
       int i = p0.k();
       if (this.p != i) {
          this.p = i;
          if (!this.c.getChildCount()) {
             g tb = this.b;
             tb.setPadding(0, this.p, 0, tb.getPaddingBottom());
          }
       }
       i0.i(this.c, p0);
       return;
    }
    public boolean j(e p0,h p1){
       return false;
    }
    public void k(Context p0,e p1){
       this.h = LayoutInflater.from(p0);
       this.e = p1;
       this.q = c.a(p0.getResources(), 0x7f0701b8);
    }
    public void l(j$a p0){
       this.d = p0;
    }
    public k m(ViewGroup p0){
       if (this.b == null) {
          this.b = a.c(this.h, 0x7f0d0262, p0, false);
          if (this.g == null) {
             this.g = new g$c(this);
          }
          this.c = a.c(this.h, 0x7f0d025f, this.b, false);
          this.b.setAdapter(this.g);
       }
       return this.b;
    }
    public h n(){
       return this.g.L0();
    }
    public int o(){
       return this.c.getChildCount();
    }
    public Drawable p(){
       return this.m;
    }
    public int q(){
       return this.n;
    }
    public int r(){
       return this.o;
    }
    public ColorStateList s(){
       return this.k;
    }
    public ColorStateList t(){
       return this.l;
    }
    public View u(int p0){
       View view = a.c(this.h, p0, this.c, false);
       this.d(view);
       return view;
    }
    public void v(h p0){
       this.g.R0(p0);
    }
    public void w(int p0){
       this.f = p0;
    }
    public void x(Drawable p0){
       this.m = p0;
       this.e(false);
    }
    public void y(int p0){
       this.n = p0;
       this.e(false);
    }
    public void z(int p0){
       this.o = p0;
       this.e(false);
    }
}
