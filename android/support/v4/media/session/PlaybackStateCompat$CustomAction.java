package android.support.v4.media.session.PlaybackStateCompat$CustomAction;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import android.text.TextUtils;
import android.os.Parcelable$Creator;
import java.lang.CharSequence;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Bundle;
import android.media.session.PlaybackState$CustomAction;
import android.media.session.PlaybackState$CustomAction$Builder;
import java.lang.StringBuilder;

public final class PlaybackStateCompat$CustomAction implements Parcelable	// class@0003fe
{
    public final String b;
    public final CharSequence c;
    public final int d;
    public final Bundle e;
    public PlaybackState$CustomAction f;
    public static final Parcelable$Creator CREATOR;

    static {
       PlaybackStateCompat$CustomAction.CREATOR = new PlaybackStateCompat$CustomAction$a();
    }
    public void PlaybackStateCompat$CustomAction(Parcel p0){
       super();
       this.b = p0.readString();
       this.c = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       this.d = p0.readInt();
       this.e = p0.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    public void PlaybackStateCompat$CustomAction(String p0,CharSequence p1,int p2,Bundle p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public static PlaybackStateCompat$CustomAction a(Object p0){
       if (p0 == null) {
          return null;
       }
       Bundle extras = p0.getExtras();
       MediaSessionCompat.b(extras);
       PlaybackStateCompat$CustomAction uCustomActio = new PlaybackStateCompat$CustomAction(p0.getAction(), p0.getName(), p0.getIcon(), extras);
       uCustomActio.f = p0;
       return uCustomActio;
    }
    public String b(){
       return this.b;
    }
    public Object c(){
       PlaybackStateCompat$CustomAction tf = this.f;
       if (tf == null) {
          PlaybackState$CustomAction$Builder uCustomActio = new PlaybackState$CustomAction$Builder(this.b, this.c, this.d);
          uCustomActio.setExtras(this.e);
          tf = uCustomActio.build();
       }
       return tf;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "Action:mName=\'"+this.c+", mIcon="+this.d+", mExtras="+this.e;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.b);
       TextUtils.writeToParcel(this.c, p0, p1);
       p0.writeInt(this.d);
       p0.writeBundle(this.e);
    }
}
