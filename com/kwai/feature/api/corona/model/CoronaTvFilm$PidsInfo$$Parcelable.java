package com.kwai.feature.api.corona.model.CoronaTvFilm$PidsInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.model.CoronaTvFilm$PidsInfo$$Parcelable$a;
import com.kwai.feature.api.corona.model.CoronaTvFilm$PidsInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Boolean;

public class CoronaTvFilm$PidsInfo$$Parcelable implements Parcelable, d	// class@000e0a
{
    public CoronaTvFilm$PidsInfo pidsInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaTvFilm$PidsInfo$$Parcelable.CREATOR = new CoronaTvFilm$PidsInfo$$Parcelable$a();
    }
    public void CoronaTvFilm$PidsInfo$$Parcelable(CoronaTvFilm$PidsInfo p0){
       super();
       this.pidsInfo$$0 = p0;
    }
    public static CoronaTvFilm$PidsInfo read(Parcel p0,a p1){
       Boolean uBoolean;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaTvFilm$PidsInfo pidsInfo = new CoronaTvFilm$PidsInfo();
          p1.f(p1.g(), pidsInfo);
          pidsInfo.mdesc = p0.readString();
          pidsInfo.mEndTime = p0.readLong();
          if (p0.readInt() < 0) {
             uBoolean = null;
          }else {
             boolean b = true;
             if (p0.readInt() != b) {
                b = false;
             }
             uBoolean = Boolean.valueOf(b);
          }
          pidsInfo.mHighlightDegrade = uBoolean;
          pidsInfo.mpid = p0.readString();
          pidsInfo.mStartTime = p0.readLong();
          p1.f(i, pidsInfo);
          return pidsInfo;
       }
    }
    public static void write(CoronaTvFilm$PidsInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mdesc);
          p1.writeLong(p0.mEndTime);
          if (p0.mHighlightDegrade == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.mHighlightDegrade.booleanValue());
          }
          p1.writeString(p0.mpid);
          p1.writeLong(p0.mStartTime);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaTvFilm$PidsInfo getParcel(){
       return this.pidsInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaTvFilm$PidsInfo$$Parcelable.write(this.pidsInfo$$0, p0, p1, new a());
    }
}
