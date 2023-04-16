package io.netty.util.internal.logging.a;
import ard.c;
import java.lang.String;
import ard.b;
import io.netty.util.internal.logging.Log4JLogger;
import org.apache.log4j.Logger;

public class a extends c	// class@00118d
{

    public void a(){
       super();
    }
    public b c(String p0){
       return new Log4JLogger(Logger.getLogger(p0));
    }
}
