package fc2.f$a;
import rq5.a;
import fc2.f;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.luckystar.pendant.LiveBaseLuckyStarPendantView;
import com.kuaishou.live.core.show.luckystar.pendant.LiveGzoneLuckyStarPendantView;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import java.util.List;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import java.util.Arrays;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;

public class f$a extends a	// class@002930
{
    public final f h;

    public void f$a(f p0){
       this.h = p0;
       super();
    }
    public View H(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f$a obj = PatchProxy.apply(objArray, this, f$a.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.h;
       Objects.requireNonNull(obj);
       f uof = PatchProxy.apply(objArray, obj, f.class, "1");
       if (uof != patchProxyRe) {
       }else if(obj.f == null){
          LiveGzoneLuckyStarPendantView liveGzoneLuc = new LiveGzoneLuckyStarPendantView(obj.c);
          obj.f = liveGzoneLuc;
          liveGzoneLuc.setOnClickListener(obj.d);
       }
       uof = obj.f;
       return uof;
    }
    public List c(){
       LivePendantRelation[] obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePendantRelation[]{LivePendantRelation.LIVE_PK_SMALL_WINDOW};
       return Arrays.asList(obj);
    }
    public LivePendantPriority f(){
       return LivePendantPriority.LUCKY_STAR;
    }
}
