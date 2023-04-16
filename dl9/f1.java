package dl9.f1;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import dl9.c1;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import java.lang.Enum;
import dl9.z0;
import ag6.a;
import dl9.a1;
import android.view.View$OnClickListener;
import dl9.b1;
import o07.n;

public final class f1 implements PopupInterface$f	// class@001f5e
{
    public final c1 b;

    public void f1(c1 p0){
       this.b = p0;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int intx;
       View view1;
       View view2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, f1.class, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       a.p(p1, "inflater");
       a.p(p2, "container");
       f1 tb = this.b;
       Objects.requireNonNull(tb);
       View view = PatchProxy.applyThreeRefs(p1, p2, p3, tb, c1.class, "10");
       if (view != patchProxyRe) {
       }else if(p3 != null){
          intx = p3.getInt(tb.E);
       }else {
          intx = BubbleInterface$Position.TOP.ordinal();
       }
       BubbleInterface$Position position = BubbleInterface$Position.fromOrdinal(intx);
       a.o(position, "BubbleInterface.Position.fromOrdinal\(ordinal\)");
       intx = z0.a[position.ordinal()];
       boolean b = true;
       if (intx != b) {
          if (intx != 2) {
             view1 = a.c(p1, R.layout.arg_RES_7f0d01cd, p2, false);
             a.o(view1, "inflater.inflate\(R.layou¡­layout, container, false\)");
             if (view1 != null) {
                tb.Y8(view1, b);
             }
          }else {
             view1 = a.c(p1, R.layout.arg_RES_7f0d01cd, p2, false);
             a.o(view1, "inflater.inflate\(R.layou¡­layout, container, false\)");
             if (view1 != null) {
                tb.Y8(view1, b);
             }
          }
       }else {
          view1 = a.c(p1, R.layout.arg_RES_7f0d01cc, p2, false);
          a.o(view1, "inflater.inflate\(R.layou¡­layout, container, false\)");
          if (view1 != null) {
             tb.Y8(view1, false);
          }
       }
       view = view1;
       int i = 8;
       if (view != null) {
          view2 = view.findViewById(R.id.emotion_add);
          if (view2 != null) {
             view2.setVisibility(i);
          }
       }
       if (view != null) {
          view2 = view.findViewById(R.id.emotion_divider);
          if (view2 != null) {
             view2.setVisibility(i);
          }
       }
       view1 = null;
       view2 = (view != null)? view.findViewById(R.id.emotion_report): view1;
       if (view2 != null) {
          view2.setVisibility(false);
       }
       if (view2 != null) {
          view2.setOnClickListener(new a1(tb));
       }
       if (view != null) {
          view1 = view.findViewById(R.id.save_to_album);
       }
       if (view != null) {
          view2 = view.findViewById(R.id.emotion_divider_2);
          if (view2 != null) {
             view2.setVisibility(false);
          }
       }
       if (view1 != null) {
          view1.setVisibility(false);
       }
       if (view1 != null) {
          view1.setOnClickListener(new b1(tb));
       }
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
