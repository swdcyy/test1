package com.yxcorp.gifshow.album.AlbumPerformanceOptOption;
import android.os.Parcelable;
import com.yxcorp.gifshow.album.AlbumPerformanceOptOption$b;
import nsd.u;
import com.yxcorp.gifshow.album.AlbumPerformanceOptOption$c;
import com.yxcorp.gifshow.album.AlbumPerformanceOptOption$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class AlbumPerformanceOptOption implements Parcelable	// class@0019c1
{
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public static final Parcelable$Creator CREATOR;
    public static final AlbumPerformanceOptOption$b f;

    static {
       AlbumPerformanceOptOption.f = new AlbumPerformanceOptOption$b(null);
       AlbumPerformanceOptOption.CREATOR = new AlbumPerformanceOptOption$c();
    }
    public void AlbumPerformanceOptOption(AlbumPerformanceOptOption$a p0){
       super(p0.a, p0.b, p0.c, p0.d);
    }
    public void AlbumPerformanceOptOption(AlbumPerformanceOptOption$a p0,u p1){
       super(p0);
    }
    public void AlbumPerformanceOptOption(boolean p0,int p1,boolean p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(AlbumPerformanceOptOption.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AlbumPerformanceOptOption.class, "1")) {
          return;
       }
       a.q(p0, "parcel");
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.d);
       p0.writeInt(this.e);
       return;
    }
}
