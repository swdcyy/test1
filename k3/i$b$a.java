package k3.i$b$a;
import k3.i$b;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Object;

public final class i$b$a extends i$b	// class@002477
{
    public final Throwable a;

    public void i$b$a(Throwable p0){
       super();
       this.a = p0;
    }
    public Throwable a(){
       return this.a;
    }
    public String toString(){
       Object[] objArray = new Object[]{this.a.getMessage()};
       return String.format("FAILURE \(%s\)", objArray);
    }
}
