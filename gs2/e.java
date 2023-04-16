package gs2.e;
import erd.g;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendView;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyEmptyRecommendMusicResponse;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.b$b;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.b$a;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyMusicInfo;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class e implements g	// class@002b93
{
    public final LiveVoicePartyEmptyRecommendView b;
    public final g c;

    public void e(LiveVoicePartyEmptyRecommendView p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       b uob = null;
       if (p0 == null || q.f(p0.mMusicList)) {
          tb.f = uob;
          tc.accept(uob);
       }else {
          b uob1 = PatchProxy.applyOneRefs(p0, uob, b.class, "1");
          if (uob1 != PatchProxyResult.class) {
          }else {
             uob1 = new b();
             int i = p0.mMusicList.size();
             int i1 = i / 3;
             if ((i % 3) > 0) {
                i1 = i1 + 1;
             }
             for (int i2 = 0; i2 < i1; i2 = i4) {
                b$b uob2 = new b$b(uob);
                int i3 = i2 * 3;
                int i4 = i2 + 1;
                int i5 = i4 * 3;
                while (i3 < i5) {
                   if (i3 < i) {
                      uob2.a.add(p0.mMusicList.get(i3));
                   }
                   i3 = i3 + 1;
                }
                uob1.a.add(uob2);
             }
          }
          tb.f = uob1;
          if (!PatchProxy.applyVoidOneRefs(uob1, tb, LiveVoicePartyEmptyRecommendView.class, "6")) {
             b.Z(LiveVoicePartyLogTag.KTV, "refresh onLoadDataSuccess");
             tb.e.W0(uob1.a);
             tb.e.k0();
          }
       }
       return;
    }
}
