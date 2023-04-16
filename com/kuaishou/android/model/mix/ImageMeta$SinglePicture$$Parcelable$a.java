package com.kuaishou.android.model.mix.ImageMeta$SinglePicture$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;

public class ImageMeta$SinglePicture$$Parcelable$a implements Parcelable$Creator	// class@000cd4
{

    public void ImageMeta$SinglePicture$$Parcelable$a(){
       super();
    }
    public ImageMeta$SinglePicture$$Parcelable a(Parcel p0){
       return new ImageMeta$SinglePicture$$Parcelable(ImageMeta$SinglePicture$$Parcelable.read(p0, new a()));
    }
    public ImageMeta$SinglePicture$$Parcelable[] b(int p0){
       ImageMeta$SinglePicture$$Parcelable[] singlePictur = new ImageMeta$SinglePicture$$Parcelable[p0];
       return singlePictur;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
