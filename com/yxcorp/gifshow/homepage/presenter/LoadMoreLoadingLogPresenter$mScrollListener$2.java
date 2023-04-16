package com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter$mScrollListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter;
import com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LoadMoreLoadingLogPresenter$mScrollListener$2 extends Lambda implements a	// class@001797
{
    public final LoadMoreLoadingLogPresenter this$0;

    public void LoadMoreLoadingLogPresenter$mScrollListener$2(LoadMoreLoadingLogPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final LoadMoreLoadingLogPresenter$b invoke(){
       Object obj = PatchProxy.apply(null, this, LoadMoreLoadingLogPresenter$mScrollListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LoadMoreLoadingLogPresenter$b(this.this$0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
