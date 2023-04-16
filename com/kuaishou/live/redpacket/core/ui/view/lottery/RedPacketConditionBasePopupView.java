package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketConditionBasePopupView;
import eo3.q;
import nm3.a;
import android.widget.FrameLayout;
import java.util.HashMap;
import android.content.Context;
import android.util.AttributeSet;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import eo3.r;

public abstract class RedPacketConditionBasePopupView extends FrameLayout implements q, a	// class@000efe
{
    public a b;
    public a c;
    public a d;
    public FrameLayout e;
    public FrameLayout f;
    public FrameLayout g;
    public w h;
    public b i;
    public a j;
    public a k;
    public a l;
    public r m;
    public static final Map n;
    public static final Map o;
    public static final Map p;

    static {
       RedPacketConditionBasePopupView.n = new HashMap();
       RedPacketConditionBasePopupView.o = new HashMap();
       RedPacketConditionBasePopupView.p = new HashMap();
    }
    public void RedPacketConditionBasePopupView(Context p0){
       super(p0);
       this.b();
    }
    public void RedPacketConditionBasePopupView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b();
    }
    public void RedPacketConditionBasePopupView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b();
    }
    public static Map getPreparePageMap(){
       return RedPacketConditionBasePopupView.n;
    }
    public static Map getResultPageMap(){
       return RedPacketConditionBasePopupView.p;
    }
    public static Map getScrollPageMap(){
       return RedPacketConditionBasePopupView.o;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionBasePopupView.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       a.k(this, R.layout.arg_RES_7f0d0daf, true);
       this.e = this.findViewById(0x7f0a31b4);
       this.f = this.findViewById(0x7f0a374f);
       this.g = this.findViewById(0x7f0a35d9);
       return;
    }
    public r getDestroyListener(){
       return this.m;
    }
    public void setDestroyAction(r p0){
       this.m = p0;
    }
}
