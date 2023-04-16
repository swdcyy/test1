package i01.e;
import erd.g;
import i01.j;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig;
import f82.c;

public final class e implements g	// class@0027dd
{
    public final j b;

    public void e(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mLiveFansGroupInfo;
       tb.w = p0;
       j y = tb.y;
       LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig liveFansGrou = (y == null)? null: y.mLiveFansGroupFlashJoinConfig;
       tb.x = c.k(p0, liveFansGrou);
       return;
    }
}
