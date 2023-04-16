package com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta$$Parcelable$a;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta$RelateSearchWord;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class SearchCardMeta$$Parcelable implements Parcelable, d	// class@001803
{
    public SearchCardMeta searchCardMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchCardMeta$$Parcelable.CREATOR = new SearchCardMeta$$Parcelable$a();
    }
    public void SearchCardMeta$$Parcelable(SearchCardMeta p0){
       super();
       this.searchCardMeta$$0 = p0;
    }
    public static SearchCardMeta read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SearchCardMeta searchCardMe = new SearchCardMeta();
          p1.f(p1.g(), searchCardMe);
          int i1 = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          searchCardMe.mHasShown = b;
          searchCardMe.mRecallPhotoId = p0.readString();
          searchCardMe.mQPhoto = QPhoto$$Parcelable.read(p0, p1);
          searchCardMe.mUssid = p0.readString();
          int i2 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          if (i2 < 0) {
             list = uCDNUrlArray;
          }else {
             list = new ArrayList(i2);
             for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                list.add(p0.readSerializable());
             }
          }
          searchCardMe.mRelateSearchWordList = list;
          i2 = p0.readInt();
          if (i2 >= 0) {
             uCDNUrlArray = new CDNUrl[i2];
             for (; i1 < i2; i1 = i1 + 1) {
                uCDNUrlArray[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          searchCardMe.mIconUrls = uCDNUrlArray;
          searchCardMe.mTitle = p0.readString();
          searchCardMe.mFromPhotoId = p0.readString();
          searchCardMe.mDisplayLimit = p0.readInt();
          p1.f(i, searchCardMe);
          return searchCardMe;
       }
    }
    public static void write(SearchCardMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHasShown);
          p1.writeString(p0.mRecallPhotoId);
          QPhoto$$Parcelable.write(p0.mQPhoto, p1, p2, p3);
          p1.writeString(p0.mUssid);
          SearchCardMeta mRelateSearc = p0.mRelateSearchWordList;
          if (mRelateSearc == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRelateSearc.size());
             Iterator iterator = p0.mRelateSearchWordList.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          mRelateSearc = p0.mIconUrls;
          if (mRelateSearc == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRelateSearc.length);
             mRelateSearc = p0.mIconUrls;
             i1 = mRelateSearc.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mRelateSearc[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mFromPhotoId);
          p1.writeInt(p0.mDisplayLimit);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SearchCardMeta getParcel(){
       return this.searchCardMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SearchCardMeta$$Parcelable.write(this.searchCardMeta$$0, p0, p1, new a());
    }
}
