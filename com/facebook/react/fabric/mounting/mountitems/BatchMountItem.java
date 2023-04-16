package com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import de.f;
import java.lang.Object;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import ce.b;
import hg.a;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;

public class BatchMountItem implements f	// class@001267
{
    public final f[] a;
    public final int b;
    public final int c;

    public void BatchMountItem(f[] p0,int p1,int p2){
       super();
       Objects.requireNonNull(p0);
       if (p1 < 0 || p1 > p0.length) {
          throw new IllegalArgumentException("Invalid size received by parameter size: "+p1+" items.size = "+p0.length);
       }
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return;
    }
    public void a(b p0){
       a.a(0, "FabricUIManager::mountViews - "+this.b+" items");
       BatchMountItem tc = this.c;
       if (tc > null) {
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, tc);
       }
       for (int i = 0; i < this.b; i = i + 1) {
          this.a[i].a(p0);
       }
       BatchMountItem tc1 = this.c;
       if (tc1 > null) {
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, tc1);
       }
       a.c(0, "FabricUIManager::mountViews - "+this.b+" items");
       return;
    }
    public String toString(){
       StringBuilder str = "";
       for (int i = 0; i < this.b; i = i1) {
          if (str.length() > 0) {
             str = str+"\n";
          }
          int i1 = i + 1;
          str = str+"BatchMountItem \("+i1+"/"+this.b+"\): "+this.a[i];
       }
       return str;
    }
}
