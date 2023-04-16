package com.ta.utdid2.device.e;
import java.lang.Object;
import java.lang.String;
import com.ta.utdid2.a.a.a;
import com.ta.utdid2.a.a.g;
import com.ta.utdid2.a.a.b;

public class e	// class@000cd6
{

    public void e(){
       super();
    }
    public String d(String p0){
       return a.b(p0);
    }
    public String e(String p0){
       p0 = a.b(p0);
       if (g.a(p0)) {
          return v1;
       }
       int i = 0;
       try{
          return new String(b.decode(p0, i));
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
}
