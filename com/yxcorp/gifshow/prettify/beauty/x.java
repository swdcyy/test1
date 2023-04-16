package com.yxcorp.gifshow.prettify.beauty.x;
import erd.g;
import com.yxcorp.gifshow.prettify.beauty.y;
import java.lang.Object;
import w16.j;
import java.util.Objects;
import q0c.b2;

public final class x implements g	// class@001129
{
    public final y b;

    public void x(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a != null) {
       }else if(tb.H != null){
          tb.C2(p0);
       }else {
          tb.I = new b2(tb, p0);
       }
       return;
    }
}
