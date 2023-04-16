package ftd.f1;
import ftd.t1;
import java.lang.Object;
import ftd.k2;
import java.lang.String;
import java.lang.StringBuilder;

public final class f1 implements t1	// class@00163e
{
    public final boolean b;

    public void f1(boolean p0){
       super();
       this.b = p0;
    }
    public boolean E(){
       return this.b;
    }
    public k2 b(){
       return null;
    }
    public String toString(){
       StringBuilder str = "Empty{";
       String str1 = (this.E())? "Active": "New";
       return str+str1+'}';
    }
}
