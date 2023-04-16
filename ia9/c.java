package ia9.c;
import ec7.a;
import java.util.ArrayList;
import ga9.b;
import ia9.d;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModel;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.os.Bundle;
import java.lang.Boolean;
import ia9.a;
import android.view.View$OnClickListener;
import ia9.b;
import android.view.View$OnLongClickListener;

public abstract class c extends a	// class@00265b
{
    public b g;
    public c h;
    public a i;

    public void c(){
       super(true);
       this.e = new ArrayList();
    }
    public abstract b T0(int p0);
    public void U0(d p0,int p1,List p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "1")) {
          return;
       }
       a.q(p0, "holder");
       a.q(p2, "payloads");
       p0.a(this.L0(p1), p2, this.X0());
       return;
    }
    public void V0(d p0,int p1,List p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "4")) {
          return;
       }
       a.q(p0, "holder");
       a.q(p2, "payloads");
       this.U0(p0, p1, p2);
       p0.b().i(this, p1, p2, this.X0());
       return;
    }
    public abstract d W0(View p0,int p1,b p2);
    public ViewModel X0(){
       return null;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3")) {
          a.q(p0, "holder");
          this.V0(p0, p1, new ArrayList());
       }
       return;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.V0(p0, p1, p2);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       d uod;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          uod = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2");
          if (uod != patchProxyRe) {
          }else {
          label_001a :
             a.q(p0, "parent");
             b uob = this.T0(p1);
             LayoutInflater layoutInflat = LayoutInflater.from(p0.getContext());
             a.h(layoutInflat, "LayoutInflater.from\(parent.context\)");
             uod = this.W0(uob.f(layoutInflat, p0, null), p1, uob);
             uod.c();
             ViewModel viewModel = this.X0();
             Object obj = PatchProxy.applyOneRefs(viewModel, uod, d.class, "4");
             boolean b = (obj != patchProxyRe)? obj.booleanValue(): uod.b().a(viewModel);
             if (!b) {
                viewModel = this.X0();
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(uod, Integer.valueOf(p1), viewModel, this, c.class, "5")) {
                   a.q(uod, "viewHolder");
                   uod.b = this.i;
                   if (this.g != null) {
                      uod.itemView.setOnClickListener(new a(this, uod));
                   }
                   if (this.h != null) {
                      uod.itemView.setOnLongClickListener(new b(this, uod));
                   }
                   uod.onBindClickEvent(p1, viewModel);
                }
             }
          }
       }else {
          goto label_001a ;
       }
       return uod;
    }
}
