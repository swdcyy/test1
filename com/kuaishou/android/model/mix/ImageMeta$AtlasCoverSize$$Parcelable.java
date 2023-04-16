package com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize$$Parcelable$a;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ImageMeta$AtlasCoverSize$$Parcelable implements Parcelable, d	// class@000ccd
{
    public ImageMeta$AtlasCoverSize atlasCoverSize$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ImageMeta$AtlasCoverSize$$Parcelable.CREATOR = new ImageMeta$AtlasCoverSize$$Parcelable$a();
    }
    public void ImageMeta$AtlasCoverSize$$Parcelable(ImageMeta$AtlasCoverSize p0){
       super();
       this.atlasCoverSize$$0 = p0;
    }
    public static ImageMeta$AtlasCoverSize read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ImageMeta$AtlasCoverSize uAtlasCoverS = new ImageMeta$AtlasCoverSize();
          p1.f(p1.g(), uAtlasCoverS);
          uAtlasCoverS.mHeight = p0.readFloat();
          uAtlasCoverS.mWidth = p0.readFloat();
          p1.f(i, uAtlasCoverS);
          return uAtlasCoverS;
       }
    }
    public static void write(ImageMeta$AtlasCoverSize p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeFloat(p0.mHeight);
          p1.writeFloat(p0.mWidth);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ImageMeta$AtlasCoverSize getParcel(){
       return this.atlasCoverSize$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ImageMeta$AtlasCoverSize$$Parcelable.write(this.atlasCoverSize$$0, p0, p1, new a());
    }
}
