package com.yxcorp.gifshow.plugin.impl.search.SearchMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.plugin.impl.search.SearchMeta$$Parcelable$a;
import com.yxcorp.gifshow.plugin.impl.search.SearchMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.plugin.impl.search.SearchCollectionModel;
import com.yxcorp.gifshow.plugin.impl.search.SearchCollectionModel$$Parcelable;

public class SearchMeta$$Parcelable implements Parcelable, d	// class@000fd5
{
    public SearchMeta searchMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchMeta$$Parcelable.CREATOR = new SearchMeta$$Parcelable$a();
    }
    public void SearchMeta$$Parcelable(SearchMeta p0){
       super();
       this.searchMeta$$0 = p0;
    }
    public static SearchMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SearchMeta searchMeta = new SearchMeta();
          p1.f(p1.g(), searchMeta);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          searchMeta.noOverridePhotoId = b;
          searchMeta.mProviderId = p0.readString();
          searchMeta.mHotTrendingId = p0.readString();
          searchMeta.mCollectionMeta = SearchCollectionModel$$Parcelable.read(p0, p1);
          searchMeta.mCollectionId = p0.readString();
          p1.f(i, searchMeta);
          return searchMeta;
       }
    }
    public static void write(SearchMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.noOverridePhotoId);
          p1.writeString(p0.mProviderId);
          p1.writeString(p0.mHotTrendingId);
          SearchCollectionModel$$Parcelable.write(p0.mCollectionMeta, p1, p2, p3);
          p1.writeString(p0.mCollectionId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SearchMeta getParcel(){
       return this.searchMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SearchMeta$$Parcelable.write(this.searchMeta$$0, p0, p1, new a());
    }
}
