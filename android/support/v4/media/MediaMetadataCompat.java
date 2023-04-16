package android.support.v4.media.MediaMetadataCompat;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import java.lang.Integer;
import java.lang.Object;
import androidx.collection.SimpleArrayMap;
import java.lang.String;
import android.support.v4.media.MediaMetadataCompat$a;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Class;
import android.media.MediaMetadata;
import android.os.Parcelable$Creator;
import android.graphics.Bitmap;
import android.support.v4.media.MediaDescriptionCompat;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat$b;

public final class MediaMetadataCompat implements Parcelable	// class@0003db
{
    public final Bundle b;
    public MediaMetadata c;
    public MediaDescriptionCompat d;
    public static final Parcelable$Creator CREATOR;
    public static final ArrayMap e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;

    static {
       ArrayMap uArrayMap = new ArrayMap();
       MediaMetadataCompat.e = uArrayMap;
       Integer integer = Integer.valueOf(1);
       uArrayMap.put("android.media.metadata.TITLE", integer);
       uArrayMap.put("android.media.metadata.ARTIST", integer);
       Integer integer1 = Integer.valueOf(0);
       uArrayMap.put("android.media.metadata.DURATION", integer1);
       uArrayMap.put("android.media.metadata.ALBUM", integer);
       uArrayMap.put("android.media.metadata.AUTHOR", integer);
       uArrayMap.put("android.media.metadata.WRITER", integer);
       uArrayMap.put("android.media.metadata.COMPOSER", integer);
       uArrayMap.put("android.media.metadata.COMPILATION", integer);
       uArrayMap.put("android.media.metadata.DATE", integer);
       uArrayMap.put("android.media.metadata.YEAR", integer1);
       uArrayMap.put("android.media.metadata.GENRE", integer);
       uArrayMap.put("android.media.metadata.TRACK_NUMBER", integer1);
       uArrayMap.put("android.media.metadata.NUM_TRACKS", integer1);
       uArrayMap.put("android.media.metadata.DISC_NUMBER", integer1);
       uArrayMap.put("android.media.metadata.ALBUM_ARTIST", integer);
       Integer integer2 = Integer.valueOf(2);
       uArrayMap.put("android.media.metadata.ART", integer2);
       uArrayMap.put("android.media.metadata.ART_URI", integer);
       uArrayMap.put("android.media.metadata.ALBUM_ART", integer2);
       uArrayMap.put("android.media.metadata.ALBUM_ART_URI", integer);
       Integer integer3 = Integer.valueOf(3);
       uArrayMap.put("android.media.metadata.USER_RATING", integer3);
       uArrayMap.put("android.media.metadata.RATING", integer3);
       uArrayMap.put("android.media.metadata.DISPLAY_TITLE", integer);
       uArrayMap.put("android.media.metadata.DISPLAY_SUBTITLE", integer);
       uArrayMap.put("android.media.metadata.DISPLAY_DESCRIPTION", integer);
       uArrayMap.put("android.media.metadata.DISPLAY_ICON", integer2);
       uArrayMap.put("android.media.metadata.DISPLAY_ICON_URI", integer);
       uArrayMap.put("android.media.metadata.MEDIA_ID", integer);
       uArrayMap.put("android.media.metadata.BT_FOLDER_TYPE", integer1);
       uArrayMap.put("android.media.metadata.MEDIA_URI", integer);
       uArrayMap.put("android.media.metadata.ADVERTISEMENT", integer1);
       uArrayMap.put("android.media.metadata.DOWNLOAD_STATUS", integer1);
       String[] stringArray = new String[]{"android.media.metadata.TITLE","android.media.metadata.ARTIST","android.media.metadata.ALBUM","android.media.metadata.ALBUM_ARTIST","android.media.metadata.WRITER","android.media.metadata.AUTHOR","android.media.metadata.COMPOSER"};
       MediaMetadataCompat.f = stringArray;
       stringArray = new String[]{"android.media.metadata.DISPLAY_ICON","android.media.metadata.ART","android.media.metadata.ALBUM_ART"};
       MediaMetadataCompat.g = stringArray;
       stringArray = new String[]{"android.media.metadata.DISPLAY_ICON_URI","android.media.metadata.ART_URI","android.media.metadata.ALBUM_ART_URI"};
       MediaMetadataCompat.h = stringArray;
       MediaMetadataCompat.CREATOR = new MediaMetadataCompat$a();
    }
    public void MediaMetadataCompat(Bundle p0){
       super();
       Bundle uBundle = new Bundle(p0);
       this.b = uBundle;
       MediaSessionCompat.b(uBundle);
    }
    public void MediaMetadataCompat(Parcel p0){
       super();
       this.b = p0.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    public static MediaMetadataCompat b(Object p0){
       if (p0 == null) {
          return null;
       }
       MediaMetadata mediaMetadat = Parcel.obtain();
       p0.writeToParcel(mediaMetadat, 0);
       mediaMetadat.setDataPosition(0);
       MediaMetadataCompat mediaMetadat1 = MediaMetadataCompat.CREATOR.createFromParcel(mediaMetadat);
       mediaMetadat.recycle();
       mediaMetadat1.c = p0;
       return mediaMetadat1;
    }
    public boolean a(String p0){
       return this.b.containsKey(p0);
    }
    public Bitmap c(String p0){
       Bitmap parcelable;
       try{
          parcelable = this.b.getParcelable(p0);
       }catch(java.lang.Exception e0){
          parcelable = null;
       }
       return parcelable;
    }
    public MediaDescriptionCompat d(){
       Bitmap uBitmap;
       Uri uri1;
       MediaDescriptionCompat$b uob;
       MediaMetadataCompat td = this.d;
       if (td != null) {
          return td;
       }
       String str = this.g("android.media.metadata.MEDIA_ID");
       int i = 3;
       CharSequence[] uCharSequenc = new CharSequence[i];
       CharSequence uCharSequenc1 = this.h("android.media.metadata.DISPLAY_TITLE");
       if (!TextUtils.isEmpty(uCharSequenc1)) {
          uCharSequenc[0] = uCharSequenc1;
          uCharSequenc[1] = this.h("android.media.metadata.DISPLAY_SUBTITLE");
          uCharSequenc[2] = this.h("android.media.metadata.DISPLAY_DESCRIPTION");
       }else {
          int i1 = 0;
          int i2 = 0;
          while (i1 < i) {
             String[] f = MediaMetadataCompat.f;
             if (i2 < f.length) {
                int i3 = i2 + 1;
                CharSequence uCharSequenc2 = this.h(f[i2]);
                if (!TextUtils.isEmpty(uCharSequenc2)) {
                   int i4 = i1 + 1;
                   uCharSequenc[i1] = uCharSequenc2;
                   i1 = i4;
                }
                i2 = i3;
             }
          }
       }
       i = 0;
       while (true) {
          String[] g = MediaMetadataCompat.g;
          Uri uri = null;
          if (i < g.length) {
             uBitmap = this.c(g[i]);
             if (uBitmap != null) {
             label_0062 :
                i = 0;
                while (true) {
                   String[] h = MediaMetadataCompat.h;
                   if (i < h.length) {
                      String str1 = this.g(h[i]);
                      if (!TextUtils.isEmpty(str1)) {
                         uri1 = Uri.parse(str1);
                      label_007d :
                         str1 = this.g("android.media.metadata.MEDIA_URI");
                         if (!TextUtils.isEmpty(str1)) {
                            uri = Uri.parse(str1);
                         }
                         uob = new MediaDescriptionCompat$b();
                         uob.f(str);
                         uob.i(uCharSequenc[0]);
                         uob.h(uCharSequenc[1]);
                         uob.b(uCharSequenc[2]);
                         uob.d(uBitmap);
                         uob.e(uri1);
                         uob.g(uri);
                         Bundle uBundle = new Bundle();
                         String str2 = "android.media.metadata.BT_FOLDER_TYPE";
                         if (this.b.containsKey(str2)) {
                            uBundle.putLong("android.media.extra.BT_FOLDER_TYPE", this.e(str2));
                         }
                         if (this.b.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
                            uBundle.putLong("android.media.extra.DOWNLOAD_STATUS", this.e("android.media.metadata.DOWNLOAD_STATUS"));
                         }
                         if (!uBundle.isEmpty()) {
                            uob.c(uBundle);
                            break ;
                         }
                         break ;
                      }else {
                         i = i + 1;
                      }
                   }else {
                      uri1 = uri;
                      goto label_007d ;
                   }
                }
                MediaDescriptionCompat mediaDescrip = uob.a();
                this.d = mediaDescrip;
                return mediaDescrip;
             }else {
                i = i + 1;
             }
          }else {
             uBitmap = uri;
             goto label_0062 ;
          }
       }
    }
    public int describeContents(){
       return 0;
    }
    public long e(String p0){
       return this.b.getLong(p0, 0);
    }
    public Object f(){
       if (this.c == null) {
          Parcel parcel = Parcel.obtain();
          this.writeToParcel(parcel, 0);
          parcel.setDataPosition(0);
          this.c = MediaMetadata.CREATOR.createFromParcel(parcel);
          parcel.recycle();
       }
       return this.c;
    }
    public String g(String p0){
       CharSequence charSequence = this.b.getCharSequence(p0);
       if (charSequence != null) {
          return charSequence.toString();
       }
       return null;
    }
    public CharSequence h(String p0){
       return this.b.getCharSequence(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeBundle(this.b);
    }
}
