package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.widget.DetailPendantViewPager$a;
import android.os.Handler;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.widget.DetailPendantViewPager;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Boolean;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;

public class DetailPendantViewPager$a extends Handler	// class@000752
{
    public final DetailPendantViewPager a;

    public void DetailPendantViewPager$a(DetailPendantViewPager p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailPendantViewPager$a.class, "1")) {
          return;
       }
       if (p0.what == null) {
          DetailPendantViewPager$a ta = this.a;
          DetailPendantViewPager w = ta.w;
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport(DetailPendantViewPager.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(w), Boolean.TRUE, ta, DetailPendantViewPager.class, "8")) {
             int i = w + 1;
             if (ta.getAdapter() == null) {
                ta.setCurrentItem(i, 1);
             }else {
                ta.setCurrentItem((i % ta.getAdapter().j()), 1);
             }
          }
       }
       return;
    }
}
