package gna.d$b;
import gna.d$a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderEnum;
import gna.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gna.b$d;
import gna.d;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderKt;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import gna.b$a;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import gna.d$b$a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import gna.d$b$b;
import android.content.Context;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt;
import java.util.Objects;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.view.Display;
import msd.l;

public final class d$b extends d$a	// class@002b32
{
    public final GrowthCleanerViewHolderEnum q;
    public l r;

    public void d$b(View p0){
       a.p(p0, "itemView");
       super(p0);
       this.q = GrowthCleanerViewHolderEnum.SelectTitle;
    }
    public GrowthCleanerViewHolderEnum c(){
       return this.q;
    }
    public void g(b p0){
       int i5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       if (!p0 instanceof b$d) {
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
                               int i1 = 8;
                               int i2 = (p0.d() == null)? 8: 0;
                               tf.setVisibility(i2);
                               tg.setText(p0.i());
                               b$a uoa = p0;
                               int i3 = (uoa.C() && uoa.v() > 0)? 0: 8;
                               th.setVisibility(i3);
                               i3 = (uoa.B())? 0x7f080dfe: 0x7f080e00;
                               th.setImageResource(i3);
                               String str = p0.g();
                               Integer integer = p0.h();
                               int i4 = (integer != null)? integer.intValue(): this.f();
                               this.a(ti, str, i4, p0.m());
                               i3 = (p0.g() == null)? 8: 0;
                               ti.setVisibility(i3);
                               String str1 = p0.a();
                               Integer integer1 = p0.b();
                               i3 = (integer1 != null)? integer1.intValue(): this.b();
                               this.a(tj, str1, i3, p0.k());
                               if (p0.a() != null) {
                                  i1 = 0;
                               }
                               tj.setVisibility(i1);
                               tk.setBackgroundResource(R.drawable.arg_RES_7f080cf0);
                               tk.setSelected(p0.l());
                               b$a uoa1 = b$a.class;
                               Object obj = PatchProxy.apply(null, uoa, uoa1, "3");
                               if (obj != patchProxyRe) {
                                  i2 = obj.intValue();
                               }else if(uoa.l()){
                                  i = 1;
                               }else if(!uoa.l()){
                                  obj = PatchProxy.apply(null, uoa, uoa1, "4");
                                  if (obj != patchProxyRe) {
                                     i2 = obj.booleanValue();
                                  }else {
                                     ArrayList uArrayList = PatchProxy.apply(null, uoa, uoa1, "5");
                                     if (uArrayList != patchProxyRe) {
                                     }else {
                                        uArrayList = new ArrayList();
                                        Iterator iterator = uoa.w().iterator();
                                        while (iterator.hasNext()) {
                                           obj = iterator.next();
                                           if (obj.l()) {
                                              uArrayList.add(obj);
                                           }
                                        }
                                     }
                                     i2 = uArrayList.isEmpty() ^ 1;
                                  }
                                  if (i2) {
                                     i = 2;
                                  }
                               }
                               i2 = i;
                               if (i2 == 2) {
                                  tk.setBackgroundResource(R.drawable.arg_RES_7f080cf2);
                               }
                               tm.setOnClickListener(new d$b$a(this, tk, p0));
                               this.itemView.setOnClickListener(new d$b$b(this, th, p0));
                               if (!th.getVisibility()) {
                                  RecyclerView$ViewHolder titemView = this.itemView;
                                  a.o(titemView, "itemView");
                                  Context context = titemView.getContext();
                                  a.o(context, "itemView.context");
                                  Object obj1 = PatchProxy.applyOneRefs(context, null, GrowthCommonExtKt.class, "20");
                                  if (obj1 != patchProxyRe) {
                                     i5 = obj1.intValue();
                                  }else {
                                     a.p(context, "context");
                                     DisplayMetrics systemServic = context.getSystemService("window");
                                     Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.view.WindowManager");
                                     DisplayMetrics uDisplayMetr = new DisplayMetrics();
                                     systemServic.getDefaultDisplay().getMetrics(uDisplayMetr);
                                     systemServic = uDisplayMetr.widthPixels;
                                  }
                                  i5 = ((i5 - GrowthCleanerViewHolderKt.c(p0)) - GrowthCleanerViewHolderKt.b) - GrowthCleanerViewHolderKt.e;
                                  if (!tf.getVisibility()) {
                                     i5 = i5 - GrowthCleanerViewHolderKt.c;
                                  }
                                  tg.setMaxWidth((i5 - GrowthCleanerViewHolderKt.d));
                               }else {
                                  tg.setMaxWidth(Integer.MAX_VALUE);
                               }
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
    public final void p(l p0){
       this.r = p0;
    }
}
