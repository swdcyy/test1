package com.hhh.mvvm.recycler.c;
import java.lang.Object;
import fm.a;
import androidx.lifecycle.MutableLiveData;
import com.hhh.mvvm.recycler.LoadingStatus;
import brd.t;
import fm.d;
import com.hhh.mvvm.recycler.a;
import erd.g;
import crd.b;
import java.util.ArrayList;

public abstract class c	// class@000569
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final MutableLiveData g;
    public final Object h;
    public final MutableLiveData i;
    public final a j;
    public Runnable k;
    public static Handler l;

    public void c(Object p0,a p1){
       super();
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       this.d = new MutableLiveData();
       this.e = new MutableLiveData();
       this.f = new MutableLiveData();
       this.g = new MutableLiveData();
       this.i = new MutableLiveData();
       this.h = p0;
       this.j = p1;
    }
    public void a(Object p0){
       c tj = this.j;
       if (tj.d == null && (tj.c == null && (tj.e != null || tj.f != null))) {
          this.i.postValue(tj.a());
          p0 = this.j;
          if (p0.d != null) {
             p0.d = false;
             this.d.postValue(LoadingStatus.h);
          }
          p0 = this.j;
          if (p0.c != null) {
             p0.c = false;
             this.e.postValue(LoadingStatus.i);
          }
          p0 = this.j;
          if (p0.e != null) {
             p0.e = false;
             this.f.postValue(LoadingStatus.j);
          }
          p0 = this.j;
          if (p0.f != null) {
             p0.f = false;
             this.g.postValue(LoadingStatus.k);
          }
          return;
       }else {
          this.a.postValue(LoadingStatus.d);
          this.b().subscribe(new d(this), new a(this, p0));
          return;
       }
    }
    public abstract t b();
}
