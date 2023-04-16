package dpb.i$a;
import java.lang.Object;
import dpb.a;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import java.util.Objects;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$c;
import dpb.i;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dpb.h;
import nsd.u;
import java.lang.IllegalStateException;

public final class i$a	// class@0024e0
{
    public BaseFragment a;
    public h b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public MusicSearchUiOption i;

    public void i$a(){
       super();
       this.b = new a();
       this.c = "";
       this.d = -1;
       MusicSearchUiOption$b companion = MusicSearchUiOption.Companion;
       Objects.requireNonNull(companion);
       MusicSearchUiOption musicSearchU = PatchProxy.apply(null, companion, MusicSearchUiOption$b.class, "1");
       if (musicSearchU != PatchProxyResult.class) {
       }else {
          MusicSearchUiOption musicSearchU1 = new MusicSearchUiOption(-1, -1, false, false, null, -1, -999, -999, false);
       }
       this.i = musicSearchU;
       return;
    }
    public final i a(){
       Object obj = PatchProxy.apply(null, this, i$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i$a ta = this.a;
       if (ta == null) {
          throw new IllegalStateException("parentFragment must be init");
       }
       if (ta == null) {
          a.S("parentFragment");
       }
       i oi = new i(ta, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
       return obj;
    }
    public final i$a b(boolean p0){
       this.f = p0;
       return this;
    }
    public final i$a c(int p0){
       this.d = p0;
       return this;
    }
    public final i$a d(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       this.a = p0;
       return this;
    }
    public final i$a e(int p0){
       this.e = p0;
       return this;
    }
    public final i$a f(int p0){
       this.g = p0;
       return this;
    }
    public final i$a g(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "listener");
       this.b = p0;
       return this;
    }
    public final i$a h(String p0){
       if (p0 != null) {
       }else {
          p0 = "";
       }
       this.c = p0;
       return this;
    }
    public final i$a i(MusicSearchUiOption p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "uiOption");
       this.i = p0;
       return this;
    }
}
