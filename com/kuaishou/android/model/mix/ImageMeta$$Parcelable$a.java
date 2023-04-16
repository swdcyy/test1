package com.kuaishou.android.model.mix.ImageMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ImageMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ImageMeta;

public class ImageMeta$$Parcelable$a implements Parcelable$Creator	// class@000cba
{

    public void ImageMeta$$Parcelable$a(){
       super();
    }
    public ImageMeta$$Parcelable a(Parcel p0){
       return new ImageMeta$$Parcelable(ImageMeta$$Parcelable.read(p0, new a()));
    }
    public ImageMeta$$Parcelable[] b(int p0){
       ImageMeta$$Parcelable[] $ParcelableA = new ImageMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
