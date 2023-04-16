package com.kwai.components.nearbymodel.model.BoundaryMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.BoundaryMeta$$Parcelable$a;
import com.kwai.components.nearbymodel.model.BoundaryMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.components.nearbymodel.model.BoundaryButton;
import com.kwai.components.nearbymodel.model.BoundaryButton$$Parcelable;
import com.kwai.components.nearbymodel.model.BoundaryBlankCard;
import com.kwai.components.nearbymodel.model.BoundaryBlankCard$$Parcelable;
import java.util.ArrayList;
import com.kwai.components.nearbymodel.model.BoundaryText;
import com.kwai.components.nearbymodel.model.BoundaryText$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class BoundaryMeta$$Parcelable implements Parcelable, d	// class@000c63
{
    public BoundaryMeta boundaryMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BoundaryMeta$$Parcelable.CREATOR = new BoundaryMeta$$Parcelable$a();
    }
    public void BoundaryMeta$$Parcelable(BoundaryMeta p0){
       super();
       this.boundaryMeta$$0 = p0;
    }
    public static BoundaryMeta read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          BoundaryMeta uBoundaryMet = new BoundaryMeta();
          p1.f(p1.g(), uBoundaryMet);
          uBoundaryMet.mButton = BoundaryButton$$Parcelable.read(p0, p1);
          uBoundaryMet.mBlankCard = BoundaryBlankCard$$Parcelable.read(p0, p1);
          uBoundaryMet.mStyle = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(BoundaryText$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uBoundaryMet.mDesc = list;
          p1.f(i, uBoundaryMet);
          return uBoundaryMet;
       }
    }
    public static void write(BoundaryMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          BoundaryButton$$Parcelable.write(p0.mButton, p1, p2, p3);
          BoundaryBlankCard$$Parcelable.write(p0.mBlankCard, p1, p2, p3);
          p1.writeInt(p0.mStyle);
          BoundaryMeta mDesc = p0.mDesc;
          if (mDesc == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDesc.size());
             Iterator iterator = p0.mDesc.iterator();
             while (iterator.hasNext()) {
                BoundaryText$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BoundaryMeta getParcel(){
       return this.boundaryMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BoundaryMeta$$Parcelable.write(this.boundaryMeta$$0, p0, p1, new a());
    }
}
