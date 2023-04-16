package com.kuaishou.android.model.mix.FusionPlayInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.FusionPlayInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.FusionPlayInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class FusionPlayInfo$$Parcelable implements Parcelable, d	// class@000c94
{
    public FusionPlayInfo fusionPlayInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FusionPlayInfo$$Parcelable.CREATOR = new FusionPlayInfo$$Parcelable$a();
    }
    public void FusionPlayInfo$$Parcelable(FusionPlayInfo p0){
       super();
       this.fusionPlayInfo$$0 = p0;
    }
    public static FusionPlayInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FusionPlayInfo uFusionPlayI = new FusionPlayInfo();
          p1.f(p1.g(), uFusionPlayI);
          uFusionPlayI.mSourceType = p0.readString();
          uFusionPlayI.mHeight = p0.readInt();
          uFusionPlayI.mWidth = p0.readInt();
          uFusionPlayI.mStreamId = p0.readString();
          uFusionPlayI.mDefinitionCode = p0.readString();
          uFusionPlayI.mDefinition = p0.readString();
          uFusionPlayI.mRate = p0.readInt();
          uFusionPlayI.mStream = p0.readString();
          uFusionPlayI.mDefinitionId = p0.readString();
          uFusionPlayI.mFilesize = p0.readString();
          p1.f(i, uFusionPlayI);
          return uFusionPlayI;
       }
    }
    public static void write(FusionPlayInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mSourceType);
          p1.writeInt(p0.mHeight);
          p1.writeInt(p0.mWidth);
          p1.writeString(p0.mStreamId);
          p1.writeString(p0.mDefinitionCode);
          p1.writeString(p0.mDefinition);
          p1.writeInt(p0.mRate);
          p1.writeString(p0.mStream);
          p1.writeString(p0.mDefinitionId);
          p1.writeString(p0.mFilesize);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FusionPlayInfo getParcel(){
       return this.fusionPlayInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FusionPlayInfo$$Parcelable.write(this.fusionPlayInfo$$0, p0, p1, new a());
    }
}
