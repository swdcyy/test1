package com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView;
import java.util.ArrayList;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$f;
import java.util.Objects;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$d;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import no3.a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import bld.b;
import android.content.res.Resources;
import cw9.c;
import jo3.a;
import bld.c;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;

public class RedPacketPopupPrepareSharePolicyAreaView$c extends RecyclerView$Adapter	// class@000f1e
{
    public final List e;
    public final RedPacketPopupPrepareSharePolicyAreaView f;

    public void RedPacketPopupPrepareSharePolicyAreaView$c(RedPacketPopupPrepareSharePolicyAreaView p0){
       this.f = p0;
       super();
       this.e = new ArrayList();
    }
    public void RedPacketPopupPrepareSharePolicyAreaView$c(RedPacketPopupPrepareSharePolicyAreaView p0,RedPacketPopupPrepareSharePolicyAreaView$a p1){
       super(p0);
    }
    public int f0(int p0){
       RedPacketPopupPrepareSharePolicyAreaView$c uoc = RedPacketPopupPrepareSharePolicyAreaView$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if ((this.e.get(p0).b).isEmpty()) {
          return 0;
       }else {
          return 1;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, RedPacketPopupPrepareSharePolicyAreaView$c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       RedPacketPopupPrepareSharePolicyAreaView$b uob;
       RedPacketPopupPrepareSharePolicyAreaView$c uoc = RedPacketPopupPrepareSharePolicyAreaView$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       String str = "1";
       if (p0 instanceof RedPacketPopupPrepareSharePolicyAreaView$f) {
          uob = this.e.get(p1);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uob, p0, RedPacketPopupPrepareSharePolicyAreaView$f.class, str)) {
             p0.a.setText(uob.b);
          }
       }else {
          uob = this.e.get(p1);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uob, p0, RedPacketPopupPrepareSharePolicyAreaView$d.class, str)) {
             p0.a.p0(uob.a, HeadImageSize.ADJUST_SMALL, false);
             p0.a.setOnClickListener(new a(p0, uob));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RedPacketPopupPrepareSharePolicyAreaView$c uoc = RedPacketPopupPrepareSharePolicyAreaView$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (!p1) {
          return new RedPacketPopupPrepareSharePolicyAreaView$d(this.f, a.d(p0.getContext(), 0x7f0d09a6, p0, false));
       }else {
          Context context = p0.getContext();
          RedPacketPopupPrepareSharePolicyAreaView$f uof = PatchProxy.applyOneRefs(context, this, uoc, "6");
          if (uof != patchProxyRe) {
          }else {
             TextView textView = new TextView(context);
             textView.setLayoutParams(new RecyclerView$LayoutParams(a1.d(R.dimen.arg_RES_7f070d8c), a1.d(R.dimen.arg_RES_7f070d8c)));
             textView.setGravity(17);
             textView.setTextSize(false, (float)a1.d(R.dimen.arg_RES_7f070d8e));
             textView.setTextColor(a1.a(R.color.arg_RES_7f061d13));
             b uob = new b();
             uob.v(a1.a(R.color.arg_RES_7f061d3e));
             uob.w(a1.a(R.color.arg_RES_7f061d11));
             uob.x((float)c.b(a1.m(), R.dimen.arg_RES_7f070d8d));
             uob.g(new a((float)R.dimen.arg_RES_7f070d8b));
             uob.s(DrawableCreator$Shape.Rectangle);
             textView.setBackground(uob.a());
             uof = new RedPacketPopupPrepareSharePolicyAreaView$f(textView);
          }
          return uof;
       }
    }
}
