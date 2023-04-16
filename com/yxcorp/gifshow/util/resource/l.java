package com.yxcorp.gifshow.util.resource.l;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse;
import com.yxcorp.gifshow.util.resource.n;
import qfc.a;
import java.lang.String;

public final class l implements o	// class@000cf0
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       n.f = p0;
       Object[] objArray = new Object[0];
       a.C().D("YCNN2_CONFIG", "[yModel][keypath][update] ", p0.toString(), objArray);
       return p0;
    }
}
