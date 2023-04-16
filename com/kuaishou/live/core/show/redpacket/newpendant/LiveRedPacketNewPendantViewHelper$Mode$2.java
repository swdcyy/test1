package com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode$2;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.newpendant.b;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.widget.TextView;
import lnc.a1;
import androidx.appcompat.widget.AppCompatTextView;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class LiveRedPacketNewPendantViewHelper$Mode$2 extends LiveRedPacketNewPendantViewHelper$Mode	// class@000ee1
{

    public void LiveRedPacketNewPendantViewHelper$Mode$2(String p0,int p1){
       super(p0, p1, null);
    }
    public void bind(LiveRedPacketNewPendantViewHelper p0,LiveRedPacketNewPendantViewHelper$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPacketNewPendantViewHelper$Mode$2.class, "1")) {
          return;
       }
       p0.b.setVisibility(0);
       p0.c.setVisibility(8);
       p0.d.setVisibility(0);
       p0.d.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070981));
       p0.d.setText(R.string.arg_RES_7f10229d);
       p0.e.setVisibility(0);
       p0.e.setImageResource(R.drawable.arg_RES_7f08130d);
       return;
    }
}
