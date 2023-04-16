package com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserView$TopScoreUserListAnchor;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserItem;
import android.widget.FrameLayout;
import android.view.View;
import java.util.List;
import android.view.ViewParent;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import hc.b;
import com.kuaishou.live.common.core.component.pk.b;
import com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserItem$a;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkTopScoreUserDetailInfo;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;

public class LivePkMvpTopScoreUserView extends LinearLayout	// class@0016ac
{
    public KwaiImageView b;
    public List c;
    public LivePkMvpTopScoreUserView$TopScoreUserListAnchor d;

    public void LivePkMvpTopScoreUserView(Context p0){
       super(p0, null, 0);
    }
    public void LivePkMvpTopScoreUserView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkMvpTopScoreUserView(Context p0,AttributeSet p1,int p2){
       int i1;
       super(p0, p1, p2);
       this.c = new ArrayList();
       if (!PatchProxy.isSupport(LivePkMvpTopScoreUserView.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LivePkMvpTopScoreUserView.class, "1")) {
          int i = 0;
          if (!PatchProxy.isSupport(LivePkMvpTopScoreUserView.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LivePkMvpTopScoreUserView.class, "4")) {
             TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.H2);
             LivePkMvpTopScoreUserView$TopScoreUserListAnchor sELF = LivePkMvpTopScoreUserView$TopScoreUserListAnchor.SELF;
             this.d = (!typedArray.getInt(i, sELF.value))? sELF: LivePkMvpTopScoreUserView$TopScoreUserListAnchor.OPPONENT;
             typedArray.recycle();
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, LivePkMvpTopScoreUserView.class, "2")) {
             this.setOrientation(i);
             this.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
             if (this.d == LivePkMvpTopScoreUserView$TopScoreUserListAnchor.SELF) {
                this.a();
             }
             while (i < 3) {
                LivePkMvpTopScoreUserItem livePkMvpTop = new LivePkMvpTopScoreUserItem(p0);
                if (this.d == LivePkMvpTopScoreUserView$TopScoreUserListAnchor.SELF) {
                   i1 = i + 1;
                   livePkMvpTop.setRank(i1);
                }else {
                   i1 = i - 3;
                   livePkMvpTop.setRank(i1);
                }
                livePkMvpTop.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                this.addView(livePkMvpTop);
                this.c.add(livePkMvpTop);
                i = i + 1;
             }
             if (this.d == LivePkMvpTopScoreUserView$TopScoreUserListAnchor.OPPONENT) {
                this.a();
             }
          }
       }
    label_00af :
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LivePkMvpTopScoreUserView.class, "6")) {
          return;
       }
       LivePkMvpTopScoreUserView tb = this.b;
       if (tb != null && tb.getParent() == null) {
          this.addView(this.b);
          return;
       }else {
          this.b = new KwaiImageView(this.getContext());
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(a1.e(28.00f), a1.e(28.00f));
          layoutParams.gravity = 16;
          layoutParams.setMarginEnd(a1.e(7.00f));
          this.c();
          this.addView(this.b, layoutParams);
          return;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LivePkMvpTopScoreUserView.class, "7")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       LivePkMvpTopScoreUserView tb = this.b;
       if (tb != null) {
          tb.setVisibility(0);
          this.c();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LivePkMvpTopScoreUserView.class, "9")) {
          return;
       }
       LivePkMvpTopScoreUserView td = this.d;
       if (td == LivePkMvpTopScoreUserView$TopScoreUserListAnchor.SELF) {
          b.b(this.b, LivePkResource$PkSkinResource.LIVE_PK_RANK_SELF_EMPTY, null);
       }else if(td == LivePkMvpTopScoreUserView$TopScoreUserListAnchor.OPPONENT){
          b.b(this.b, LivePkResource$PkSkinResource.LIVE_PK_RANK_OPPONENT_EMPTY, null);
       }
       return;
    }
    public void setScoreUserItemClickListener(LivePkMvpTopScoreUserItem$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkMvpTopScoreUserView.class, "3")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().setLivePkMvpTopScoreUserItemClickListener(p0);
       }
       return;
    }
    public void setTopScoreUserData(LivePkMessages$PkTopScoreUserDetailInfo[] p0){
       LivePkMvpTopScoreUserItem livePkMvpTop;
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkMvpTopScoreUserView.class, "5")) {
          return;
       }
       if (j.h(p0)) {
          return;
       }
       LivePkMvpTopScoreUserView tb = this.b;
       if (tb != null) {
          tb.setVisibility(8);
       }
       int i = 0;
       while (i < 3) {
          LivePkMvpTopScoreUserView$TopScoreUserListAnchor sELF = LivePkMvpTopScoreUserView$TopScoreUserListAnchor.SELF;
          int i1 = 1;
          if (this.d == sELF) {
             livePkMvpTop = this.c.get(i);
          }else {
             i2 = i - 3;
             i2 = i2 - i1;
             livePkMvpTop = this.c.get(i2);
          }
          if (livePkMvpTop != null) {
             i2 = p0.length - i1;
             if (i > i2) {
                livePkMvpTop.a();
             }else if(p0[i] != null){
                UserInfo userInfo = UserInfo.convertFromProto(p0[i].userInfo);
                if (this.d != sELF) {
                   i1 = false;
                }
                livePkMvpTop.b(userInfo, i1);
             }
          }
          i = i + 1;
       }
       return;
    }
}
