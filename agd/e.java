package agd.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a17.c$a;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import a17.g;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import agd.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import agd.d;
import android.view.View$OnClickListener;

public class e extends RecyclerView$Adapter	// class@00002c
{
    public c$a e;
    public Activity f;
    public int g;
    public int[] h;

    public void e(c$a p0,Activity p1,int p2){
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = this.K0();
    }
    public void J0(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "5")) {
          return;
       }
       this.g = p0;
       this.k0();
       return;
    }
    public int[] K0(){
       return null;
    }
    public final g L0(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= 0 && p0 < this.getItemCount()) {
          return this.e.N.get(p0);
       }else {
          return null;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.N.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
          uoe = this.h;
          if (uoe.length > 0) {
             p0.a.setImageDrawable(j.n(this.f, uoe[p1], R.color.arg_RES_7f061641));
          }
          f c = p0.c;
          CharSequence uCharSequenc = (this.L0(p1) != null)? this.L0(p1).b(): "";
          c.setText(uCharSequenc);
          if (p1 != this.g) {
             p0.b.setVisibility(8);
          }else {
             p0.b.setVisibility(0);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       f uof;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          uof = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (uof != PatchProxyResult.class) {
          label_0038 :
             return uof;
          }
       }
       uof = new f(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d1648, p0, false));
       uof.e.setOnClickListener(new d(this, uof));
       goto label_0038 ;
    }
}
