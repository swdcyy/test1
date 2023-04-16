package kuaishou.perf.page.impl.PageStage;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public class PageStage implements Serializable	// class@001be8
{
    public String alias;
    public long cost;
    public long end;
    public long start;

    public void PageStage(String p0){
       super();
       this.alias = p0;
       this.start = System.currentTimeMillis();
    }
    public void PageStage(String p0,long p1,long p2){
       super();
       this.alias = p0;
       this.start = p1;
       this.end = p2;
       this.cost = p2 - p1;
    }
    public boolean end(){
       if (this.end - null > 0) {
          return false;
       }
       long l = System.currentTimeMillis();
       this.end = l;
       this.cost = l - this.start;
       return true;
    }
    public boolean isValid(){
       boolean b = (this.end > 0)? true: false;
       return b;
    }
}
