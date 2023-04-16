package com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.ja;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import fac.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import org.json.JSONObject;
import g7c.i;
import io.reactivex.subjects.PublishSubject;

public class FriendPymkBigCardView$d extends m	// class@00188a
{
    public final FriendPymkBigCardView c;

    public void FriendPymkBigCardView$d(FriendPymkBigCardView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendPymkBigCardView$d.class, "1")) {
          return;
       }
       ja.a();
       FriendPymkBigCardView$d tc = this.c;
       User mId = tc.c.mUser.mId;
       b a = tc.d.a;
       int i = (a == null)? 0: a.f();
       tc = this.c;
       BaseCardView d = tc.d;
       b b = d.b;
       FriendPymkBigCardView j = tc.j;
       a = d.a;
       String str = (a == null)? "": a.o();
       PymkLogSender.reportPymkNegative(mId, i, b, j, 4, "", "", "", str);
       tc = this.c;
       i.b(tc.c.mUser, tc.d.b, null, "replace");
       tc = this.c;
       tc.d.g.onNext(tc.c);
       return;
    }
}
