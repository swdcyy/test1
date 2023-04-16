package gpb.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gpb.i$a;
import nsd.u;
import gpb.i$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kob.k;
import q87.c;
import gpb.i$d;
import erd.g;
import crd.b;
import brd.t;
import hka.a;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import com.yxcorp.gifshow.util.rx.RxBus;
import b46.a;
import android.view.View;
import com.kwai.feature.post.api.music.widget.DragScrollContainerLayout;
import gpb.i$c;
import com.kwai.feature.post.api.music.widget.DragScrollContainerLayout$b;
import android.app.Activity;
import b46.b;
import dpb.b;
import k2b.e0;

public final class i extends PresenterV2	// class@002b61
{
    public BaseFragment p;
    public SearchMusicPanelInteraction q;
    public t r;
    public b s;
    public e0 t;
    public boolean u;
    public ObjectAnimator v;
    public final a w;
    public static final i$a x;

    static {
       i.x = new i$a(null);
    }
    public void i(){
       super();
       this.w = new i$b(this);
    }
    public static final BaseFragment P8(i p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("fragment");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().w("music_search_panel", "SearchPanelShowPresenter onBind", objArray);
       i tr = this.r;
       if (tr == null) {
          a.S("searchObservable");
       }
       this.X7(tr.subscribe(new i$d(this)));
       this.u = true;
       i tq = this.q;
       String str = "searchPanelInteraction";
       if (tq == null) {
          a.S(str);
       }
       tq.setBackPressable(this.w);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.onOpenMusicSearchPanel();
       RxBus.f.b(new a(true));
       return;
    }
    public void J8(){
       int i;
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       i = 0;
       Object[] objArray = new Object[i];
       k.D().w("music_search_panel", "SearchPanelShowPresenter onUnBind", objArray);
       this.u = i;
       i tq = this.q;
       if (tq == null) {
          a.S("searchPanelInteraction");
       }
       tq.setBackPressable(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       if (p0 instanceof DragScrollContainerLayout) {
          p0.setOnDragListener(new i$c(this));
          Activity activity = this.getActivity();
          if (activity != null) {
             a.o(activity, "it");
             p0.setMaxDragSlop((b.a.a(activity) / 2));
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       Object obj = this.r8("MUSIC_SEARCH_PANEL_FRAGMENT");
       a.o(obj, "inject\(MusicFieldConst.M¡­IC_SEARCH_PANEL_FRAGMENT\)");
       this.p = obj;
       obj = this.r8("MUSIC_SEARCH_PANEL_INTERACTION");
       a.o(obj, "inject\(MusicFieldConst.M¡­SEARCH_PANEL_INTERACTION\)");
       this.q = obj;
       obj = this.r8("MUSIC_SEARCH_FRAGMENT");
       a.o(obj, "inject\(MusicConstant.MUSIC_SEARCH_FRAGMENT\)");
       this.r = obj;
       obj = this.r8("music_search_handler");
       a.o(obj, "inject\(MusicConstant.MUSIC_SEARCH_HANDLER\)");
       this.s = obj;
       obj = this.r8("MUSIC_SEARCH_PANEL_ORIGIN_LOG_PAGE");
       a.o(obj, "inject\(MusicFieldConst.M¡­CH_PANEL_ORIGIN_LOG_PAGE\)");
       this.t = obj;
       return;
    }
}
