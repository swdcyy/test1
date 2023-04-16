package j89.j$b;
import j89.j;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import j89.j$a;
import java.lang.Throwable;
import android.os.SystemClock;
import uh5.e;
import on5.b;
import tkd.b;
import tkd.d;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import com.kwai.kcube.TabIdentifier;
import wkd.b;
import gb5.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import uv8.a;

public class j$b	// class@0019c8
{
    public j$a a;
    public j$a b;
    public j$a c;
    public boolean d;
    public final j e;

    public void j$b(j p0){
       this.e = p0;
       super();
    }
    public void a(String p0,boolean p1){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "3")) {
          return;
       }
       if (this.a.a()) {
          this.d = p1;
       }
       this.e.v0(true, "Fetch feed success");
       return;
    }
    public void b(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$b.class, "5")) {
          return;
       }
       if (this.a.a()) {
          p0.b = SystemClock.elapsedRealtime();
          j$b te = this.e;
          Object[] objArray = new Object[]{te.x0(p1)};
          te.v0(0, String.format("Fetch feed failed: %s.", objArray));
       }
       return;
    }
    public void c(String p0,Throwable p1,boolean p2){
       if (PatchProxy.isSupport(j$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j$b.class, "9")) {
          return;
       }
       if (this.b.a()) {
          j$b te = this.e;
          Object[] objArray = new Object[]{te.x0(p1)};
          te.v0(0, String.format("Fetch cover failed: %s.", objArray));
       }
       return;
    }
    public void d(String p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(j$b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, j$b.class, "8")) {
          return;
       }
       if (e.f() && b.b.equals(d.a(0xded02ea).p7())) {
          p0 = (p1)? "thanos_feed_cache_cover_visible": "thanos_feed_network_cover_visible";
          this.e.B0(p0);
          b.a(0x8708467).log("thanos onFetchCoverSuccess record");
       }else if(!TextUtils.x(p0) && p0.equals("featured")){
          p0 = (p1)? "featured_feed_cache_cover_visible": "featured_feed_network_cover_visible";
          this.e.B0(p0);
          b.a(0x8708467).log("featured onFetchCoverSuccess record");
       }
       if (!p2) {
          return;
       }else if(this.b.a()){
          RxBus.f.b(new a());
          this.e.v0(true, "App launched normally.");
       }
       return;
    }
}
