package com.yxcorp.gifshow.profile.model.UserOperationEntrance$OperationExtParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.UserOperationEntrance$OperationExtParam$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.UserOperationEntrance$OperationExtParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.model.UserOperationEntrance;
import com.yxcorp.gifshow.profile.model.UserOperationEntrance$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class UserOperationEntrance$OperationExtParam$$Parcelable implements Parcelable, d	// class@0013bb
{
    public UserOperationEntrance$OperationExtParam operationExtParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserOperationEntrance$OperationExtParam$$Parcelable.CREATOR = new UserOperationEntrance$OperationExtParam$$Parcelable$a();
    }
    public void UserOperationEntrance$OperationExtParam$$Parcelable(UserOperationEntrance$OperationExtParam p0){
       super();
       this.operationExtParam$$0 = p0;
    }
    public static UserOperationEntrance$OperationExtParam read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserOperationEntrance$OperationExtParam operationExt = new UserOperationEntrance$OperationExtParam();
          p1.f(p1.g(), operationExt);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(UserOperationEntrance$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          operationExt.mOperationEntrances = list;
          operationExt.mIntimateRelationStatus = p0.readInt();
          operationExt.mIntimateRelationIcon = p0.readString();
          p1.f(i, operationExt);
          return operationExt;
       }
    }
    public static void write(UserOperationEntrance$OperationExtParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          UserOperationEntrance$OperationExtParam mOperationEn = p0.mOperationEntrances;
          if (mOperationEn == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mOperationEn.size());
             Iterator iterator = p0.mOperationEntrances.iterator();
             while (iterator.hasNext()) {
                UserOperationEntrance$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mIntimateRelationStatus);
          p1.writeString(p0.mIntimateRelationIcon);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserOperationEntrance$OperationExtParam getParcel(){
       return this.operationExtParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserOperationEntrance$OperationExtParam$$Parcelable.write(this.operationExtParam$$0, p0, p1, new a());
    }
}