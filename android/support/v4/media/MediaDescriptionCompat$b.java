package android.support.v4.media.MediaDescriptionCompat$b;
import java.lang.Object;
import android.support.v4.media.MediaDescriptionCompat;
import java.lang.String;
import java.lang.CharSequence;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

public final class MediaDescriptionCompat$b	// class@0003d7
{
    public String a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public Bitmap e;
    public Uri f;
    public Bundle g;
    public Uri h;

    public void MediaDescriptionCompat$b(){
       super();
    }
    public MediaDescriptionCompat a(){
       MediaDescriptionCompat mediaDescrip = new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
       return v9;
    }
    public MediaDescriptionCompat$b b(CharSequence p0){
       this.d = p0;
       return this;
    }
    public MediaDescriptionCompat$b c(Bundle p0){
       this.g = p0;
       return this;
    }
    public MediaDescriptionCompat$b d(Bitmap p0){
       this.e = p0;
       return this;
    }
    public MediaDescriptionCompat$b e(Uri p0){
       this.f = p0;
       return this;
    }
    public MediaDescriptionCompat$b f(String p0){
       this.a = p0;
       return this;
    }
    public MediaDescriptionCompat$b g(Uri p0){
       this.h = p0;
       return this;
    }
    public MediaDescriptionCompat$b h(CharSequence p0){
       this.c = p0;
       return this;
    }
    public MediaDescriptionCompat$b i(CharSequence p0){
       this.b = p0;
       return this;
    }
}
