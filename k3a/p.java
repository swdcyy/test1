package k3a.p;
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
import k3a.o;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Objects;
import k3a.r;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import i2b.a;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityItemModel;
import android.text.TextPaint;
import k3a.q;
import msd.p;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class p implements b	// class@002bd2
{
    public TextView a;
    public r b;

    public void p(){
       super();
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return b$a.a(this, p0);
    }
    public void c(a p0){
       p a;
       Object obj7;
       int i7;
       LinearLayout obj = this;
       o obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, p.class, "3")) {
       }else {
          a.p(obj1, "element");
          a = obj.a;
          if (a == null) {
             a.S("mTitle");
          }
          a.setText(obj1.e);
          a = obj.b;
          if (a == null) {
             a.S("mQualityItemHelper");
          }
          o f = obj1.f;
          obj1 = obj1.g;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(f, obj1, a, r.class, "1")) {
             a.p(f, "items");
             a.a.removeAllViews();
             if (!f.isEmpty()) {
                ArrayList uArrayList = new ArrayList();
                boolean i = f.size();
                int i1 = 0;
                int i2 = 0x7f0d1167;
                while (i1 < i) {
                   LinearLayout linearLayout = a.i(a.a, i2);
                   a.o(linearLayout, "view");
                   linearLayout.setId(View.generateViewId());
                   uArrayList.add(linearLayout);
                   i1 = i1 + 1;
                }
                int i3 = f.size();
                int i4 = 0;
                i = true;
                while (i4 < i3) {
                   TextView obj2 = uArrayList.get(i4);
                   a.o(obj2, "itemViews[i]");
                   Object obj3 = obj2;
                   Object obj4 = f.get(i4);
                   obj2 = obj3.findViewById(R.id.item_title);
                   TextView textView = obj3.findViewById(R.id.item_sub_title);
                   a.o(obj2, "itemTitle");
                   obj2.setText(obj4.getTitle());
                   a.o(textView, "itemSubTitle");
                   textView.setText(obj4.getSubTitle());
                   TextPaint paint = obj2.getPaint();
                   a.o(paint, "itemTitle.paint");
                   paint.setFakeBoldText(i);
                   paint = textView.getPaint();
                   a.o(paint, "itemSubTitle.paint");
                   paint.setFakeBoldText(i);
                   obj3.setSelected(obj4.getSelected$detail_release());
                   q oq = v8;
                   q oq1 = v8;
                   Object obj5 = obj3;
                   Object obj6 = obj3;
                   oq = new q(a, uArrayList, f, obj5, obj4, obj1, 1, 500);
                   obj7 = obj6;
                   obj7.setOnClickListener(oq1);
                   a.a.addView(obj7);
                   i4 = i4 + 1;
                   i3 = i3;
                   i2 = 0x7f0d1167;
                }
                int i5 = 0x7f0d1167;
                if (f.size() == 2) {
                   obj = a.i(a.a, i5);
                   a.o(obj, "fakeView");
                   obj.setId(View.generateViewId());
                   obj.setVisibility(4);
                   a.a.addView(obj);
                   uArrayList.add(obj);
                }
                r a1 = a.a;
                int childCount = a1.getChildCount();
                int i6 = 0;
                while (i6 < childCount) {
                   View childAt = a1.getChildAt(i6);
                   a.o(childAt, "getChildAt\(index\)");
                   ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                   Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                   i1 = -1;
                   if (!i6) {
                      layoutParams.q = a.a.getId();
                      layoutParams.p = i1;
                   }else {
                      layoutParams.q = i1;
                      i7 = i6 - 1;
                      Object obj8 = uArrayList.get(i7);
                      a.o(obj8, "itemViews[i - 1]");
                      layoutParams.p = obj8.getId();
                   }
                   i7 = uArrayList.size() - i;
                   if (i6 == i7) {
                      layoutParams.s = a.a.getId();
                      layoutParams.r = i1;
                   }else {
                      layoutParams.s = i1;
                      i1 = i6 + 1;
                      obj7 = uArrayList.get(i1);
                      a.o(obj7, "itemViews[i + 1]");
                      layoutParams.r = obj7.getId();
                   }
                   i6 = i6 + 1;
                }
             }
          }
       }
       return;
    }
    public View d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d1166);
       a.o(view, "KwaiLayoutInflater.infla¡­er_panel_element_quality\)");
       return view;
    }
    public void k(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = p0.findViewById(R.id.title);
       a.o(view, "view.findViewById\(R.id.title\)");
       this.a = view;
       ConstraintLayout uConstraintL = p0.findViewById(R.id.clarity_container);
       a.o(uConstraintL, "clarityContainer");
       this.b = new r(uConstraintL);
       return;
    }
}
