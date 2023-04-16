package androidx.work.ListenableWorker$a$c;
import androidx.work.ListenableWorker$a;
import androidx.work.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class ListenableWorker$a$c extends ListenableWorker$a	// class@000a4d
{
    public final a a;

    public void ListenableWorker$a$c(){
       super(a.c);
    }
    public void ListenableWorker$a$c(a p0){
       super();
       this.a = p0;
    }
    public a e(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || ListenableWorker$a$c.class != p0.getClass()) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public int hashCode(){
       return (((ListenableWorker$a$c.class.getName()).hashCode() * 31) + this.a.hashCode());
    }
    public String toString(){
       return "Success {mOutputData="+this.a+'}';
    }
}
