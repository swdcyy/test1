package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$e;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.ProfileEmptyUserGuideInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;

public final class MyProfileEmptyGuideTipPresenter$e implements g	// class@00140b
{
    public final MyProfileEmptyGuideTipPresenter b;
    public final List c;

    public void MyProfileEmptyGuideTipPresenter$e(MyProfileEmptyGuideTipPresenter p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MyProfileEmptyGuideTipPresenter$e.class, "1")) {
       }else {
          p0 = this.b;
          MyProfileEmptyGuideTipPresenter$e tc = this.c;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(tc, p0, MyProfileEmptyGuideTipPresenter.class, "30")) {
             int i = 0;
             if (!tc instanceof Collection || !tc.isEmpty()) {
                Iterator iterator = tc.iterator();
                do {
                   if (iterator.hasNext()) {
                      b = (iterator.next().mStatus == 1)? true: false;
                   }
                } while (!b);
                if (i) {
                   p0.d9();
                }else {
                   p0.R8(tc);
                   p0.j9(tc);
                   p0 = p0.A;
                   if (p0 != null) {
                      p0 = p0.getAdapter();
                      if (p0 != null) {
                         p0.k0();
                      }
                   }
                }
             }
             i = 1;
             goto label_0047 ;
          }
       label_0060 :
          PatchProxy.onMethodExit(MyProfileEmptyGuideTipPresenter$e.class, "1");
       }
       return;
    }
}
