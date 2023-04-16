package d4c.d0;
import erd.g;
import d4c.h0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import qm9.i;

public final class d0 implements g	// class@0020c7
{
    public final h0 b;

    public void d0(h0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       h0 obj = PatchProxy.apply(null, tb, h0.class, "6");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = tb.v;
          b = (obj != null && (obj.c() && ActivityContext.g().e() == tb.getActivity()))? true: false;
       }
       if (!b) {
          tb.W8(8);
       }else if(tb.t == null && p0.booleanValue()){
          obj = tb.q;
          if (obj != null) {
             i.c(obj.getMCurrentMusic(), ImmutableMap.of("tab_name", "music"), null);
             tb.t = true;
          }
       }
       if (!p0.booleanValue()) {
          i = 8;
       }
       tb.W8(i);
       return;
    }
}
