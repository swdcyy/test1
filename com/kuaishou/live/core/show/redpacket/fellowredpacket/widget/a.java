package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.a;
import java.lang.String;
import vg2.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.a$a;

public interface abstract a	// class@000ecd
{

    void a(int p0,long p1);
    void b(String p0);
    int getCurrentDisplayCount();
    long getMaxDisplayCount();
    a getRedPackInfo();
    void release();
    void setLiveFellowRedPackInfo(a p0);
    void setOnLiveFellowRedPackFloatViewClickListener(a$a p0);
    void setVisibility(int p0);
}
