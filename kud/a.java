package kud.a;
import kud.d;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.Class;

public abstract class a implements d	// class@001bff
{

    public void a(){
       super();
    }
    public boolean accept(File p0){
       return this.accept(p0.getParentFile(), p0.getName());
    }
    public boolean accept(File p0,String p1){
       return this.accept(new File(p0, p1));
    }
    public String toString(){
       return this.getClass().getSimpleName();
    }
}
