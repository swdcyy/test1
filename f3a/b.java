package f3a.b;
import hka.a;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class b implements a	// class@00227b
{
    public final OcrFragment b;

    public void b(OcrFragment p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return OcrFragment.Ih(this.b, false, 1, null);
    }
}
