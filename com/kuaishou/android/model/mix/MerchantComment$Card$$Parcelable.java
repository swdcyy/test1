package com.kuaishou.android.model.mix.MerchantComment$Card$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.MerchantComment$Card$$Parcelable$a;
import com.kuaishou.android.model.mix.MerchantComment$Card;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class MerchantComment$Card$$Parcelable implements Parcelable, d	// class@000d1d
{
    public MerchantComment$Card card$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MerchantComment$Card$$Parcelable.CREATOR = new MerchantComment$Card$$Parcelable$a();
    }
    public void MerchantComment$Card$$Parcelable(MerchantComment$Card p0){
       super();
       this.card$$0 = p0;
    }
    public static MerchantComment$Card read(Parcel p0,a p1){
       List list1;
       ArrayList uArrayList;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MerchantComment$Card uCard = new MerchantComment$Card();
          p1.f(p1.g(), uCard);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          uCard.mTags = list1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          uCard.mAvatarUrl = list1;
          uCard.mContent = p0.readString();
          uCard.mActionUrl = p0.readString();
          uCard.mId = p0.readString();
          uCard.mTitle = p0.readString();
          uCard.mNickName = p0.readString();
          uCard.mActionLabel = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(p0.readString());
             }
          }
          uCard.mLcTags = list;
          uCard.mType = p0.readInt();
          p1.f(i, uCard);
          return uCard;
       }
    }
    public static void write(MerchantComment$Card p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          MerchantComment$Card mTags = p0.mTags;
          if (mTags == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mTags.size());
             iterator1 = p0.mTags.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          mTags = p0.mAvatarUrl;
          if (mTags == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mTags.size());
             iterator1 = p0.mAvatarUrl.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mContent);
          p1.writeString(p0.mActionUrl);
          p1.writeString(p0.mId);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mNickName);
          p1.writeString(p0.mActionLabel);
          MerchantComment$Card mLcTags = p0.mLcTags;
          if (mLcTags == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mLcTags.size());
             Iterator iterator = p0.mLcTags.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MerchantComment$Card getParcel(){
       return this.card$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MerchantComment$Card$$Parcelable.write(this.card$$0, p0, p1, new a());
    }
}
