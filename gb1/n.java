package gb1.n;
import eb1.a;
import gb1.s;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eb1.e;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import bb1.b;
import java.util.ArrayList;
import hy2.c;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig;
import zf6.l;
import mz6.b$d;
import android.content.res.Resources;
import java.lang.CharSequence;
import db1.b;
import com.kwai.framework.model.user.UserInfo;
import gb1.j;
import z1.a;
import mz6.b;
import gb1.h;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class n implements a	// class@002478
{
    public final s a;

    public void n(s p0){
       this.a = p0;
    }
    public final void run(){
       boolean b;
       n ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, ta, s.class, "3")) {
       }else {
          LiveAdminAbilityModel mExtInfo = ta.c.mExtInfo;
          if (mExtInfo != null) {
             LiveAdminAbilityExtInfo mForbidTimeC = mExtInfo.mForbidTimeConfig;
             if (mForbidTimeC != null) {
                if (q.f(mForbidTimeC)) {
                   b.B(LiveLogTag.LIVE_ADMIN, "forbid comment, config list is null");
                }else {
                   Activity activity = ta.b.getActivity();
                   ArrayList uArrayList = new ArrayList();
                   c uoc = new c(ta.b.getActivity());
                   Iterator iterator = mForbidTimeC.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(new b$d(iterator.next().mDisplayText, objArray, activity.getResources().getColor(l.m(R.color.arg_RES_7f061dc4, 0x7f061d77))));
                   }
                   b uob = ta.b.b();
                   UserInfo userInfo = uob.f();
                   String str = uob.c();
                   b = uob.i();
                   ta.i(new j(userInfo));
                   uoc.b(uArrayList);
                   String str1 = str;
                   h oh = new h(ta, uArrayList, mForbidTimeC, str1, userInfo, b);
                   uoc.l(v9);
                   uoc.q();
                }
             }
          }
          b.B(LiveLogTag.LIVE_ADMIN, "forbid comment, config is null");
       }
       return;
    }
}
