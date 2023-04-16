package com.airbnb.lottie.ex.LottieAnimationView$SavedState;
import android.view.View$BaseSavedState;
import com.airbnb.lottie.ex.LottieAnimationView$SavedState$a;
import android.os.Parcel;
import java.lang.String;
import android.os.Parcelable;

public class LottieAnimationView$SavedState extends View$BaseSavedState	// class@000d99
{
    public String b;
    public int c;
    public float d;
    public boolean e;
    public String f;
    public int g;
    public int h;
    public static final Parcelable$Creator CREATOR;

    static {
       LottieAnimationView$SavedState.CREATOR = new LottieAnimationView$SavedState$a();
    }
    public void LottieAnimationView$SavedState(Parcel p0){
       super(p0);
       this.b = p0.readString();
       this.d = p0.readFloat();
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.e = b;
       this.f = p0.readString();
       this.g = p0.readInt();
       this.h = p0.readInt();
       return;
    }
    public void LottieAnimationView$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeString(this.b);
       p0.writeFloat(this.d);
       p0.writeInt(this.e);
       p0.writeString(this.f);
       p0.writeInt(this.g);
       p0.writeInt(this.h);
    }
}
