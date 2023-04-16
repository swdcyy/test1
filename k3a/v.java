package k3a.v;
import j3a.b;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import j3a.b$a;
import j3a.a;
import k3a.u;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Objects;
import k3a.w;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import i2b.a;
import com.yxcorp.gifshow.detail.player.panel.elements.SpeedItemModel;
import android.text.SpannableStringBuilder;
import kotlin.text.StringsKt__StringsKt;
import com.yxcorp.gifshow.detail.player.panel.BaselineShiftSpan;
import android.content.Context;
import android.content.res.Resources;
import cw9.c;
import qrd.l1;
import android.graphics.Typeface;
import ekd.d0;
import k3a.x;
import msd.p;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class v implements b	// class@002bd8
{
    public TextView a;
    public w b;

    public void v(){
       super();
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return b$a.a(this, p0);
    }
    public void c(a p0){
       v a;
       int i7;
       x obj = this;
       u obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, v.class, "3")) {
       }else {
          a.p(obj1, "element");
          a = obj.a;
          if (a == null) {
             a.S("title");
          }
          a.setText(obj1.e);
          a = obj.b;
          if (a == null) {
             a.S("speedItemHelper");
          }
          u f = obj1.f;
          obj1 = obj1.g;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(f, obj1, a, w.class, "1")) {
             a.p(f, "items");
             a.a.removeAllViews();
             if (!f.isEmpty()) {
                ArrayList uArrayList = new ArrayList();
                int i = f.size();
                for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                   TextView textView = a.i(a.a, R.layout.arg_RES_7f0d116a);
                   a.o(textView, "view");
                   textView.setId(View.generateViewId());
                   uArrayList.add(textView);
                }
                int i2 = f.size();
                int i3 = 0;
                while (i3 < i2) {
                   SpannableStringBuilder obj2 = uArrayList.get(i3);
                   a.o(obj2, "itemViews[i]");
                   Object obj3 = obj2;
                   Object obj4 = f.get(i3);
                   obj2 = new SpannableStringBuilder(obj4.getDisplayName());
                   int i4 = StringsKt__StringsKt.i3(obj4.getDisplayName(), "x", 0, false, 6, null);
                   if (i4 != -1) {
                      Context context = obj3.getContext();
                      a.o(context, "view.context");
                      int i5 = - c.b(context.getResources(), 0x7f0702ac);
                      BaselineShiftSpan uBaselineShi = new BaselineShiftSpan(i5);
                      i5 = i4 + 1;
                      obj2.setSpan(uBaselineShi, i4, i5, 17);
                   }
                   obj3.setText(obj2);
                   obj3.setTypeface(d0.a("alte-din.ttf", obj3.getContext()));
                   obj3.setSelected(obj4.getSelected$detail_release());
                   x ox = v10;
                   obj = v10;
                   u ou = obj1;
                   Object obj5 = obj3;
                   int i6 = i2;
                   i2 = -1;
                   ox = new x(a, uArrayList, f, obj4, obj1, 1, 500);
                   obj5.setOnClickListener(obj);
                   a.a.addView(obj5);
                   ViewGroup$LayoutParams layoutParams = obj5.getLayoutParams();
                   Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                   if (!i3) {
                      layoutParams.q = a.a.getId();
                      layoutParams.p = i2;
                   }else {
                      layoutParams.q = i2;
                      i7 = i3 - 1;
                      obj5 = uArrayList.get(i7);
                      a.o(obj5, "itemViews[i - 1]");
                      layoutParams.p = obj5.getId();
                   }
                   i7 = f.size() + i2;
                   if (i3 == i7) {
                      layoutParams.s = a.a.getId();
                      layoutParams.r = i2;
                   }else {
                      layoutParams.s = i2;
                      i7 = i3 + 1;
                      obj5 = uArrayList.get(i7);
                      a.o(obj5, "itemViews[i + 1]");
                      layoutParams.r = obj5.getId();
                   }
                   i3 = i3 + 1;
                   i2 = i6;
                   obj1 = ou;
                }
             }
          }
       }
       return;
    }
    public View d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d1169);
       a.o(view, "KwaiLayoutInflater.infla¡­ayer_panel_element_speed\)");
       return view;
    }
    public void k(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = p0.findViewById(R.id.title);
       a.o(view, "view.findViewById\(R.id.title\)");
       this.a = view;
       ConstraintLayout uConstraintL = p0.findViewById(R.id.speed_container);
       a.o(uConstraintL, "speedContainer");
       this.b = new w(uConstraintL);
       return;
    }
}
