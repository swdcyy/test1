package com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kw1.e;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import bld.b;
import d61.k;
import kw1.b;
import android.graphics.drawable.GradientDrawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.h;
import android.widget.TextView;
import java.util.List;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView$b;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView$a;
import java.util.Objects;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import rr2.k;
import com.kuaishou.live.core.basic.widget.LiveTextView;
import android.widget.LinearLayout;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView$c;

public class VoicePartyCrossRoomPkAnchorAndTopContributorView extends FrameLayout	// class@001488
{
    public View b;
    public KwaiImageView c;
    public KwaiImageView d;
    public LiveUserView e;
    public LiveUserView f;
    public LiveTextView g;
    public LiveTextView h;
    public final SparseArray i;
    public final SparseArray j;
    public VoicePartyCrossRoomPkAnchorAndTopContributorView$c k;
    public static final int l;
    public static final int m;

    static {
       VoicePartyCrossRoomPkAnchorAndTopContributorView.l = a1.e(23.00f);
       VoicePartyCrossRoomPkAnchorAndTopContributorView.m = a1.e(6.00f);
    }
    public void VoicePartyCrossRoomPkAnchorAndTopContributorView(Context p0){
       super(p0, null);
    }
    public void VoicePartyCrossRoomPkAnchorAndTopContributorView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyCrossRoomPkAnchorAndTopContributorView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = new SparseArray();
       this.j = new SparseArray();
       a.c(p0, R.layout.arg_RES_7f0d0e46, this);
    }
    public final String a(boolean p0){
       String str = (p0)? "我方": "对方";
       return str;
    }
    public final void b(){
       int l;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyCrossRoomPkAnchorAndTopContributorView.class, "8")) {
          return;
       }
       VoicePartyCrossRoomPkAnchorAndTopContributorView tb = this.b;
       e uoe = e.class;
       int i = 0;
       if (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidTwoRefs(tb, Boolean.FALSE, objArray, uoe, "1") && tb != null)) {
          Drawable uDrawable1 = PatchProxy.apply(objArray, objArray, uoe, "2");
          if (uDrawable1 != PatchProxyResult.class) {
          }else {
             b uob = new b();
             uob.l(b.d("live_pk_mvp_container_background_start_color", k.b("#66CD5500")), b.d("live_pk_mvp_container_background_end_color", k.b("#661E69FF")));
             uob.j(i);
             uDrawable1 = uob.a();
          }
          tb.setBackground(uDrawable1);
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       float[] uofloatArray = new float[]{0,0,(float)l,(float)l,(float)l,(float)l,0,0};
       l = VoicePartyCrossRoomPkAnchorAndTopContributorView.l;
       gradientDraw.setCornerRadii(uofloatArray);
       gradientDraw.setColor(b.d("pk_mvp_container_left_anchor_bg_color", a1.a(R.color.arg_RES_7f060441)));
       this.c.setImageDrawable(gradientDraw);
       gradientDraw = new GradientDrawable();
       float[] uofloatArray1 = new float[]{(float)l,(float)l,0,0,0,0,(float)l,(float)l};
       gradientDraw.setCornerRadii(uofloatArray1);
       gradientDraw.setColor(b.d("pk_mvp_container_right_anchor_bg_color", a1.a(R.color.arg_RES_7f06025a)));
       this.d.setImageDrawable(gradientDraw);
       Drawable uDrawable = h.a(VoicePartyCrossRoomPkAnchorAndTopContributorView.m, a1.a(R.color.arg_RES_7f06060a));
       this.g.setBackground(uDrawable);
       this.h.setBackground(uDrawable);
       this.g.setTextColor(b.d("pk_mvp_container_left_anchor_bg_color", a1.a(R.color.arg_RES_7f060441)));
       this.h.setTextColor(b.d("pk_mvp_container_right_anchor_bg_color", a1.a(R.color.arg_RES_7f06025a)));
       return;
    }
    public final void c(SparseArray p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyCrossRoomPkAnchorAndTopContributorView.class, "3")) {
          return;
       }
       int i = 0;
       while (i < 3) {
          Object[] objArray = null;
          UserInfo userInfo = (p1.size() > i)? p1.get(i): objArray;
          VoicePartyCrossRoomPkAnchorAndTopContributorView$b uob = p0.get(i);
          VoicePartyCrossRoomPkAnchorAndTopContributorView$a uoa = new VoicePartyCrossRoomPkAnchorAndTopContributorView$a(this, userInfo);
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidTwoRefs(userInfo, uoa, uob, VoicePartyCrossRoomPkAnchorAndTopContributorView$b.class, "1")) {
             uob.a.setOnClickListener(uoa);
             if (userInfo == null) {
                uoa = 8;
                if (uob.f != null) {
                   if (!PatchProxy.applyVoid(objArray, uob, VoicePartyCrossRoomPkAnchorAndTopContributorView$b.class, "3")) {
                      uob.c.setVisibility(uoa);
                      uob.a();
                      uob.b.setTag(objArray);
                   }
                }else {
                   uob.a.setVisibility(uoa);
                   uob.b.setTag(objArray);
                }
             }else {
                uob.c.setVisibility(0);
                uob.a.setVisibility(0);
                k.a(uob.b, userInfo);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyCrossRoomPkAnchorAndTopContributorView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, VoicePartyCrossRoomPkAnchorAndTopContributorView.class, "7")) {
          this.b = this.findViewById(0x7f0a2742);
          this.c = this.findViewById(0x7f0a2755);
          this.d = this.findViewById(0x7f0a2749);
          this.e = this.findViewById(0x7f0a2757);
          this.f = this.findViewById(0x7f0a274b);
          this.g = this.findViewById(0x7f0a2756);
          this.h = this.findViewById(0x7f0a274a);
       }
       this.b();
       if (!PatchProxy.applyVoid(objArray, this, VoicePartyCrossRoomPkAnchorAndTopContributorView.class, "2")) {
          LinearLayout linearLayout = this.findViewById(R.id.live_voice_party_cross_room_team_pk_yellow_team_contributors_container);
          LinearLayout linearLayout1 = this.findViewById(R.id.live_voice_party_cross_room_team_pk_blue_team_contributors_container);
          for (int i = 0; i < 3; i = i + 1) {
             VoicePartyCrossRoomPkAnchorAndTopContributorView ti = this.i;
             boolean b = true;
             boolean b1 = (!i)? true: false;
             ti.put(i, new VoicePartyCrossRoomPkAnchorAndTopContributorView$b(linearLayout, i, b, b1));
             ti = this.j;
             int i1 = i - 3;
             i1 = i1 - b;
             if (i != 2) {
                b = false;
             }
             ti.put(i1, new VoicePartyCrossRoomPkAnchorAndTopContributorView$b(linearLayout1, i1, false, b));
          }
       }
       return;
    }
    public void setOnClickListener(VoicePartyCrossRoomPkAnchorAndTopContributorView$c p0){
       this.k = p0;
    }
}
