package com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;

public class DownloadPhotoInfoResponse$$Parcelable$a implements Parcelable$Creator	// class@000ecc
{

    public void DownloadPhotoInfoResponse$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new DownloadPhotoInfoResponse$$Parcelable(DownloadPhotoInfoResponse$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       DownloadPhotoInfoResponse$$Parcelable[] $ParcelableA = new DownloadPhotoInfoResponse$$Parcelable[p0];
       return $ParcelableA;
    }
}
