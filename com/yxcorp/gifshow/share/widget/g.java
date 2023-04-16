package com.yxcorp.gifshow.share.widget.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.widget.k;
import com.yxcorp.gifshow.share.widget.d$b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class g extends Accessor	// class@001d26
{
    public final d$b c;
    public final k d;

    public void g(k p0,d$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
