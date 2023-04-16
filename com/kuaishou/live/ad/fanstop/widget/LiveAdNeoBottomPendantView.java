package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoBottomPendantView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$Label;
import java.lang.CharSequence;
import android.view.View;

public final class LiveAdNeoBottomPendantView extends FrameLayout implements d	// class@0009c6
{
    public TextView b;
    public TextView c;
    public ViewGroup d;
    public TextView e;
    public TextView f;
    public ViewGroup g;
    public TextView h;
    public TextView i;
    public HashMap j;

    public void LiveAdNeoBottomPendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveAdNeoBottomPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveAdNeoBottomPendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void LiveAdNeoBottomPendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(ViewGroup p0,TextView p1,TextView p2,NeoLiveBottomPendantInfo p3,int p4){
       NeoLiveBottomPendantInfo$Label label;
       if (PatchProxy.isSupport(LiveAdNeoBottomPendantView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveAdNeoBottomPendantView.class, "4")) {
             return;
          }
       }
       if (p3 != null) {
          p3 = p3.mLabels;
          if (p3 != null) {
             label = CollectionsKt___CollectionsKt.F2(p3, p4);
          label_0037 :
             if (label != null) {
                p0.setVisibility(0);
                NeoLiveBottomPendantInfo$Label mTip = label.mTip;
                String str = "";
                if (mTip == null) {
                   mTip = str;
                }
                p1.setText(mTip);
                mTip = label.mMsg;
                if (mTip != null) {
                   str = mTip;
                }
                p2.setText(str);
             }else {
                p0.setVisibility(8);
             }
             return;
          }
       }
       label = null;
       goto label_0037 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoBottomPendantView.class, "2")) {
          return;
       }
       p0 = this.findViewById(R.id.title);
       a.o(p0, "findViewById\(R.id.title\)");
       this.b = p0;
       p0 = this.findViewById(R.id.action_bar);
       a.o(p0, "findViewById\(R.id.action_bar\)");
       this.c = p0;
       p0 = this.findViewById(R.id.label1);
       a.o(p0, "findViewById\(R.id.label1\)");
       this.d = p0;
       p0 = this.findViewById(R.id.tip1);
       a.o(p0, "findViewById\(R.id.tip1\)");
       this.e = p0;
       p0 = this.findViewById(R.id.msg1);
       a.o(p0, "findViewById\(R.id.msg1\)");
       this.f = p0;
       p0 = this.findViewById(R.id.label2);
       a.o(p0, "findViewById\(R.id.label2\)");
       this.g = p0;
       p0 = this.findViewById(R.id.tip2);
       a.o(p0, "findViewById\(R.id.tip2\)");
       this.h = p0;
       p0 = this.findViewById(R.id.msg2);
       a.o(p0, "findViewById\(R.id.msg2\)");
       this.i = p0;
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveAdNeoBottomPendantView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public final void setData(NeoLiveBottomPendantInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoBottomPendantView.class, "3")) {
          return;
       }
       LiveAdNeoBottomPendantView tb = this.b;
       if (tb == null) {
          a.S("titleView");
       }
       NeoLiveBottomPendantInfo neoLiveBotto = null;
       NeoLiveBottomPendantInfo mTitle = (p0 != null)? p0.mTitle: neoLiveBotto;
       String str = "";
       if (mTitle == null) {
          mTitle = str;
       }
       tb.setText(mTitle);
       tb = this.c;
       if (tb == null) {
          a.S("actionBarView");
       }
       if (p0 != null) {
          neoLiveBotto = p0.mActionBar;
       }
       if (neoLiveBotto != null) {
          str = neoLiveBotto;
       }
       tb.setText(str);
       LiveAdNeoBottomPendantView td = this.d;
       if (td == null) {
          a.S("labelLayout1");
       }
       LiveAdNeoBottomPendantView te = this.e;
       if (te == null) {
          a.S("labelTip1");
       }
       LiveAdNeoBottomPendantView tf = this.f;
       if (tf == null) {
          a.S("labelMsg1");
       }
       this.a(td, te, tf, p0, 0);
       td = this.g;
       if (td == null) {
          a.S("labelLayout2");
       }
       te = this.h;
       if (te == null) {
          a.S("labelTip2");
       }
       tf = this.i;
       if (tf == null) {
          a.S("labelMsg2");
       }
       this.a(td, te, tf, p0, 1);
       return;
    }
}
