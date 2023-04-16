package com.yxcorp.gifshow.corona.common.model.CoronaBannerContent$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerContent$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerContent;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeedMeta;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeedMeta$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class CoronaBannerContent$$Parcelable implements Parcelable, d	// class@0011f8
{
    public CoronaBannerContent coronaBannerContent$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaBannerContent$$Parcelable.CREATOR = new CoronaBannerContent$$Parcelable$a();
    }
    public void CoronaBannerContent$$Parcelable(CoronaBannerContent p0){
       super();
       this.coronaBannerContent$$0 = p0;
    }
    public static CoronaBannerContent read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaBannerContent uCoronaBanne = new CoronaBannerContent();
          p1.f(p1.g(), uCoronaBanne);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(CoronaBannerFeedMeta$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uCoronaBanne.mCoronaBannerFeedMetas = list;
          p1.f(i, uCoronaBanne);
          return uCoronaBanne;
       }
    }
    public static void write(CoronaBannerContent p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaBannerContent mCoronaBanne = p0.mCoronaBannerFeedMetas;
          if (mCoronaBanne == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCoronaBanne.size());
             Iterator iterator = p0.mCoronaBannerFeedMetas.iterator();
             while (iterator.hasNext()) {
                CoronaBannerFeedMeta$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaBannerContent getParcel(){
       return this.coronaBannerContent$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaBannerContent$$Parcelable.write(this.coronaBannerContent$$0, p0, p1, new a());
    }
}
