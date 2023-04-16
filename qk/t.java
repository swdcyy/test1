package qk.t;
import java.lang.Object;
import java.lang.String;

public abstract class t	// class@002a19
{

    public void t(){
       super();
    }
    public abstract Object delegate();
    public String toString(){
       return this.delegate().toString();
    }
}
