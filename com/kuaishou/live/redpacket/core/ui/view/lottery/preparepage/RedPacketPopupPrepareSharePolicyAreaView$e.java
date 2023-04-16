package com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$e;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RedPacketPopupPrepareSharePolicyAreaView$e extends RecyclerView$n	// class@000f20
{
    public final int a;

    public void RedPacketPopupPrepareSharePolicyAreaView$e(int p0){
       super();
       this.a = p0;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, RedPacketPopupPrepareSharePolicyAreaView$e.class, "1")) {
          return;
       }
       super.c(p0, p1, p2, p3);
       p0.left = (!p2.getChildAdapterPosition(p1))? 0: - this.a;
       return;
    }
}
