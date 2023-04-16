package pa.a;
import java.lang.Runnable;
import com.example.commercial.diversead.banner.AdTKBannerView;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import yx.j0;
import com.yxcorp.gifshow.ad.tachikoma.a;

public final class a implements Runnable	// class@0028f5
{
    public final AdTKBannerView b;

    public void a(AdTKBannerView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = new Object[0];
       j0.f("AdTKBannerView", " mTKManager destroy "+this.b, objArray);
       this.b.j.destroy();
    }
}
