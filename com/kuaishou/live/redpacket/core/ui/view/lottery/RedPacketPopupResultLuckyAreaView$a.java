package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupResultLuckyAreaView$a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupResultLuckyAreaView;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RedPacketPopupResultLuckyAreaView$a extends RecyclerView$n	// class@000f06
{
    public final RedPacketPopupResultLuckyAreaView a;

    public void RedPacketPopupResultLuckyAreaView$a(RedPacketPopupResultLuckyAreaView p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, RedPacketPopupResultLuckyAreaView$a.class, "1")) {
          return;
       }
       p0.left = 0;
       p0.right = 0;
       p0.top = (!p2.getChildAdapterPosition(p1))? 0: RedPacketPopupResultLuckyAreaView.j;
       p0.bottom = 0;
       return;
    }
}
