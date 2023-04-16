package ky8.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.award.ui.ShineView;
import java.lang.Object;

public final class c implements Runnable	// class@002c55
{
    public final ShineView b;

    public void c(ShineView p0){
       this.b = p0;
    }
    public final void run(){
       ShineView.a(this.b);
    }
}
