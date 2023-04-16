package a01.c;
import u07.u;
import a01.i;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGift;
import java.lang.Object;
import u07.t;
import android.view.View;
import lz0.c;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import vi1.a;

public final class c implements u	// class@000009
{
    public final i b;
    public final PrivilegeGift c;

    public void c(i p0,PrivilegeGift p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       a.a(this.b.w.Z2.a(), String.valueOf(this.c.mId), false);
    }
}
