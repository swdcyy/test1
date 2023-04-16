package n0d.b;
import com.kwai.video.ksheifdec.HeifLoggerReporter;
import com.yxcorp.image.common.log.Log$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.image.common.log.Log$LEVEL;

public final class b implements HeifLoggerReporter	// class@001ef6
{
    public final Log$b a;

    public void b(Log$b p0){
       this.a = p0;
    }
    public final void log(String p0,int p1,String p2,String p3,Throwable p4){
       b ta = this.a;
       Log$LEVEL wARN = Log$LEVEL.WARN;
       if (p1 != 2) {
          if (p1 != 3) {
             if (p1 != 4) {
                if (p1 != 5) {
                   if (p1 != 6) {
                      if (p1 == 8) {
                      label_0021 :
                         wARN = Log$LEVEL.VERBOSE;
                      }
                   }else {
                      wARN = Log$LEVEL.ERROR;
                   }
                }
             }else {
                wARN = Log$LEVEL.INFO;
             }
          }else {
             wARN = Log$LEVEL.DEBUG;
          }
       }else {
          goto label_0021 ;
       }
       ta.a(wARN, p0, p3, p4);
       return;
    }
}
