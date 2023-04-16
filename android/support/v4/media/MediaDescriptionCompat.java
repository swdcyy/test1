package android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import android.text.TextUtils;
import android.os.Parcelable$Creator;
import java.lang.CharSequence;
import java.lang.ClassLoader;
import java.lang.Class;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.support.v4.media.MediaDescriptionCompat$b;
import android.media.MediaDescription;
import android.support.v4.media.session.MediaSessionCompat;
import android.media.MediaDescription$Builder;
import java.lang.StringBuilder;

public final class MediaDescriptionCompat implements Parcelable	// class@0003d8
{
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final Bitmap f;
    public final Uri g;
    public final Bundle h;
    public final Uri i;
    public MediaDescription j;
    public static final Parcelable$Creator CREATOR;

    static {
       MediaDescriptionCompat.CREATOR = new MediaDescriptionCompat$a();
    }
    public void MediaDescriptionCompat(Parcel p0){
       super();
       this.b = p0.readString();
       this.c = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       this.d = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       this.e = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
       this.f = p0.readParcelable(classLoader);
       this.g = p0.readParcelable(classLoader);
       this.h = p0.readBundle(classLoader);
       this.i = p0.readParcelable(classLoader);
    }
    public void MediaDescriptionCompat(String p0,CharSequence p1,CharSequence p2,CharSequence p3,Bitmap p4,Uri p5,Bundle p6,Uri p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public static MediaDescriptionCompat a(Object p0){
       Bundle uBundle = null;
       if (p0 != null) {
          int sDK_INT = Build$VERSION.SDK_INT;
          MediaDescriptionCompat$b uob = new MediaDescriptionCompat$b();
          uob.f(p0.getMediaId());
          uob.i(p0.getTitle());
          uob.h(p0.getSubtitle());
          uob.b(p0.getDescription());
          uob.d(p0.getIconBitmap());
          uob.e(p0.getIconUri());
          Bundle extras = p0.getExtras();
          if (extras != null) {
             extras = MediaSessionCompat.m(extras);
          }
          Uri parcelable = (extras != null)? extras.getParcelable("android.support.v4.media.description.MEDIA_URI"): uBundle;
          if (parcelable != null) {
             if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
             label_0065 :
                uob.c(uBundle);
                if (parcelable != null) {
                   uob.g(parcelable);
                }else if(sDK_INT >= 23){
                   uob.g(p0.getMediaUri());
                }
                uBundle = uob.a();
                uBundle.j = p0;
             }else {
                extras.remove("android.support.v4.media.description.MEDIA_URI");
                extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
             }
          }
          uBundle = extras;
          goto label_0065 ;
       }
       return uBundle;
    }
    public CharSequence b(){
       return this.e;
    }
    public Bitmap c(){
       return this.f;
    }
    public Object d(){
       MediaDescriptionCompat tj = this.j;
       if (tj == null) {
          int sDK_INT = Build$VERSION.SDK_INT;
          MediaDescription$Builder uBuilder = new MediaDescription$Builder();
          uBuilder.setMediaId(this.b);
          uBuilder.setTitle(this.c);
          uBuilder.setSubtitle(this.d);
          uBuilder.setDescription(this.e);
          uBuilder.setIconBitmap(this.f);
          uBuilder.setIconUri(this.g);
          MediaDescriptionCompat th = this.h;
          if (sDK_INT < 23 && this.i != null) {
             if (th == null) {
                th = new Bundle();
                th.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
             }
             th.putParcelable("android.support.v4.media.description.MEDIA_URI", this.i);
          }
          uBuilder.setExtras(th);
          if (sDK_INT >= 23) {
             uBuilder.setMediaUri(this.i);
          }
          tj = uBuilder.build();
          this.j = tj;
       }
       return tj;
    }
    public int describeContents(){
       return 0;
    }
    public String e(){
       return this.b;
    }
    public CharSequence f(){
       return this.d;
    }
    public CharSequence g(){
       return this.c;
    }
    public String toString(){
       return this.c+", "+this.d+", "+this.e;
    }
    public void writeToParcel(Parcel p0,int p1){
       this.d().writeToParcel(p0, p1);
    }
}
