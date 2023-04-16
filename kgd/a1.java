package kgd.a1;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.d0$a;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class a1 implements g	// class@001775
{
    public final d0$a b;

    public void a1(d0$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a1 tb = this.b;
       Objects.requireNonNull(tb);
       d0$a uoa = d0$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoa, "11")) {
       }else if(p0 == null || !p0.size()){
          Object[] objArray = null;
          int i = 0;
          if (!PatchProxy.applyVoid(objArray, tb, uoa, "10") && tb.s == null) {
             tb.s = a.c(tb.getContext(), 0x7f0d166f, objArray);
             tb.s.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
             tb.q.addView(tb.s);
             tb.q.setVisibility(i);
          }
          int i1 = 1;
          if (p0.size() == i1) {
             tb.s.findViewById(R.id.downloadtip_finishtip).setVisibility(i);
          }
          tb.P8(p0, i, tb.s.findViewById(R.id.downloadtip_img1));
          tb.P8(p0, i1, tb.s.findViewById(R.id.downloadtip_img2));
          tb.P8(p0, 2, tb.s.findViewById(R.id.downloadtip_img3));
       }
       return;
    }
}
