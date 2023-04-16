package com.yxcorp.gifshow.bottom.sheet.BottomSheetParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams$$Parcelable$a;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class BottomSheetParams$$Parcelable implements Parcelable, d	// class@001c60
{
    public BottomSheetParams bottomSheetParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BottomSheetParams$$Parcelable.CREATOR = new BottomSheetParams$$Parcelable$a();
    }
    public void BottomSheetParams$$Parcelable(BottomSheetParams p0){
       super();
       this.bottomSheetParams$$0 = p0;
    }
    public static BottomSheetParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          boolean i1 = p1.g();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          BottomSheetParams uBottomSheet = new BottomSheetParams(b1);
          p1.f(i1, uBottomSheet);
          uBottomSheet.mBottomMargin = p0.readInt();
          uBottomSheet.mExpandAnimDuration = p0.readInt();
          i1 = (p0.readInt() == 1)? true: false;
          uBottomSheet.mNeedPageLogger = i1;
          i1 = (p0.readInt() == 1)? true: false;
          uBottomSheet.mOutsideCancelable = i1;
          uBottomSheet.mContentHeight = p0.readInt();
          uBottomSheet.mBackgroundColor = p0.readInt();
          uBottomSheet.mBackgroundDimAmount = p0.readFloat();
          i1 = (p0.readInt() == 1)? true: false;
          uBottomSheet.mDragDisable = i1;
          uBottomSheet.mContainerLayout = p0.readInt();
          uBottomSheet.mSurviveTimeMs = p0.readLong();
          i1 = (p0.readInt() == 1)? true: false;
          uBottomSheet.mIsSoftInputEnabled = i1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uBottomSheet.mBackPressCancelable = b;
          p1.f(i, uBottomSheet);
          return uBottomSheet;
       }
    }
    public static void write(BottomSheetParams p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsStateless);
          p1.writeInt(p0.mBottomMargin);
          p1.writeInt(p0.mExpandAnimDuration);
          p1.writeInt(p0.mNeedPageLogger);
          p1.writeInt(p0.mOutsideCancelable);
          p1.writeInt(p0.mContentHeight);
          p1.writeInt(p0.mBackgroundColor);
          p1.writeFloat(p0.mBackgroundDimAmount);
          p1.writeInt(p0.mDragDisable);
          p1.writeInt(p0.mContainerLayout);
          p1.writeLong(p0.mSurviveTimeMs);
          p1.writeInt(p0.mIsSoftInputEnabled);
          p1.writeInt(p0.mBackPressCancelable);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BottomSheetParams getParcel(){
       return this.bottomSheetParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BottomSheetParams$$Parcelable.write(this.bottomSheetParams$$0, p0, p1, new a());
    }
}
