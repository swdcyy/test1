package com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment$a;
import joc.d;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;
import java.lang.Object;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import android.view.View;
import jz8.n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class AdDetailVMFragment$a implements d	// class@001553
{
    public final AdDetailVMFragment a;

    public void AdDetailVMFragment$a(AdDetailVMFragment p0){
       this.a = p0;
       super();
    }
    public final boolean a(MotionEvent p0,boolean p1){
       AdDetailVMFragment$a obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdDetailVMFragment$a uoa = AdDetailVMFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = this.a;
       a.o(p0, "event");
       Objects.requireNonNull(obj);
       LinearLayoutManager obj1 = PatchProxy.applyOneRefs(p0, obj, AdDetailVMFragment.class, "38");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj1 = null;
          if (obj.Q == null) {
             DetailSlidePlayFragment x = obj.x;
             if (x != null) {
                PhotoDetailParam mPhoto = x.mPhoto;
                if (mPhoto != null) {
                   QPhoto mEntity = mPhoto.mEntity;
                   if (mEntity != null) {
                      if (!r1.t5(mEntity)) {
                         mEntity = obj1;
                      }
                      if (mEntity != null) {
                         obj.Q = obj.j.findViewById(0x7f0a3101);
                      }
                   }
                }
             }
          }
          AdDetailVMFragment q = obj.Q;
          if (q != null) {
             a.m(q);
             if (!q.getVisibility()) {
                q = obj.L;
                a.m(q);
                if (q.o != null) {
                   q = obj.L;
                   a.m(q);
                   n o = q.o;
                   String str = "mCallerContext!!.mRecyclerView";
                   a.o(o, str);
                   if (o.getAdapter() != null) {
                      q = obj.L;
                      a.m(q);
                      o = q.o;
                      a.o(o, str);
                      RecyclerView$LayoutManager layoutManage = o.getLayoutManager();
                      if (layoutManage instanceof LinearLayoutManager) {
                         RecyclerView$LayoutManager layoutManage1 = layoutManage;
                      }
                      int i = (obj1 != null)? obj1.i0(): -1;
                      if (i <= 0) {
                         int[] ointArray = new int[2];
                         AdDetailVMFragment q1 = obj.Q;
                         a.m(q1);
                         q1.getLocationOnScreen(ointArray);
                         if (p0.getRawY() - (float)ointArray[1] > 0) {
                            AdDetailVMFragment q2 = obj.Q;
                            a.m(q2);
                            if (p0.getRawY() - (float)(ointArray[1] + q2.getHeight()) < 0) {
                               b = true;
                            }
                         }
                      }
                   }
                }
             }
          }
          b = false;
       }
       return b;
    }
}
