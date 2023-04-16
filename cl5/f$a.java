package cl5.f$a;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$c;
import cl5.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.emotionsdk.widget.CommonEmotionPopupWindow;
import java.lang.ref.WeakReference;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import vk5.a;
import ql8.a;
import pl8.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import yk5.f;
import xk5.c;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uk5.r;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import jl5.h;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import lnc.a1;
import jl5.k;
import android.graphics.Point;
import java.lang.Math;
import androidx.fragment.app.CommitSafeDialogFragment;
import java.lang.Exception;

public class f$a implements EmotionLongClickRecyclerView$c	// class@0006f2
{
    public WeakReference a;
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "2")) {
          return;
       }
       f$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, f.class, "5")) {
          f q = tb.q;
          if (q != null) {
             q.Ug();
          }
       }
       tb = this.a;
       if (tb != null && tb.get() != null) {
          this.a.get().setSelected(false);
       }
       return;
    }
    public void b(int p0,int p1){
       a uoa2;
       float f;
       Point point;
       WeakReference weakReferenc = this;
       int i = p1;
       f$a uoa = f$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), weakReferenc, uoa, str)) {
          return;
       }
       uoa = weakReferenc.a;
       boolean b = false;
       if (uoa != null && uoa.get() != null) {
          weakReferenc.a.get().setSelected(b);
       }
       int b1 = true;
       if (i >= 0 && i < weakReferenc.b.p.getChildCount()) {
          View childAt = weakReferenc.b.p.getChildAt(i);
          childAt.setSelected(b1);
          weakReferenc.a = new WeakReference(childAt);
       }
       f$a b2 = weakReferenc.b;
       Objects.requireNonNull(b2);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), b2, uof, "4")) {
          uof = b2.p;
          int childAdapter = uof.getChildAdapterPosition(uof.getChildAt(i));
          f p = b2.p;
          int i1 = -1;
          if (childAdapter != i1) {
             a adapter = p.getAdapter();
             Objects.requireNonNull(adapter);
             a uoa1 = a.class;
             if (PatchProxy.isSupport(uoa1)) {
                uoa2 = PatchProxy.applyOneRefs(Integer.valueOf(childAdapter), adapter, uoa1, str);
                if (uoa2 != patchProxyRe) {
                label_00a2 :
                   if (uoa2 instanceof a && uoa2.b instanceof EmotionInfo) {
                      if (b2.q == null) {
                         CommonEmotionPopupWindow uCommonEmoti = new CommonEmotionPopupWindow();
                         b2.q = uCommonEmoti;
                         uCommonEmoti.o = b2.u.isEnableForceLightStyle();
                      }
                      uoa2 = uoa2.b;
                      p = b2.t;
                      if (p != null) {
                         p.d(b2.p.getChildAt(i), uoa2, b2.s.d());
                      }
                      int i2 = 0x7f070fcc;
                      int i3 = 0x7f0703bc;
                      f = (- (b2.l8().getDimension(i2) - b2.l8().getDimension(i3))) / 2.00f;
                      int i4 = r.a(b2.v);
                      childAdapter = (childAdapter + i1) % i4;
                      int i5 = 0;
                      if (!childAdapter) {
                         f = 0;
                      }else if(childAdapter == (i4 + i1)){
                         f = - (b2.l8().getDimension(i2) - b2.l8().getDimension(i3));
                      }
                      if (!b2.r - i5) {
                         b2.r = - (b2.l8().getDimension(i2) + b2.l8().getDimension(i3));
                      }
                      if (TextUtils.isEmpty(uoa2.mId)) {
                         f q = b2.q;
                         if (q != null) {
                            q.Ug();
                         }
                      }else {
                         CDNUrl[] uCDNUrlArray = new CDNUrl[(uoa2.mEmotionImageBigUrl.size() + b1)];
                         uCDNUrlArray[b] = new CDNUrl();
                         uCDNUrlArray[b].mUrl = h.g(uoa2);
                         EmotionInfo mEmotionImag = uoa2.mEmotionImageBigUrl;
                         CDNUrl[] uCDNUrlArray1 = new CDNUrl[mEmotionImag.size()];
                         CDNUrl[] uCDNUrlArray2 = mEmotionImag.toArray(uCDNUrlArray1);
                         for (childAdapter = 0; childAdapter < uCDNUrlArray2.length; childAdapter = i1) {
                            i1 = childAdapter + 1;
                            uCDNUrlArray[i1] = uCDNUrlArray2[childAdapter];
                         }
                         if (b2.getActivity() != null && b2.getActivity() instanceof FragmentActivity) {
                            Activity uActivity = b2.getActivity();
                            if (b2.s.d() == 4 || b2.s.d() == 2) {
                               b1 = a1.d(R.dimen.arg_RES_7f070340);
                               EmotionInfo mWidth = uoa2.mWidth;
                               EmotionInfo mHeight = uoa2.mHeight;
                               if (PatchProxy.isSupport(k.class)) {
                                  point = PatchProxy.applyFourRefs(Integer.valueOf(mWidth), Integer.valueOf(mHeight), Integer.valueOf(b1), Integer.valueOf(b1), null, k.class, "1");
                                  if (point != patchProxyRe) {
                                  }else {
                                  label_01ee :
                                     point = new Point();
                                     if (mWidth > null && mHeight > null) {
                                        float f1 = (float)b1 * 0x3f800000;
                                        float f2 = (float)mWidth;
                                        float f3 = f1 / f2;
                                        float f4 = (float)mHeight;
                                        f1 = Math.min(f3, (f1 / f4));
                                        point.x = (int)(f2 * f1);
                                        point.y = (int)(f1 * f4);
                                     }
                                     if (point.x <= null || point.y <= null) {
                                        point.x = b1;
                                        point.y = b1;
                                     }
                                  }
                               }else {
                                  goto label_01ee ;
                               }
                               b2.q.Vg(point.y);
                               b2.q.Xg(point.x);
                               b2.q.Zg(uActivity, b2.p.getChildAt(i), (int)f, (int)b2.r, uCDNUrlArray, point.x, point.y);
                            }else {
                               b2.q.Vg(b);
                               b2.q.Xg(b);
                               b2.q.Zg(uActivity, b2.p.getChildAt(i), (int)f, (int)b2.r, uCDNUrlArray, 0, 0);
                            }
                         }
                      }
                   }
                }
             }
             uoa2 = adapter.h.get(childAdapter);
             goto label_00a2 ;
          }
       }
    label_023e :
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "3")) {
          return;
       }
       f$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, f.class, "6")) {
          f q = tb.q;
          if (q != null) {
             try{
                q.dismiss();
                tb.q = objArray;
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
          }
       }
    }
}
