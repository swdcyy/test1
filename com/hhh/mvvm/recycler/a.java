package com.hhh.mvvm.recycler.a;
import erd.g;
import com.hhh.mvvm.recycler.c;
import java.lang.Object;
import java.lang.Throwable;
import com.hhh.mvvm.recycler.b;
import fm.a;
import java.util.List;
import java.util.ArrayList;
import androidx.lifecycle.MutableLiveData;
import com.hhh.mvvm.recycler.LoadingStatus;
import com.hhh.mvvm.recycler.LoadingStatus$Status;

public final class a implements g	// class@000567
{
    public final c b;
    public final Object c;

    public void a(c p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tb = this.b;
       tb.k = new b(tb, this.c);
       if (!tb.j.a.isEmpty()) {
          tb.i.postValue(tb.j.a());
       }
       tb.a.postValue(new LoadingStatus(LoadingStatus$Status.FAILED, p0));
       return;
    }
}
