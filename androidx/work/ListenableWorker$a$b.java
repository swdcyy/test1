package androidx.work.ListenableWorker$a$b;
import androidx.work.ListenableWorker$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;

public final class ListenableWorker$a$b extends ListenableWorker$a	// class@000a4c
{

    public void ListenableWorker$a$b(){
       super();
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || ListenableWorker$a$b.class != p0.getClass()) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (ListenableWorker$a$b.class.getName()).hashCode();
    }
    public String toString(){
       return "Retry";
    }
}
