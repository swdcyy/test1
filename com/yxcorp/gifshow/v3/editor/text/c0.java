package com.yxcorp.gifshow.v3.editor.text.c0;
import ok.o;
import java.lang.Object;
import android.util.Pair;
import com.yxcorp.gifshow.v3.editor.text.i0;
import java.lang.String;
import java.lang.Integer;
import huc.d;
import nuc.a;
import java.util.List;

public final class c0 implements o	// class@0013b3
{
    public static final c0 b;

    static {
       c0.b = new c0();
    }
    public void c0(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b;
       Pair first = p0.first;
       if (d.p(first, p0.second.intValue())) {
          p0 = d.n(first);
          b = (p0 == null)? false: d.r(p0, p0.l());
       }else {
          b = true;
       }
       return b;
    }
}
