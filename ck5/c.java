package ck5.c;
import java.util.concurrent.Callable;
import com.kwai.emotionsdk.core.j;
import java.lang.String;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionPackage;

public final class c implements Callable	// class@0006d1
{
    public final j b;
    public final String c;

    public void c(j p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       EmotionPackage uEmotionPack = this.b.f(this.c);
       if (uEmotionPack == null) {
          uEmotionPack = EmotionPackage.EMPTY_PKG;
       }
       return uEmotionPack;
    }
}
