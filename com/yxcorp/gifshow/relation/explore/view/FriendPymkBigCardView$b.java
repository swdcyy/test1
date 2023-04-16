package com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import com.kwai.framework.model.user.RecoUser;
import fac.b;
import com.kwai.framework.model.user.User;
import org.json.JSONObject;
import g7c.i;
import io.reactivex.subjects.PublishSubject;

public class FriendPymkBigCardView$b extends m	// class@001888
{
    public final FriendPymkBigCardView c;

    public void FriendPymkBigCardView$b(FriendPymkBigCardView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendPymkBigCardView$b.class, "1")) {
          return;
       }
       FriendPymkBigCardView$b tc = this.c;
       i.b(tc.c.mUser, tc.d.b, null, "close");
       tc = this.c;
       tc.d.f.onNext(tc.c);
       return;
    }
}
