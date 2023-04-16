package com.kwai.nearby.local.presenter.v$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.nearby.local.presenter.v;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.nearby.startup.local.model.NearbyLocationWindowShowConfig;
import java.util.Collection;
import ekd.q;
import mc7.i;
import java.util.List;
import java.lang.System;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

public class v$a extends RecyclerView$r	// class@000fd7
{
    public final v a;

    public void v$a(v p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       int i3;
       v$a uoa = v$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p1 && LocalConfigKeyHelper.i()) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          if (layoutManage instanceof StaggeredGridLayoutManager) {
             v$a ta = this.a;
             int i = 0;
             int i1 = layoutManage.findLastVisibleItemPositions(null)[i];
             Objects.requireNonNull(ta);
             v ov = v.class;
             if (PatchProxy.isSupport(ov)) {
                NearbyLocationWindowShowConfig obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), ta, ov, "4");
                if (obj != PatchProxyResult.class) {
                   i = obj.booleanValue();
                }else {
                label_0051 :
                   ov = ta.r;
                   if (ov != null) {
                      obj = ov.mShowStrategy;
                      if (!q.f(obj)) {
                         int i2 = i.b();
                         if (i2 > 0) {
                            i2 = i2 % obj.size();
                            if (!i2) {
                               i2 = obj.size();
                            }
                            i3 = obj.get((i2 - 1)).intValue();
                         }else {
                            i3 = 0;
                         }
                         if ((System.currentTimeMillis() - i.a.getLong("permissionDialogRefuseTime", 0)) - TimeUnit.DAYS.toMillis((long)i3) > 0 && i1 >= (ta.r.mFeedCountWhenShow - 1)) {
                            i = true;
                         }
                      }
                   }
                }
             }else {
                goto label_0051 ;
             }
             if (i) {
                this.a.P8();
             }
          }
       }
       return;
    }
}
