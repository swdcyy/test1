package com.yxcorp.gifshow.helper.l;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.helper.UserContactManager;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.String;

public final class l implements o	// class@00163d
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       HashMap hashMap = new HashMap();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          String[] stringArray = p0.next();
          hashMap.put(stringArray[0], stringArray[1]);
       }
       return hashMap;
    }
}
