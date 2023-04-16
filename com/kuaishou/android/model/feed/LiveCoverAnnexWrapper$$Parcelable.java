package com.kuaishou.android.model.feed.LiveCoverAnnexWrapper$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper$$Parcelable$a;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.feed.LiveCoverAnnex;
import com.kuaishou.android.model.feed.LiveCoverAnnex$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class LiveCoverAnnexWrapper$$Parcelable implements Parcelable, d	// class@000b05
{
    public LiveCoverAnnexWrapper liveCoverAnnexWrapper$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveCoverAnnexWrapper$$Parcelable.CREATOR = new LiveCoverAnnexWrapper$$Parcelable$a();
    }
    public void LiveCoverAnnexWrapper$$Parcelable(LiveCoverAnnexWrapper p0){
       super();
       this.liveCoverAnnexWrapper$$0 = p0;
    }
    public static LiveCoverAnnexWrapper read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveCoverAnnexWrapper liveCoverAnn = new LiveCoverAnnexWrapper();
          p1.f(p1.g(), liveCoverAnn);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(LiveCoverAnnex$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          liveCoverAnn.mLiveCoverAnnexes = list;
          p1.f(i, liveCoverAnn);
          return liveCoverAnn;
       }
    }
    public static void write(LiveCoverAnnexWrapper p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveCoverAnnexWrapper mLiveCoverAn = p0.mLiveCoverAnnexes;
          if (mLiveCoverAn == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mLiveCoverAn.size());
             Iterator iterator = p0.mLiveCoverAnnexes.iterator();
             while (iterator.hasNext()) {
                LiveCoverAnnex$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveCoverAnnexWrapper getParcel(){
       return this.liveCoverAnnexWrapper$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveCoverAnnexWrapper$$Parcelable.write(this.liveCoverAnnexWrapper$$0, p0, p1, new a());
    }
}
