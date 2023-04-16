package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$b$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import bf5.q;
import java.lang.Boolean;
import brd.y;

public final class MilanoProfileSideOptVMPresenter$b$a implements Runnable	// class@001531
{
    public final MilanoProfileSideOptVMPresenter$b b;

    public void MilanoProfileSideOptVMPresenter$b$a(MilanoProfileSideOptVMPresenter$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MilanoProfileSideOptVMPresenter$b$a.class, "1")) {
          return;
       }
       this.b.b.O.t.onNext(Boolean.TRUE);
       return;
    }
}
