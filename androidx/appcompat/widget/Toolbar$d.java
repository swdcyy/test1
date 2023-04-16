package androidx.appcompat.widget.Toolbar$d;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import java.lang.Object;
import android.os.Parcelable;
import androidx.appcompat.view.menu.e;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.view.ViewGroup;
import android.view.View;
import androidx.appcompat.widget.Toolbar$LayoutParams;
import androidx.appcompat.app.ActionBar$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import u0.c;
import android.content.Context;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.k;

public class Toolbar$d implements j	// class@000631
{
    public e b;
    public h c;
    public final Toolbar d;

    public void Toolbar$d(Toolbar p0){
       this.d = p0;
       super();
    }
    public Parcelable a(){
       return null;
    }
    public void b(e p0,boolean p1){
    }
    public void c(Parcelable p0){
    }
    public void e(boolean p0){
       if (this.c != null) {
          Toolbar$d tb = this.b;
          Toolbar$d uod = null;
          if (tb != null) {
             int i = tb.size();
             int i1 = 0;
             while (i1 < i) {
                if (this.b.getItem(i1) == this.c) {
                   uod = 1;
                   break ;
                }
                i1 = i1 + 1;
             }
          }
          if (!uod) {
             this.j(this.b, this.c);
          }
       }
       return;
    }
    public boolean f(m p0){
       return false;
    }
    public boolean g(e p0,h p1){
       Toolbar$d td1;
       this.d.g();
       ViewParent parent = this.d.i.getParent();
       Toolbar$d td = this.d;
       if (parent != td) {
          if (parent instanceof ViewGroup) {
             parent.removeView(td.i);
          }
          td1 = this.d;
          td1.addView(td1.i);
       }
       td1.j = p1.getActionView();
       this.c = p1;
       parent = this.d.j.getParent();
       td = this.d;
       if (parent != td) {
          if (parent instanceof ViewGroup) {
             parent.removeView(td.j);
          }
          Toolbar$LayoutParams layoutParams = this.d.n();
          Toolbar$d td2 = this.d;
          layoutParams.a = 0x800003 | (td2.o & 0x70);
          layoutParams.b = 2;
          td2.j.setLayoutParams(layoutParams);
          td1 = this.d;
          td1.addView(td1.j);
       }
       this.d.I();
       this.d.requestLayout();
       p1.s(true);
       Toolbar j = this.d.j;
       if (j instanceof c) {
          j.f();
       }
       return true;
    }
    public int getId(){
       return 0;
    }
    public boolean h(){
       return false;
    }
    public boolean j(e p0,h p1){
       Toolbar j = this.d.j;
       if (j instanceof c) {
          j.c();
       }
       Toolbar$d td = this.d;
       td.removeView(td.j);
       td = this.d;
       td.removeView(td.i);
       td = this.d;
       td.j = null;
       td.a();
       this.c = null;
       this.d.requestLayout();
       p1.s(false);
       return true;
    }
    public void k(Context p0,e p1){
       Toolbar$d tb = this.b;
       if (tb != null) {
          Toolbar$d tc = this.c;
          if (tc != null) {
             tb.f(tc);
          }
       }
       this.b = p1;
       return;
    }
    public void l(j$a p0){
    }
    public k m(ViewGroup p0){
       return null;
    }
}
