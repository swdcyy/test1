package com.yxcorp.gifshow.util.resource.k;
import erd.o;
import java.lang.Object;
import com.kuaishou.android.model.response.ConfigResponse;
import com.yxcorp.gifshow.util.resource.n;
import qfc.a;
import java.lang.String;
import q87.c;

public final class k implements o	// class@000cef
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final Object apply(Object p0){
       n.e = p0;
       Object[] objArray = new Object[0];
       a.C().t("resourcemanager", "getConfig", objArray);
       return p0;
    }
}
