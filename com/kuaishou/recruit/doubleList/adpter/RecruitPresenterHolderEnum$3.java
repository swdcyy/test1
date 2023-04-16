package com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$3;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum;
import java.lang.String;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ps4.c;
import ts4.a;
import ss4.m;
import rs4.d;
import xs4.c;

public final class RecruitPresenterHolderEnum$3 extends RecruitPresenterHolderEnum	// class@000ea2
{

    public void RecruitPresenterHolderEnum$3(String p0,int p1){
       super(p0, p1, null);
    }
    public int getItemLayoutRes(){
       return 0x7f0d12ea;
    }
    public PresenterV2 getPresenter(View p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, RecruitPresenterHolderEnum$3.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new c());
       presenterV2.U7(new a());
       presenterV2.U7(new m());
       presenterV2.U7(new d());
       presenterV2.U7(new c());
       PatchProxy.onMethodExit(RecruitPresenterHolderEnum$3.class, "1");
       return presenterV2;
    }
}
