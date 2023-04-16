package com.kuaishou.live.lite.slide.LiveLiteSlideParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.lite.slide.LiveLiteSlideParam$$Parcelable$a;
import com.kuaishou.live.lite.slide.LiveLiteSlideParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class LiveLiteSlideParam$$Parcelable implements Parcelable, d	// class@000b53
{
    public LiveLiteSlideParam liveLiteSlideParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveLiteSlideParam$$Parcelable.CREATOR = new LiveLiteSlideParam$$Parcelable$a();
    }
    public void LiveLiteSlideParam$$Parcelable(LiveLiteSlideParam p0){
       super();
       this.liveLiteSlideParam$$0 = p0;
    }
    public static LiveLiteSlideParam read(Parcel p0,a p1){
       Set set;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveLiteSlideParam liveLiteSlid = new LiveLiteSlideParam();
          p1.f(p1.g(), liveLiteSlid);
          int i1 = p0.readInt();
          if (i1 < 0) {
             set = null;
          }else {
             HashSet hashSet = new HashSet(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                hashSet.add(p0.readString());
             }
             set = hashSet;
          }
          liveLiteSlid.mOrganicTrafficSet = set;
          p1.f(i, liveLiteSlid);
          return liveLiteSlid;
       }
    }
    public static void write(LiveLiteSlideParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          LiveLiteSlideParam mOrganicTraf = p0.mOrganicTrafficSet;
          if (mOrganicTraf == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mOrganicTraf.size());
             Iterator iterator = p0.mOrganicTrafficSet.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveLiteSlideParam getParcel(){
       return this.liveLiteSlideParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveLiteSlideParam$$Parcelable.write(this.liveLiteSlideParam$$0, p0, p1, new a());
    }
}
