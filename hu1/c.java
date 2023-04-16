package hu1.c;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;

public final class c	// class@002782
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;

    public void c(){
       super();
       this.a = new MutableLiveData();
       this.b = new MutableLiveData(null);
       this.c = new MutableLiveData();
       this.d = new MutableLiveData();
    }
    public final MutableLiveData a(){
       return this.d;
    }
    public final MutableLiveData b(){
       return this.b;
    }
    public final MutableLiveData c(){
       return this.a;
    }
    public final MutableLiveData d(){
       return this.c;
    }
}
