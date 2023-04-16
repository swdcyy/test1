package com.kuaishou.live.gzone.treasurebox.presenter.r$d;
import m53.b$b;
import com.kuaishou.live.gzone.treasurebox.presenter.r;
import java.lang.Object;
import android.view.View;
import m53.c$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.treasure.box.bean.PanelVisibilityType;
import x57.a;
import m53.c;
import java.lang.Boolean;
import m53.c$a$a;

public class r$d implements b$b	// class@001c95
{
    public final r a;

    public void r$d(r p0){
       this.a = p0;
       super();
    }
    public View a(){
       return this.a.N;
    }
    public c$a j2(){
       Object obj1;
       c$a d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, r$d.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       int b = a.b(this.a.A);
       if (PatchProxy.isSupport(c.class)) {
          obj1 = PatchProxy.applyTwoRefs(Boolean.TRUE, Boolean.valueOf(b), objArray, c.class, "5");
          if (obj1 != patchProxyRe) {
          }else {
          label_0031 :
             int i = 3;
             if (b) {
                obj = PatchProxy.apply(objArray, objArray, c.class, "4");
                if (obj != patchProxyRe) {
                   obj1 = obj;
                }else if(c.d == null){
                   c.d = new c$a(new c$a$a(true, 0x7fff, i), new c$a$a(true, 0x7fff, i));
                }
                d = c.d;
             }else {
                b = 4;
                Object obj2 = PatchProxy.apply(objArray, objArray, c.class, "3");
                if (obj2 != patchProxyRe) {
                   obj1 = obj2;
                }else if(c.c == null){
                   c.c = new c$a(new c$a$a(true, 0x7fff, b), new c$a$a(true, 0x7fff, b));
                }
                d = c.c;
             }
             obj1 = d;
          }
       }else {
          goto label_0031 ;
       }
       return obj1;
    }
    public boolean k2(){
       return true;
    }
}
