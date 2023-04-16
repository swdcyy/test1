package com.yxcorp.gifshow.plugin.impl.search.SearchCollectionModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.plugin.impl.search.SearchCollectionModel$$Parcelable$a;
import com.yxcorp.gifshow.plugin.impl.search.SearchCollectionModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class SearchCollectionModel$$Parcelable implements Parcelable, d	// class@000fd2
{
    public SearchCollectionModel searchCollectionModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchCollectionModel$$Parcelable.CREATOR = new SearchCollectionModel$$Parcelable$a();
    }
    public void SearchCollectionModel$$Parcelable(SearchCollectionModel p0){
       super();
       this.searchCollectionModel$$0 = p0;
    }
    public static SearchCollectionModel read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SearchCollectionModel searchCollec = new SearchCollectionModel();
          p1.f(p1.g(), searchCollec);
          int i1 = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          searchCollec.mIsShow = b;
          int i2 = p0.readInt();
          if (i2 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i2];
             for (; i1 < i2; i1 = i1 + 1) {
                uCDNUrlArray1[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          searchCollec.mConfigCoverUrlList = uCDNUrlArray;
          searchCollec.mEpisodeTitle = p0.readString();
          searchCollec.mOriginLiveStreamId = p0.readString();
          searchCollec.mEpisodeIndex = p0.readInt();
          p1.f(i, searchCollec);
          return searchCollec;
       }
    }
    public static void write(SearchCollectionModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsShow);
          SearchCollectionModel mConfigCover = p0.mConfigCoverUrlList;
          if (mConfigCover == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mConfigCover.length);
             mConfigCover = p0.mConfigCoverUrlList;
             i1 = mConfigCover.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mConfigCover[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mEpisodeTitle);
          p1.writeString(p0.mOriginLiveStreamId);
          p1.writeInt(p0.mEpisodeIndex);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SearchCollectionModel getParcel(){
       return this.searchCollectionModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SearchCollectionModel$$Parcelable.write(this.searchCollectionModel$$0, p0, p1, new a());
    }
}
