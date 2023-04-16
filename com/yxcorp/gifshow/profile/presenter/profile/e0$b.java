package com.yxcorp.gifshow.profile.presenter.profile.e0$b;
import com.yxcorp.gifshow.profile.widget.SerialHorizontalLoadMoreLayout$b;
import com.yxcorp.gifshow.profile.presenter.profile.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;

public class e0$b implements SerialHorizontalLoadMoreLayout$b	// class@00148e
{
    public final e0 a;

    public void e0$b(e0 p0){
       this.a = p0;
       super();
    }
    public void onRelease(){
       if (PatchProxy.applyVoid(null, this, e0$b.class, "1")) {
          return;
       }
       e0$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, e0.class, "7")) {
          Object[] objArray = new Object[]{ta.s.getId()};
          a.b(b.j(ta.getActivity(), String.format("kwai://corona/profileserial?profileUid=%s", objArray)), null);
       }
       return;
    }
    public void onStart(){
    }
}
