package com.hpplay.sdk.source.bean.MediaAssetBean$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.hpplay.sdk.source.bean.MediaAssetBean;

public final class MediaAssetBean$1 implements Parcelable$Creator	// class@00064d
{

    public void MediaAssetBean$1(){
       super();
    }
    public MediaAssetBean createFromParcel(Parcel p0){
       return new MediaAssetBean(p0);
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public MediaAssetBean[] newArray(int p0){
       MediaAssetBean[] mediaAssetBe = new MediaAssetBean[p0];
       return mediaAssetBe;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
