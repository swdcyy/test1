package com.kwai.components.feedmodel.OperationBarInfo$RelatedVideoItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.OperationBarInfo$RelatedVideoItem$$Parcelable$a;
import com.kwai.components.feedmodel.OperationBarInfo$RelatedVideoItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class OperationBarInfo$RelatedVideoItem$$Parcelable implements Parcelable, d	// class@000c23
{
    public OperationBarInfo$RelatedVideoItem relatedVideoItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       OperationBarInfo$RelatedVideoItem$$Parcelable.CREATOR = new OperationBarInfo$RelatedVideoItem$$Parcelable$a();
    }
    public void OperationBarInfo$RelatedVideoItem$$Parcelable(OperationBarInfo$RelatedVideoItem p0){
       super();
       this.relatedVideoItem$$0 = p0;
    }
    public static OperationBarInfo$RelatedVideoItem read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          OperationBarInfo$RelatedVideoItem relatedVideo = new OperationBarInfo$RelatedVideoItem();
          p1.f(p1.g(), relatedVideo);
          relatedVideo.mLink = p0.readString();
          relatedVideo.mRelatedPhotoId = p0.readString();
          relatedVideo.mViewCount = p0.readInt();
          relatedVideo.mPhotoId = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          relatedVideo.mCover = uCDNUrlArray;
          p1.f(i, relatedVideo);
          return relatedVideo;
       }
    }
    public static void write(OperationBarInfo$RelatedVideoItem p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLink);
          p1.writeString(p0.mRelatedPhotoId);
          p1.writeInt(p0.mViewCount);
          p1.writeInt(p0.mPhotoId);
          OperationBarInfo$RelatedVideoItem mCover = p0.mCover;
          if (mCover == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCover.length);
             p0 = p0.mCover;
             i = p0.length;
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(p0[i1], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public OperationBarInfo$RelatedVideoItem getParcel(){
       return this.relatedVideoItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       OperationBarInfo$RelatedVideoItem$$Parcelable.write(this.relatedVideoItem$$0, p0, p1, new a());
    }
}
