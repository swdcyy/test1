package com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams;
import android.os.Parcelable;
import com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams$a;
import java.lang.Object;
import android.os.Parcel;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import java.lang.Integer;

public class HalfContainerParams implements Parcelable	// class@001632
{
    public boolean b;
    public float c;
    public float d;
    public float e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public static final Parcelable$Creator CREATOR;

    static {
       HalfContainerParams.CREATOR = new HalfContainerParams$a();
    }
    public void HalfContainerParams(){
       super();
    }
    public void HalfContainerParams(Parcel p0){
       super();
       boolean b = true;
       boolean b1 = (p0.readByte())? true: false;
       this.b = b1;
       this.c = p0.readFloat();
       this.d = p0.readFloat();
       this.e = p0.readFloat();
       this.f = p0.readInt();
       b1 = (p0.readByte())? true: false;
       this.g = b1;
       if (!p0.readByte()) {
          b = false;
       }
       this.h = b;
       return;
    }
    public float a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfContainerParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)n.w(p0);
    }
    public float b(Context p0){
       HalfContainerParams obj = PatchProxy.applyOneRefs(p0, this, HalfContainerParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.d;
       if (obj <= 0) {
          float f = this.a(p0);
       }
       return obj;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(HalfContainerParams.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HalfContainerParams.class, "3")) {
          return;
       }
       p0.writeByte(this.b);
       p0.writeFloat(this.c);
       p0.writeFloat(this.d);
       p0.writeFloat(this.e);
       p0.writeInt(this.f);
       p0.writeByte(this.g);
       p0.writeByte(this.h);
       return;
    }
}
