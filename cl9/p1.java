package cl9.p1;
import erd.g;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import njd.a;
import e17.i;

public final class p1 implements g	// class@000654
{
    public final QComment b;
    public final boolean c;

    public void p1(QComment p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p1 tc = this.c;
       if (this.b.mIsGodComment != null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f103aa1);
       }else if(tc != null){
          i.a(R.style.arg_RES_7f11066a, 0x7f103aa0);
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f103a9f);
       }
       return;
    }
}
