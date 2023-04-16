package n0d.d;
import java.lang.Runnable;
import com.yxcorp.image.common.log.Log$b;
import java.lang.Object;
import com.kwai.video.ksheifdec.KSHeifConfig;
import com.kwai.video.ksheifdec.HeifLogger;
import n0d.b;
import com.kwai.video.ksheifdec.HeifLoggerReporter;

public final class d implements Runnable	// class@001ef8
{
    public final boolean b;
    public final int c;
    public final Log$b d;

    public void d(boolean p0,int p1,Log$b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       KSHeifConfig.init();
       KSHeifConfig.setStaticImgRetryUseSystemDecoder(true);
       KSHeifConfig.setUseFFmpegSwScale(this.b);
       KSHeifConfig.setFFmpegDecodeHeifThreadCount(this.c);
       HeifLogger.setHeifLoggerLevel(3);
       HeifLogger.setHeifLoggerReporter(new b(this.d));
    }
}
