package jb1.q;
import erd.g;
import jb1.b$c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.Enum;
import com.kwai.framework.model.user.UserExtraInfo;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.String;
import b61.b;
import android.content.Context;
import nl8.p;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.a;
import kb1.b;

public final class q implements g	// class@002b1a
{
    public final b$c b;
    public final int c;
    public final UserInfo d;

    public void q(b$c p0,int p1,UserInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       q tb = this.b;
       q tc = this.c;
       q td = this.d;
       Objects.requireNonNull(tb);
       int i = 1;
       p0 = (tc == LiveApiParams$AssistantType.ADMIN.ordinal())? 1: null;
       int i1 = (p0)? 0x7f101d0a: 0x7f101d0e;
       UserInfo mExtraInfo = td.mExtraInfo;
       if (mExtraInfo == null) {
          mExtraInfo = new UserExtraInfo();
          td.mExtraInfo = mExtraInfo;
       }
       mExtraInfo.mAssistantType = tc;
       tb.p.k0();
       Object[] objArray = new Object[i];
       objArray[0] = b.c(td);
       i.d(R.style.arg_RES_7f11066a, tb.s().getString(i1, objArray));
       RxBus f = RxBus.f;
       p0 = (p0)? new a(td.mId): new b(td.mId);
       f.b(p0);
       return;
    }
}
