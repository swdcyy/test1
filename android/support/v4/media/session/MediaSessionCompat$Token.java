package android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$Token$a;
import java.lang.Object;
import android.support.v4.media.session.b;
import g3.c;
import android.media.session.MediaSession$Token;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.os.Parcel;

public final class MediaSessionCompat$Token implements Parcelable	// class@0003ef
{
    public final Object b;
    public final Object c;
    public b d;
    public c e;
    public static final Parcelable$Creator CREATOR;

    static {
       MediaSessionCompat$Token.CREATOR = new MediaSessionCompat$Token$a();
    }
    public void MediaSessionCompat$Token(Object p0){
       super(p0, null, null);
    }
    public void MediaSessionCompat$Token(Object p0,b p1){
       super(p0, p1, null);
    }
    public void MediaSessionCompat$Token(Object p0,b p1,c p2){
       super();
       this.b = new Object();
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public static MediaSessionCompat$Token a(Object p0){
       return MediaSessionCompat$Token.b(p0, null);
    }
    public static MediaSessionCompat$Token b(Object p0,b p1){
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof MediaSession$Token) {
          return new MediaSessionCompat$Token(p0, p1);
       }
       throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
    public b c(){
       MediaSessionCompat$Token tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.d;
    }
    public c d(){
       MediaSessionCompat$Token tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.e;
    }
    public int describeContents(){
       return 0;
    }
    public Object e(){
       return this.c;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof MediaSessionCompat$Token) {
          return false;
       }
       MediaSessionCompat$Token tc = this.c;
       if (tc == null) {
          if (p0.c != null) {
             b = false;
          }
          return b;
       }else {
          p0 = p0.c;
          if (p0 == null) {
             return false;
          }
          return tc.equals(p0);
       }
    }
    public void f(b p0){
       MediaSessionCompat$Token tb = this.b;
       _monitor_enter(tb);
       this.d = p0;
       _monitor_exit(tb);
    }
    public void g(c p0){
       MediaSessionCompat$Token tb = this.b;
       _monitor_enter(tb);
       this.e = p0;
       _monitor_exit(tb);
    }
    public int hashCode(){
       MediaSessionCompat$Token tc = this.c;
       if (tc == null) {
          return 0;
       }
       return tc.hashCode();
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.c, p1);
    }
}
