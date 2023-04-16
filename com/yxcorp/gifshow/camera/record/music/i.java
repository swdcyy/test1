package com.yxcorp.gifshow.camera.record.music.i;
import com.yxcorp.gifshow.camera.record.base.g;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.music.n;
import com.yxcorp.gifshow.camera.record.base.d;
import vf9.h0;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import android.view.ViewGroup;
import pi9.j;
import android.view.View;
import com.yxcorp.utility.n;
import java.util.List;
import oc9.z;
import com.yxcorp.gifshow.model.Lyrics;
import kqb.y;
import com.yxcorp.gifshow.model.Lyrics$Line;
import oc9.w;
import com.kwai.video.player.KsMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import vf9.i0;
import java.lang.Runnable;
import t45.c;

public class i extends d0 implements g	// class@000e81
{
    public n o;
    public KsMediaPlayer p;
    public Lyrics q;

    public void i(CameraPageType p0,b p1,n p2){
       super(p0, p1);
       this.o = p2;
       this.d.n(g.class, new h0(this));
    }
    public boolean H(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.o.B2();
    }
    public long K1(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.o.r2();
    }
    public void P0(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       n.Y(this.o.C.a(), 0, true);
       return;
    }
    public g d(List p0){
       return z.a(this, p0);
    }
    public Object d(List p0){
       return z.b(this, p0);
    }
    public boolean d1(){
       return true;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       n.Y(this.o.C.a(), 8, true);
       return;
    }
    public final Lyrics g2(){
       int i;
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.o.G == null || !this.H()) {
          return objArray;
       }
       obj = this.o;
       Lyrics lyrics = y.a(obj.G, (int)obj.U0);
       for (i = lyrics.mLines.size() - 1; i >= 0; i = i - 1) {
          Lyrics$Line line = lyrics.mLines.get(i);
          if (line.mDuration > null) {
             break ;
          }else {
             int i1 = this.d.b().getRecordDuration() - line.mStart;
             line.mDuration = i1;
          }
       }
       return lyrics;
    }
    public KsMediaPlayer h1(){
       return this.p;
    }
    public void h2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "6")) {
          return;
       }
       this.q = objArray;
       i tp = this.p;
       if (tp == null) {
          return;
       }
       tp.setOnPreparedListener(objArray);
       this.p.setOnCompletionListener(objArray);
       c.a(new i0(this.p));
       return;
    }
    public Lyrics m1(){
       return this.q;
    }
    public KsMediaPlayer r(){
       return null;
    }
}
