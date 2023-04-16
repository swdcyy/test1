package uo7.i;
import uo7.c0;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public abstract class i extends c0	// class@00394f
{
    public final ShareAnyResponse$ShareObject c;

    public void i(ShareAnyResponse$ShareObject p0,k p1){
       a.p(p0, "shareData");
       a.p(p1, "conf");
       super(p1);
       this.c = p0;
    }
    public final ShareAnyResponse$ShareObject t(){
       return this.c;
    }
}
