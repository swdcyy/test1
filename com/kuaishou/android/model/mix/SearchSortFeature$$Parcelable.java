package com.kuaishou.android.model.mix.SearchSortFeature$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.SearchSortFeature$$Parcelable$a;
import com.kuaishou.android.model.mix.SearchSortFeature;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Float;
import java.util.List;
import java.util.Iterator;

public class SearchSortFeature$$Parcelable implements Parcelable, d	// class@000df5
{
    public SearchSortFeature searchSortFeature$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchSortFeature$$Parcelable.CREATOR = new SearchSortFeature$$Parcelable$a();
    }
    public void SearchSortFeature$$Parcelable(SearchSortFeature p0){
       super();
       this.searchSortFeature$$0 = p0;
    }
    public static SearchSortFeature read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SearchSortFeature searchSortFe = new SearchSortFeature();
          p1.f(p1.g(), searchSortFe);
          searchSortFe.mName = p0.readString();
          int i1 = p0.readInt();
          List list = null;
          if (i1 >= 0) {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                List list1 = (p0.readInt() < 0)? list: Float.valueOf(p0.readFloat());
                uArrayList.add(list1);
             }
             list = uArrayList;
          }
          searchSortFe.mValue = list;
          p1.f(i, searchSortFe);
          return searchSortFe;
       }
    }
    public static void write(SearchSortFeature p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mName);
          SearchSortFeature mValue = p0.mValue;
          if (mValue == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mValue.size());
             Iterator iterator = p0.mValue.iterator();
             while (iterator.hasNext()) {
                Float uFloat = iterator.next();
                if (uFloat == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeFloat(uFloat.floatValue());
                }
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SearchSortFeature getParcel(){
       return this.searchSortFeature$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SearchSortFeature$$Parcelable.write(this.searchSortFeature$$0, p0, p1, new a());
    }
}
