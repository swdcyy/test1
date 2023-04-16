package com.kuaishou.android.model.mix.ScoreMark$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ScoreMark$$Parcelable$a;
import com.kuaishou.android.model.mix.ScoreMark;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ScoreMark$$Parcelable implements Parcelable, d	// class@000df1
{
    public ScoreMark scoreMark$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ScoreMark$$Parcelable.CREATOR = new ScoreMark$$Parcelable$a();
    }
    public void ScoreMark$$Parcelable(ScoreMark p0){
       super();
       this.scoreMark$$0 = p0;
    }
    public static ScoreMark read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ScoreMark scoreMark = new ScoreMark();
          p1.f(p1.g(), scoreMark);
          scoreMark.mScoreIconUrl = p0.readString();
          scoreMark.mToastContent = p0.readString();
          scoreMark.mId = p0.readString();
          scoreMark.mScoreTitle = p0.readString();
          scoreMark.mScoreValue = p0.readInt();
          p1.f(i, scoreMark);
          return scoreMark;
       }
    }
    public static void write(ScoreMark p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mScoreIconUrl);
          p1.writeString(p0.mToastContent);
          p1.writeString(p0.mId);
          p1.writeString(p0.mScoreTitle);
          p1.writeInt(p0.mScoreValue);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ScoreMark getParcel(){
       return this.scoreMark$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ScoreMark$$Parcelable.write(this.scoreMark$$0, p0, p1, new a());
    }
}
