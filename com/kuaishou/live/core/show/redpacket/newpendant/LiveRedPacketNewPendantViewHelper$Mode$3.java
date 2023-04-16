package com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode$3;
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
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import com.yxcorp.gifshow.image.KwaiImageView;
import l12.d;
import va1.f0;

public final class LiveRedPacketNewPendantViewHelper$Mode$3 extends LiveRedPacketNewPendantViewHelper$Mode	// class@000ee2
{

    public void LiveRedPacketNewPendantViewHelper$Mode$3(String p0,int p1){
       super(p0, p1, null);
    }
    public void bind(LiveRedPacketNewPendantViewHelper p0,LiveRedPacketNewPendantViewHelper$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPacketNewPendantViewHelper$Mode$3.class, "1")) {
          return;
       }
       p0.b.setVisibility(8);
       p0.c.setVisibility(0);
       g.d(p0.c, p1.d(), HeadImageSize.SMALL);
       p0.d.setVisibility(8);
       p0.e.setVisibility(0);
       f0.a(p0.e, LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_COVER_OPEN);
       return;
    }
}
