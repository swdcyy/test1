package gna.d$a;
import gna.d;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderEnum;
import android.widget.ImageView;
import android.widget.TextView;
import gna.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gna.b$c;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderKt;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import java.lang.Integer;
import gna.d$a$a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import gna.d$a$b;
import msd.a;
import msd.p;
import android.graphics.drawable.AnimationDrawable;

public class d$a extends d	// class@002b2f
{
    public final GrowthCleanerViewHolderEnum d;
    public final View e;
    public final ImageView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;
    public final ImageView k;
    public final View l;
    public final View m;
    public a n;
    public p o;
    public boolean p;

    public void d$a(View p0){
       a.p(p0, "itemView");
       super(p0);
       this.d = GrowthCleanerViewHolderEnum.SelectItem;
       this.e = p0.findViewById(0x7f0a071f);
       this.f = p0.findViewById(0x7f0a0723);
       this.g = p0.findViewById(0x7f0a0735);
       this.h = p0.findViewById(0x7f0a0721);
       this.i = p0.findViewById(0x7f0a0730);
       this.j = p0.findViewById(0x7f0a0720);
       this.k = p0.findViewById(0x7f0a071d);
       this.l = p0.findViewById(0x7f0a0725);
       this.m = p0.findViewById(0x7f0a072d);
    }
    public GrowthCleanerViewHolderEnum c(){
       return this.d;
    }
    public void g(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "4")) {
          return;
       }
       if (!p0 instanceof b$c) {
          return;
       }
       this.h(p0);
       d$a te = this.e;
       if (te != null) {
          d$a tf = this.f;
          if (tf != null) {
             d$a tg = this.g;
             if (tg != null) {
                d$a th = this.h;
                if (th != null) {
                   d$a ti = this.i;
                   if (ti != null) {
                      d$a tj = this.j;
                      if (tj != null) {
                         d$a tk = this.k;
                         if (tk != null) {
                            d$a tm = this.m;
                            if (tm != null) {
                               int i = 0;
                               te.setPadding(GrowthCleanerViewHolderKt.c(p0), i, GrowthCleanerViewHolderKt.b, i);
                               tf.setImageDrawable(p0.d());
                               int i1 = (p0.d() == null)? 8: 0;
                               tf.setVisibility(i1);
                               tg.setText(p0.i());
                               th.setVisibility(8);
                               String str = p0.g();
                               Integer integer = p0.h();
                               int i2 = (integer != null)? integer.intValue(): this.f();
                               this.a(ti, str, i2, p0.m());
                               i1 = (p0.g() == null)? 8: 0;
                               ti.setVisibility(i1);
                               str = p0.a();
                               integer = p0.b();
                               i2 = (integer != null)? integer.intValue(): this.b();
                               this.a(tj, str, i2, p0.k());
                               if (p0.a() == null) {
                                  i = 8;
                               }
                               tj.setVisibility(i);
                               tk.setSelected(p0.l());
                               tm.setOnClickListener(new d$a$a(this, tk, p0));
                               this.itemView.setOnClickListener(new d$a$b(this));
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public final a i(){
       return this.n;
    }
    public final p j(){
       return this.o;
    }
    public final void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$a.class, "3")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       this.p = false;
       d$a tk = this.k;
       if (tk != null) {
          tk.setImageDrawable(objArray);
          tk.setBackgroundResource(R.drawable.arg_RES_7f080cf0);
       }
       return;
    }
    public final boolean l(){
       return this.p;
    }
    public final void m(p p0){
       this.o = p0;
    }
    public final void n(){
       Drawable drawable;
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       if (this.p != null) {
          return;
       }
       this.p = true;
       d$a tk = this.k;
       if (tk != null) {
          tk.setBackgroundResource(R.drawable.arg_RES_7f0802c9);
          tk.setImageResource(R.drawable.arg_RES_7f080490);
          drawable = tk.getDrawable();
          if (drawable instanceof AnimationDrawable) {
             drawable.start();
          }
       }
       return;
    }
    public final void o(String p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       b uob = this.d();
       if (uob != null) {
          uob.n(p0);
       }
       d$a tj = this.j;
       boolean b = false;
       if (tj != null) {
          i = (p0 == null)? 8: 0;
          tj.setVisibility(i);
       }
       tj = this.j;
       b uob1 = this.d();
       if (uob1 != null) {
          Integer integer = uob1.b();
          if (integer != null) {
             i = integer.intValue();
          label_0039 :
             b uob2 = this.d();
             if (uob2 != null) {
                b = uob2.k();
             }
             this.a(tj, p0, i, b);
             return;
          }
       }
       i = this.b();
       goto label_0039 ;
    }
}
