package jw8.r;
import c35.a;
import android.content.Context;
import com.kuaishou.viewbinder.IViewBinder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import jw8.a;
import android.app.Activity;
import android.content.Intent;
import q46.t;
import c35.c;
import qxc.c;
import c35.b;
import jw8.s;
import java.util.List;
import ypc.a;
import java.util.ArrayList;
import huc.b;
import android.view.View;
import jw8.r$a;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class r extends a	// class@0029ca
{
    public r$a h;
    public List i;
    public b j;

    public void r(){
       super();
    }
    public IViewBinder J0(Context p0,int p1){
       IViewBinder iViewBinder;
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          iViewBinder = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, or, "1");
          if (iViewBinder != PatchProxyResult.class) {
          }else if(p0 instanceof Activity){
             iViewBinder = c.a(t.c(p0.getIntent()), a.class, null);
          }else {
             iViewBinder = null;
          }
       }else {
          goto label_0019 ;
       }
       return iViewBinder;
    }
    public void K0(b p0,int p1){
       r or = r.class;
       if (!PatchProxy.isSupport(or) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, or, "2")) {
          p0.d(p1, this.i.get(p1), new ArrayList(), this.j);
       }
       return;
    }
    public b L0(View p0,int p1,IViewBinder p2){
       s os;
       if (PatchProxy.isSupport(r.class)) {
          os = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, r.class, "3");
          if (os != PatchProxyResult.class) {
          label_0027 :
             return os;
          }
       }
       os = new s(p0, p2, this.h);
       goto label_0027 ;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.size();
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       if (!PatchProxy.isSupport(r.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, r.class, "4")) {
          p0.d(p1, this.i.get(p1), p2, this.j);
       }
       return;
    }
}
