package com.loc.ep$1;
import java.util.Comparator;
import com.loc.ep;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.loc.ep$a;

public final class ep$1 implements Comparator	// class@001411
{
    public final ep a;

    public void ep$1(ep p0){
       this.a = p0;
       super();
    }
    public final int a(String p0,String p1){
       return ep.a(ep.a(this.a).get(p1).c, ep.a(this.a).get(p0).c);
    }
    public final int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
