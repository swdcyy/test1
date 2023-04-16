package com.kuaishou.live.core.show.hourlytrank.e$b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankClosed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankClosed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfoClose;

public interface abstract e$b	// class@000c04
{

    void a(LiveStreamMessages$SCLiveDistrictRankClosed p0);
    void b(boolean p0);
    void c(LiveStreamMessages$SCLiveDistrictRankInfo p0);
    void d(SCLivePopularityRankInfo p0);
    void e(SCLivePopularityRankClosed p0);
    void f(LiveStreamMessages$SCGzoneLiveHourRankInfo p0);
    void g(LiveStreamMessages$SCGzoneLiveHourRankInfoClose p0);
}
