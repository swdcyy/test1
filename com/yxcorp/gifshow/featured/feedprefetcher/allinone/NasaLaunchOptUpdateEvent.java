package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptUpdateEvent;
import nsd.u;
import java.lang.Object;

public final class NasaLaunchOptUpdateEvent	// class@000fa7
{
    public final boolean isPrefetch;

    public void NasaLaunchOptUpdateEvent(){
       super(false, 1, null);
    }
    public void NasaLaunchOptUpdateEvent(boolean p0){
       super();
       this.isPrefetch = p0;
    }
    public void NasaLaunchOptUpdateEvent(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public final boolean isPrefetch(){
       return this.isPrefetch;
    }
}
