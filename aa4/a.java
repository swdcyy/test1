package aa4.a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.GraphicVerticalMarqueeView;
import android.view.View;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.GraphicVerticalMarqueeView$a;

public final class a implements View$OnClickListener	// class@00004e
{
    public final GraphicVerticalMarqueeView b;
    public final int c;
    public final View d;

    public void a(GraphicVerticalMarqueeView p0,int p1,View p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       a tc = this.c;
       a td = this.d;
       GraphicVerticalMarqueeView e = this.b.e;
       if (e != null) {
          e.a(tc, td);
       }
       return;
    }
}
