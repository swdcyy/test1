package kgd.w1;
import nc5.c;
import com.yxcorp.plugin.setting.entries.holder.p0$a;
import java.lang.Object;

public final class w1 implements c	// class@0017c3
{
    public final p0$a b;

    public void w1(p0$a p0){
       this.b = p0;
    }
    public final void onUpdate(int p0,int p1){
       w1 tb = this.b;
       boolean b = (p1 > 0)? true: false;
       tb.P8(b);
       return;
    }
}
