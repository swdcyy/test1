package com.yxcorp.gifshow.profile.presenter.g$a;
import hn5.f0$a;
import com.yxcorp.gifshow.profile.presenter.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.utility.TextUtils;
import android.view.ViewStub;

public class g$a implements f0$a	// class@00144a
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!this.a.R8()) {
          return;
       }
       uoa = this.a;
       PhotoMeta mViewCount = uoa.B.mViewCount;
       if (mViewCount < p0) {
          uoa.W8(uoa.w, R.id.profilegrid_play_count_tv, TextUtils.N((long)p0), 1);
       }else {
          uoa.W8(uoa.w, R.id.profilegrid_play_count_tv, TextUtils.N((long)mViewCount), 1);
       }
       return;
    }
}
