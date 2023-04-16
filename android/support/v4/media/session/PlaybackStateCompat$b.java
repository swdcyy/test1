package android.support.v4.media.session.PlaybackStateCompat$b;
import java.lang.Object;
import java.util.ArrayList;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Collection;
import java.util.List;
import java.lang.CharSequence;
import android.os.Bundle;
import android.os.SystemClock;

public final class PlaybackStateCompat$b	// class@000400
{
    public final List a;
    public int b;
    public long c;
    public long d;
    public float e;
    public long f;
    public int g;
    public CharSequence h;
    public long i;
    public long j;
    public Bundle k;

    public void PlaybackStateCompat$b(){
       super();
       this.a = new ArrayList();
       this.j = -1;
    }
    public void PlaybackStateCompat$b(PlaybackStateCompat p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.a = uArrayList;
       this.j = -1;
       this.b = p0.b;
       this.c = p0.c;
       this.e = p0.e;
       this.i = p0.i;
       this.d = p0.d;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       PlaybackStateCompat j = p0.j;
       if (j != null) {
          uArrayList.addAll(j);
       }
       this.j = p0.k;
       this.k = p0.l;
       return;
    }
    public PlaybackStateCompat a(){
       PlaybackStateCompat$b uob = this;
       PlaybackStateCompat playbackStat = new PlaybackStateCompat(uob.b, uob.c, uob.d, uob.e, uob.f, uob.g, uob.h, uob.i, uob.a, uob.j, uob.k);
       return v18;
    }
    public PlaybackStateCompat$b b(long p0){
       this.f = p0;
       return this;
    }
    public PlaybackStateCompat$b c(int p0,long p1,float p2){
       this.d(p0, p1, p2, SystemClock.elapsedRealtime());
       return this;
    }
    public PlaybackStateCompat$b d(int p0,long p1,float p2,long p3){
       this.b = p0;
       this.c = p1;
       this.i = p3;
       this.e = p2;
       return this;
    }
}
