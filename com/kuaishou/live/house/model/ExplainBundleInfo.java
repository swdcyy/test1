package com.kuaishou.live.house.model.ExplainBundleInfo;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.live.house.model.ExplainBundleInfo$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.Parcel;
import java.lang.Integer;

public final class ExplainBundleInfo implements Serializable, Parcelable	// class@001d0b
{
    public String mBundleId;
    public int mMinBundleVersion;
    public static final Parcelable$Creator CREATOR;

    static {
       ExplainBundleInfo.CREATOR = new ExplainBundleInfo$a();
    }
    public void ExplainBundleInfo(){
       super();
       this.mBundleId = "";
    }
    public int describeContents(){
       return 0;
    }
    public final String getMBundleId(){
       return this.mBundleId;
    }
    public final int getMMinBundleVersion(){
       return this.mMinBundleVersion;
    }
    public final void setMBundleId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExplainBundleInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBundleId = p0;
       return;
    }
    public final void setMMinBundleVersion(int p0){
       this.mMinBundleVersion = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ExplainBundleInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ExplainBundleInfo.class, "2")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}
