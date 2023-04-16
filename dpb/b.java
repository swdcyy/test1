package dpb.b;
import dpb.b$a;
import nsd.u;
import dpb.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.g;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.music.cloudmusic.search.MusicSearchLayout;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.feature.component.searchhistory.SearchLayout;
import kqb.d0;
import dpb.d;
import com.kwai.feature.component.searchhistory.SearchLayout$d;
import dpb.e;
import com.kwai.feature.component.searchhistory.SearchLayout$e;
import com.kwai.robust.PatchProxyResult;
import ty5.e;
import dpb.c;
import ty5.d;
import dpb.f;
import com.kwai.feature.component.searchhistory.SearchLayout$f;
import dpb.g;
import com.yxcorp.gifshow.music.cloudmusic.search.MusicSearchLayout$a;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$b;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import dpb.h;
import kob.k;
import q87.c;
import java.lang.Boolean;
import k2b.e0;
import k2b.u1;
import fpb.d;
import fpb.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import sy5.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import fpb.a;
import android.os.Bundle;

public final class b	// class@0024d9
{
    public MusicSearchLayout a;
    public SearchMusicFragment b;
    public b c;
    public boolean d;
    public final MusicSearchUiOption e;
    public final i f;
    public static final b$a g;

    static {
       b.g = new b$a(null);
    }
    public void b(i p0){
       a.p(p0, "option");
       super();
       this.f = p0;
       this.e = p0.i;
    }
    public final void a(){
       i oi;
       g og;
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          oi = tb.q();
          if (oi != null) {
             oi.invalidate();
          }
       }
       tb = this.b;
       if (tb != null) {
          oi = tb.q();
          if (oi != null) {
             oi.clear();
          }
       }
       tb = this.b;
       if (tb != null) {
          og = tb.g7();
          if (og != null) {
             og.M0();
          }
       }
       tb = this.b;
       if (tb != null) {
          og = tb.g7();
          if (og != null) {
             og.k0();
          }
       }
       return;
    }
    public final void b(View p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       a.p(p0, "view");
       this.a = m1.f(p0, 0x7f0a37a6);
       if (!PatchProxy.applyVoid(null, this, uob, "3")) {
          b ta = this.a;
          if (ta != null) {
             ta.setSearchHint(a1.p(R.string.arg_RES_7f103762));
             if (!d0.b()) {
                ta.setFragmentManagerProvider(new d(this));
             }
             ta.setSearchHistoryFragmentCreator(new e(this));
             ta.setSearchIcon(R.drawable.arg_RES_7f08063d);
             ta.setEditorColor(R.color.arg_RES_7f06190a);
             c uoc = PatchProxy.applyOneRefs(ta, this, uob, "4");
             if (uoc != PatchProxyResult.class) {
             }else {
                uoc = new c(this, ta);
             }
             ta.setSearchListener(uoc);
             b = true;
             ta.setShowSearchTips(b);
             ta.setShowSearchSuggest(b);
             ta.setSearchTipsFormatRes(R.string.arg_RES_7f104565);
             ta.setSearchSuggestFragmentCreator(new f(this));
             ta.setSearchLayoutListener(new g(this));
             if (MusicSearchUiOption.Companion.a(this.e.getMainColorId())) {
                ta.setSearchTipWrapperBackgroundColor(a1.a(this.e.getMainColorId()));
             }
             if (this.e.getMusicSearchSource() == b) {
                ViewGroup$LayoutParams layoutParams = ta.getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   layoutParams.bottomMargin = a1.e(8.00f);
                   ta.setLayoutParams(layoutParams);
                }
             }
          }
       }
       return;
    }
    public final SearchMusicFragment c(){
       return this.b;
    }
    public final MusicSearchUiOption d(){
       return this.e;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          this.f.c().getChildFragmentManager().beginTransaction().s(tb).m();
          this.k();
       }
       this.f.e().b();
       Object[] objArray = new Object[0];
       k.D().w("MusicSearchHandler", "hideSearchFragment", objArray);
       return;
    }
    public final boolean f(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null) {
          a.m(obj);
          if (obj.X0 != null) {
             b = true;
          label_0022 :
             return b;
          }
       }
       b = false;
       goto label_0022 ;
    }
    public final boolean g(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null) {
          a.m(obj);
          if (obj.isVisible()) {
             b = true;
          label_0024 :
             return b;
          }
       }
       b = false;
       goto label_0024 ;
    }
    public final boolean h(){
       return this.d;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          ta.setSearchLayoutListener(null);
       }
       this.c = null;
       return;
    }
    public final void j(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "11")) {
          return;
       }
       b tb = this.b;
       if (tb == null || (!PatchProxy.applyVoid(objArray, tb, SearchMusicFragment.class, "25") && tb.X0 == null)) {
          Object[] objArray1 = new Object[0];
          k.D().w("music_search_fragment", "music search result page show", objArray1);
          u1.L0(tb.V0);
          tb.X0 = true;
       }
    label_0035 :
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       if (this.f()) {
          b tc = this.c;
          if (tc != null) {
             d a = d.a;
             a.m(tc);
             b tc1 = this.c;
             a.m(tc1);
             String str = tc1.a();
             tc1 = this.c;
             a.m(tc1);
             String str1 = tc1.c();
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidThreeRefs(tc, str, str1, a, d.class, "6")) {
                a.p(tc, "page");
                a.p(str, "keyWord");
                a.p(str1, "ussid");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SEARCH_CLOSE_CLOUD_MUSIC";
                uElementPack.params = a.k().e("entry_source", "search_entrance_cloud_music").e("query_name", str).e("query_list_id", str1).i();
                u1.L("", tc, 1, uElementPack, null);
             }
          }
       }
       this.l();
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.Ph();
       }
       return;
    }
    public final void m(boolean p0){
       this.d = p0;
    }
    public final void n(){
       b tb1;
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.f.e().c();
       b tb = this.b;
       if (tb == null) {
          SearchMusicFragment searchMusicF = new SearchMusicFragment();
          this.b = searchMusicF;
          a.m(searchMusicF);
          BaseFragment uBaseFragmen = this.f.c();
          b te = this.e;
          Objects.requireNonNull(searchMusicF);
          if (!PatchProxy.applyVoidTwoRefs(uBaseFragmen, te, searchMusicF, SearchMusicFragment.class, "1")) {
             searchMusicF.W0 = uBaseFragmen;
             searchMusicF.V0 = new b(searchMusicF);
             searchMusicF.c1 = te;
          }
          tb = this.b;
          a.m(tb);
          this.c = tb.Oh();
          Bundle uBundle = new Bundle();
          uBundle.putInt("enter_type", this.f.b());
          uBundle.putInt("duration", this.f.d());
          uBundle.putString("photo_task_id", this.f.f());
          uBundle.putBoolean("MUSIC_TEMPLATE_ENTRANCE_ENABLED", this.f.f);
          tb1 = this.b;
          a.m(tb1);
          tb1.setArguments(uBundle);
          e uoe = this.f.c().getChildFragmentManager().beginTransaction();
          te = this.b;
          a.m(te);
          uoe.v(this.f.g, te);
          uoe.m();
       }else {
          a.m(tb);
          tb.Qh();
          this.a();
          tb1 = this.b;
          a.m(tb1);
          this.f.c().getChildFragmentManager().beginTransaction().E(tb1).m();
       }
       Object[] objArray = new Object[0];
       k.D().w("MusicSearchHandler", "showSearchFragment", objArray);
       return;
    }
}
