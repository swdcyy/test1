package com.kuaishou.merchant.customerservice.notification.b;
import java.lang.Object;
import yv3.f;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Build$VERSION;
import android.media.SoundPool;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import android.media.SoundPool$Builder;
import com.kuaishou.merchant.customerservice.notification.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import yv3.j;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import sv3.a;
import q87.c;
import android.os.Handler;
import java.lang.StringBuilder;
import yv3.i;
import android.media.SoundPool$OnLoadCompleteListener;
import com.kuaishou.merchant.customerservice.notification.b$a;

public class b	// class@001689
{
    public SoundPool a;
    public a b;
    public b$b c;
    public int d;
    public float e;
    public int f;
    public f g;
    public AtomicBoolean h;
    public AtomicBoolean i;
    public AtomicBoolean j;

    public void b(){
       super();
       this.e = 0x3f800000;
       this.f = 0;
       this.g = new f();
       this.h = new AtomicBoolean(0);
       this.i = new AtomicBoolean(0);
       this.j = new AtomicBoolean(0);
       int i = 1;
       this.a = (Build$VERSION.SDK_INT < 23)? new SoundPool(i, 3, 100): new SoundPool$Builder().setAudioAttributes(new AudioAttributes$Builder().setUsage(5).setContentType(2).build()).setMaxStreams(i).build();
       this.b = new a(a.a().a());
       k1.o(new j(this));
       this.g.a();
       this.i.set(0);
       this.h.set(0);
       return;
    }
    public final void a(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "11")) {
          return;
       }
       if (this.c != null && !this.i.get()) {
          Object[] objArray = new Object[0];
          a.C().A("SoundPoolPlayer", "no startjob and checkJob £¬start check", objArray);
          this.i.set(true);
          this.c.sendEmptyMessageDelayed(1548, p0);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b td = this.d;
       if (td == null) {
          return;
       }
       b ta = this.a;
       if (ta != null && this.c != null) {
          this.e = 0x3f800000;
          this.f = ta.play(td, 0x3f800000, 0x3f800000, 0, 0, 0x3f800000);
          Object[] objArray = new Object[0];
          a.C().A("SoundPoolPlayer", "start play ,streamId:"+this.f+": sound id"+this.d, objArray);
          this.c.sendEmptyMessageDelayed(1541, 2000);
       }
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a.setOnLoadCompleteListener(new i(this));
       this.b.e = new b$a(this);
       this.d = this.a.load(p0, 1);
       Object[] objArray = new Object[0];
       a.C().A("SoundPoolPlayer", "get sound Id "+this.d, objArray);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       if (this.c != null) {
          this.h.set(true);
          this.c.sendEmptyMessage(1542);
       }
       return;
    }
}
