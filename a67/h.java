package a67.h;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import a67.h$b;
import com.kwai.library.widget.popup.common.c$b;
import a67.f;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import a67.g;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import a67.e;
import java.util.List;
import g9c.a;
import a67.h$a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import o07.n;

public class h extends c implements PopupInterface$f	// class@00005b
{
    public h$b p;
    public View q;
    public static final int r;

    public void h(h$b p0){
       super(p0);
       this.p = p0;
       p0.L(this);
       p0.F(f.a);
       p0.N(g.a);
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       if (q.f(this.p.H)) {
          this.o();
          return;
       }else {
          RecyclerView recyclerView = this.q.findViewById(R.id.live_gzone_audience_hot_words_recyclerview);
          recyclerView.setLayoutManager(new LinearLayoutManager(this.u()));
          a uoa = new a(1, false, false);
          uoa.o(a1.f(R.drawable.arg_RES_7f081236));
          recyclerView.addItemDecoration(uoa);
          e uoe = new e();
          uoe.W0(this.p.H);
          uoe.w = new h$a(this);
          View view = this.q.findViewById(R.id.live_gzone_audience_hot_words_container);
          ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
          h$b i = this.p.I;
          if (i == null) {
             i = a1.e(10.00f);
          }
          layoutParams.leftMargin = i;
          layoutParams.bottomMargin = this.p.J;
          view.setLayoutParams(layoutParams);
          recyclerView.setAdapter(uoe);
          return;
       }
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, h.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.f(p1, R.layout.arg_RES_7f0d0b92, p2);
       this.q = view;
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
