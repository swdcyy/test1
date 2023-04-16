package com.google.android.material.bottomnavigation.BottomNavigationPresenter;
import androidx.appcompat.view.menu.j;
import java.lang.Object;
import android.os.Parcelable;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.h;
import android.content.Context;
import androidx.appcompat.view.menu.j$a;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.k;

public class BottomNavigationPresenter implements j	// class@00164a
{
    public e b;
    public BottomNavigationMenuView c;
    public boolean d;
    public int e;

    public void BottomNavigationPresenter(){
       super();
       this.d = false;
    }
    public Parcelable a(){
       BottomNavigationPresenter$SavedState savedState = new BottomNavigationPresenter$SavedState();
       savedState.b = this.c.getSelectedItemId();
       return savedState;
    }
    public void b(e p0,boolean p1){
    }
    public void c(Parcelable p0){
       if (p0 instanceof BottomNavigationPresenter$SavedState) {
          this.c.f(p0.b);
       }
       return;
    }
    public void d(BottomNavigationMenuView p0){
       this.c = p0;
    }
    public void e(boolean p0){
       if (this.d != null) {
          return;
       }
       if (p0) {
          this.c.a();
       }else {
          this.c.g();
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
       return this.e;
    }
    public boolean h(){
       return false;
    }
    public void i(int p0){
       this.e = p0;
    }
    public boolean j(e p0,h p1){
       return false;
    }
    public void k(Context p0,e p1){
       this.b = p1;
       this.c.d(p1);
    }
    public void l(j$a p0){
    }
    public k m(ViewGroup p0){
       return this.c;
    }
    public void n(boolean p0){
       this.d = p0;
    }
}
