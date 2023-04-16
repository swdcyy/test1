package com.example.commercial.diversead.banner.AdTKBannerView$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class AdTKBannerView$b	// class@001026
{
    public final Object event;
    public final String type;

    public void AdTKBannerView$b(String p0,Object p1){
       a.p(p0, "type");
       super();
       this.type = p0;
       this.event = p1;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof AdTKBannerView$b && (a.g(this.type, p0.type) && a.g(this.event, p0.event)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       AdTKBannerView$b ttype = this.type;
       int i = 0;
       int i1 = (ttype != null)? ttype.hashCode(): 0;
       i1 = i1 * 31;
       AdTKBannerView$b tevent = this.event;
       if (tevent != null) {
          i = tevent.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "EventContent\(type="+this.type+", event="+this.event+"\)";
    }
}
