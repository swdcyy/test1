package com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo$$Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PhotoCommonTagsStyleInfo$$Parcelable implements Parcelable, d	// class@000d44
{
    public PhotoCommonTagsStyleInfo photoCommonTagsStyleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoCommonTagsStyleInfo$$Parcelable.CREATOR = new PhotoCommonTagsStyleInfo$$Parcelable$a();
    }
    public void PhotoCommonTagsStyleInfo$$Parcelable(PhotoCommonTagsStyleInfo p0){
       super();
       this.photoCommonTagsStyleInfo$$0 = p0;
    }
    public static PhotoCommonTagsStyleInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoCommonTagsStyleInfo photoCommonT = new PhotoCommonTagsStyleInfo();
          p1.f(p1.g(), photoCommonT);
          photoCommonT.mFrontWord = PhotoCommonTagInfo$$Parcelable.read(p0, p1);
          photoCommonT.mExtJson = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoCommonTagInfo$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          photoCommonT.mMatchWords = list;
          photoCommonT.mTailWord = PhotoCommonTagInfo$$Parcelable.read(p0, p1);
          p1.f(i, photoCommonT);
          return photoCommonT;
       }
    }
    public static void write(PhotoCommonTagsStyleInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoCommonTagInfo$$Parcelable.write(p0.mFrontWord, p1, p2, p3);
          p1.writeString(p0.mExtJson);
          PhotoCommonTagsStyleInfo mMatchWords = p0.mMatchWords;
          if (mMatchWords == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMatchWords.size());
             Iterator iterator = p0.mMatchWords.iterator();
             while (iterator.hasNext()) {
                PhotoCommonTagInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          PhotoCommonTagInfo$$Parcelable.write(p0.mTailWord, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoCommonTagsStyleInfo getParcel(){
       return this.photoCommonTagsStyleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoCommonTagsStyleInfo$$Parcelable.write(this.photoCommonTagsStyleInfo$$0, p0, p1, new a());
    }
}
