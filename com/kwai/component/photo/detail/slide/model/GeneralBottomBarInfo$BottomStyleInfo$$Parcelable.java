package com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo$BottomStyleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo$BottomStyleInfo$$Parcelable$a;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo$BottomStyleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarWeakInfo;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarWeakInfo$$Parcelable;
import java.util.ArrayList;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarTrigger;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarTrigger$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class GeneralBottomBarInfo$BottomStyleInfo$$Parcelable implements Parcelable, d	// class@000a65
{
    public GeneralBottomBarInfo$BottomStyleInfo bottomStyleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GeneralBottomBarInfo$BottomStyleInfo$$Parcelable.CREATOR = new GeneralBottomBarInfo$BottomStyleInfo$$Parcelable$a();
    }
    public void GeneralBottomBarInfo$BottomStyleInfo$$Parcelable(GeneralBottomBarInfo$BottomStyleInfo p0){
       super();
       this.bottomStyleInfo$$0 = p0;
    }
    public static GeneralBottomBarInfo$BottomStyleInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          GeneralBottomBarInfo$BottomStyleInfo uBottomStyle = new GeneralBottomBarInfo$BottomStyleInfo();
          p1.f(p1.g(), uBottomStyle);
          uBottomStyle.mBottomWeakStyle = GeneralBottomBarWeakInfo$$Parcelable.read(p0, p1);
          boolean i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(GeneralBottomBarTrigger$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uBottomStyle.mTriggers = list;
          i1 = (p0.readInt() == 1)? true: false;
          uBottomStyle.mDelayShowWeakStyle = i1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uBottomStyle.mStrongStyleCloseHideWeakStyle = b;
          p1.f(i, uBottomStyle);
          return uBottomStyle;
       }
    }
    public static void write(GeneralBottomBarInfo$BottomStyleInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          GeneralBottomBarWeakInfo$$Parcelable.write(p0.mBottomWeakStyle, p1, p2, p3);
          GeneralBottomBarInfo$BottomStyleInfo mTriggers = p0.mTriggers;
          if (mTriggers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTriggers.size());
             Iterator iterator = p0.mTriggers.iterator();
             while (iterator.hasNext()) {
                GeneralBottomBarTrigger$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mDelayShowWeakStyle);
          p1.writeInt(p0.mStrongStyleCloseHideWeakStyle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GeneralBottomBarInfo$BottomStyleInfo getParcel(){
       return this.bottomStyleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GeneralBottomBarInfo$BottomStyleInfo$$Parcelable.write(this.bottomStyleInfo$$0, p0, p1, new a());
    }
}
