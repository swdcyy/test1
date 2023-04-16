package com.yxcorp.gifshow.detail.OldPhotoDetailParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.OldPhotoDetailParam$$Parcelable$a;
import com.yxcorp.gifshow.detail.OldPhotoDetailParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.entity.QPreInfo$$Parcelable;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.android.model.mix.QComment$$Parcelable;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;

public class OldPhotoDetailParam$$Parcelable implements Parcelable, d	// class@00133d
{
    public OldPhotoDetailParam oldPhotoDetailParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       OldPhotoDetailParam$$Parcelable.CREATOR = new OldPhotoDetailParam$$Parcelable$a();
    }
    public void OldPhotoDetailParam$$Parcelable(OldPhotoDetailParam p0){
       super();
       this.oldPhotoDetailParam$$0 = p0;
    }
    public static OldPhotoDetailParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          OldPhotoDetailParam oldPhotoDeta = new OldPhotoDetailParam();
          p1.f(p1.g(), oldPhotoDeta);
          oldPhotoDeta.mPhotoCoorX = p0.readFloat();
          oldPhotoDeta.mPhotoCoorY = p0.readFloat();
          oldPhotoDeta.mPhotoIndexByLog = p0.readInt();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          oldPhotoDeta.mIsFromFollowTopLive = b1;
          oldPhotoDeta.mPreInfo = QPreInfo$$Parcelable.read(p0, p1);
          oldPhotoDeta.mComment = QComment$$Parcelable.read(p0, p1);
          oldPhotoDeta.mDetailPlayConfig = DetailPlayConfig$$Parcelable.read(p0, p1);
          oldPhotoDeta.mThumbWidth = p0.readInt();
          oldPhotoDeta.mSource = p0.readInt();
          oldPhotoDeta.mGzoneSourceUrl = p0.readString();
          oldPhotoDeta.mPhotoIndex = p0.readInt();
          oldPhotoDeta.mFromH5Page = p0.readString();
          oldPhotoDeta.mSlidePlayId = p0.readString();
          oldPhotoDeta.mFromUtmSource = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          oldPhotoDeta.mIsFromUserProfile = b;
          oldPhotoDeta.mOpendTimeStamp = p0.readLong();
          oldPhotoDeta.mThumbHeight = p0.readInt();
          oldPhotoDeta.mPhoto = QPhoto$$Parcelable.read(p0, p1);
          oldPhotoDeta.mPhotoId = p0.readString();
          p1.f(i, oldPhotoDeta);
          return oldPhotoDeta;
       }
    }
    public static void write(OldPhotoDetailParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeFloat(p0.mPhotoCoorX);
          p1.writeFloat(p0.mPhotoCoorY);
          p1.writeInt(p0.mPhotoIndexByLog);
          p1.writeInt(p0.mIsFromFollowTopLive);
          QPreInfo$$Parcelable.write(p0.mPreInfo, p1, p2, p3);
          QComment$$Parcelable.write(p0.mComment, p1, p2, p3);
          DetailPlayConfig$$Parcelable.write(p0.mDetailPlayConfig, p1, p2, p3);
          p1.writeInt(p0.mThumbWidth);
          p1.writeInt(p0.mSource);
          p1.writeString(p0.mGzoneSourceUrl);
          p1.writeInt(p0.mPhotoIndex);
          p1.writeString(p0.mFromH5Page);
          p1.writeString(p0.mSlidePlayId);
          p1.writeString(p0.mFromUtmSource);
          p1.writeInt(p0.mIsFromUserProfile);
          p1.writeLong(p0.mOpendTimeStamp);
          p1.writeInt(p0.mThumbHeight);
          QPhoto$$Parcelable.write(p0.mPhoto, p1, p2, p3);
          p1.writeString(p0.mPhotoId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public OldPhotoDetailParam getParcel(){
       return this.oldPhotoDetailParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       OldPhotoDetailParam$$Parcelable.write(this.oldPhotoDetailParam$$0, p0, p1, new a());
    }
}
