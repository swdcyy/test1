package gv8.j;
import erd.g;
import com.yxcorp.gateway.pay.activity.FrontCashierActivity;
import iv8.c;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.QueryPayResponse;

public final class j implements g	// class@0024e7
{
    public final FrontCashierActivity b;
    public final c c;

    public void j(FrontCashierActivity p0,c p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       FrontCashierActivity.N2(this.b, this.c, 1, p0);
    }
}
