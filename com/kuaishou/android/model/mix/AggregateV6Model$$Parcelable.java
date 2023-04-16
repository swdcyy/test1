package com.kuaishou.android.model.mix.AggregateV6Model$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.AggregateV6Model$$Parcelable$a;
import com.kuaishou.android.model.mix.AggregateV6Model;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$IconUrl;
import com.kuaishou.android.model.mix.AggregateV6Model$TagContent;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo;

public class AggregateV6Model$$Parcelable implements Parcelable, d	// class@000bb4
{
    public AggregateV6Model aggregateV6Model$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       AggregateV6Model$$Parcelable.CREATOR = new AggregateV6Model$$Parcelable$a();
    }
    public void AggregateV6Model$$Parcelable(AggregateV6Model p0){
       super();
       this.aggregateV6Model$$0 = p0;
    }
    public static AggregateV6Model read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          AggregateV6Model uAggregateV6 = new AggregateV6Model();
          p1.f(p1.g(), uAggregateV6);
          uAggregateV6.mUser = User$$Parcelable.read(p0, p1);
          uAggregateV6.mTitleBgColor = p0.readString();
          uAggregateV6.mAvatarRightTag = p0.readSerializable();
          uAggregateV6.mLeftTopTag = p0.readSerializable();
          uAggregateV6.mRightBottomInfo = p0.readSerializable();
          uAggregateV6.mTitle = p0.readString();
          uAggregateV6.mNickName = p0.readString();
          p1.f(i, uAggregateV6);
          return uAggregateV6;
       }
    }
    public static void write(AggregateV6Model p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          User$$Parcelable.write(p0.mUser, p1, p2, p3);
          p1.writeString(p0.mTitleBgColor);
          p1.writeSerializable(p0.mAvatarRightTag);
          p1.writeSerializable(p0.mLeftTopTag);
          p1.writeSerializable(p0.mRightBottomInfo);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mNickName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public AggregateV6Model getParcel(){
       return this.aggregateV6Model$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       AggregateV6Model$$Parcelable.write(this.aggregateV6Model$$0, p0, p1, new a());
    }
}
