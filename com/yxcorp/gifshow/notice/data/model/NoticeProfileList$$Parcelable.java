package com.yxcorp.gifshow.notice.data.model.NoticeProfileList$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.notice.data.model.NoticeProfileList$$Parcelable$a;
import com.yxcorp.gifshow.notice.data.model.NoticeProfileList;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserInfo$$Parcelable;
import com.kwai.framework.model.user.QUserContactName;
import com.kwai.framework.model.user.QUserContactName$$Parcelable;

public class NoticeProfileList$$Parcelable implements Parcelable, d	// class@00218a
{
    public NoticeProfileList noticeProfileList$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NoticeProfileList$$Parcelable.CREATOR = new NoticeProfileList$$Parcelable$a();
    }
    public void NoticeProfileList$$Parcelable(NoticeProfileList p0){
       super();
       this.noticeProfileList$$0 = p0;
    }
    public static NoticeProfileList read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NoticeProfileList noticeProfil = new NoticeProfileList();
          p1.f(p1.g(), noticeProfil);
          noticeProfil.mUserInfo = UserInfo$$Parcelable.read(p0, p1);
          noticeProfil.mThirdPlatformName = p0.readString();
          noticeProfil.mContactName = QUserContactName$$Parcelable.read(p0, p1);
          noticeProfil.mCount = p0.readInt();
          noticeProfil.mPeriodDays = p0.readInt();
          noticeProfil.mRelationType = p0.readInt();
          p1.f(i, noticeProfil);
          return noticeProfil;
       }
    }
    public static void write(NoticeProfileList p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          UserInfo$$Parcelable.write(p0.mUserInfo, p1, p2, p3);
          p1.writeString(p0.mThirdPlatformName);
          QUserContactName$$Parcelable.write(p0.mContactName, p1, p2, p3);
          p1.writeInt(p0.mCount);
          p1.writeInt(p0.mPeriodDays);
          p1.writeInt(p0.mRelationType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NoticeProfileList getParcel(){
       return this.noticeProfileList$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NoticeProfileList$$Parcelable.write(this.noticeProfileList$$0, p0, p1, new a());
    }
}
