package com.yxcorp.gifshow.profile.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.profile.presenter.e$a;
import android.view.View$OnClickListener;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import com.yxcorp.gifshow.profile.http.l;

public class e extends PresenterV2	// class@001445
{
    public l p;
    public BaseFeed q;
    public List r;

    public void e(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       m1.f(p0, R.id.drafts_view).setOnClickListener(new e$a(this, true));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.q = this.r8("feed");
       this.r = this.t8("PROFILE_DRAFTS_ACTIVITY_CALLBACK");
       this.p = this.r8("DETAIL_PAGE_LIST");
       return;
    }
}
