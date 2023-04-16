package com.yxcorp.gifshow.mockphoto.e;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.mockphoto.i;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.mockphoto.j;
import java.util.Map;

public final class e implements g	// class@001de3
{
    public final QPhoto b;
    public final String c;

    public void e(QPhoto p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       k1.o(new i(this.b, p0));
       j.b.remove(this.c);
    }
}
