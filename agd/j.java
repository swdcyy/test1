package agd.j;
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
import agd.k;
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
import agd.i;
import android.view.View$OnClickListener;

public class j extends RecyclerView$Adapter	// class@000031
{
    public c$a e;
    public int[] f;
    public Activity g;
    public int h;

    public void j(c$a p0,Activity p1,int p2){
       super();
       int[] ointArray = new int[]{0x7f08229e,0x7f08054b,0x7f080544,0x7f080568};
       this.f = ointArray;
       this.e = p0;
       this.g = p1;
       this.h = p2;
    }
    public void J0(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "5")) {
          return;
       }
       this.h = p0;
       this.k0();
       return;
    }
    public final g K0(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "4");
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
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.N.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oj, "2")) {
          p0.a.setImageDrawable(j.n(this.g, this.f[p1], R.color.arg_RES_7f061641));
          k c = p0.c;
          CharSequence uCharSequenc = (this.K0(p1) != null)? this.K0(p1).b(): "";
          c.setText(uCharSequenc);
          if (p1 == 3) {
             p0.d.setVisibility(0);
             p0.b.setVisibility(8);
          }else if(p1 != this.h){
             p0.b.setVisibility(8);
          }else {
             p0.b.setVisibility(0);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       k ok;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          ok = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj, "1");
          if (ok != PatchProxyResult.class) {
          label_0038 :
             return ok;
          }
       }
       ok = new k(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d1648, p0, false));
       ok.e.setOnClickListener(new i(this, ok));
       goto label_0038 ;
    }
}
