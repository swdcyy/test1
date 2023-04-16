package com.yxcorp.gifshow.share.widget.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.widget.k;
import com.yxcorp.gifshow.share.widget.d$b;
import java.lang.Object;
import java.lang.String;

public class i extends Accessor	// class@001d28
{
    public final d$b c;
    public final k d;

    public void i(k p0,d$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.l;
    }
    public void set(Object p0){
       this.c.l = p0;
    }
}
