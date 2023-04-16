package i61.g;
import a71.c;
import i61.j;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import j61.b;

public final class g implements c	// class@00283a
{
    public final j a;
    public final MutableLiveData b;

    public void g(j p0,MutableLiveData p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onShow(){
       g tb = this.b;
       j i = this.a.i;
       if (i != null) {
          i.b(tb);
       }
       return;
    }
}
