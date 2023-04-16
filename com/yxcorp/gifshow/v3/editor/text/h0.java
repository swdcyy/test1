package com.yxcorp.gifshow.v3.editor.text.h0;
import ok.o;
import java.lang.Object;
import android.util.Pair;
import com.yxcorp.gifshow.v3.editor.text.i0;
import java.lang.Integer;
import java.util.List;
import java.util.Map;
import huc.d;
import huc.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class h0 implements o	// class@001456
{
    public static final h0 b;

    static {
       h0.b = new h0();
    }
    public void h0(){
       super();
    }
    public final boolean apply(Object p0){
       int i = 1;
       boolean b = false;
       if (p0.second.intValue() != i || (!i0.g.contains(p0.first) && (p0.second.intValue() != 16 || !i0.h.contains(p0.first)))) {
          c uoc = d.o().get(p0.first);
          if (uoc == null) {
             b = d.p(p0.first, p0.second.intValue());
          }else {
             int i1 = p0.second.intValue();
             i0 oi0 = i0.class;
             Object obj = null;
             if (PatchProxy.isSupport(oi0)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i1), obj, oi0, "1");
                if (obj1 != PatchProxyResult.class) {
                   obj = obj1;
                }else {
                label_0076 :
                   Object[] objArray = new Object[b];
                   a.D().w("EditTextManager", "getEditEnvIdList target:"+i1, objArray);
                   if (i1 == i) {
                      obj = i0.l;
                   }
                }
             }else {
                goto label_0076 ;
             }
             if (obj != null) {
                b = obj.contains(p0.first);
             }else if((uoc.f(p0.first) & p0.second.intValue()) == p0.second.intValue()){
                i = 0;
             }
             b = i;
          }
       }
       return b;
    }
}
