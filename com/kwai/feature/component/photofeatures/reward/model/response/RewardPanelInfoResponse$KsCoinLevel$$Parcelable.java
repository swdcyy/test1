package com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel$$Parcelable$a;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$GiftNumOption;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$GiftNumOption$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class RewardPanelInfoResponse$KsCoinLevel$$Parcelable implements Parcelable, d	// class@00124c
{
    public RewardPanelInfoResponse$KsCoinLevel ksCoinLevel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardPanelInfoResponse$KsCoinLevel$$Parcelable.CREATOR = new RewardPanelInfoResponse$KsCoinLevel$$Parcelable$a();
    }
    public void RewardPanelInfoResponse$KsCoinLevel$$Parcelable(RewardPanelInfoResponse$KsCoinLevel p0){
       super();
       this.ksCoinLevel$$0 = p0;
    }
    public static RewardPanelInfoResponse$KsCoinLevel read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RewardPanelInfoResponse$KsCoinLevel ksCoinLevel = new RewardPanelInfoResponse$KsCoinLevel();
          p1.f(p1.g(), ksCoinLevel);
          ksCoinLevel.mSubsidyCoin = p0.readLong();
          long l = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          ksCoinLevel.mIsCustomLevel = b;
          ksCoinLevel.mPosition = p0.readInt();
          int i1 = p0.readInt();
          List list = null;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                list1.add(RewardPanelInfoResponse$GiftNumOption$$Parcelable.read(p0, p1));
             }
          }
          ksCoinLevel.mGiftNumOptions = list1;
          ksCoinLevel.type = p0.readInt();
          ksCoinLevel.mOverrideDisplayName = p0.readString();
          ksCoinLevel.mCornerText = p0.readString();
          ksCoinLevel.mKsCoin = p0.readLong();
          ksCoinLevel.mPicUrl = p0.readString();
          ksCoinLevel.mGiftName = p0.readString();
          ksCoinLevel.mOriginalKsCoin = p0.readLong();
          ksCoinLevel.mDisplayName = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; l < i1; l = l + 1) {
                list.add(p0.readString());
             }
          }
          ksCoinLevel.mMessage = list;
          ksCoinLevel.mLabel = p0.readString();
          ksCoinLevel.mGiftId = p0.readLong();
          p1.f(i, ksCoinLevel);
          return ksCoinLevel;
       }
    }
    public static void write(RewardPanelInfoResponse$KsCoinLevel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mSubsidyCoin);
          p1.writeInt(p0.mIsCustomLevel);
          p1.writeInt(p0.mPosition);
          RewardPanelInfoResponse$KsCoinLevel mGiftNumOpti = p0.mGiftNumOptions;
          if (mGiftNumOpti == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mGiftNumOpti.size());
             Iterator iterator1 = p0.mGiftNumOptions.iterator();
             while (iterator1.hasNext()) {
                RewardPanelInfoResponse$GiftNumOption$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.type);
          p1.writeString(p0.mOverrideDisplayName);
          p1.writeString(p0.mCornerText);
          p1.writeLong(p0.mKsCoin);
          p1.writeString(p0.mPicUrl);
          p1.writeString(p0.mGiftName);
          p1.writeLong(p0.mOriginalKsCoin);
          p1.writeString(p0.mDisplayName);
          RewardPanelInfoResponse$KsCoinLevel mMessage = p0.mMessage;
          if (mMessage == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mMessage.size());
             Iterator iterator = p0.mMessage.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mLabel);
          p1.writeLong(p0.mGiftId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardPanelInfoResponse$KsCoinLevel getParcel(){
       return this.ksCoinLevel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardPanelInfoResponse$KsCoinLevel$$Parcelable.write(this.ksCoinLevel$$0, p0, p1, new a());
    }
}
