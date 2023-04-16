package com.kwai.framework.model.user.RichTextMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.RichTextMeta$$Parcelable$a;
import com.kwai.framework.model.user.RichTextMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.framework.model.user.RichTextMeta$Param;
import com.kwai.framework.model.user.RichTextMeta$Param$$Parcelable;
import java.util.HashMap;
import xwd.b;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;

public class RichTextMeta$$Parcelable implements Parcelable, d	// class@001722
{
    public RichTextMeta richTextMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RichTextMeta$$Parcelable.CREATOR = new RichTextMeta$$Parcelable$a();
    }
    public void RichTextMeta$$Parcelable(RichTextMeta p0){
       super();
       this.richTextMeta$$0 = p0;
    }
    public static RichTextMeta read(Parcel p0,a p1){
       List list1;
       Map map;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RichTextMeta richTextMeta = new RichTextMeta();
          p1.f(p1.g(), richTextMeta);
          richTextMeta.mUserCount = p0.readInt();
          richTextMeta.mRawText = p0.readString();
          richTextMeta.mInteractRecoTextInfo = RichTextMeta$$Parcelable.read(p0, p1);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                list1.add(RichTextMeta$Param$$Parcelable.read(p0, p1));
             }
          }
          richTextMeta.mParamList = list1;
          i1 = p0.readInt();
          if (i1 < 0) {
             map = list;
          }else {
             map = new HashMap(b.a(i1));
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                map.put(p0.readString(), p0.readString());
             }
          }
          richTextMeta.mEventTrackInfo = map;
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(User$$Parcelable.read(p0, p1));
             }
          }
          richTextMeta.mShowUsers = list;
          richTextMeta.mInteractActionUrl = p0.readString();
          richTextMeta.mTitle = p0.readString();
          richTextMeta.mPageType = p0.readString();
          richTextMeta.mScene = p0.readString();
          p1.f(i, richTextMeta);
          return richTextMeta;
       }
    }
    public static void write(RichTextMeta p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mUserCount);
          p1.writeString(p0.mRawText);
          RichTextMeta$$Parcelable.write(p0.mInteractRecoTextInfo, p1, p2, p3);
          RichTextMeta mParamList = p0.mParamList;
          if (mParamList == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mParamList.size());
             iterator = p0.mParamList.iterator();
             while (iterator.hasNext()) {
                RichTextMeta$Param$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          mParamList = p0.mEventTrackInfo;
          if (mParamList == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mParamList.size());
             iterator = p0.mEventTrackInfo.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          mParamList = p0.mShowUsers;
          if (mParamList == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mParamList.size());
             iterator = p0.mShowUsers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mInteractActionUrl);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mPageType);
          p1.writeString(p0.mScene);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RichTextMeta getParcel(){
       return this.richTextMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RichTextMeta$$Parcelable.write(this.richTextMeta$$0, p0, p1, new a());
    }
}
