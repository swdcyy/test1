package com.kwai.feature.api.corona.model.CoronaMeta$CoronaTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.model.CoronaMeta$CoronaTag$$Parcelable$a;
import com.kwai.feature.api.corona.model.CoronaMeta$CoronaTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaMeta$CoronaTag$$Parcelable implements Parcelable, d	// class@000df3
{
    public CoronaMeta$CoronaTag coronaTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaMeta$CoronaTag$$Parcelable.CREATOR = new CoronaMeta$CoronaTag$$Parcelable$a();
    }
    public void CoronaMeta$CoronaTag$$Parcelable(CoronaMeta$CoronaTag p0){
       super();
       this.coronaTag$$0 = p0;
    }
    public static CoronaMeta$CoronaTag read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaMeta$CoronaTag uCoronaTag = new CoronaMeta$CoronaTag();
          p1.f(p1.g(), uCoronaTag);
          uCoronaTag.mId = p0.readInt();
          uCoronaTag.mName = p0.readString();
          uCoronaTag.mType = p0.readInt();
          p1.f(i, uCoronaTag);
          return uCoronaTag;
       }
    }
    public static void write(CoronaMeta$CoronaTag p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mId);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaMeta$CoronaTag getParcel(){
       return this.coronaTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaMeta$CoronaTag$$Parcelable.write(this.coronaTag$$0, p0, p1, new a());
    }
}