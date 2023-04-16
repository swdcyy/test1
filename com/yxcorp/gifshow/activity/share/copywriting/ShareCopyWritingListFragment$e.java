package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$e;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.widget.FrameLayout;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

public final class ShareCopyWritingListFragment$e implements View$OnLayoutChangeListener	// class@001384
{
    public final ShareCopyWritingListFragment b;

    public void ShareCopyWritingListFragment$e(ShareCopyWritingListFragment p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.isSupport(ShareCopyWritingListFragment$e.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, ShareCopyWritingListFragment$e.class, "1")) {
             return;
          }
       }
       p4 = p4 - p2;
       Object[] objArray1 = new Object[0];
       a.b().s("ShareCopyWritingListFg", "onCreateTipsHelper: height="+p4, objArray1);
       RecyclerFragment s = this.b.s;
       s = (s != null)? s.getStateView(): null;
       if (s instanceof KwaiEmptyStateView && !s.getVisibility()) {
          View view = s.findViewById(R.id.iv_empty_icon);
          if (p4 < a1.d(0x7f0702e5)) {
             if (view != null) {
                layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams instanceof LinearLayout$LayoutParams) {
                   layoutParams.bottomMargin = 0;
                }
             }
             s.f();
          }else if(view != null){
             layoutParams = view.getLayoutParams();
             if (layoutParams != null && layoutParams instanceof LinearLayout$LayoutParams) {
                layoutParams.bottomMargin = a1.d(0x7f0702a4);
             }
          }
          s.i(R.drawable.arg_RES_7f0805f4);
       }
       return;
    }
}
