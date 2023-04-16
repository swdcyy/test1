package cy2.d;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import android.graphics.Point;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import d61.c;
import ok.o;
import msd.p;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import ok.n;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getVideoSize$1;
import yx2.e;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.io.IOException;
import com.kwai.video.player.IMediaPlayer;

public class d implements IMediaPlayer$OnVideoSizeChangedListener, IKwaiMediaPlayer$OnLiveInterActiveListener	// class@0023fe
{
    public final VoicePartyPlayerController b;
    public final c c;
    public final o d;
    public final p e;
    public final l f;
    public Point g;
    public boolean h;
    public static final Point i;

    static {
       d.i = new Point(-1, -1);
    }
    public void d(VoicePartyPlayerController p0,c p1,o p2,p p3,l p4){
       super();
       this.g = d.i;
       this.h = false;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = null;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       if (this.h == null) {
          this.b.l(this);
          this.b.j(this);
          this.h = true;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "show, liveType = "+this.b.n());
       this.c();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       this.h = false;
       b.Z(LiveVoicePartyLogTag.KTV, "hide");
       this.b.x(this);
       this.b.v(this);
       if (this.c.b()) {
          this.c.a().setVisibility(8);
       }
       return;
    }
    public final void c(){
       d tc;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VoicePartyPlayerController voicePartyPl = VoicePartyPlayerController.class;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "7")) {
          return;
       }
       if (this.d.apply(objArray)) {
          LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
          b.Z(kTV, "show，更新播放器的Surface");
          if (!this.c.b()) {
             tc = this.c;
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoid(objArray, tc, c.class, "6") && tc.a == null) {
                Object obj1 = tc.c();
                n.j(obj1);
                tc.a = obj1;
             }
             tc = this.b;
             LivePlayTextureView livePlayText = this.c.a();
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoidOneRefs(livePlayText, tc, voicePartyPl, "16")) {
                VoicePartyPlayerController.y(tc, livePlayText, 0, 2, objArray);
             }
          }
          tc = this.b;
          Objects.requireNonNull(tc);
          Point point = PatchProxy.apply(objArray, tc, voicePartyPl, "14");
          if (point == patchProxyRe) {
             point = tc.b(VoicePartyPlayerController$getVideoSize$1.INSTANCE);
          }
          if (!PatchProxy.applyVoidOneRefs(point, this, uod, "3")) {
             b.Z(kTV, "adjustSurfaceByVideoSize: "+point);
             if (point != null) {
                Object obj = PatchProxy.applyOneRefs(point, this, uod, "4");
                b = (obj != patchProxyRe)? obj.booleanValue(): this.g.equals(point) ^ 0x01;
                if (b) {
                   b.e0(kTV, "adjustPlayerTexture", "width", Integer.valueOf(point.x), "height", Integer.valueOf(point.y), "liveType", this.b.n());
                   this.g = point;
                   View view = this.c.a();
                   ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
                   this.e.invoke(layoutParams, this.g);
                   view.setLayoutParams(layoutParams);
                }
             }
          }
          this.c.a().setVisibility(0);
       }
       return;
    }
    public void onParseAdSei(long p0,int p1,String p2){
    }
    public void onTsptInfo(byte[] p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "2")) {
          return;
       }
       try{
          LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(p0);
          b.c0(LiveVoicePartyLogTag.PORTRAIT_VIDEO, "onTsptInfo", "messageType", Integer.valueOf(liveFlvStrea.messageType));
          d tf = this.f;
          if (tf != null) {
             tf.invoke(liveFlvStrea);
          }
          return;
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e4){
          b.Z(LiveVoicePartyLogTag.KTV, "onTsptInfo: "+e4.getMessage());
          return;
       }
    }
    public void onVideoFrameRender(long p0){
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(d.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
             return;
          }
       }
       if (this.h != null) {
          this.c();
       }
       return;
    }
}
