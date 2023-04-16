package com.yxcorp.gifshow.entity.TagDetailItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.TagDetailItem$$Parcelable$a;
import com.yxcorp.gifshow.entity.TagDetailItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.TagDetailItem$Tag;
import com.yxcorp.gifshow.entity.TagDetailItem$Tag$$Parcelable;
import com.yxcorp.gifshow.entity.TagDetailItem$TagStatus;
import com.yxcorp.gifshow.entity.TagDetailItem$TagStatus$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class TagDetailItem$$Parcelable implements Parcelable, d	// class@000d76
{
    public TagDetailItem tagDetailItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TagDetailItem$$Parcelable.CREATOR = new TagDetailItem$$Parcelable$a();
    }
    public void TagDetailItem$$Parcelable(TagDetailItem p0){
       super();
       this.tagDetailItem$$0 = p0;
    }
    public static TagDetailItem read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TagDetailItem tagDetailIte = new TagDetailItem();
          p1.f(p1.g(), tagDetailIte);
          tagDetailIte.mResult = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
             list = uArrayList;
          }
          tagDetailIte.mPermissions = list;
          tagDetailIte.mTag = TagDetailItem$Tag$$Parcelable.read(p0, p1);
          tagDetailIte.mTagStats = TagDetailItem$TagStatus$$Parcelable.read(p0, p1);
          p1.f(i, tagDetailIte);
          return tagDetailIte;
       }
    }
    public static void write(TagDetailItem p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mResult);
          TagDetailItem mPermissions = p0.mPermissions;
          if (mPermissions == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPermissions.size());
             Iterator iterator = p0.mPermissions.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          TagDetailItem$Tag$$Parcelable.write(p0.mTag, p1, p2, p3);
          TagDetailItem$TagStatus$$Parcelable.write(p0.mTagStats, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TagDetailItem getParcel(){
       return this.tagDetailItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TagDetailItem$$Parcelable.write(this.tagDetailItem$$0, p0, p1, new a());
    }
}
