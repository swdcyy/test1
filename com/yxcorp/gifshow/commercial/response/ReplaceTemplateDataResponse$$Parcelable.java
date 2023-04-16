package com.yxcorp.gifshow.commercial.response.ReplaceTemplateDataResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.commercial.response.ReplaceTemplateDataResponse$$Parcelable$a;
import com.yxcorp.gifshow.commercial.response.ReplaceTemplateDataResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.ReplaceTemplateData;
import com.kuaishou.android.model.ads.ReplaceTemplateData$$Parcelable;

public class ReplaceTemplateDataResponse$$Parcelable implements Parcelable, d	// class@00115f
{
    public ReplaceTemplateDataResponse replaceTemplateDataResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ReplaceTemplateDataResponse$$Parcelable.CREATOR = new ReplaceTemplateDataResponse$$Parcelable$a();
    }
    public void ReplaceTemplateDataResponse$$Parcelable(ReplaceTemplateDataResponse p0){
       super();
       this.replaceTemplateDataResponse$$0 = p0;
    }
    public static ReplaceTemplateDataResponse read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ReplaceTemplateDataResponse replaceTempl = new ReplaceTemplateDataResponse();
          p1.f(p1.g(), replaceTempl);
          replaceTempl.mData = ReplaceTemplateData$$Parcelable.read(p0, p1);
          p1.f(i, replaceTempl);
          return replaceTempl;
       }
    }
    public static void write(ReplaceTemplateDataResponse p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          ReplaceTemplateData$$Parcelable.write(p0.mData, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ReplaceTemplateDataResponse getParcel(){
       return this.replaceTemplateDataResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ReplaceTemplateDataResponse$$Parcelable.write(this.replaceTemplateDataResponse$$0, p0, p1, new a());
    }
}
