package com.gifshow.kanim.a$b;
import java.util.concurrent.Callable;
import com.gifshow.kanim.a;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bh.e;
import android.content.Context;
import android.view.View;
import com.gifshow.kanim.b;
import java.lang.StringBuilder;

public class a$b implements Callable	// class@0015ae
{
    public final String b;
    public final a c;

    public void a$b(a p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object call(){
       e uoe;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a$b obj = PatchProxy.apply(objArray, this, a$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.c;
          if (obj.h != null) {
             Context context = obj.b.getContext();
             a$b tb = this.b;
             Object obj1 = PatchProxy.applyTwoRefs(context, tb, objArray, b.class, "11");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                uoe = b.c(context, tb, "asset_"+tb);
             }
          }else {
             uoe = b.c(obj.b.getContext(), this.b, objArray);
          }
          obj = uoe;
       }
       return obj;
    }
}
