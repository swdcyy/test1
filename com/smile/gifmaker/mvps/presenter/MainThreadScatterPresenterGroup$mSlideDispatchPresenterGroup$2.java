package com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup$mSlideDispatchPresenterGroup$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup;
import java.lang.Object;
import kotlin.jvm.internal.a;
import jh5.a;

public final class MainThreadScatterPresenterGroup$mSlideDispatchPresenterGroup$2 extends Lambda implements a	// class@000c17
{
    public final MainThreadScatterPresenterGroup this$0;

    public void MainThreadScatterPresenterGroup$mSlideDispatchPresenterGroup$2(MainThreadScatterPresenterGroup p0){
       this.this$0 = p0;
       super(0);
    }
    public final DispatchPresenterGroup invoke(){
       DispatchPresenterGroup uDispatchPre;
       if (this.this$0.l()) {
          MainThreadScatterPresenterGroup e = this.this$0.e;
          a.m(e);
          uDispatchPre = new DispatchPresenterGroup(e);
       }else {
          uDispatchPre = null;
       }
       return uDispatchPre;
    }
    public Object invoke(){
       return this.invoke();
    }
}
