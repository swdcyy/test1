package com.kwai.component.photo.reduce.model.ReduceMode;
import android.os.Parcelable;
import com.kwai.component.photo.reduce.model.ReduceMode$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class ReduceMode implements Parcelable	// class@000af9
{
    public boolean mCanShowLongTip;
    public boolean mIsActualMode;
    public static final Parcelable$Creator CREATOR;

    static {
       ReduceMode.CREATOR = new ReduceMode$a();
    }
    public void ReduceMode(){
       super();
       this.mCanShowLongTip = true;
    }
    public void ReduceMode(Parcel p0){
       super();
       boolean b = true;
       this.mCanShowLongTip = b;
       boolean b1 = (p0.readByte())? true: false;
       this.mCanShowLongTip = b1;
       if (!p0.readByte()) {
          b = false;
       }
       this.mIsActualMode = b;
       return;
    }
    public void ReduceMode(boolean p0,boolean p1){
       super();
       this.mCanShowLongTip = true;
       this.mCanShowLongTip = p0;
       this.mIsActualMode = p1;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ReduceMode.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ReduceMode.class, "1")) {
          return;
       }
       p0.writeByte(this.mCanShowLongTip);
       p0.writeByte(this.mIsActualMode);
       return;
    }
}
