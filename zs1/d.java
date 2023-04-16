package zs1.d;
import com.kuaishou.live.common.core.component.multipk.core.statemachine.MultiPkState;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkStatistic;
import com.kuaishou.live.common.core.component.multipk.core.LiveMultiPkStatisticUpdateType;
import java.util.List;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkEnd;
import com.kuaishou.live.livestage.basic.LayoutConfig;

public interface abstract d	// class@004b2a
{

    void a(MultiPkState p0,MultiPkState p1,Object p2);
    void b(MultiPkState p0,MultiPkState p1,Object p2);
    void c(SCLiveMultiPkStatistic p0,LiveMultiPkStatisticUpdateType p1);
    void e(List p0);
    void f(LiveMultiPkEnd p0,int p1);
    void h(LayoutConfig p0);
}
