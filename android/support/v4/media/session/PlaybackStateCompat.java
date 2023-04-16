package android.support.v4.media.session.PlaybackStateCompat;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat$a;
import java.lang.CharSequence;
import java.util.List;
import android.os.Bundle;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import android.os.Parcel;
import android.text.TextUtils;
import android.os.Parcelable$Creator;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ClassLoader;
import java.lang.Class;
import android.media.session.PlaybackState;
import java.util.Iterator;
import android.os.Build$VERSION;
import android.media.session.PlaybackState$Builder;
import android.media.session.PlaybackState$CustomAction;
import java.lang.String;
import java.lang.StringBuilder;

public final class PlaybackStateCompat implements Parcelable	// class@000401
{
    public final int b;
    public final long c;
    public final long d;
    public final float e;
    public final long f;
    public final int g;
    public final CharSequence h;
    public final long i;
    public List j;
    public final long k;
    public final Bundle l;
    public PlaybackState m;
    public static final Parcelable$Creator CREATOR;
    public static final long n;

    static {
       PlaybackStateCompat.CREATOR = new PlaybackStateCompat$a();
    }
    public void PlaybackStateCompat(int p0,long p1,long p2,float p3,long p4,int p5,CharSequence p6,long p7,List p8,long p9,Bundle p10){
       int i = this;
       super();
       i.b = p0;
       i.c = p1;
       i.d = p2;
       i.e = p3;
       i.f = p4;
       i.g = p5;
       i.h = p6;
       i.i = p7;
       i.j = new ArrayList(p8);
       i.k = p9;
       i.l = p10;
    }
    public void PlaybackStateCompat(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = p0.readLong();
       this.e = p0.readFloat();
       this.i = p0.readLong();
       this.d = p0.readLong();
       this.f = p0.readLong();
       this.h = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       this.j = p0.createTypedArrayList(PlaybackStateCompat$CustomAction.CREATOR);
       this.k = p0.readLong();
       this.l = p0.readBundle(MediaSessionCompat.class.getClassLoader());
       this.g = p0.readInt();
    }
    public static PlaybackStateCompat a(Object p0){
       ArrayList uArrayList1;
       Bundle uBundle = null;
       if (p0 != null) {
          PlaybackState playbackStat = p0;
          List customAction = playbackStat.getCustomActions();
          if (customAction != null) {
             ArrayList uArrayList = new ArrayList(customAction.size());
             Iterator iterator = customAction.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(PlaybackStateCompat$CustomAction.a(iterator.next()));
             }
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = uBundle;
          }
          if (Build$VERSION.SDK_INT >= 22) {
             uBundle = playbackStat.getExtras();
             MediaSessionCompat.b(uBundle);
          }
          PlaybackStateCompat playbackStat1 = new PlaybackStateCompat(playbackStat.getState(), playbackStat.getPosition(), playbackStat.getBufferedPosition(), playbackStat.getPlaybackSpeed(), playbackStat.getActions(), 0, playbackStat.getErrorMessage(), playbackStat.getLastPositionUpdateTime(), uArrayList1, playbackStat.getActiveQueueItemId(), uBundle);
          uBundle.m = playbackStat;
       }
       return uBundle;
    }
    public static int g(long p0){
       if (!p0 - 4) {
          return 126;
       }
       if (!p0 - 2) {
          return 127;
       }
       if (!p0 - 32) {
          return 87;
       }
       if (!p0 - 16) {
          return 88;
       }
       if (!p0 - 1) {
          return 86;
       }
       if (!p0 - 64) {
          return 90;
       }
       if (!p0 - 8) {
          return 89;
       }
       if (!p0 - 512) {
          return 85;
       }
       return 0;
    }
    public long b(){
       return this.i;
    }
    public float c(){
       return this.e;
    }
    public Object d(){
       if (this.m == null) {
          PlaybackState$Builder uBuilder = new PlaybackState$Builder();
          uBuilder.setState(this.b, this.c, this.e, this.i);
          uBuilder.setBufferedPosition(this.d);
          uBuilder.setActions(this.f);
          uBuilder.setErrorMessage(this.h);
          Iterator iterator = this.j.iterator();
          while (iterator.hasNext()) {
             uBuilder.addCustomAction(iterator.next().c());
          }
          uBuilder.setActiveQueueItemId(this.k);
          if (Build$VERSION.SDK_INT >= 22) {
             uBuilder.setExtras(this.l);
          }
          this.m = uBuilder.build();
       }
       return this.m;
    }
    public int describeContents(){
       return 0;
    }
    public long e(){
       return this.c;
    }
    public int f(){
       return this.b;
    }
    public String toString(){
       return "PlaybackState {"+"state="+this.b+", position="+this.c+", buffered position="+this.d+", speed="+this.e+", updated="+this.i+", actions="+this.f+", error code="+this.g+", error message="+this.h+", custom actions="+this.j+", active item id="+this.k+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeLong(this.c);
       p0.writeFloat(this.e);
       p0.writeLong(this.i);
       p0.writeLong(this.d);
       p0.writeLong(this.f);
       TextUtils.writeToParcel(this.h, p0, p1);
       p0.writeTypedList(this.j);
       p0.writeLong(this.k);
       p0.writeBundle(this.l);
       p0.writeInt(this.g);
    }
}
