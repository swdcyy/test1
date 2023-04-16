package com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$CarouselSavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$CarouselSavedState;

public class CarouselLayoutManager$CarouselSavedState$a implements Parcelable$Creator	// class@0017ee
{

    public void CarouselLayoutManager$CarouselSavedState$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       CarouselLayoutManager$CarouselSavedState uCarouselSav = PatchProxy.applyOneRefs(p0, this, CarouselLayoutManager$CarouselSavedState$a.class, "1");
       if (uCarouselSav != PatchProxyResult.class) {
       }else {
          uCarouselSav = new CarouselLayoutManager$CarouselSavedState(p0);
       }
       return uCarouselSav;
    }
    public Object[] newArray(int p0){
       CarouselLayoutManager$CarouselSavedState[] uCarouselSav = new CarouselLayoutManager$CarouselSavedState[p0];
       return uCarouselSav;
    }
}
