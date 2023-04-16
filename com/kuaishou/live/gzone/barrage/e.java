package com.kuaishou.live.gzone.barrage.e;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView$b;
import com.kuaishou.live.gzone.barrage.BarrageView;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z1.a;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView;
import oe1.n;

public class e implements LiveComboCommentView$b	// class@001c32
{
    public final BarrageView a;

    public void e(BarrageView p0){
       this.a = p0;
       super();
    }
    public void a(ComboCommentMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       BarrageView y = this.a.y;
       if (y != null) {
          y.accept(p0);
       }
       return;
    }
    public void b(LiveComboCommentView p0){
       n.b(this, p0);
    }
}
