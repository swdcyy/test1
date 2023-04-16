package e0b.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import e0b.f$b;
import java.lang.Integer;
import xza.a;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import e0b.g;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;

public final class f extends RecyclerView$Adapter	// class@0025c2
{
    public f$a e;
    public int f;
    public List g;

    public void f(List p0){
       a.p(p0, "mList");
       super();
       this.g = p0;
       this.f = 0x7f0d08de;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "3")) {
          a.p(p0, "holder");
          p0.b.setText(this.g.get(p1).a().getName());
          p0.a.setOnClickListener(new g(this, p1));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       f$b uob;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "1");
          if (uob != PatchProxyResult.class) {
          label_0037 :
             return uob;
          }
       }
       a.p(p0, "parent");
       View view = a.c(LayoutInflater.from(p0.getContext()), this.f, p0, false);
       a.o(view, "view");
       uob = new f$b(this, view);
       goto label_0037 ;
    }
}
