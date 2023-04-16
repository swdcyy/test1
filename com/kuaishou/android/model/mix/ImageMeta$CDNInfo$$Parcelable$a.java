package com.kuaishou.android.model.mix.ImageMeta$CDNInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;

public class ImageMeta$CDNInfo$$Parcelable$a implements Parcelable$Creator	// class@000cd0
{

    public void ImageMeta$CDNInfo$$Parcelable$a(){
       super();
    }
    public ImageMeta$CDNInfo$$Parcelable a(Parcel p0){
       return new ImageMeta$CDNInfo$$Parcelable(ImageMeta$CDNInfo$$Parcelable.read(p0, new a()));
    }
    public ImageMeta$CDNInfo$$Parcelable[] b(int p0){
       ImageMeta$CDNInfo$$Parcelable[] uCDNInfo$$Pa = new ImageMeta$CDNInfo$$Parcelable[p0];
       return uCDNInfo$$Pa;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
