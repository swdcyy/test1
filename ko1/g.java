package ko1.g;
import erd.o;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.io.File;
import java.io.FileInputStream;
import qkd.b;
import java.io.InputStream;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;

public final class g implements o	// class@002d7f
{
    public final String b;

    public void g(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0 = new File(this.b);
       FileInputStream uFileInputSt = b.b0(p0);
       return a.d(uFileInputSt, p0.getName());
    }
}
