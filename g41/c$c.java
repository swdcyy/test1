package g41.c$c;
import t99.y;
import g41.c;
import java.lang.Object;
import t99.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import tkd.b;
import tkd.d;
import os5.l;
import java.util.Objects;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import t99.w;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import t99.w$a;
import android.view.View;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;
import ba9.a;
import v99.a;

public class c$c implements y	// class@00241c
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1,int p2){
       x.d(this, p0, p1, p2);
    }
    public void c(int p0,int p1,int p2){
       x.j(this, p0, p1, p2);
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "2")) {
          return;
       }
       this.b.f();
       return;
    }
    public void onAudioStart(){
       x.b(this);
    }
    public void onCachedPlayerResumePlay(){
       x.c(this);
    }
    public void onPlayTimeFinished(){
       x.e(this);
    }
    public void onPlayerCached(){
       x.f(this);
    }
    public void onPlayerRetrieved(){
       x.g(this);
    }
    public void onRenderStop(){
       Bitmap uBitmap;
       View[] viewArray;
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoid(objArray, this, c$c.class, str)) {
          return;
       }
       if (!this.b.o.g()) {
          this.b.f();
       }
       if (!d.a(-1492894991).h1()) {
          c$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, c.class, str)) {
             int b = tb.e.U();
             c m = tb.m;
             w ow = w.class;
             if (PatchProxy.isSupport(ow)) {
                uBitmap = PatchProxy.applyTwoRefs(Boolean.valueOf(b), m, objArray, ow, "3");
                if (uBitmap != PatchProxyResult.class) {
                label_0061 :
                   b = 1;
                   if (uBitmap != null) {
                      viewArray = new View[b];
                      viewArray[0] = tb.q;
                      n.Z(0, viewArray);
                      tb.q.setImageBitmap(uBitmap);
                   }else {
                      viewArray = new View[b];
                      viewArray[0] = tb.q;
                      n.Z(4, viewArray);
                   }
                }
             }
             uBitmap = w.a.c(b, m);
             goto label_0061 ;
          }
       }
       return;
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       x.i(this, p0, p1, p2);
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       if (PatchProxy.isSupport(c$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, c$c.class, "3")) {
          return;
       }
       c$c tb = this.b;
       c$c tb1 = this.b;
       tb.e(p0, p1, p2, tb.o.getView(), tb1.m, tb1.n);
       return;
    }
    public void onVideoStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$c.class, "1")) {
          return;
       }
       c$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, c.class, "9")) {
          View[] viewArray = new View[]{tb.n};
          n.Z(4, viewArray);
          View[] viewArray1 = new View[]{tb.q};
          n.Z(4, viewArray1);
       }
       return;
    }
    public void onVideoStateChange(LiveAutoPlayerState p0){
       c$c tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "4")) {
          return;
       }
       if (p0 == LiveAutoPlayerState.PLAYING) {
          if (this.b.o.g()) {
             tb = this.b;
             if (tb.d.e(tb.o, "live_state_change")) {
                tb = 1;
             label_002a :
                if (!tb) {
                   this.b.g("live_state_change");
                }
             }
          }
          tb = null;
          goto label_002a ;
       }
       return;
    }
}
