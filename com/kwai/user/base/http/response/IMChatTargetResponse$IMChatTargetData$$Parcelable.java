package com.kwai.user.base.http.response.IMChatTargetResponse$IMChatTargetData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.user.base.http.response.IMChatTargetResponse$IMChatTargetData$$Parcelable$a;
import com.kwai.user.base.http.response.IMChatTargetResponse$IMChatTargetData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.user.base.chat.target.bean.UserSimpleInfo;
import com.kwai.user.base.chat.target.bean.UserSimpleInfo$$Parcelable;
import java.lang.Class;
import org.parceler.a;
import org.parceler.a$c;
import java.util.List;
import java.util.Iterator;

public class IMChatTargetResponse$IMChatTargetData$$Parcelable implements Parcelable, d	// class@00198a
{
    public IMChatTargetResponse$IMChatTargetData iMChatTargetData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       IMChatTargetResponse$IMChatTargetData$$Parcelable.CREATOR = new IMChatTargetResponse$IMChatTargetData$$Parcelable$a();
    }
    public void IMChatTargetResponse$IMChatTargetData$$Parcelable(IMChatTargetResponse$IMChatTargetData p0){
       super();
       this.iMChatTargetData$$0 = p0;
    }
    public static IMChatTargetResponse$IMChatTargetData read(Parcel p0,a p1){
       ArrayList uArrayList;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          IMChatTargetResponse$IMChatTargetData iMChatTarget = new IMChatTargetResponse$IMChatTargetData();
          p1.f(p1.g(), iMChatTarget);
          int i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList = null;
          }else {
             ArrayList uArrayList1 = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList1.add(UserSimpleInfo$$Parcelable.read(p0, p1));
             }
             uArrayList = uArrayList1;
          }
          a.d(IMChatTargetResponse$IMChatTargetData.class, iMChatTarget, "mUsers", uArrayList);
          p1.f(i, iMChatTarget);
          return iMChatTarget;
       }
    }
    public static void write(IMChatTargetResponse$IMChatTargetData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          if (a.c(new a$c(), IMChatTargetResponse$IMChatTargetData.class, p0, "mUsers") == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(a.c(new a$c(), IMChatTargetResponse$IMChatTargetData.class, p0, "mUsers").size());
             Iterator iterator = a.c(new a$c(), IMChatTargetResponse$IMChatTargetData.class, p0, "mUsers").iterator();
             while (iterator.hasNext()) {
                UserSimpleInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public IMChatTargetResponse$IMChatTargetData getParcel(){
       return this.iMChatTargetData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       IMChatTargetResponse$IMChatTargetData$$Parcelable.write(this.iMChatTargetData$$0, p0, p1, new a());
    }
}
