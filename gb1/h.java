package gb1.h;
import android.content.DialogInterface$OnClickListener;
import gb1.s;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig;

public final class h implements DialogInterface$OnClickListener	// class@002465
{
    public final s b;
    public final ArrayList c;
    public final List d;
    public final String e;
    public final UserInfo f;
    public final boolean g;

    public void h(s p0,ArrayList p1,List p2,String p3,UserInfo p4,boolean p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void onClick(DialogInterface p0,int p1){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       h tf = this.f;
       h tg = this.g;
       Objects.requireNonNull(tb);
       if (p1 >= 0 && p1 < tc.size()) {
          tb.j(td.get(p1), te, tf, tg);
       }
       return;
    }
}
