package com.kwai.tokenshare.model.TokenDialogModel$ShareTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.tokenshare.model.TokenDialogModel$ShareTag$$Parcelable$a;
import com.kwai.tokenshare.model.TokenDialogModel$ShareTag;
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

public class TokenDialogModel$ShareTag$$Parcelable implements Parcelable, d	// class@001931
{
    public TokenDialogModel$ShareTag shareTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TokenDialogModel$ShareTag$$Parcelable.CREATOR = new TokenDialogModel$ShareTag$$Parcelable$a();
    }
    public void TokenDialogModel$ShareTag$$Parcelable(TokenDialogModel$ShareTag p0){
       super();
       this.shareTag$$0 = p0;
    }
    public static TokenDialogModel$ShareTag read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TokenDialogModel$ShareTag shareTag = new TokenDialogModel$ShareTag();
          p1.f(p1.g(), shareTag);
          int i1 = p0.readInt();
          List list = null;
          boolean b = false;
          if (i1 >= 0) {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                int i3 = p0.readInt();
                if (i3 < 0) {
                   list1 = list;
                }else {
                   list1 = new CDNUrl[i3];
                   for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
                      list1[i4] = CDNUrl$$Parcelable.read(p0, p1);
                   }
                }
                uArrayList.add(list1);
             }
             list = uArrayList;
          }
          shareTag.mPhotoCovers = list;
          shareTag.mTagType = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          shareTag.mIsRich = b;
          shareTag.mId = p0.readString();
          shareTag.mTagName = p0.readString();
          shareTag.mPhotoCount = p0.readInt();
          shareTag.mType = p0.readString();
          p1.f(i, shareTag);
          return shareTag;
       }
    }
    public static void write(TokenDialogModel$ShareTag p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          TokenDialogModel$ShareTag mPhotoCovers = p0.mPhotoCovers;
          if (mPhotoCovers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mPhotoCovers.size());
             Iterator iterator = p0.mPhotoCovers.iterator();
             while (iterator.hasNext()) {
                CDNUrl[] uCDNUrlArray = iterator.next();
                if (uCDNUrlArray == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(uCDNUrlArray.length);
                   int len = uCDNUrlArray.length;
                   for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                      CDNUrl$$Parcelable.write(uCDNUrlArray[i1], p1, p2, p3);
                   }
                }
             }
          }
          p1.writeInt(p0.mTagType);
          p1.writeInt(p0.mIsRich);
          p1.writeString(p0.mId);
          p1.writeString(p0.mTagName);
          p1.writeInt(p0.mPhotoCount);
          p1.writeString(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TokenDialogModel$ShareTag getParcel(){
       return this.shareTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TokenDialogModel$ShareTag$$Parcelable.write(this.shareTag$$0, p0, p1, new a());
    }
}
