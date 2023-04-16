package androidx.work.ListenableWorker$a$a;
import androidx.work.ListenableWorker$a;
import androidx.work.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class ListenableWorker$a$a extends ListenableWorker$a	// class@000a4b
{
    public final a a;

    public void ListenableWorker$a$a(){
       super(a.c);
    }
    public void ListenableWorker$a$a(a p0){
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
       if (p0 == null || ListenableWorker$a$a.class != p0.getClass()) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public int hashCode(){
       return (((ListenableWorker$a$a.class.getName()).hashCode() * 31) + this.a.hashCode());
    }
    public String toString(){
       return "Failure {mOutputData="+this.a+'}';
    }
}
