package com.kuaishou.krn.model.PluginTrackInfo;
import android.os.Parcelable;
import com.kuaishou.krn.model.PluginTrackInfo$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import java.lang.System;
import android.os.Parcel;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class PluginTrackInfo implements Parcelable	// class@000908
{
    public long b;
    public long c;
    public long d;
    public double e;
    public long f;
    public boolean g;
    public boolean h;
    public static final Parcelable$Creator CREATOR;

    static {
       PluginTrackInfo.CREATOR = new PluginTrackInfo$a();
    }
    public void PluginTrackInfo(){
       super();
       this.g = true;
       this.h = true;
    }
    public final long a(){
       return this.d;
    }
    public final long b(){
       PluginTrackInfo obj = PatchProxy.apply(null, this, PluginTrackInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.d;
       if (obj <= 0) {
          long l = SystemClock.elapsedRealtime();
       }
       return obj;
    }
    public final long c(){
       PluginTrackInfo obj = PatchProxy.apply(null, this, PluginTrackInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.f;
       if (obj <= 0) {
          long l = System.currentTimeMillis();
       }
       return obj;
    }
    public final double d(){
       PluginTrackInfo te = this.e;
       if (te - (double)0 > 0) {
       }else {
          te = 0;
       }
       return te;
    }
    public int describeContents(){
       return 0;
    }
    public final long e(){
       return this.c;
    }
    public final long f(){
       return this.b;
    }
    public final boolean g(){
       return this.h;
    }
    public final boolean h(){
       return this.g;
    }
    public final void i(long p0){
       this.d = p0;
    }
    public final void j(boolean p0){
       this.h = p0;
    }
    public final void k(long p0){
       this.c = p0;
    }
    public final void l(boolean p0){
       this.g = p0;
    }
    public final void m(long p0){
       this.b = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PluginTrackInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PluginTrackInfo.class, "3")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}
