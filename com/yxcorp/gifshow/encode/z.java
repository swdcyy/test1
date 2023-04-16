package com.yxcorp.gifshow.encode.z;
import erd.g;
import java.lang.Object;
import java.lang.Integer;
import e17.i;
import java.lang.IllegalStateException;
import java.lang.String;

public final class z implements g	// class@000d5d
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final void accept(Object p0){
       if (p0.intValue() != 2) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f100dd5);
       throw new IllegalStateException("can not allow download photo");
    }
}
