package com.kwai.video_clip.model.Size;
import android.os.Parcelable;
import com.kwai.video_clip.model.Size$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Integer;

public class Size implements Parcelable	// class@001102
{
    public int b;
    public int c;
    public static final Parcelable$Creator CREATOR;

    static {
       Size.CREATOR = new Size$a();
    }
    public void Size(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = p0.readInt();
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof Size) {
          return b;
       }
       if (p0.b == this.b && p0.c == this.c) {
          b = true;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Size.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Size{width="+this.b+", height="+this.c+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(Size.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, Size.class, "1")) {
          return;
       }
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       return;
    }
}
