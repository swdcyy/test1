package com.kuaishou.live.gzone.barrage.BarrageView$f;
import com.kuaishou.live.gzone.barrage.BarrageView$d;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import java.lang.String;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.CharSequence;

public class BarrageView$f extends BarrageView$d	// class@001c28
{
    public View$OnClickListener e;
    public ComboCommentMessage f;
    public int g;

    public void BarrageView$f(ComboCommentMessage p0,int p1){
       super(p0.getContent(), p1);
       this.f = p0;
       this.g = (p0.getContent()).hashCode();
    }
}
