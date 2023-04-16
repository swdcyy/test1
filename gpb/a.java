package gpb.a;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$c;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import fpb.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.b2;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a implements MusicSearchUiOption$c	// class@002b55
{
    public final MusicSearchPanelFragment a;

    public void a(MusicSearchPanelFragment p0){
       this.a = p0;
       super();
    }
    public void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.dh().onNext(Boolean.FALSE);
       this.a.ch().onSelectMusic(p0);
       return;
    }
    public void b(){
       d a;
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.a.ch().onClickMusicEntrance();
       a = d.a;
       a ta = this.a;
       Objects.requireNonNull(ta);
       MusicSearchPanelFragment musicSearchP = PatchProxy.apply(null, ta, MusicSearchPanelFragment.class, "2");
       if (musicSearchP != PatchProxyResult.class) {
       }else {
          musicSearchP = ta.k;
          if (musicSearchP == null) {
             a.S("fragment");
          }
       }
       Object obj = musicSearchP;
       MusicSearchPanelFragment q = this.a.q;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(obj, Integer.valueOf(q), "search_list_top", a, d.class, "1")) {
          a.p(obj, "page");
          a.p("search_list_top", "enterPos");
          u1.L("", obj, 1, b2.b(q, "search_list_top"), null);
       }
       return;
    }
}
