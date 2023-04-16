package com.yxcorp.plugin.search.startup.SearchStartEndTime$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.plugin.search.startup.SearchStartEndTime$$Parcelable$a;
import com.yxcorp.plugin.search.startup.SearchStartEndTime;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SearchStartEndTime$$Parcelable implements Parcelable, d	// class@000766
{
    public SearchStartEndTime searchStartEndTime$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchStartEndTime$$Parcelable.CREATOR = new SearchStartEndTime$$Parcelable$a();
    }
    public void SearchStartEndTime$$Parcelable(SearchStartEndTime p0){
       super();
       this.searchStartEndTime$$0 = p0;
    }
    public static SearchStartEndTime read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SearchStartEndTime searchStartE = new SearchStartEndTime();
          p1.f(p1.g(), searchStartE);
          searchStartE.mEndTime = p0.readLong();
          searchStartE.mStartTime = p0.readLong();
          p1.f(i, searchStartE);
          return searchStartE;
       }
    }
    public static void write(SearchStartEndTime p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mEndTime);
          p1.writeLong(p0.mStartTime);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SearchStartEndTime getParcel(){
       return this.searchStartEndTime$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SearchStartEndTime$$Parcelable.write(this.searchStartEndTime$$0, p0, p1, new a());
    }
}
