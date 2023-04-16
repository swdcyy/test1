package dz9.n$b;
import android.view.View$OnClickListener;
import dz9.n;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.ja;
import tkd.b;
import tkd.d;
import ayb.g;
import ez9.a;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Integer;
import v6a.m0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lnc.a1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.component.photo.reduce.d;
import kf5.g;
import mf5.w0;

public final class n$b implements View$OnClickListener	// class@00201a
{
    public final n b;

    public void n$b(n p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       n d;
       a a;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, n$b.class, "1")) {
          return;
       }
       ja.a();
       int i = 1;
       String str = "fragment";
       int i1 = 0x7f1016ee;
       String str1 = "detailParam";
       String str2 = "photo";
       if (d.a(-908290672).z50()) {
          n$b b = obj.b;
          d = b.D;
          a.o(d, str2);
          n e = obj.b.E;
          a.o(e, str);
          a uoa = a.a;
          uoa.c(b.N, d, e, n.W(obj.b).getText().toString(), Integer.valueOf(i));
          n d1 = obj.b.D;
          a.o(d1, str2);
          d = obj.b.C;
          a.o(d, str1);
          n$b b1 = obj.b;
          uoa.a(d1, d, b1.G, b1.F, a1.p(i1));
       }else {
          a = a.a;
          n d2 = obj.b.D;
          a.o(d2, str2);
          n c = obj.b.C;
          a.o(c, str1);
          n$b b2 = obj.b;
          a.a(d2, c, b2.G, b2.F, a1.p(i1));
          n$b b3 = obj.b;
          n d3 = b3.D;
          a.o(d3, str2);
          n e1 = obj.b.E;
          a.o(e1, str);
          n on = e1;
          a.c(b3.N, d3, on, n.W(obj.b).getText().toString(), Integer.valueOf(i));
       }
       g og = obj.b.q();
       if (og != null) {
          og.a();
       }
       return;
    }
}
