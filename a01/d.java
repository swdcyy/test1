package a01.d;
import u07.u;
import a01.i;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGift;
import java.lang.Object;
import u07.t;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import lz0.c;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import vi1.a;

public final class d implements u	// class@00000a
{
    public final i b;
    public final Runnable c;
    public final PrivilegeGift d;

    public void d(i p0,Runnable p1,PrivilegeGift p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       d tb = this.b;
       y.a(tb.getActivity(), this.c, tb, 100);
       a.a(tb.w.Z2.a(), String.valueOf(this.d.mId), true);
    }
}
