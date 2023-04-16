package com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$5;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum;
import java.lang.String;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ns4.d;

public final class RecruitPresenterHolderEnum$5 extends RecruitPresenterHolderEnum	// class@000ea4
{

    public void RecruitPresenterHolderEnum$5(String p0,int p1){
       super(p0, p1, null);
    }
    public int getItemLayoutRes(){
       return 0x7f0d0ebe;
    }
    public PresenterV2 getPresenter(View p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, RecruitPresenterHolderEnum$5.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       PatchProxy.onMethodExit(RecruitPresenterHolderEnum$5.class, "1");
       return new d();
    }
}
