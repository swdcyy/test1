package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.a$a;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView$b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.a;
import java.lang.Object;
import ug1.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.widget.FrameLayout;
import mk1.h;
import mk1.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import jk1.c;
import pz0.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.LiveAudienceDrawingGiftBoxFragment$a;

public class a$a implements DrawingGiftEditView$b	// class@000b36
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       d.b(this);
    }
    public void b(int p0){
       d.a(this, p0);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.a.P8();
       int i = 0;
       this.a.x.setVisibility(i);
       this.a.v.setFocusableInTouchMode(true);
       this.a.v.requestFocus();
       a$a ta = this.a;
       ta.q.L = i;
       if (!q.f(ta.p.b)) {
          Iterator iterator = this.a.p.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().e(this.a.x.getWidth(), this.a.x.getHeight());
          }
       }
       return;
    }
    public void d(int p0){
       d.e(this, p0);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       this.a.R8(new b(this));
       a$a ta = this.a;
       ta.q.L = true;
       if (!q.f(ta.p.b)) {
          Iterator iterator = this.a.p.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().e(0, 0);
          }
       }
       return;
    }
}
