package kn9.k;
import tvc.a;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class k extends a	// class@002cc6
{
    public final int a;
    public final boolean b;
    public final SelectScrollOption c;

    public void k(int p0,boolean p1,SelectScrollOption p2){
       a.p(p2, "selectScrollOption");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final int getPosition(){
       return this.a;
    }
}
