package com.gifshow.kanim.a$c;
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

public class a$c implements Callable	// class@0015af
{
    public final String b;
    public final a c;

    public void a$c(a p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object call(){
       e uoe;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a$c obj = PatchProxy.apply(objArray, this, a$c.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.c;
          if (obj.h != null) {
             Context context = obj.b.getContext();
             a$c tb = this.b;
             Object obj1 = PatchProxy.applyTwoRefs(context, tb, objArray, b.class, "7");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                uoe = b.h(context, tb, "url_"+tb);
             }
          }else {
             uoe = b.h(obj.b.getContext(), this.b, objArray);
          }
          obj = uoe;
       }
       return obj;
    }
}
