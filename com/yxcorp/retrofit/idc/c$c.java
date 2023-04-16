package com.yxcorp.retrofit.idc.c$c;
import com.yxcorp.utility.NetworkUtilsCached$a;
import com.yxcorp.retrofit.idc.c;
import java.lang.Object;
import fjd.c;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public class c$c implements NetworkUtilsCached$a	// class@0013d4
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void onNetworkChanged(){
       c.k(new c(this));
    }
}
