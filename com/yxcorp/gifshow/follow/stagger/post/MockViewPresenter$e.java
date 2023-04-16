package com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$e;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bja.g0;
import java.lang.Enum;
import android.view.View;

public final class MockViewPresenter$e implements Observer	// class@0011d5
{
    public final MockViewPresenter b;

    public void MockViewPresenter$e(MockViewPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MockViewPresenter$e.class, "1")) {
       }else if(p0 == null){
       label_0032 :
          p0 = this.b.s;
          if (p0 != null) {
             p0.setVisibility(8);
          }
       }else {
          int i = g0.a[p0.ordinal()];
          if (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5)))) {
             i = this.b.s;
             if (i != null) {
                i.setVisibility(0);
             }
          }else {
             goto label_0032 ;
          }
       }
       PatchProxy.onMethodExit(MockViewPresenter$e.class, "1");
       return;
    }
}
