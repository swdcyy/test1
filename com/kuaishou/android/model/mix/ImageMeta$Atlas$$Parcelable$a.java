package com.kuaishou.android.model.mix.ImageMeta$Atlas$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;

public class ImageMeta$Atlas$$Parcelable$a implements Parcelable$Creator	// class@000cbc
{

    public void ImageMeta$Atlas$$Parcelable$a(){
       super();
    }
    public ImageMeta$Atlas$$Parcelable a(Parcel p0){
       return new ImageMeta$Atlas$$Parcelable(ImageMeta$Atlas$$Parcelable.read(p0, new a()));
    }
    public ImageMeta$Atlas$$Parcelable[] b(int p0){
       ImageMeta$Atlas$$Parcelable[] uAtlas$$Parc = new ImageMeta$Atlas$$Parcelable[p0];
       return uAtlas$$Parc;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
