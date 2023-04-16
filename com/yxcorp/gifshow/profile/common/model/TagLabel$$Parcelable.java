package com.yxcorp.gifshow.profile.common.model.TagLabel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.common.model.TagLabel$$Parcelable$a;
import com.yxcorp.gifshow.profile.common.model.TagLabel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.common.model.TagLabel$PopUpParam;
import com.yxcorp.gifshow.profile.common.model.TagLabel$DownloadParam;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.common.model.TagLabel$Bubble;
import java.util.List;
import java.util.Iterator;

public class TagLabel$$Parcelable implements Parcelable, d	// class@0012d9
{
    public TagLabel tagLabel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TagLabel$$Parcelable.CREATOR = new TagLabel$$Parcelable$a();
    }
    public void TagLabel$$Parcelable(TagLabel p0){
       super();
       this.tagLabel$$0 = p0;
    }
    public static TagLabel read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TagLabel tagLabel = new TagLabel();
          p1.f(p1.g(), tagLabel);
          tagLabel.mStatisticsInfo = p0.readString();
          tagLabel.mLabelDarkIcon = p0.readString();
          tagLabel.mActionUrl = p0.readString();
          tagLabel.mPopUpParams = p0.readSerializable();
          tagLabel.mLabelIcon = p0.readString();
          tagLabel.mExtraInfo = p0.readString();
          tagLabel.mName = p0.readString();
          tagLabel.mDownloadParams = p0.readSerializable();
          tagLabel.mActionType = p0.readInt();
          tagLabel.mLabelType = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
             list = uArrayList;
          }
          tagLabel.mBubbles = list;
          p1.f(i, tagLabel);
          return tagLabel;
       }
    }
    public static void write(TagLabel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mStatisticsInfo);
          p1.writeString(p0.mLabelDarkIcon);
          p1.writeString(p0.mActionUrl);
          p1.writeSerializable(p0.mPopUpParams);
          p1.writeString(p0.mLabelIcon);
          p1.writeString(p0.mExtraInfo);
          p1.writeString(p0.mName);
          p1.writeSerializable(p0.mDownloadParams);
          p1.writeInt(p0.mActionType);
          p1.writeString(p0.mLabelType);
          TagLabel mBubbles = p0.mBubbles;
          if (mBubbles == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mBubbles.size());
             Iterator iterator = p0.mBubbles.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TagLabel getParcel(){
       return this.tagLabel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TagLabel$$Parcelable.write(this.tagLabel$$0, p0, p1, new a());
    }
}
