package com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$a;
import java.lang.Runnable;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$Type;
import java.lang.String;
import okhttp3.Request;
import java.lang.Object;
import java.util.Map;
import java.lang.StringBuilder;
import mjd.a;

public class CommonParamsCompareManager$a implements Runnable	// class@000962
{
    public final CommonParamsCompareManager$Type b;
    public final String c;
    public final Request d;
    public final CommonParamsCompareManager e;

    public void CommonParamsCompareManager$a(CommonParamsCompareManager p0,CommonParamsCompareManager$Type p1,String p2,Request p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       CommonParamsCompareManager$a tb = this.b;
       if (tb == CommonParamsCompareManager$Type.REQUEST_PARAMS) {
          this.e.a.put(this.c, this.d);
       }else if(tb == CommonParamsCompareManager$Type.REQUEST_HEADERS){
          this.e.b.put(this.c, this.d);
       }
       a.c("CommonParamsCompareManager", "compare map size: "+this.e.a.size()+"&"+this.e.b.size());
       return;
    }
}
