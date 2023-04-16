package com.kuaishou.merchant.basic.util.i;
import erd.o;
import android.widget.RatingBar;
import java.lang.Object;
import java.util.Map$Entry;
import ot3.d0;
import io.reactivex.g;
import brd.t;

public final class i implements o	// class@0015de
{
    public final RatingBar b;
    public final int c;

    public void i(RatingBar p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       return t.create(new d0(p0, this.b, this.c));
    }
}
