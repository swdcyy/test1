package c43.a;
import erd.g;
import com.kuaishou.live.fragment.LivePluginLoadingFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.FrameLayout;
import com.kuaishou.live.fragment.LivePluginLoadingFragment$a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;

public final class a implements g	// class@0004c5
{
    public final LivePluginLoadingFragment b;

    public void a(LivePluginLoadingFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       String str = "LivePluginLoadingFragment";
       if (p0.booleanValue()) {
          b.P(LiveLogTag.LIVE_PLUGIN.appendTag(str), "install live_audience_plugin success");
          tb.j.setVisibility(8);
          tb.k.setVisibility(8);
          p0 = tb.m;
          if (p0 != null) {
             p0.b();
          }
          if (tb.l != null && tb.getChildFragmentManager().findFragmentById(0x7f0a232f) == null) {
             p0 = tb.getChildFragmentManager().beginTransaction();
             p0.f(R.id.live_plugin_loading_fragment_container, tb.l);
             p0.m();
          }
       }else {
          b.P(LiveLogTag.LIVE_PLUGIN.appendTag(str), "install live_audience_plugin fail");
          tb.j.setVisibility(8);
          tb.k.setVisibility(0);
          p0 = tb.m;
          if (p0 != null) {
             p0.y1();
          }
       }
       return;
    }
}
