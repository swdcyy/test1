package com.kuaishou.merchant.home2.dynamic.container.model.HalfRnContainerParams;
import com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams;
import com.kuaishou.merchant.home2.dynamic.container.model.HalfRnContainerParams$a;
import android.os.Parcel;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public class HalfRnContainerParams extends HalfContainerParams	// class@001743
{
    public float k;
    public static final Parcelable$Creator CREATOR;

    static {
       HalfRnContainerParams.CREATOR = new HalfRnContainerParams$a();
    }
    public void HalfRnContainerParams(){
       super();
    }
    public void HalfRnContainerParams(Parcel p0){
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
       this.k = p0.readFloat();
       return;
    }
    public float a(Context p0){
       HalfRnContainerParams obj = PatchProxy.applyOneRefs(p0, this, HalfRnContainerParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = super.a(p0);
       obj = this.k;
       if (obj > 0 && obj - this.c > 0) {
          f = f * obj;
       }
       return f;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(HalfRnContainerParams.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HalfRnContainerParams.class, "2")) {
          return;
       }
       super.writeToParcel(p0, p1);
       p0.writeFloat(this.k);
       return;
    }
}
