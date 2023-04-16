package ffd.a;
import w99.b;
import jfd.d;
import u99.f;
import java.lang.Object;
import ffd.d;
import com.kwai.framework.player.core.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.player.core.f;
import ffd.h;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.player.multisource.d;
import jfd.b;
import com.yxcorp.plugin.search.entity.template.aggregate.BigCardExternalFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.BigCardExternalPhotoModel;
import ffd.c$a;
import o56.a;
import ffd.c;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import ffd.b;
import pc6.a;
import wc6.b;
import com.kwai.framework.player.multisource.b;
import ec6.g;
import yc6.b;
import qc6.k;
import ffd.f;
import com.kwai.framework.player.multisource.PlaySourceSwitcher;
import yc6.d;
import ffd.e;
import nc6.d;
import nc6.f;
import java.lang.Number;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Enum;
import java.lang.Long;

public class a implements b	// class@000e16
{
    public d b;
    public d c;
    public f d;

    public void a(d p0,f p1){
       super();
       this.b = new d();
       this.c = p0;
       this.d = p1;
    }
    public b F(){
       return this.b;
    }
    public void a(int p0){
       d h;
       d uod;
       a uoa3;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       this.d.i();
       a tb = this.b;
       if (tb != null) {
          tb.start();
       }else {
          Object[] objArray = null;
          String str = "4";
          if (!PatchProxy.applyVoid(objArray, this, uoa, str)) {
             String str1 = "3";
             if (!PatchProxy.applyVoid(objArray, this, uoa, str1)) {
                uoa3 = this.b;
                if (uoa3 != null) {
                   uoa3.release();
                }
             }
             h oh = h.class;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             String str2 = "1";
             if (!PatchProxy.applyVoid(objArray, this, uoa, str2)) {
                h = this.b.H;
                int i = 0;
                long l = 0;
                if (h != null) {
                   i = h.getRetryCount();
                   l = h.getCurrentPosition();
                }
                BigCardExternalPhotoModel mMediaManife = this.c.c().mAcfunModel.mMediaManifest;
                c$a uoa1 = new c$a();
                uoa1.c = this.c.getPhotoId();
                uoa1.b = a.B;
                uoa1.a = mMediaManife;
                c uoc = PatchProxy.apply(objArray, uoa1, c$a.class, str2);
                if (uoc != patchProxyRe) {
                }else {
                   uoc = new c(uoa1);
                }
                uoc.a().setBizType("BigCardPlayer").setPlayIndex(i).setStartPosition(l);
                if (mMediaManife.mBusinessType == 1) {
                   uod = PatchProxy.applyOneRefs(uoc, objArray, oh, "2");
                   if (uod != patchProxyRe) {
                   }else {
                      d uod1 = uoc.a();
                      a uoa2 = new a();
                      uoa2.c(new b(uod1));
                      uoa2.b(new b());
                      uoa2.d(uod1.getPlayIndex());
                      uod = uoa2.a();
                      c b = uoc.b;
                      f uof = PatchProxy.applyOneRefs(uoc, objArray, oh, str);
                      if (uof != patchProxyRe) {
                      }else {
                         uof = new f(uoc);
                      }
                      uod.l(new b(b, uof), uod1.getStartPosition());
                   }
                   this.b.h0(uod);
                }else {
                   d uod2 = PatchProxy.applyOneRefs(uoc, objArray, oh, str2);
                   if (uod2 != patchProxyRe) {
                   }else {
                      b uob = new b();
                      c b1 = uoc.b;
                      e uoe = PatchProxy.applyOneRefs(uoc, objArray, oh, str1);
                      if (uoe != patchProxyRe) {
                      }else {
                         uoe = new e(uoc);
                      }
                      uod = uoc.a();
                      uoa3 = new a();
                      uoa3.c(new b(uod));
                      uoa3.b(uob);
                      uoa3.d(uod.getPlayIndex());
                      uod2 = uoa3.a();
                      uod2.l(new d(b1, uoe), uod.getStartPosition());
                   }
                   this.b.h0(uod2);
                }
                this.b.prepareAsync();
                if (!PatchProxy.applyVoid(objArray, this, uoa, "2")) {
                   this.b.x().g(this.d.l);
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
       a obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.b;
       if (obj != null) {
          return obj.getDuration();
       }
       return -1;
    }
    public b getPlayer(){
       return this.b;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isPlaying();
    }
    public String k(){
       a obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          return "player is null";
       }
       Object[] objArray = new Object[]{obj.m().name(),this.c.getPhotoId(),this.c.getUserId()};
       return String.format("feed type : %s\nfeed id : %s\nuser : %s", objArray);
    }
    public long m(){
       a obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.b;
       if (obj != null) {
          return obj.getCurrentPosition();
       }
       return -1;
    }
    public void pause(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "6")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.pause();
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.release();
       }
       return;
    }
    public void seekTo(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "7")) {
          return;
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.seekTo(p0);
       }
       return;
    }
}
