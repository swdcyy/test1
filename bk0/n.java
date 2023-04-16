package bk0.n;
import mk0.a;
import bk0.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bk0.j;
import lj0.c;
import zj0.v;
import java.lang.Throwable;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import ik0.m;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import zj0.x;
import zj0.w;

public final class n extends d implements a	// class@0003ad
{

    public void n(){
       super();
    }
    public final void G(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "4")) {
          return;
       }
       j.b.b("krn_page_show", d.F(this, this.D(), objArray, 2, objArray));
       return;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       c uoc = this.D();
       if (uoc != null) {
          m om = uoc.l();
          if (om != null) {
             KrnDelegate krnDelegate = om.getKrnDelegate();
             if (krnDelegate != null) {
                KrnReactRootView krnReactRoot = krnDelegate.g();
                if (krnReactRoot != null) {
                   krnReactRoot.setKdsAttachWindowCallback(this);
                   if (krnReactRoot.R != null) {
                      this.G();
                   }
                }
             }
          }
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       w.t(this);
       c uoc = this.D();
       if (uoc != null) {
          m om = uoc.l();
          if (om != null) {
             KrnDelegate krnDelegate = om.getKrnDelegate();
             if (krnDelegate != null) {
                KrnReactRootView krnReactRoot = krnDelegate.g();
                if (krnReactRoot != null) {
                   krnReactRoot.setKdsAttachWindowCallback(null);
                }
             }
          }
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       this.G();
       return;
    }
    public void onDetachedFromWindow(){
    }
}
