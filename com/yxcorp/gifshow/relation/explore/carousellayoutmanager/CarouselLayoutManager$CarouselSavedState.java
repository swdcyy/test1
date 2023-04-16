package com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$CarouselSavedState;
import android.os.Parcelable;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$CarouselSavedState$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class CarouselLayoutManager$CarouselSavedState implements Parcelable	// class@0017ef
{
    public final Parcelable b;
    public int c;
    public static final Parcelable$Creator CREATOR;

    static {
       CarouselLayoutManager$CarouselSavedState.CREATOR = new CarouselLayoutManager$CarouselSavedState$a();
    }
    public void CarouselLayoutManager$CarouselSavedState(Parcel p0){
       super();
       this.b = p0.readParcelable(Parcelable.class.getClassLoader());
       this.c = p0.readInt();
    }
    public void CarouselLayoutManager$CarouselSavedState(Parcelable p0){
       super();
       this.b = p0;
    }
    public void CarouselLayoutManager$CarouselSavedState(CarouselLayoutManager$CarouselSavedState p0){
       super();
       this.b = p0.b;
       this.c = p0.c;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(CarouselLayoutManager$CarouselSavedState.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, CarouselLayoutManager$CarouselSavedState.class, "1")) {
          return;
       }
       p0.writeParcelable(this.b, p1);
       p0.writeInt(this.c);
       return;
    }
}
