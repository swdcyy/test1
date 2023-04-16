package jq9.y0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData;
import com.kuaishou.android.model.mix.CoronaInfo;
import jq9.w0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.x0;
import mm8.a;

public final class y0 implements b	// class@002b67
{

    public void y0(){
       super();
    }
    public void a(a p0,Object p1){
       CoronaInfo uCoronaInfo = CoronaInfo.class;
       w0 ow0 = new w0(this, p1);
       try{
          p0.h(uCoronaInfo, ow0);
          p0.h(PadCoronaRankingListTabData.class, new x0(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
