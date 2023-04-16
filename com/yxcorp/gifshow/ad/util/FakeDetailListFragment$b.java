package com.yxcorp.gifshow.ad.util.FakeDetailListFragment$b;
import y8c.g;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;

public final class FakeDetailListFragment$b extends g	// class@00186c
{

    public void FakeDetailListFragment$b(){
       super();
    }
    public f h1(ViewGroup p0,int p1){
       FakeDetailListFragment$b uob = FakeDetailListFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Context context = (p0 != null)? p0.getContext(): null;
       return new f(new View(context), new PresenterV2());
    }
}
