package com.yxcorp.gifshow.share.model.guide.ShareFinishGuide$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.share.model.guide.ShareFinishGuide$$Parcelable$a;
import com.yxcorp.gifshow.share.model.guide.ShareFinishGuide;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ShareFinishGuide$$Parcelable implements Parcelable, d	// class@001be1
{
    public ShareFinishGuide shareFinishGuide$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShareFinishGuide$$Parcelable.CREATOR = new ShareFinishGuide$$Parcelable$a();
    }
    public void ShareFinishGuide$$Parcelable(ShareFinishGuide p0){
       super();
       this.shareFinishGuide$$0 = p0;
    }
    public static ShareFinishGuide read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ShareFinishGuide shareFinishG = new ShareFinishGuide();
          p1.f(p1.g(), shareFinishG);
          shareFinishG.panelType = p0.readInt();
          p1.f(i, shareFinishG);
          return shareFinishG;
       }
    }
    public static void write(ShareFinishGuide p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.panelType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShareFinishGuide getParcel(){
       return this.shareFinishGuide$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShareFinishGuide$$Parcelable.write(this.shareFinishGuide$$0, p0, p1, new a());
    }
}
