package androidx.work.e;
import java.util.UUID;
import u3.r;
import java.util.Set;
import java.lang.Object;
import java.lang.String;

public abstract class e	// class@000a61
{
    public UUID a;
    public r b;
    public Set c;

    public void e(UUID p0,r p1,Set p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public String a(){
       return this.a.toString();
    }
    public Set b(){
       return this.c;
    }
    public r c(){
       return this.b;
    }
}
