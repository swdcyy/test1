package eu2.c$e;
import ks5.b;
import eu2.c;
import java.lang.Object;
import ks5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ks5.e;
import ks5.d;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import co2.f2;
import kx2.a;

public final class c$e implements b	// class@0027ef
{
    public final c a;

    public void c$e(c p0){
       this.a = p0;
       super();
    }
    public void D(){
       a.d(this);
    }
    public void a(int p0){
       c$e uoe = c$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "2")) {
          return;
       }
       this.a.d.a(p0);
       return;
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return this.a.d;
    }
    public boolean c(){
       return d.a(this);
    }
    public void d(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$e.class, "3")) {
          return;
       }
       a.p(p0, "parent");
       c$e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, c.class, "7")) {
          a.e(ta.i, ta.h.a(), ta.P(ta.Q(ta.j)));
       }
       return;
    }
    public void e(ViewGroup p0){
       d.c(this, p0);
    }
    public int getBizId(){
       return 8;
    }
    public boolean i(){
       return true;
    }
    public String k(){
       return a.a(this);
    }
    public void onShow(){
       a.e(this);
    }
    public int[] p(){
       int[] ointArray = new int[]{1};
       return ointArray;
    }
}
