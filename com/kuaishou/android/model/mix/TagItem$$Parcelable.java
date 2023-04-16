package com.kuaishou.android.model.mix.TagItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.TagItem$$Parcelable$a;
import com.kuaishou.android.model.mix.TagItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.io.Serializable;
import com.kuaishou.android.model.mix.LyricItemEntity$MusicCommonTagEntity;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.mix.LyricItemEntity;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.Music$$Parcelable;
import com.kuaishou.android.model.mix.TagItem$InitiatorPhoto;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class TagItem$$Parcelable implements Parcelable, d	// class@000e12
{
    public TagItem tagItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TagItem$$Parcelable.CREATOR = new TagItem$$Parcelable$a();
    }
    public void TagItem$$Parcelable(TagItem p0){
       super();
       this.tagItem$$0 = p0;
    }
    public static TagItem read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TagItem tagItem = new TagItem();
          p1.f(p1.g(), tagItem);
          tagItem.mSearchUssid = p0.readString();
          boolean i1 = p0.readInt();
          List list = null;
          boolean b = false;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list1.add(p0.readSerializable());
             }
          }
          tagItem.mCommonLabel = list1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                list.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          tagItem.mTagIconUrls = list;
          tagItem.mLyricLabel = p0.readSerializable();
          tagItem.mCount = p0.readInt();
          tagItem.mPhotoLlsid = p0.readString();
          tagItem.mId = p0.readString();
          tagItem.mKsOrderId = p0.readString();
          tagItem.mMusic = Music$$Parcelable.read(p0, p1);
          i1 = (p0.readInt() == 1)? true: false;
          tagItem.mRich = i1;
          tagItem.mInitiatorPhoto = p0.readSerializable();
          i1 = (p0.readInt() == 1)? true: false;
          tagItem.mIsKaraoke = i1;
          tagItem.playCount = p0.readLong();
          tagItem.mMagicFace = MagicEmoji$MagicFace$$Parcelable.read(p0, p1);
          tagItem.mDurationPlayTrail = p0.readLong();
          i1 = (p0.readInt() == 1)? true: false;
          tagItem.mIsCollecting = i1;
          i1 = (p0.readInt() == 1)? true: false;
          tagItem.mHideArtist = i1;
          tagItem.mUserName = p0.readString();
          tagItem.mName = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          tagItem.mIsCollected = b;
          tagItem.mTag = p0.readString();
          p1.f(i, tagItem);
          return tagItem;
       }
    }
    public static void write(TagItem p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mSearchUssid);
          TagItem mCommonLabel = p0.mCommonLabel;
          if (mCommonLabel == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCommonLabel.size());
             iterator = p0.mCommonLabel.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          mCommonLabel = p0.mTagIconUrls;
          if (mCommonLabel == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCommonLabel.size());
             iterator = p0.mTagIconUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mLyricLabel);
          p1.writeInt(p0.mCount);
          p1.writeString(p0.mPhotoLlsid);
          p1.writeString(p0.mId);
          p1.writeString(p0.mKsOrderId);
          Music$$Parcelable.write(p0.mMusic, p1, p2, p3);
          p1.writeInt(p0.mRich);
          p1.writeSerializable(p0.mInitiatorPhoto);
          p1.writeInt(p0.mIsKaraoke);
          p1.writeLong(p0.playCount);
          MagicEmoji$MagicFace$$Parcelable.write(p0.mMagicFace, p1, p2, p3);
          p1.writeLong(p0.mDurationPlayTrail);
          p1.writeInt(p0.mIsCollecting);
          p1.writeInt(p0.mHideArtist);
          p1.writeString(p0.mUserName);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mIsCollected);
          p1.writeString(p0.mTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TagItem getParcel(){
       return this.tagItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TagItem$$Parcelable.write(this.tagItem$$0, p0, p1, new a());
    }
}
