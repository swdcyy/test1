package com.kwai.widget.customer.mediapreview.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.widget.customer.mediapreview.s$b;
import androidx.recyclerview.widget.RecyclerView$q;
import com.kwai.widget.customer.mediapreview.s$a;
import androidx.recyclerview.widget.RecyclerView$r;
import ix7.a0;
import ix7.o;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.lang.Integer;
import java.util.List;
import kx7.c;
import ix7.d;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.recyclerview.SnappyRecyclerView;
import ix7.p;
import io.reactivex.subjects.PublishSubject;

public class s extends PresenterV2	// class@001144
{
    public SnappyRecyclerView p;
    public p q;
    public List r;
    public PublishSubject s;
    public int t;
    public a0 u;
    public static final int v;

    static {
       s.v = a1.e(10.00f);
    }
    public void s(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       this.p.addItemDecoration(new b(0, 0, 0, s.v));
       this.p.addOnItemTouchListener(new s$b(this));
       this.p.addOnScrollListener(new s$a(this));
       s tt = this.t;
       if (tt > null) {
          this.p.scrollToPosition(tt);
          tt = this.u;
          if (tt != null) {
             tt.c(this.t);
          }
          this.p.post(new o(this));
       }
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, s.class, "4");
    }
    public void P8(int p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, os, "6")) {
          return;
       }
       if (p0 >= 0 && p0 < this.r.size()) {
          d.a(this.r.get(p0));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a34da);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.q = this.r8("PREVIEW_MEDIA_PREVIEW_ADAPTER");
       this.r = this.r8("PREVIEW_MEDIA_PREVIEW_INFO");
       this.s = this.r8("PREVIEW_MEDIA_PREVIEW_POSITION");
       this.t = this.r8("PREVIEW_MEDIA_PREVIEW_POSITION_INIT").intValue();
       this.u = this.r8("PREVIEW_MEDIA_PAGE_INDEX");
       return;
    }
}
