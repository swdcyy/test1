package com.kwai.feature.component.entry.SearchLandingParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.component.entry.SearchLandingParams$$Parcelable$a;
import com.kwai.feature.component.entry.SearchLandingParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;
import java.lang.Integer;
import java.lang.Boolean;

public class SearchLandingParams$$Parcelable implements Parcelable, d	// class@001208
{
    public SearchLandingParams searchLandingParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchLandingParams$$Parcelable.CREATOR = new SearchLandingParams$$Parcelable$a();
    }
    public void SearchLandingParams$$Parcelable(SearchLandingParams p0){
       super();
       this.searchLandingParams$$0 = p0;
    }
    public static SearchLandingParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SearchLandingParams searchLandin = new SearchLandingParams();
          p1.f(p1.g(), searchLandin);
          a.d(SearchLandingParams.class, searchLandin, "mBackQuery", p0.readString());
          a.d(SearchLandingParams.class, searchLandin, "mPageSize", Integer.valueOf(p0.readInt()));
          a.d(SearchLandingParams.class, searchLandin, "mSubTabId", p0.readString());
          a.d(SearchLandingParams.class, searchLandin, "mPageType", p0.readString());
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          a.d(SearchLandingParams.class, searchLandin, "mFromShare", Boolean.valueOf(b));
          p1.f(i, searchLandin);
          return searchLandin;
       }
    }
    public static void write(SearchLandingParams p0,Parcel p1,int p2,a p3){
       String str = String.class;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(a.b(str, SearchLandingParams.class, p0, "mBackQuery"));
          p1.writeInt(a.b(Integer.TYPE, SearchLandingParams.class, p0, "mPageSize").intValue());
          p1.writeString(a.b(str, SearchLandingParams.class, p0, "mSubTabId"));
          p1.writeString(a.b(str, SearchLandingParams.class, p0, "mPageType"));
          p1.writeInt(a.b(Boolean.TYPE, SearchLandingParams.class, p0, "mFromShare").booleanValue());
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SearchLandingParams getParcel(){
       return this.searchLandingParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SearchLandingParams$$Parcelable.write(this.searchLandingParams$$0, p0, p1, new a());
    }
}
