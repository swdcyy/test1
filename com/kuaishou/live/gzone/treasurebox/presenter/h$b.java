package com.kuaishou.live.gzone.treasurebox.presenter.h$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.gzone.treasurebox.presenter.h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import java.util.Objects;
import r53.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import c77.p;
import jk1.e;

public class h$b implements PopupInterface$h	// class@001c82
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       h$b tb = this.b;
       if (tb.U0 != null) {
          tb.e9();
          TreasureBoxCommonModel treasureBoxC = this.b.c9();
          Objects.requireNonNull(treasureBoxC);
          if (!PatchProxy.applyVoid(null, treasureBoxC, TreasureBoxCommonModel.class, "23")) {
             TreasureBoxCommonModel f = treasureBoxC.F;
             if (f != null) {
                a h = f.h;
                if (h != null) {
                   h.Ub(LiveGzoneTabSource.OTHERS, false);
                }
                treasureBoxC.F.i.Vg(-1);
             }
          }
          treasureBoxC.U0 = false;
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}