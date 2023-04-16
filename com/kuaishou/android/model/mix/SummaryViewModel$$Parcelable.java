package com.kuaishou.android.model.mix.SummaryViewModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.SummaryViewModel$$Parcelable$a;
import com.kuaishou.android.model.mix.SummaryViewModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class SummaryViewModel$$Parcelable implements Parcelable, d	// class@000e04
{
    public SummaryViewModel summaryViewModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SummaryViewModel$$Parcelable.CREATOR = new SummaryViewModel$$Parcelable$a();
    }
    public void SummaryViewModel$$Parcelable(SummaryViewModel p0){
       super();
       this.summaryViewModel$$0 = p0;
    }
    public static SummaryViewModel read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SummaryViewModel summaryViewM = new SummaryViewModel();
          p1.f(p1.g(), summaryViewM);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          summaryViewM.mIcon = uCDNUrlArray;
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(User$$Parcelable.read(p0, p1));
             }
          }
          summaryViewM.mUsers = list;
          summaryViewM.mKsOrderId = p0.readString();
          summaryViewM.mTextColor = p0.readString();
          summaryViewM.mText = p0.readString();
          summaryViewM.mType = p0.readInt();
          p1.f(i, summaryViewM);
          return summaryViewM;
       }
    }
    public static void write(SummaryViewModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          SummaryViewModel mIcon = p0.mIcon;
          if (mIcon == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIcon.length);
             mIcon = p0.mIcon;
             int len = mIcon.length;
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mIcon[i2], p1, p2, p3);
             }
          }
          mIcon = p0.mUsers;
          if (mIcon == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIcon.size());
             Iterator iterator = p0.mUsers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mKsOrderId);
          p1.writeString(p0.mTextColor);
          p1.writeString(p0.mText);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SummaryViewModel getParcel(){
       return this.summaryViewModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SummaryViewModel$$Parcelable.write(this.summaryViewModel$$0, p0, p1, new a());
    }
}
