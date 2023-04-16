package com.yxcorp.gifshow.profile.model.CommonRoleLabel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.CommonRoleLabel$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.CommonRoleLabel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.common.model.TagLabel;
import com.yxcorp.gifshow.profile.common.model.TagLabel$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class CommonRoleLabel$$Parcelable implements Parcelable, d	// class@001386
{
    public CommonRoleLabel commonRoleLabel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommonRoleLabel$$Parcelable.CREATOR = new CommonRoleLabel$$Parcelable$a();
    }
    public void CommonRoleLabel$$Parcelable(CommonRoleLabel p0){
       super();
       this.commonRoleLabel$$0 = p0;
    }
    public static CommonRoleLabel read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CommonRoleLabel uCommonRoleL = new CommonRoleLabel();
          p1.f(p1.g(), uCommonRoleL);
          uCommonRoleL.mLabelGroup = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(TagLabel$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uCommonRoleL.mRoleLabelList = list;
          p1.f(i, uCommonRoleL);
          return uCommonRoleL;
       }
    }
    public static void write(CommonRoleLabel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mLabelGroup);
          CommonRoleLabel mRoleLabelLi = p0.mRoleLabelList;
          if (mRoleLabelLi == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mRoleLabelLi.size());
             Iterator iterator = p0.mRoleLabelList.iterator();
             while (iterator.hasNext()) {
                TagLabel$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommonRoleLabel getParcel(){
       return this.commonRoleLabel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommonRoleLabel$$Parcelable.write(this.commonRoleLabel$$0, p0, p1, new a());
    }
}
