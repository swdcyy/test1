package cl5.e$a;
import sl8.b;
import cl5.e;
import java.lang.Object;
import android.view.ViewGroup;
import sl8.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import wk5.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import cl5.c;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yk5.f;
import xk5.c;
import al5.g;
import cl5.l;
import cl5.d;
import cl5.j;
import java.util.Set;

public class e$a implements b	// class@0006ee
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public a a(ViewGroup p0,int p1){
       a uoa1;
       View view;
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uoa1 != PatchProxyResult.class) {
          }else {
          label_001a :
             boolean b = false;
             if (p1 != 100) {
                if (p1 != 101) {
                   if (p1 != 200 && p1 != 400) {
                      if (p1 != 1000) {
                         if (p1 != 300) {
                            if (p1 != 301) {
                               uoa1 = null;
                            }else {
                               view = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d03ec, p0, b);
                               view.setOnClickListener(new c(this));
                               uoa1 = new a(view, new PresenterV2(), this.a.p.d(), this.a.r);
                            }
                         }
                      }else {
                         uoa1 = new a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d03e4, p0, b), new g(), this.a.p.d(), this.a.r);
                      }
                   }else {
                      uoa1 = new a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d03dc, p0, b), new l(), this.a.p.d(), this.a.r);
                   }
                }else {
                   view = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d03d6, p0, b);
                   view.setOnClickListener(new d(this));
                   uoa1 = new a(view, new PresenterV2(), this.a.p.d(), this.a.r);
                }
             }
             uoa1 = new a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d03d8, p0, b), new j(), this.a.p.d(), this.a.r);
          }
       }else {
          goto label_001a ;
       }
       return uoa1;
    }
    public Set b(){
       return null;
    }
}
