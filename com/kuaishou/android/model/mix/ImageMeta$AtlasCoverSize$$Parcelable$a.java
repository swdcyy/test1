package com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;

public class ImageMeta$AtlasCoverSize$$Parcelable$a implements Parcelable$Creator	// class@000ccc
{

    public void ImageMeta$AtlasCoverSize$$Parcelable$a(){
       super();
    }
    public ImageMeta$AtlasCoverSize$$Parcelable a(Parcel p0){
       return new ImageMeta$AtlasCoverSize$$Parcelable(ImageMeta$AtlasCoverSize$$Parcelable.read(p0, new a()));
    }
    public ImageMeta$AtlasCoverSize$$Parcelable[] b(int p0){
       ImageMeta$AtlasCoverSize$$Parcelable[] uAtlasCoverS = new ImageMeta$AtlasCoverSize$$Parcelable[p0];
       return uAtlasCoverS;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
