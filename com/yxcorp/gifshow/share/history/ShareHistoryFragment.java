package com.yxcorp.gifshow.share.history.ShareHistoryFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import eic.p;
import eic.g;
import com.yxcorp.gifshow.share.history.ShareHistoryFragment$a;
import y8c.f$b;
import io.reactivex.subjects.ReplaySubject;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;

public class ShareHistoryFragment extends BaseFragment	// class@001bad
{
    public PresenterV2 j;

    public void ShareHistoryFragment(){
       super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareHistoryFragment.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.i(p1, 0x7f0d14ea);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ShareHistoryFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       ShareHistoryFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareHistoryFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.j = presenterV2;
       presenterV2.U7(new p());
       this.j.U7(new g());
       ShareHistoryFragment$a uoa = new ShareHistoryFragment$a();
       uoa.f = this;
       uoa.h = ReplaySubject.g();
       uoa.i = new ArrayList();
       uoa.j = PublishSubject.g();
       uoa.k = PublishSubject.g();
       this.j.f(p0);
       Object[] objArray = new Object[]{uoa};
       this.j.i(objArray);
       return;
    }
}
