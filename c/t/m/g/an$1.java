package c.t.m.g.an$1;
import java.lang.Runnable;
import c.t.m.g.an;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import java.io.File;
import c.t.m.g.bf;

public class an$1 implements Runnable	// class@000bcc
{
    public final String a;
    public final an b;

    public void an$1(an p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       an$1 ta = this.a;
       bf.a(new File(this.a), new File(ta.substring(0, (ta.length() - (an.a(this.b)).length()))+".gzip"), true);
    }
}
