package com.kuaishou.android.model.mix.ColumnMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ColumnMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.ColumnMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ColumnMeta$$Parcelable implements Parcelable, d	// class@000bf6
{
    public ColumnMeta columnMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ColumnMeta$$Parcelable.CREATOR = new ColumnMeta$$Parcelable$a();
    }
    public void ColumnMeta$$Parcelable(ColumnMeta p0){
       super();
       this.columnMeta$$0 = p0;
    }
    public static ColumnMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ColumnMeta uColumnMeta = new ColumnMeta();
          p1.f(p1.g(), uColumnMeta);
          uColumnMeta.mCoverMainTitle = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uColumnMeta.mShowCoverOrder = b;
          uColumnMeta.mInnerMainTitle = p0.readString();
          uColumnMeta.mDetailTitle = p0.readString();
          uColumnMeta.mCoverSubTitle = p0.readString();
          uColumnMeta.mCoverIconUrl = p0.readString();
          uColumnMeta.mCoverDesc = p0.readString();
          uColumnMeta.mInnerSubTitle = p0.readString();
          uColumnMeta.mCoverOrder = p0.readInt();
          p1.f(i, uColumnMeta);
          return uColumnMeta;
       }
    }
    public static void write(ColumnMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCoverMainTitle);
          p1.writeInt(p0.mShowCoverOrder);
          p1.writeString(p0.mInnerMainTitle);
          p1.writeString(p0.mDetailTitle);
          p1.writeString(p0.mCoverSubTitle);
          p1.writeString(p0.mCoverIconUrl);
          p1.writeString(p0.mCoverDesc);
          p1.writeString(p0.mInnerSubTitle);
          p1.writeInt(p0.mCoverOrder);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ColumnMeta getParcel(){
       return this.columnMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ColumnMeta$$Parcelable.write(this.columnMeta$$0, p0, p1, new a());
    }
}
