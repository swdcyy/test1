package com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$2;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum;
import java.lang.String;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ts4.a;
import ps4.c;
import rs4.d;
import ss4.m;
import xs4.c;

public final class RecruitPresenterHolderEnum$2 extends RecruitPresenterHolderEnum	// class@000ea1
{

    public void RecruitPresenterHolderEnum$2(String p0,int p1){
       super(p0, p1, null);
    }
    public int getItemLayoutRes(){
       return 0x7f0d12f1;
    }
    public PresenterV2 getPresenter(View p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, RecruitPresenterHolderEnum$2.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new a());
       presenterV2.U7(new c());
       presenterV2.U7(new d());
       presenterV2.U7(new m());
       presenterV2.U7(new c());
       PatchProxy.onMethodExit(RecruitPresenterHolderEnum$2.class, "1");
       return presenterV2;
    }
}
