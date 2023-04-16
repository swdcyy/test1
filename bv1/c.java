package bv1.c;
import java.util.Comparator;
import java.lang.Object;
import ks5.m;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import java.lang.Integer;

public final class c implements Comparator	// class@00041b
{
    public final int b;

    public void c(int p0){
       this.b = p0;
    }
    public final int compare(Object p0,Object p1){
       int i = (this.b == 2 && b.a)? Integer.compare(p1.getLayoutOrder(), p0.getLayoutOrder()): Integer.compare(p0.getLayoutOrder(), p1.getLayoutOrder());
       return i;
    }
}
