package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketConditionPopupView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketConditionBasePopupView;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleOwner;
import yh3.a;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mo3.c;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import mo3.b;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import com.kuaishou.live.redpacket.core.ui.vm.a;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import eo3.w;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import mo3.a;
import android.view.ViewGroup;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketConditionPopupView$a;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$e;
import com.kuaishou.live.redpacket.core.ui.item.RedPacketPageItem;

public class RedPacketConditionPopupView extends RedPacketConditionBasePopupView	// class@000f00
{
    public RedPacketConditionPopupViewModel q;
    public RedPacketPageItem r;
    public RedPacketPageItem s;
    public RedPacketPageItem t;
    public static final int u;

    public void RedPacketConditionPopupView(Context p0){
       super(p0);
    }
    public void RedPacketConditionPopupView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RedPacketConditionPopupView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(LifecycleOwner p0,a p1){
       this.c(p0, p1);
    }
    public void c(LifecycleOwner p0,RedPacketConditionPopupViewModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionPopupView.class, "3")) {
          return;
       }
       this.q = p1;
       p1.m.observe(p0, new c(this));
       p1.l.observe(p0, new b(this));
       return;
    }
    public final void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketConditionPopupView.class, "9")) {
          return;
       }
       p0.u0().observe(this.h.k(), new a(this));
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       RedPacketConditionPopupView tq = this.q;
       if (tq != null) {
          tq.C0(new RedPacketConditionPopupView$a(this));
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupView.class, "10")) {
          return;
       }
       RedPacketConditionPopupView tr = this.r;
       if (tr != null) {
          tr.release();
       }
       tr = this.s;
       if (tr != null) {
          tr.release();
       }
       tr = this.t;
       if (tr != null) {
          tr.release();
       }
       return;
    }
}
