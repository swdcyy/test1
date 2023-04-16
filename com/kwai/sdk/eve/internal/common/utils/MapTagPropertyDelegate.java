package com.kwai.sdk.eve.internal.common.utils.MapTagPropertyDelegate;
import en7.s;
import nsd.u;
import com.kwai.sdk.eve.internal.common.utils.MapTagPropertyDelegate$1;
import msd.l;

public final class MapTagPropertyDelegate extends s	// class@0014a5
{

    public void MapTagPropertyDelegate(){
       super(false, 1, null);
    }
    public void MapTagPropertyDelegate(boolean p0){
       super(true, new MapTagPropertyDelegate$1(p0));
    }
    public void MapTagPropertyDelegate(boolean p0,int p1,u p2){
       if (p1 & 1) {
          p0 = true;
       }
       super(p0);
       return;
    }
}
