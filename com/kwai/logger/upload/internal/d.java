package com.kwai.logger.upload.internal.d;
import erd.o;
import java.lang.Object;
import v87.b;
import com.kwai.logger.upload.model.ObiwanResponseException;

public final class d implements o	// class@000ece
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       if (p0.b() == 1) {
          return p0;
       }
       throw new ObiwanResponseException(p0);
    }
}
