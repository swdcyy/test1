package eh0.d;
import erd.g;
import com.kuaishou.house.live.prerequest.a;
import oy.a;
import java.lang.Object;
import com.kuaishou.house.live.prerequest.HousePreRequestResponse;
import java.util.Objects;
import java.lang.System;
import com.kuaishou.house.live.prerequest.HousePreRequestResponse$Data;
import mrd.a;
import fg6.a;
import java.lang.String;
import com.google.gson.Gson;
import com.kuaishou.house.live.prerequest.a$b;
import java.lang.Exception;
import com.kuaishou.house.live.bottombar.HouseLiveIconMessage;

public final class d implements g	// class@00215f
{
    public final a b;
    public final a c;
    public final long d;

    public void d(a p0,a p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       tc.a0((System.currentTimeMillis() - this.d));
       tc.b0(1);
       tc.r();
       HousePreRequestResponse mData = p0.mData;
       if (mData != null) {
          HousePreRequestResponse$Data mLocalLifeLi = mData.mLocalLifeLiveIconMessage;
          if (mLocalLifeLi != null) {
             a s = tb.s;
             try{
                s.onNext(mLocalLifeLi);
                tb.w.d = a.a.q(p0);
             }catch(java.lang.Exception e7){
                e7.printStackTrace();
             }
          }else {
          label_0037 :
             tb.s.onNext(new HouseLiveIconMessage());
             p0.d = "";
          }
       }else {
          goto label_0037 ;
       }
    }
}
