package com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$d;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import xx6.k;

public final class SessionTimesStatistics$d implements IMediaPlayer$OnInfoListener	// class@000885
{
    public final SessionTimesStatistics b;

    public void SessionTimesStatistics$d(SessionTimesStatistics p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (p1 != 2) {
          if (p1 != 3) {
             if (p1 != 701) {
                if (p1 != 702) {
                   if (p1 != 0x2775) {
                      switch (p1){
                          case 0x2712:
                            if (!this.b.g()) {
                               this.b.i();
                               this.b.l();
                            }
                            break;
                          case 0x2713:
                            if (this.b.g()) {
                               this.b.l();
                            }
                            break;
                          case 0x2714:
                            if (!this.b.g()) {
                               this.b.l();
                            }
                            break;
                          default:
                      }
                   }else {
                      this.b.k();
                   }
                }else {
                   this.b.u.c();
                }
             }else {
                this.b.h();
             }
          }else if(this.b.g()){
             this.b.i();
             this.b.l();
          }
       }else {
          this.b.k();
       }
       return false;
    }
}
