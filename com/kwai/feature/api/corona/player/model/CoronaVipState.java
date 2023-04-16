package com.kwai.feature.api.corona.player.model.CoronaVipState;
import android.os.Parcelable;
import com.kwai.feature.api.corona.player.model.CoronaVipState$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class CoronaVipState implements Parcelable	// class@000e1f
{
    public boolean b;
    public boolean c;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaVipState.CREATOR = new CoronaVipState$a();
    }
    public void CoronaVipState(){
       super(false, false, 3, null);
    }
    public void CoronaVipState(boolean p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void CoronaVipState(boolean p0,boolean p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = false;
       }
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final boolean a(){
       return this.b;
    }
    public final boolean b(){
       return this.c;
    }
    public final void c(boolean p0){
       this.b = p0;
    }
    public final void d(boolean p0){
       this.c = p0;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof CoronaVipState && (this.b == p0.b && this.c == p0.c))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CoronaVipState tb = this.b;
       int i = 1;
       if (tb != null) {
          tb = 1;
       }
       int i1 = tb * 31;
       CoronaVipState tc = this.c;
       if (tc == null) {
          i = tc;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CoronaVipState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CoronaVipState\(isVipPanelShowing="+this.b+", isVipPayDialogShowing="+this.c+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(CoronaVipState.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, CoronaVipState.class, "3")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       return;
    }
}
