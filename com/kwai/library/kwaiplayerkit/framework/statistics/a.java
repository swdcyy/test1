package com.kwai.library.kwaiplayerkit.framework.statistics.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.library.kwaiplayerkit.framework.statistics.a$b;
import java.lang.Object;
import xx6.c;
import xx6.b;
import java.lang.String;
import com.kwai.video.wayne.player.listeners.OnPlayerStateChangedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import ay6.k;
import px6.e;
import java.lang.StringBuilder;

public class a	// class@000890
{
    public final a$b a;
    public final IWaynePlayer b;
    public boolean c;
    public int d;
    public boolean e;
    public final OnPlayerStateChangedListener f;
    public final IMediaPlayer$OnInfoListener g;

    public void a(IWaynePlayer p0,a$b p1){
       super();
       c uoc = new c(this);
       this.f = uoc;
       b uob = new b(this);
       this.g = uob;
       this.b = p0;
       this.a = p1;
       if (p0.isVideoRenderingStart() || p0.isAudioRenderingStart()) {
          boolean b = true;
          this.e = b;
          if (p0.isPlaying()) {
             this.c = b;
          }
       }
       this.a("init ", 0, this.c);
       p0.registerPlayerStateChangedListener(uoc);
       p0.addOnInfoListener(uob);
       return;
    }
    public final void a(String p0,int p1,boolean p2){
       e.a().i("PlayerPlayOrNotHelper", p0+","+p1+","+p2);
    }
    public final void b(int p0){
       this.d = p0;
       this.e = false;
       this.c("android ", p0, false);
    }
    public final void c(String p0,int p1,boolean p2){
       this.a(p0, p1, p2);
       if (this.c != p2) {
          this.c = p2;
          this.a.a(p2);
       }
       return;
    }
}
