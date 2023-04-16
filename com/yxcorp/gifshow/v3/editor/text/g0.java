package com.yxcorp.gifshow.v3.editor.text.g0;
import ok.o;
import java.lang.Object;
import android.util.Pair;
import com.yxcorp.gifshow.v3.editor.text.i0;
import java.util.List;
import java.lang.Boolean;
import huc.d;

public final class g0 implements o	// class@001453
{
    public static final g0 b;

    static {
       g0.b = new g0();
    }
    public void g0(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = false;
       if (i0.i.contains(p0.first)) {
       }else if(p0.second.booleanValue() || (!i0.j.contains(p0.first) && !d.f.contains(p0.first))){
          b = true;
       }
       return b;
    }
}
