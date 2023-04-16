package com.yxcorp.gifshow.growth.push.model.PushCofigRdItem;
import android.os.Parcelable;
import com.yxcorp.gifshow.growth.push.model.PushCofigRdItem$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class PushCofigRdItem implements Parcelable	// class@00149f
{
    public int b;
    public long c;
    public static final Parcelable$Creator CREATOR;

    static {
       PushCofigRdItem.CREATOR = new PushCofigRdItem$a();
    }
    public void PushCofigRdItem(){
       super();
       this.b = -1;
       this.c = 0;
    }
    public void PushCofigRdItem(int p0,long p1){
       super();
       this.b = -1;
       this.c = 0;
       this.b = p0;
       this.c = p1;
    }
    public void PushCofigRdItem(Parcel p0){
       super();
       this.b = -1;
       this.c = 0;
       this.b = p0.readInt();
       this.c = p0.readLong();
    }
    public int a(){
       return this.b;
    }
    public long b(){
       return this.c;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PushCofigRdItem.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PushCofigRdItem.class, "1")) {
          return;
       }
       p0.writeInt(this.b);
       p0.writeLong(this.c);
       return;
    }
}
