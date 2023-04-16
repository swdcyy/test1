package com.kuaishou.android.model.ads.ReplaceTemplateData$ReplaceCardInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplaceCardInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplaceCardInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ReplaceTemplateData$ReplaceCardInfo$$Parcelable implements Parcelable, d	// class@000a74
{
    public ReplaceTemplateData$ReplaceCardInfo replaceCardInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ReplaceTemplateData$ReplaceCardInfo$$Parcelable.CREATOR = new ReplaceTemplateData$ReplaceCardInfo$$Parcelable$a();
    }
    public void ReplaceTemplateData$ReplaceCardInfo$$Parcelable(ReplaceTemplateData$ReplaceCardInfo p0){
       super();
       this.replaceCardInfo$$0 = p0;
    }
    public static ReplaceTemplateData$ReplaceCardInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ReplaceTemplateData$ReplaceCardInfo replaceCardI = new ReplaceTemplateData$ReplaceCardInfo();
          p1.f(p1.g(), replaceCardI);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          replaceCardI.mUseTemplate = b;
          replaceCardI.mTemplateId = p0.readString();
          p1.f(i, replaceCardI);
          return replaceCardI;
       }
    }
    public static void write(ReplaceTemplateData$ReplaceCardInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mUseTemplate);
          p1.writeString(p0.mTemplateId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ReplaceTemplateData$ReplaceCardInfo getParcel(){
       return this.replaceCardInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ReplaceTemplateData$ReplaceCardInfo$$Parcelable.write(this.replaceCardInfo$$0, p0, p1, new a());
    }
}
