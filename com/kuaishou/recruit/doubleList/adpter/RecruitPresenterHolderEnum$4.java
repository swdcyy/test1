package com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$4;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum;
import java.lang.String;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qs4.h;

public final class RecruitPresenterHolderEnum$4 extends RecruitPresenterHolderEnum	// class@000ea3
{

    public void RecruitPresenterHolderEnum$4(String p0,int p1){
       super(p0, p1, null);
    }
    public int getItemLayoutRes(){
       return 0x7f0d12f0;
    }
    public PresenterV2 getPresenter(View p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, RecruitPresenterHolderEnum$4.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       PatchProxy.onMethodExit(RecruitPresenterHolderEnum$4.class, "1");
       return new h();
    }
}
