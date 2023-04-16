package com.yxcorp.gifshow.entity.TagDetailItem$Tag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.TagDetailItem$Tag$$Parcelable$a;
import com.yxcorp.gifshow.entity.TagDetailItem$Tag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace$$Parcelable;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.Music$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class TagDetailItem$Tag$$Parcelable implements Parcelable, d	// class@000d7b
{
    public TagDetailItem$Tag tag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TagDetailItem$Tag$$Parcelable.CREATOR = new TagDetailItem$Tag$$Parcelable$a();
    }
    public void TagDetailItem$Tag$$Parcelable(TagDetailItem$Tag p0){
       super();
       this.tag$$0 = p0;
    }
    public static TagDetailItem$Tag read(Parcel p0,a p1){
       Boolean uBoolean;
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TagDetailItem$Tag tag = new TagDetailItem$Tag();
          p1.f(p1.g(), tag);
          int i1 = 0;
          List list = null;
          if (p0.readInt() < 0) {
             uBoolean = list;
          }else {
             boolean b = true;
             if (p0.readInt() != b) {
                b = false;
             }
             uBoolean = Boolean.valueOf(b);
          }
          tag.mIsKaraoke = uBoolean;
          tag.mMagicFace = MagicEmoji$MagicFace$$Parcelable.read(p0, p1);
          int i2 = p0.readInt();
          if (i2 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i2);
             for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                list1.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          tag.mCoverUrls = list1;
          i2 = p0.readInt();
          if (i2 >= 0) {
             list = new ArrayList(i2);
             for (; i1 < i2; i1 = i1 + 1) {
                list.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          tag.mBannerUrls = list;
          tag.mTagName = p0.readString();
          tag.mMusicStartTime = p0.readInt();
          tag.mMusic = Music$$Parcelable.read(p0, p1);
          tag.mDescription = p0.readString();
          tag.mAppActionUrl = p0.readString();
          p1.f(i, tag);
          return tag;
       }
    }
    public static void write(TagDetailItem$Tag p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          if (p0.mIsKaraoke == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.mIsKaraoke.booleanValue());
          }
          MagicEmoji$MagicFace$$Parcelable.write(p0.mMagicFace, p1, p2, p3);
          TagDetailItem$Tag mCoverUrls = p0.mCoverUrls;
          if (mCoverUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCoverUrls.size());
             iterator = p0.mCoverUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          mCoverUrls = p0.mBannerUrls;
          if (mCoverUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCoverUrls.size());
             iterator = p0.mBannerUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mTagName);
          p1.writeInt(p0.mMusicStartTime);
          Music$$Parcelable.write(p0.mMusic, p1, p2, p3);
          p1.writeString(p0.mDescription);
          p1.writeString(p0.mAppActionUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TagDetailItem$Tag getParcel(){
       return this.tag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TagDetailItem$Tag$$Parcelable.write(this.tag$$0, p0, p1, new a());
    }
}
