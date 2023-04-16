package com.kuaishou.live.core.show.subscribe.plc.LiveHalfSubscribeDialogFragment;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import tkd.b;
import tkd.d;
import nl9.u;
import com.yxcorp.gifshow.entity.QPhoto;
import crd.b;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import zk2.b;
import android.view.View$OnClickListener;
import com.kwai.video.wayne.player.util.ViewUtil;
import lnc.a1;
import java.util.List;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo$LiveSubscribeStat;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import b61.b;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo$LivePersonLabel;
import com.kwai.framework.model.user.User;
import zk2.c;
import com.kuaishou.live.core.show.subscribe.plc.LiveHalfSubscribeDialogFragment$b;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import zk2.f;
import zk2.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.live.core.show.subscribe.plc.LiveSubscribeHalfDialogEvent;
import brd.t;
import eoc.e;
import brd.z;
import zk2.e;
import erd.g;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;

public class LiveHalfSubscribeDialogFragment extends LiveDialogContainerFragment	// class@001157
{
    public KwaiImageView A;
    public TextView B;
    public RelativeLayout C;
    public SelectShapeTextView D;
    public SelectShapeTextView E;
    public SelectShapeTextView F;
    public TextView G;
    public TextView H;
    public SelectShapeTextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public final List M;
    public LiveHalfSubscribeDialogFragment$b N;
    public LiveSubscribeStatInfo$LiveSubscribeStat O;
    public QPhoto P;
    public b Q;
    public boolean R;
    public KwaiImageView y;
    public RelativeLayout z;
    public static final int S;

    public void LiveHalfSubscribeDialogFragment(){
       super();
       this.M = new ArrayList();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveHalfSubscribeDialogFragment.class, "11");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0dee, p1, false);
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHalfSubscribeDialogFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       this.N = objArray;
       this.O = objArray;
       d.a(-1694791652).jD(this.P);
       LiveHalfSubscribeDialogFragment tQ = this.Q;
       if (tQ != null) {
          tQ.dispose();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i1;
       LiveHalfSubscribeDialogFragment tN;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHalfSubscribeDialogFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.N != null && this.O != null) {
          this.y = p0.findViewById(0x7f0a261f);
          this.z = p0.findViewById(0x7f0a2620);
          this.A = p0.findViewById(0x7f0a260b);
          this.B = p0.findViewById(0x7f0a260d);
          this.C = p0.findViewById(0x7f0a207d);
          this.D = p0.findViewById(0x7f0a1cba);
          this.E = p0.findViewById(0x7f0a253a);
          this.F = p0.findViewById(0x7f0a2697);
          this.G = p0.findViewById(0x7f0a2657);
          this.H = p0.findViewById(0x7f0a2655);
          this.J = p0.findViewById(0x7f0a2665);
          this.L = p0.findViewById(0x7f0a2664);
          this.I = p0.findViewById(0x7f0a1cde);
          this.K = p0.findViewById(0x7f0a2619);
          this.z.setOnClickListener(new b(this));
          int i = ((ViewUtil.getScreenWidth() - a1.d(0x7f070340)) - a1.d(0x7f070295)) / 2;
          this.I.setWidth(i);
          this.K.setWidth(i);
          this.M.add(this.D);
          this.M.add(this.E);
          this.M.add(this.F);
          if (!PatchProxy.applyVoid(null, this, LiveHalfSubscribeDialogFragment.class, "4")) {
             LiveHalfSubscribeDialogFragment tO = this.O;
             if (tO != null && this.N != null) {
                this.A.U(tO.mUserInfo.mHeadUrls);
                this.B.setText(b.c(this.O.mUserInfo));
                this.G.setText(this.O.mSubscribeTitle);
                this.H.setText(this.O.mStartTime+"直播");
                this.yh(this.O.mRawTotalCount);
                tO = this.O;
                LiveHalfSubscribeDialogFragment liveHalfSubs = null;
                if (!PatchProxy.applyVoidOneRefs(tO, this, LiveHalfSubscribeDialogFragment.class, "9")) {
                   i1 = 8;
                   if (q.f(tO.mLivePersonLabels)) {
                      this.C.setVisibility(i1);
                   }else {
                      this.C.setVisibility(liveHalfSubs);
                      int i2 = 0;
                      while (i2 < this.M.size()) {
                         TextView textView = this.M.get(i2);
                         if (i2 < tO.mLivePersonLabels.size()) {
                            textView.setText(tO.mLivePersonLabels.get(i2).mText);
                            textView.setVisibility(liveHalfSubs);
                         }else {
                            textView.setVisibility(i1);
                         }
                         i2++;
                      }
                   }
                }
                tO = this.N;
                i1 = 0x7f0607de;
                if (!PatchProxy.applyVoidOneRefs(tO, this, LiveHalfSubscribeDialogFragment.class, "5")) {
                   tN = this.P;
                   if (tN != null && tN.getUser().isFollowingOrFollowRequesting()) {
                      this.xh(true, "已关注", i1, R.drawable.arg_RES_7f080254);
                   }else {
                      this.xh(liveHalfSubs, "关注", R.color.arg_RES_7f0607c5, 0x7f080252);
                   }
                   this.I.setOnClickListener(new c(this, tO));
                }
                tO = this.O;
                tN = this.N;
                if (!PatchProxy.applyVoidTwoRefs(tO, tN, this, LiveHalfSubscribeDialogFragment.class, "7")) {
                   if (tO.mBookStatus == LiveSubscribeBookStatus.BOOKED) {
                      this.wh(this.K, "已预约", i1, R.drawable.arg_RES_7f080255);
                   }else {
                      this.wh(this.K, "立即预约", R.color.arg_RES_7f0607c6, 0x7f080253);
                      f.a(tO.mUserInfo.mId);
                   }
                   this.K.setOnClickListener(new d(this, tN));
                }
             }
          }
          this.Q = RxBus.f.f(LiveSubscribeHalfDialogEvent.class).observeOn(e.c).subscribe(new e(this));
          d.a(-1694791652).q60(this.P);
       }
       return;
    }
    public final void wh(TextView p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveHalfSubscribeDialogFragment.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, LiveHalfSubscribeDialogFragment.class, "8")) {
          return;
       }
       p0.setText(p1);
       p0.setTextColor(a1.a(p2));
       p0.setBackground(a1.f(p3));
       return;
    }
    public final void xh(boolean p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveHalfSubscribeDialogFragment.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, LiveHalfSubscribeDialogFragment.class, "6")) {
          return;
       }
       this.R = p0;
       this.wh(this.I, p1, p2, p3);
       return;
    }
    public final void yh(long p0){
       if (PatchProxy.isSupport(LiveHalfSubscribeDialogFragment.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveHalfSubscribeDialogFragment.class, "10")) {
          return;
       }
       if (p0 - null <= 0) {
          this.L.setVisibility(8);
          this.J.setVisibility(8);
       }else {
          this.L.setVisibility(0);
          this.J.setVisibility(0);
          this.L.setText(TextUtils.N(p0)+"人已预约");
       }
       return;
    }
    public final void zh(LiveSubscribeBookStatus p0){
       LiveHalfSubscribeDialogFragment tO = this.O;
       if (tO != null) {
          tO.mBookStatus = p0;
       }
       return;
    }
}
