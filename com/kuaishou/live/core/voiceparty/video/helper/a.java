package com.kuaishou.live.core.voiceparty.video.helper.a;
import xv4.i;
import cy2.f;
import ee1.a;
import ok.o;
import msd.p;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.nio.ByteBuffer;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import d22.k;
import cy2.a;
import java.lang.Runnable;
import ekd.k1;

public class a extends i	// class@001ae2
{
    public final f a;
    public final o b;
    public final p c;
    public final a d;
    public final a e;
    public final a f;
    public boolean g;
    public boolean h;

    public void a(f p0,a p1,o p2,p p3,a p4,a p5){
       super();
       this.g = false;
       this.h = false;
       this.a = p0;
       this.b = p2;
       this.c = p3;
       this.f = p1;
       this.d = p4;
       this.e = p5;
    }
    public final boolean a(){
       return this.g;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.a()) {
          return;
       }
       if (this.a.I()) {
          this.a.hide();
       }
       a tf = this.f;
       if (tf != null) {
          tf.Y2(this);
       }
       tf = this.e;
       if (tf != null) {
          tf.invoke();
       }
       return;
    }
    public void j(String p0,ByteBuffer p1,int p2,int p3,int p4,int p5){
       a uoa = a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       if ((QCurrentUser.me().getId()).equals(p0)) {
          b.S(LiveVoicePartyLogTag.PORTRAIT_VIDEO.appendTag("AryaVideoHelper"), "DROP FRAME by owner is self", "userId", p0);
          return;
       }else if(this.a()){
          b.S(LiveVoicePartyLogTag.PORTRAIT_VIDEO.appendTag("AryaVideoHelper"), "DROP FRAME by release state error", "userId", p0);
          return;
       }else if(this.h == null){
          b.S(LiveVoicePartyLogTag.PORTRAIT_VIDEO.appendTag("AryaVideoHelper"), "DROP FRAME by show state error", "userId", p0);
          return;
       }else if(!this.b.apply(p0)){
          return;
       }else {
          LivePlayGLSurfaceView livePlayGLSu = this.a.get(p0);
          if (livePlayGLSu == null) {
             LiveVoicePartyLogTag pORTRAIT_VID = LiveVoicePartyLogTag.PORTRAIT_VIDEO;
             pORTRAIT_VID.appendTag("AryaVideoHelper");
             LiveVoicePartyLogTag liveVoicePar = pORTRAIT_VID;
             b.T(liveVoicePar, "DROP FRAME by NO corresponding surface", "userId", p0, "provider", this.a.toString());
             return;
          }else if(this.a.a(livePlayGLSu, p2, p3)){
             livePlayGLSu.getRenderer().a(p1, p2, p3, i);
          }else {
             k1.o(new a(this, livePlayGLSu, p2, p3));
          }
          return;
       }
    }
}
