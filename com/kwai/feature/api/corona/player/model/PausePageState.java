package com.kwai.feature.api.corona.player.model.PausePageState;
import android.os.Parcelable;
import com.kwai.feature.api.corona.player.model.PausePageState$a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.Bitmap;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;
import java.io.Serializable;

public final class PausePageState implements Parcelable	// class@000e27
{
    public boolean b;
    public QPhoto c;
    public Bitmap d;
    public static final Parcelable$Creator CREATOR;

    static {
       PausePageState.CREATOR = new PausePageState$a();
    }
    public void PausePageState(){
       super(false, null, null, 7, null);
    }
    public void PausePageState(boolean p0,QPhoto p1,Bitmap p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void PausePageState(boolean p0,QPhoto p1,Bitmap p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = false;
       }
       super(p0, null, null);
       return;
    }
    public final QPhoto a(){
       return this.c;
    }
    public final boolean b(){
       return this.b;
    }
    public final void c(Bitmap p0){
       this.d = p0;
    }
    public final void d(QPhoto p0){
       this.c = p0;
    }
    public int describeContents(){
       return 0;
    }
    public final void e(boolean p0){
       this.b = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PausePageState.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PausePageState && (this.b == p0.b && (a.g(this.c, p0.c) && a.g(this.d, p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       PausePageState obj = PatchProxy.apply(null, this, PausePageState.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       PausePageState tc = this.c;
       int i1 = 0;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.d;
       if (tc != null) {
          i1 = tc.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PausePageState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PausePageState\(isPausePageShowing="+this.b+", nextPhoto="+this.c+", mPlayerCover="+this.d+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PausePageState.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PausePageState.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.b);
       p0.writeSerializable(this.c);
       PausePageState td = this.d;
       if (td != null) {
          p0.writeInt(1);
          td.writeToParcel(p0, 0);
       }else {
          p0.writeInt(0);
       }
       return;
    }
}
