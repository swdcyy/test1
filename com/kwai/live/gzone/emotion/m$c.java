package com.kwai.live.gzone.emotion.m$c;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$c;
import com.kwai.live.gzone.emotion.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup;
import java.util.Objects;
import com.kwai.emotionsdk.widget.CommonEmotionPopupWindow;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import g9c.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import lnc.l1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.CommitSafeDialogFragment;

public class m$c implements EmotionLongClickRecyclerView$c	// class@000cec
{
    public WeakReference a;
    public final m b;

    public void m$c(m p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, m$c.class, "2")) {
          return;
       }
       this.b.S8();
       m$c ta = this.a;
       if (ta != null && ta.get() != null) {
          this.a.get().setSelected(false);
       }
       return;
    }
    public void b(int p0,int p1){
       m$c uoc = m$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       m$c ta = this.a;
       if (ta != null && ta.get() != null) {
          this.a.get().setSelected(false);
       }
       if (p1 >= 0 && p1 < this.b.v.getChildCount()) {
          View childAt = this.b.v.getChildAt(p1);
          childAt.setSelected(true);
          this.a = new WeakReference(childAt);
       }
       ta = this.b;
       Objects.requireNonNull(ta);
       m om = m.class;
       if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, om, "6")) {
          if (ta.y == null) {
             CommonEmotionPopupWindow uCommonEmoti = new CommonEmotionPopupWindow();
             ta.y = uCommonEmoti;
             uCommonEmoti.n = ta.t.isEnableForceDarkStyle();
          }
          EmotionInfo uEmotionInfo = ta.x.N0(p1);
          m v = ta.v;
          if (v.getChildAdapterPosition(v.getChildAt(p1)) != -1) {
             if (TextUtils.x(uEmotionInfo.mId)) {
                ta.S8();
             }else {
                int i = 0x7f070fcc;
                int i1 = 2;
                float f = (float)((- (a1.d(i) - ta.v.getChildAt(p1).getWidth())) / i1);
                if (!ta.z - null) {
                   ta.z = (float)((- a1.d(i)) - a1.d(0x7f0703bc));
                }
                int[] ointArray = new int[i1];
                if (l1.a()) {
                   ta.q.getLocationOnScreen(ointArray);
                   f = f - (float)ointArray[0];
                }
                if (ta.getActivity() != null && ta.getActivity() instanceof FragmentActivity) {
                   ta.y.Vg(false);
                   ta.y.Xg(false);
                   CDNUrl[] uCDNUrlArray = new CDNUrl[false];
                   ta.y.Zg(ta.getActivity(), ta.v.getChildAt(p1), (int)f, (int)ta.z, uEmotionInfo.mEmotionImageBigUrl.toArray(uCDNUrlArray), 0, 0);
                }
             }
          }
       }
    label_0119 :
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m$c.class, "3")) {
          return;
       }
       m$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, m.class, "4")) {
          m y = tb.y;
          if (y != null && (y.getFragmentManager() != null && tb.y.isAdded())) {
             tb.y.dismiss();
          }
       label_0033 :
          tb.y = objArray;
       }
       tb = this.a;
       if (tb != null && tb.get() != null) {
          this.a.get().setSelected(false);
       }
       return;
    }
}
