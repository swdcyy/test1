package com.kuaishou.android.live.model.LiveCoverRightTopDecorateInfoModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.LiveCoverRightTopDecorateInfoModel$$Parcelable$a;
import com.kuaishou.android.live.model.LiveCoverRightTopDecorateInfoModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class LiveCoverRightTopDecorateInfoModel$$Parcelable implements Parcelable, d	// class@0007e7
{
    public LiveCoverRightTopDecorateInfoModel liveCoverRightTopDecorateInfoModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveCoverRightTopDecorateInfoModel$$Parcelable.CREATOR = new LiveCoverRightTopDecorateInfoModel$$Parcelable$a();
    }
    public void LiveCoverRightTopDecorateInfoModel$$Parcelable(LiveCoverRightTopDecorateInfoModel p0){
       super();
       this.liveCoverRightTopDecorateInfoModel$$0 = p0;
    }
    public static LiveCoverRightTopDecorateInfoModel read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveCoverRightTopDecorateInfoModel liveCoverRig = new LiveCoverRightTopDecorateInfoModel();
          p1.f(p1.g(), liveCoverRig);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          liveCoverRig.mImageUrls = list;
          p1.f(i, liveCoverRig);
          return liveCoverRig;
       }
    }
    public static void write(LiveCoverRightTopDecorateInfoModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveCoverRightTopDecorateInfoModel mImageUrls = p0.mImageUrls;
          if (mImageUrls == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mImageUrls.size());
             Iterator iterator = p0.mImageUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveCoverRightTopDecorateInfoModel getParcel(){
       return this.liveCoverRightTopDecorateInfoModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveCoverRightTopDecorateInfoModel$$Parcelable.write(this.liveCoverRightTopDecorateInfoModel$$0, p0, p1, new a());
    }
}
