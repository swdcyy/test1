package dl9.g0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import dl9.m0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import java.lang.Enum;
import dl9.m0$b;
import ag6.a;
import dl9.z;
import android.view.View$OnClickListener;
import dl9.d0;
import ek9.e;
import dl9.e0;
import o07.n;

public final class g0 implements PopupInterface$f	// class@001f61
{
    public final m0 b;

    public void g0(m0 p0){
       this.b = p0;
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int i;
       View view1;
       g0 tb = this.b;
       Objects.requireNonNull(tb);
       View view = PatchProxy.applyThreeRefs(p1, p2, p3, tb, m0.class, "9");
       if (view != PatchProxyResult.class) {
       }else if(p3 == null){
          i = BubbleInterface$Position.TOP.ordinal();
       }else {
          i = p3.getInt("BUBBLE_POSITION");
       }
       boolean b = true;
       if (m0$b.a[BubbleInterface$Position.fromOrdinal(i).ordinal()] != b) {
          view1 = a.c(p1, R.layout.arg_RES_7f0d01cd, p2, false);
          tb.V8(view1, b);
       }else {
          view1 = a.c(p1, R.layout.arg_RES_7f0d01cc, p2, false);
          tb.V8(view1, false);
       }
       view = view1;
       view.findViewById(R.id.emotion_add).setOnClickListener(new z(tb));
       view.findViewById(R.id.emotion_divider).setVisibility(false);
       view1 = view.findViewById(R.id.emotion_report);
       view1.setVisibility(false);
       view1.setOnClickListener(new d0(tb));
       view1 = view.findViewById(R.id.save_to_album);
       view.findViewById(R.id.emotion_divider_2).setVisibility(false);
       view1.setVisibility(false);
       tb.v = new e();
       view1.setOnClickListener(new e0(tb));
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
