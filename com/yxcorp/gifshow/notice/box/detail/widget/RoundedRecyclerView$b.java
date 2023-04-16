package com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$b;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$c;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView;
import java.lang.Object;
import android.graphics.Rect;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$b$a;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.notice.box.detail.widget.c;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.graphics.Canvas;
import java.lang.Boolean;

public final class RoundedRecyclerView$b implements RoundedRecyclerView$c	// class@002178
{
    public final Rect a;
    public ViewOutlineProvider b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final RoundedRecyclerView g;

    public void RoundedRecyclerView$b(RoundedRecyclerView p0){
       this.g = p0;
       super();
       this.a = new Rect();
       this.b = new RoundedRecyclerView$b$a(this, p0);
    }
    public void RoundedRecyclerView$b(RoundedRecyclerView p0,RoundedRecyclerView$a p1){
       super(p0);
    }
    public void a(int p0,int p1){
       if (PatchProxy.isSupport(RoundedRecyclerView$b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RoundedRecyclerView$b.class, "2")) {
          return;
       }
       RoundedRecyclerView$b tc = this.c;
       int i = 0;
       int i1 = (tc == null && this.f == null)? (int)(- this.g.c): 0;
       if (tc == null && this.d == null) {
          i = (int)(- this.g.c);
       }
       if (this.d == null && this.e == null) {
          p0 = p0 + (int)this.g.c;
       }
       if (this.f == null && this.e == null) {
          p1 = p1 + (int)this.g.c;
       }
       this.a.set(i1, i, p0, p1);
       if (!PatchProxy.applyVoid(null, this, RoundedRecyclerView$b.class, "3")) {
          this.b = new c(this);
       }
       this.g.setClipToOutline(true);
       this.g.setOutlineProvider(this.b);
       return;
    }
    public void b(Canvas p0,boolean p1){
    }
    public void c(Canvas p0,boolean p1){
    }
    public void d(boolean p0,boolean p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(RoundedRecyclerView$b.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, RoundedRecyclerView$b.class, "1")) {
          return;
       }
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g.invalidateOutline();
       return;
    }
}
