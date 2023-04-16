package com.kuaishou.android.model.ads.ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplacePlayEndInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable implements Parcelable, d	// class@000a77
{
    public ReplaceTemplateData$ReplacePlayEndInfo replacePlayEndInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable.CREATOR = new ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable$a();
    }
    public void ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable(ReplaceTemplateData$ReplacePlayEndInfo p0){
       super();
       this.replacePlayEndInfo$$0 = p0;
    }
    public static ReplaceTemplateData$ReplacePlayEndInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ReplaceTemplateData$ReplacePlayEndInfo replacePlayE = new ReplaceTemplateData$ReplacePlayEndInfo();
          p1.f(p1.g(), replacePlayE);
          replacePlayE.mMixLottieData = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          replacePlayE.mShowEndOption = b;
          replacePlayE.mTemplateId = p0.readString();
          p1.f(i, replacePlayE);
          return replacePlayE;
       }
    }
    public static void write(ReplaceTemplateData$ReplacePlayEndInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mMixLottieData);
          p1.writeInt(p0.mShowEndOption);
          p1.writeString(p0.mTemplateId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ReplaceTemplateData$ReplacePlayEndInfo getParcel(){
       return this.replacePlayEndInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable.write(this.replacePlayEndInfo$$0, p0, p1, new a());
    }
}
