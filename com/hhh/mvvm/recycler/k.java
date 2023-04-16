package com.hhh.mvvm.recycler.k;
import androidx.lifecycle.ViewModel;
import fm.a;
import androidx.lifecycle.MutableLiveData;
import fm.l;
import androidx.lifecycle.LiveData;
import z0.a;
import androidx.lifecycle.Transformations;
import com.hhh.mvvm.recycler.d;
import com.hhh.mvvm.recycler.e;
import com.hhh.mvvm.recycler.f;
import com.hhh.mvvm.recycler.g;
import com.hhh.mvvm.recycler.h;
import com.hhh.mvvm.recycler.i;
import com.hhh.mvvm.recycler.j;
import androidx.lifecycle.MediatorLiveData;
import java.lang.Object;
import java.util.Objects;
import fm.m;
import androidx.lifecycle.Observer;
import com.hhh.mvvm.recycler.c;

public abstract class k extends ViewModel	// class@000571
{
    public final a a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;
    public final LiveData i;
    public final LiveData j;
    public final LiveData k;
    public final LiveData l;
    public final MediatorLiveData m;

    public void k(){
       super();
       this.a = new a();
       this.b = new MutableLiveData();
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.c = mutableLiveD;
       MutableLiveData mutableLiveD1 = new MutableLiveData();
       this.d = mutableLiveD1;
       this.e = Transformations.switchMap(mutableLiveD, new l(this));
       LiveData liveData = Transformations.switchMap(mutableLiveD1, d.a);
       this.f = liveData;
       LiveData liveData1 = Transformations.switchMap(mutableLiveD1, e.a);
       this.g = liveData1;
       LiveData liveData2 = Transformations.switchMap(mutableLiveD1, f.a);
       this.h = liveData2;
       LiveData liveData3 = Transformations.switchMap(mutableLiveD1, g.a);
       this.i = liveData3;
       LiveData liveData4 = Transformations.switchMap(mutableLiveD1, h.a);
       this.j = liveData4;
       LiveData liveData5 = Transformations.switchMap(mutableLiveD1, i.a);
       this.k = liveData5;
       LiveData liveData6 = Transformations.switchMap(mutableLiveD1, j.a);
       this.l = liveData6;
       MediatorLiveData mediatorLive = new MediatorLiveData();
       this.m = mediatorLive;
       Objects.requireNonNull(mediatorLive);
       mediatorLive.addSource(liveData, new m(mediatorLive));
       Objects.requireNonNull(mediatorLive);
       mediatorLive.addSource(liveData1, new m(mediatorLive));
       Objects.requireNonNull(mediatorLive);
       mediatorLive.addSource(liveData2, new m(mediatorLive));
       Objects.requireNonNull(mediatorLive);
       mediatorLive.addSource(liveData3, new m(mediatorLive));
       Objects.requireNonNull(mediatorLive);
       mediatorLive.addSource(liveData4, new m(mediatorLive));
       Objects.requireNonNull(mediatorLive);
       mediatorLive.addSource(liveData5, new m(mediatorLive));
       Objects.requireNonNull(mediatorLive);
       mediatorLive.addSource(liveData6, new m(mediatorLive));
    }
    public LiveData o0(){
       return this.m;
    }
    public void p0(Object p0){
       if (p0 != null && !p0.equals(this.c.getValue())) {
          this.c.postValue(p0);
       }
       return;
    }
    public abstract c q0(Object p0,a p1);
    public void r0(Object p0){
       this.b.setValue(p0);
    }
}
