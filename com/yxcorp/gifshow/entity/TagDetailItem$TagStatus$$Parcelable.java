package com.yxcorp.gifshow.entity.TagDetailItem$TagStatus$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.TagDetailItem$TagStatus$$Parcelable$a;
import com.yxcorp.gifshow.entity.TagDetailItem$TagStatus;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TagDetailItem$TagStatus$$Parcelable implements Parcelable, d	// class@000d7e
{
    public TagDetailItem$TagStatus tagStatus$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TagDetailItem$TagStatus$$Parcelable.CREATOR = new TagDetailItem$TagStatus$$Parcelable$a();
    }
    public void TagDetailItem$TagStatus$$Parcelable(TagDetailItem$TagStatus p0){
       super();
       this.tagStatus$$0 = p0;
    }
    public static TagDetailItem$TagStatus read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TagDetailItem$TagStatus tagStatus = new TagDetailItem$TagStatus();
          p1.f(p1.g(), tagStatus);
          tagStatus.mLikeCount = p0.readLong();
          tagStatus.mViewCount = p0.readLong();
          tagStatus.mPhotoCount = p0.readLong();
          p1.f(i, tagStatus);
          return tagStatus;
       }
    }
    public static void write(TagDetailItem$TagStatus p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mLikeCount);
          p1.writeLong(p0.mViewCount);
          p1.writeLong(p0.mPhotoCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TagDetailItem$TagStatus getParcel(){
       return this.tagStatus$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TagDetailItem$TagStatus$$Parcelable.write(this.tagStatus$$0, p0, p1, new a());
    }
}
