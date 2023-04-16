package l3.c;
import k3.i;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import w3.a;
import k3.i$b;
import k3.i$b$c;
import k3.i$b$a;
import java.lang.Throwable;
import xk.d;
import androidx.lifecycle.LiveData;

public class c implements i	// class@0024ff
{
    public final MutableLiveData c;
    public final a d;

    public void c(){
       super();
       this.c = new MutableLiveData();
       this.d = a.N();
       this.a(i.b);
    }
    public void a(i$b p0){
       this.c.postValue(p0);
       if (p0 instanceof i$b$c) {
          this.d.J(p0);
       }else if(p0 instanceof i$b$a){
          this.d.K(p0.a());
       }
       return;
    }
    public d getResult(){
       return this.d;
    }
    public LiveData getState(){
       return this.c;
    }
}
