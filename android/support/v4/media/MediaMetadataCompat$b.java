package android.support.v4.media.MediaMetadataCompat$b;
import java.lang.Object;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.String;
import android.graphics.Bitmap;
import androidx.collection.SimpleArrayMap;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.os.Parcelable;
import java.lang.CharSequence;

public final class MediaMetadataCompat$b	// class@0003da
{
    public final Bundle a;

    public void MediaMetadataCompat$b(){
       super();
       this.a = new Bundle();
    }
    public void MediaMetadataCompat$b(MediaMetadataCompat p0){
       super();
       Bundle uBundle = new Bundle(p0.b);
       this.a = uBundle;
       MediaSessionCompat.b(uBundle);
    }
    public MediaMetadataCompat a(){
       return new MediaMetadataCompat(this.a);
    }
    public MediaMetadataCompat$b b(String p0,Bitmap p1){
       ArrayMap e = MediaMetadataCompat.e;
       if (e.containsKey(p0) && e.get(p0).intValue() != 2) {
          throw new IllegalArgumentException("The "+p0+" key cannot be used to put a Bitmap");
       }
       this.a.putParcelable(p0, p1);
       return this;
    }
    public MediaMetadataCompat$b c(String p0,long p1){
       ArrayMap e = MediaMetadataCompat.e;
       if (e.containsKey(p0) && e.get(p0).intValue()) {
          throw new IllegalArgumentException("The "+p0+" key cannot be used to put a long");
       }
       this.a.putLong(p0, p1);
       return this;
    }
    public MediaMetadataCompat$b d(String p0,String p1){
       ArrayMap e = MediaMetadataCompat.e;
       if (e.containsKey(p0) && e.get(p0).intValue() != 1) {
          throw new IllegalArgumentException("The "+p0+" key cannot be used to put a String");
       }
       this.a.putCharSequence(p0, p1);
       return this;
    }
}
