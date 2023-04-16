package com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode$1;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.newpendant.b;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class LiveRedPacketNewPendantViewHelper$Mode$1 extends LiveRedPacketNewPendantViewHelper$Mode	// class@000ee0
{

    public void LiveRedPacketNewPendantViewHelper$Mode$1(String p0,int p1){
       super(p0, p1, null);
    }
    public void bind(LiveRedPacketNewPendantViewHelper p0,LiveRedPacketNewPendantViewHelper$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPacketNewPendantViewHelper$Mode$1.class, "1")) {
          return;
       }
       p0.b.setVisibility(8);
       p0.c.setVisibility(0);
       g.d(p0.c, p1.d(), HeadImageSize.SMALL);
       p0.d.setVisibility(0);
       p0.e.setVisibility(0);
       p0.e.setImageResource(R.drawable.arg_RES_7f08130d);
       return;
    }
}
