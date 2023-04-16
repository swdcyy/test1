package bz5.a$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import bz5.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import bz5.a$b$a;
import java.lang.Integer;
import bz5.b$b;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View$OnClickListener;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import o56.a;
import java.lang.Runnable;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import i2b.a;

public class a$b extends RecyclerView$Adapter	// class@000630
{
    public final b e;

    public void a$b(b p0){
       super();
       this.e = p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.a.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a$b uob = a$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          b$b uob1 = this.e.a.get(p1);
          if (uob1.a()) {
             p0.a.setBackgroundResource(uob1.a());
          }else {
             p0.a.L(uob1.c);
          }
          p0.a.setOnClickListener(uob1.e);
          if (uob1.c()) {
             p0.b.setText(a1.p(uob1.c()));
             if (a.d()) {
                p0.a.setContentDescription(a1.p(uob1.c()));
             }
          }else {
             p0.b.setText(uob1.b());
             if (a.d()) {
                p0.a.setContentDescription(uob1.b());
             }
          }
          b$b f = uob1.f;
          if (f != null) {
             f.run();
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$b$a uob$a;
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          uob$a = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uob$a != PatchProxyResult.class) {
          label_002a :
             return uob$a;
          }
       }
       uob$a = new a$b$a(a.d(p0.getContext(), 0x7f0d0fdf, p0, false));
       goto label_002a ;
    }
}
