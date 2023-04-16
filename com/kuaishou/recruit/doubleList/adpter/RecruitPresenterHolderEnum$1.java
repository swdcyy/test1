package com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$1;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum;
import java.lang.String;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.android.live.doublelist.danmaku.h;
import ss4.m;
import ps4.c;
import ts4.a;
import np.d;
import xs4.c;
import rs4.d;

public final class RecruitPresenterHolderEnum$1 extends RecruitPresenterHolderEnum	// class@000ea0
{

    public void RecruitPresenterHolderEnum$1(String p0,int p1){
       super(p0, p1, null);
    }
    public int getItemLayoutRes(){
       return 0x7f0d12eb;
    }
    public PresenterV2 getPresenter(View p0){
       PresenterV2 obj = PatchProxy.applyOneRefsWithListener(p0, this, RecruitPresenterHolderEnum$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_feed_item_cover);
       obj.U7(new h());
       obj.U7(new m());
       obj.U7(new c());
       obj.U7(new a());
       obj.U7(new d(false));
       obj.U7(new c());
       obj.U7(new d());
       PatchProxy.onMethodExit(RecruitPresenterHolderEnum$1.class, "1");
       return obj;
    }
}
