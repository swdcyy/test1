package com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import java.util.Queue;
import android.widget.LinearLayout;
import com.kwai.framework.model.user.User;
import java.util.Iterator;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.content.Context;
import lnc.a1;
import zf6.k;
import java.lang.CharSequence;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;

public class MissUProfileAndNoticeAdapter$a extends PresenterV2	// class@0019e6
{
    public LinearLayout p;
    public User q;
    public final Queue r;

    public void MissUProfileAndNoticeAdapter$a(){
       super();
       this.r = new LinkedList();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MissUProfileAndNoticeAdapter$a.class, "3")) {
          return;
       }
       MissUProfileAndNoticeAdapter$a tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, MissUProfileAndNoticeAdapter$a.class, "5")) {
          for (int i = 0; i < tp.getChildCount(); i = i + 1) {
             this.r.offer(tp.getChildAt(i));
          }
       }
       this.p.removeAllViews();
       User mMissURelati = this.q.mMissURelation;
       if (mMissURelati == null) {
          return;
       }else {
          Iterator iterator = mMissURelati.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (str.isEmpty()) {
                continue ;
             }else {
                View view = PatchProxy.apply(null, this, MissUProfileAndNoticeAdapter$a.class, "6");
                if (view == PatchProxyResult.class) {
                   view = this.r.poll();
                }
                if (view == null) {
                   view = new TextView(this.getContext());
                   view.setTextColor(a1.a(R.color.arg_RES_7f061a4c));
                   view.setTextSize(2, 9.00f);
                   view.setIncludeFontPadding(false);
                   if (k.d()) {
                      view.setBackgroundResource(R.drawable.arg_RES_7f081844);
                   }else {
                      view.setBackgroundResource(R.drawable.arg_RES_7f081843);
                   }
                   view.setPadding(a1.e(4.00f), a1.e(0x3f800000), a1.e(4.00f), a1.e(0x3f800000));
                }
                view.setText(str);
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
                layoutParams.leftMargin = a1.e(6.00f);
                this.p.addView(view, layoutParams);
             }
          }
          return;
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, MissUProfileAndNoticeAdapter$a.class, "4")) {
          return;
       }
       this.r.clear();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MissUProfileAndNoticeAdapter$a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2b8d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MissUProfileAndNoticeAdapter$a.class, "1")) {
          return;
       }
       this.q = this.q8(User.class);
       return;
    }
}
