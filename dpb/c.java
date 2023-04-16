package dpb.c;
import ty5.e;
import dpb.b;
import com.yxcorp.gifshow.music.cloudmusic.search.MusicSearchLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kob.k;
import q87.c;
import dpb.i;
import jqb.k;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import dpb.h;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.StringBuilder;
import lob.q;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.music.cloudmusic.search.b;
import qvb.n0;
import com.yxcorp.gifshow.music.util.RealTimeLogger;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;

public final class c extends e	// class@0024da
{
    public final b b;
    public final MusicSearchLayout c;

    public void c(b p0,MusicSearchLayout p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().w("MusicSearchHandler", "on search panel open", objArray);
       if (this.b.h()) {
          this.b.l();
       }
       this.c.y(true);
       this.b.n();
       String str = this.b.f.f();
       boolean b = this.b.f();
       k ok = k.class;
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(b), null, ok, "15")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "focus_search_box";
          uElementPack.type = 8;
          uElementPack.status = 1;
          uElementPack.action = 987;
          if (!b) {
             u1.M0(k.g(str, "ËÑË÷", String.valueOf(9999)));
          }
          u1.u(true, uElementPack, null);
       }
       this.b.m(true);
       this.b.f.e().R();
       return;
    }
    public void ke(String p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "4")) {
          return;
       }
       a.p(p0, "keyword");
       SearchMusicFragment searchMusicF = this.b.c();
       if (searchMusicF != null) {
          if (TextUtils.x(p0)) {
             searchMusicF.Qh();
             searchMusicF.g7().M0();
             searchMusicF.g7().k0();
             Object[] objArray = new Object[0];
             k.D().w("MusicSearchHandler", "clear keywords", objArray);
          }
          this.b.f.e().U();
       }
       return;
    }
    public void qc(String p0,boolean p1,String p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, c.class, "3")) {
          return;
       }
       String str = "keyword";
       a.p(p0, str);
       a.p(p2, "ussid");
       Object[] objArray = new Object[0];
       k.D().w("MusicSearchHandler", "on confirm search , keyword: "+p0, objArray);
       if (q.f(p0)) {
          return;
       }
       if (this.b.c() == null) {
          this.b.n();
          if (!TextUtils.x(p0)) {
             Bundle uBundle = new Bundle();
             uBundle.putString(str, p0);
             uBundle.putInt("enter_type", this.b.f.b());
             uBundle.putInt("duration", this.b.f.d());
             uBundle.putString("photo_task_id", this.b.f.f());
             SearchMusicFragment searchMusicF = this.b.c();
             if (searchMusicF != null) {
                searchMusicF.setArguments(uBundle);
             }
             this.b.j();
          }
       }else {
          SearchMusicFragment searchMusicF1 = this.b.c();
          a.m(searchMusicF1);
          searchMusicF1.X = this.c.getEntrance();
          searchMusicF1.Y = this.c.getEntranceIndex();
          searchMusicF1 = this.b.c();
          a.m(searchMusicF1);
          Objects.requireNonNull(searchMusicF1);
          if (!PatchProxy.applyVoidTwoRefs(p0, p2, searchMusicF1, SearchMusicFragment.class, "12")) {
             SearchMusicFragment u = searchMusicF1.U;
             Objects.requireNonNull(u);
             if (!PatchProxy.applyVoidTwoRefs(p0, p2, u, b.class, "2")) {
                u.q = p0;
                u.s = p2;
                u.invalidate();
             }
             searchMusicF1.a();
             searchMusicF1.V.b();
             if (searchMusicF1.Ac() != null) {
                searchMusicF1.Ac().setEnabled(0);
             }
          }
          this.b.j();
       }
       this.b.f.e().S();
       return;
    }
    public void s7(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().w("MusicSearchHandler", "on search panel close", objArray);
       this.c.y(0);
       this.b.e();
       this.b.m(0);
       this.b.f.e().T();
       return;
    }
}
