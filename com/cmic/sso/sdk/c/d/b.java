package com.cmic.sso.sdk.c.d.b;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class b	// class@000f54
{
    public int a;
    public Map b;
    public String c;

    public void b(int p0,Map p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public int a(){
       return this.a;
    }
    public Map b(){
       b tb = this.b;
       if (tb == null) {
          tb = new HashMap();
       }
       return tb;
    }
    public String c(){
       b tc = this.c;
       if (tc == null) {
          tc = "";
       }
       return tc;
    }
    public boolean d(){
       b ta = this.a;
       boolean b = (ta == 302 || ta == 301)? true: false;
       return b;
    }
}
