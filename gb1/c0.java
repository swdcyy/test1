package gb1.c0;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import gb1.d0;
import db1.b;
import java.lang.String;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment;
import eb1.e;
import bb1.a;
import bb1.b;
import p91.m;

public final class c0 implements DialogContainerFragment$b	// class@00244e
{
    public final d0 a;
    public final b b;
    public final String c;
    public final String d;

    public void c0(d0 p0,b p1,String p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final Fragment a(){
       c0 ta = this.a;
       c0 tb = this.b;
       Objects.requireNonNull(ta);
       LiveUserListFragment liveUserList = LiveUserListFragment.Hh(0, tb.a(), tb.c(), this.c, this.d, true);
       liveUserList.b5(ta.b.a());
       liveUserList.Jh(tb.b());
       return liveUserList;
    }
}
