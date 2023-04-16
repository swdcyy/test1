package com.yxcorp.gifshow.trending.list.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.trending.list.e;
import com.yxcorp.gifshow.trending.list.TrendingListAdapter$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class c extends Accessor	// class@001db3
{
    public final TrendingListAdapter$a c;
    public final e d;

    public void c(e p0,TrendingListAdapter$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.h;
    }
    public void set(Object p0){
       this.c.h = p0;
    }
}
