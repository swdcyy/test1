package b3d.m;
import n3d.a;
import android.app.Activity;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$c;
import java.lang.Object;
import android.content.Intent;
import mw4.a;
import v0d.j;
import tkd.b;
import tkd.d;
import wu5.a;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import com.yxcorp.login.util.ActivityPendingLaunchUtil;
import android.content.Context;
import java.lang.String;

public final class m implements a	// class@000337
{
    public final Activity b;
    public final ActivityPendingLaunchUtil$c c;

    public void m(Activity p0,ActivityPendingLaunchUtil$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       m tb = this.b;
       m tc = this.c;
       if (!a.f() && !j.g()) {
          d.a(0x6de3c81e).CQ(tb, true, ActivityPendingLaunchUtil.a(tc.a), tc.b);
       }
       return;
    }
}
