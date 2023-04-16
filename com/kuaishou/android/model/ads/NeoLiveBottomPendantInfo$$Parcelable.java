package com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$Label;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$Label$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class NeoLiveBottomPendantInfo$$Parcelable implements Parcelable, d	// class@000876
{
    public NeoLiveBottomPendantInfo neoLiveBottomPendantInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NeoLiveBottomPendantInfo$$Parcelable.CREATOR = new NeoLiveBottomPendantInfo$$Parcelable$a();
    }
    public void NeoLiveBottomPendantInfo$$Parcelable(NeoLiveBottomPendantInfo p0){
       super();
       this.neoLiveBottomPendantInfo$$0 = p0;
    }
    public static NeoLiveBottomPendantInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          NeoLiveBottomPendantInfo neoLiveBotto = new NeoLiveBottomPendantInfo();
          p1.f(p1.g(), neoLiveBotto);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(NeoLiveBottomPendantInfo$Label$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          neoLiveBotto.mLabels = list;
          neoLiveBotto.mActionBar = p0.readString();
          neoLiveBotto.mTitle = p0.readString();
          p1.f(i, neoLiveBotto);
          return neoLiveBotto;
       }
    }
    public static void write(NeoLiveBottomPendantInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          NeoLiveBottomPendantInfo mLabels = p0.mLabels;
          if (mLabels == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLabels.size());
             Iterator iterator = p0.mLabels.iterator();
             while (iterator.hasNext()) {
                NeoLiveBottomPendantInfo$Label$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mActionBar);
          p1.writeString(p0.mTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NeoLiveBottomPendantInfo getParcel(){
       return this.neoLiveBottomPendantInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NeoLiveBottomPendantInfo$$Parcelable.write(this.neoLiveBottomPendantInfo$$0, p0, p1, new a());
    }
}
