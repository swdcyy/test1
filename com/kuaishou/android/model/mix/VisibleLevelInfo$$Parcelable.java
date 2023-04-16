package com.kuaishou.android.model.mix.VisibleLevelInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.VisibleLevelInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.VisibleLevelInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class VisibleLevelInfo$$Parcelable implements Parcelable, d	// class@000e33
{
    public VisibleLevelInfo visibleLevelInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       VisibleLevelInfo$$Parcelable.CREATOR = new VisibleLevelInfo$$Parcelable$a();
    }
    public void VisibleLevelInfo$$Parcelable(VisibleLevelInfo p0){
       super();
       this.visibleLevelInfo$$0 = p0;
    }
    public static VisibleLevelInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          VisibleLevelInfo visibleLevel = new VisibleLevelInfo();
          p1.f(p1.g(), visibleLevel);
          visibleLevel.mPunishLevel = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          visibleLevel.mIsPunished = b;
          visibleLevel.mPunishedUrl = p0.readString();
          p1.f(i, visibleLevel);
          return visibleLevel;
       }
    }
    public static void write(VisibleLevelInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPunishLevel);
          p1.writeInt(p0.mIsPunished);
          p1.writeString(p0.mPunishedUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public VisibleLevelInfo getParcel(){
       return this.visibleLevelInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       VisibleLevelInfo$$Parcelable.write(this.visibleLevelInfo$$0, p0, p1, new a());
    }
}
