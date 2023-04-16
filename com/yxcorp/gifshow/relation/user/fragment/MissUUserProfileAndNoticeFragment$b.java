package com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$b;
import com.yxcorp.gifshow.fragment.e;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.LinearLayout;
import qvb.i;
import qvb.n0;
import android.widget.TextView;
import com.yxcorp.gifshow.relation.user.model.MissUResponse;
import lnc.a1;
import java.lang.CharSequence;
import java.util.List;

public class MissUUserProfileAndNoticeFragment$b extends e	// class@0019ff
{
    public FrameLayout i;
    public TextView j;
    public final MissUUserProfileAndNoticeFragment k;

    public void MissUUserProfileAndNoticeFragment$b(MissUUserProfileAndNoticeFragment p0,RecyclerFragment p1){
       this.k = p0;
       super(p1);
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, MissUUserProfileAndNoticeFragment$b.class, "2")) {
          return;
       }
       MissUUserProfileAndNoticeFragment$b ti = this.i;
       if (ti != null) {
          ti.setVisibility(8);
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, MissUUserProfileAndNoticeFragment$b.class, "1")) {
          return;
       }
       int i = 8;
       if (this.i == null) {
          FrameLayout uFrameLayout = a.i(this.a, R.layout.arg_RES_7f0d0fca);
          this.i = uFrameLayout;
          uFrameLayout.setVisibility(i);
          this.e.addView(this.i);
          this.f.setPadding(0, 0, 0, 0);
          this.e.setPadding(0, 0, 0, 0);
       }
       i oi = this.d.q();
       if (oi instanceof n0 && (oi.K() && !oi.hasMore())) {
          this.i.setVisibility(i);
       }else if(this.k.K != null){
          TextView textView = this.i.findViewById(R.id.missu_all_count_text);
          this.j = textView;
          MissUUserProfileAndNoticeFragment$b tk = this.k;
          textView.setText(a1.r(R.string.arg_RES_7f103648, tk.Ph(tk.K.mTotalCount)));
          MissUResponse mMaterialLis = this.k.K.mMaterialList;
          if (mMaterialLis != null && (!mMaterialLis.size() || this.k.K.mTotalCount > 3)) {
             this.j.setPadding(0, a1.e(20.00f), 0, a1.e(88.00f));
          }
          this.i.setVisibility(0);
       }
       return;
    }
}
