package aa9.d;
import w99.b;
import com.yxcorp.gifshow.entity.QPhoto;
import v5a.g;
import u99.f;
import java.lang.Object;
import p5a.h;
import com.kwai.framework.player.core.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p5a.c;
import java.lang.Integer;
import v5a.a$b;
import android.app.Application;
import o56.a;
import android.content.Context;
import v5a.a;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import v5a.f;
import nc6.d;
import com.kwai.framework.player.core.f;
import nc6.f;
import java.lang.Number;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Enum;
import java.lang.Long;

public class d implements b	// class@000073
{
    public g b;
    public QPhoto c;
    public long d;
    public int e;
    public f f;
    public boolean g;

    public void d(QPhoto p0,g p1,f p2,boolean p3){
       super();
       this.g = false;
       this.c = p0;
       this.b = p1;
       this.f = p2;
       this.e = h.e(p0);
       this.g = p3;
    }
    public b F(){
       Object obj = PatchProxy.apply(null, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.j0();
    }
    public void a(int p0){
       c uoc1;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "8")) {
          return;
       }
       this.f.i();
       c uoc = this.b.j0();
       if (uoc != null) {
          uoc.start();
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
             if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
                uoc1 = this.b.j0();
                if (uoc1 != null) {
                   uoc1.release();
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, uod, "3")) {
                uoc1 = this.b.j0();
                int i = 0;
                if (uoc1 != null) {
                   i = uoc1.getRetryCount();
                }
                a uoa = new a$b(a.b(), this.c).a();
                uoa.c().setStartPosition(this.d).setBizFt(":ks-components:auto-play").setBizType(r1.o0(this.c.getEntity(), "VideoAutoPlay")).setMediaCodecPolicy(2).setPlayIndex(i);
                if (this.g != null) {
                   uoa.c().setVodManifestHdrAdaptiveMode(1);
                }
                f uof = new f();
                this.b.h0(uof, this.c);
                uof.J(uoa);
                uof.prepareAsync();
                if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
                   this.b.x().g(this.f.l);
                   if (this.c != null) {
                      this.b.x().h(this.c.getPhotoId());
                      if (this.c.isVideoType()) {
                         this.b.x().e(1);
                      }else {
                         this.b.x().e(2);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public long getDuration(){
       c obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.b.j0();
       if (obj != null) {
          return obj.getDuration();
       }
       return -1;
    }
    public b getPlayer(){
       return this.b;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isPlaying();
    }
    public String k(){
       d obj = PatchProxy.apply(null, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          return "player is null";
       }
       Object[] objArray = new Object[]{r1.S1(obj.mEntity).name(),this.c.getPhotoId(),this.c.getUserName()};
       return String.format("feed type : %s\nfeed id : %s\nuser : %s", objArray);
    }
    public long m(){
       c obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.b.j0();
       if (obj != null) {
          return obj.getCurrentPosition();
       }
       return -1;
    }
    public void pause(int p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, d.class, "9")) {
          return;
       }
       c uoc = this.b.j0();
       if (uoc != null) {
          uoc.pause();
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, d.class, "15")) {
          return;
       }
       if (this.b.j0() != null) {
          this.b.x().f();
          this.b.j0().release();
          this.b.i0();
       }
       return;
    }
    public void seekTo(long p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uod, "10")) {
          return;
       }
       c uoc = this.b.j0();
       if (uoc != null) {
          uoc.seekTo(p0);
       }
       return;
    }
}
