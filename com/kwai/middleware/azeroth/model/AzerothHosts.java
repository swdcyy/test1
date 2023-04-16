package com.kwai.middleware.azeroth.model.AzerothHosts;
import android.os.Parcelable;
import com.kwai.middleware.azeroth.model.AzerothHosts$b;
import nsd.u;
import com.kwai.middleware.azeroth.model.AzerothHosts$a;
import java.util.List;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;

public final class AzerothHosts implements Parcelable	// class@000eff
{
    public List hosts;
    public static final Parcelable$Creator CREATOR;
    public static final AzerothHosts$b b;

    static {
       AzerothHosts.b = new AzerothHosts$b(null);
       AzerothHosts.CREATOR = new AzerothHosts$a();
    }
    public void AzerothHosts(){
       super(null);
    }
    public void AzerothHosts(Parcel p0){
       a.q(p0, "source");
       super(p0.createStringArrayList());
    }
    public void AzerothHosts(List p0){
       super();
       this.hosts = p0;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       a.q(p0, "dest");
       p0.writeStringList(this.hosts);
    }
}
