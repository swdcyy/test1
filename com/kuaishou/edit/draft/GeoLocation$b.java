package com.kuaishou.edit.draft.GeoLocation$b;
import z30.k0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.GeoLocation;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.GeoLocation$a;

public final class GeoLocation$b extends GeneratedMessageLite$Builder implements k0	// class@0017b9
{

    public void GeoLocation$b(){
       super(GeoLocation.DEFAULT_INSTANCE);
    }
    public void GeoLocation$b(GeoLocation$a p0){
       super(GeoLocation.DEFAULT_INSTANCE);
    }
    public GeoLocation$b a(double p0){
       this.copyOnWrite();
       this.instance.setLatitude(p0);
       return this;
    }
    public GeoLocation$b b(double p0){
       this.copyOnWrite();
       this.instance.setLongitude(p0);
       return this;
    }
    public double getLatitude(){
       return this.instance.getLatitude();
    }
    public double getLongitude(){
       return this.instance.getLongitude();
    }
}
