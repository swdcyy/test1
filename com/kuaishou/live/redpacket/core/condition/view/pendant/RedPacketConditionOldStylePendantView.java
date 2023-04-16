package com.kuaishou.live.redpacket.core.condition.view.pendant.RedPacketConditionOldStylePendantView;
import eo3.o;
import nm3.a;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleOwner;
import yh3.a;
import kn3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.lifecycle.LiveData;
import go3.e;
import android.widget.TextView;
import xh3.g;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import eo3.p;
import android.view.View$OnClickListener;

public class RedPacketConditionOldStylePendantView extends RelativeLayout implements o, a	// class@000ed2
{
    public KwaiImageView b;
    public KwaiImageView c;
    public LiveMediumTextView d;

    public void RedPacketConditionOldStylePendantView(Context p0){
       super(p0);
       this.c();
    }
    public void RedPacketConditionOldStylePendantView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c();
    }
    public void RedPacketConditionOldStylePendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c();
    }
    public void a(LifecycleOwner p0,a p1){
       this.b(p0, p1);
    }
    public void b(LifecycleOwner p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionOldStylePendantView.class, "3")) {
          return;
       }
       e.b(this.b, p0, p1.l);
       e.b(this.c, p0, p1.m);
       g.a(this.d, p0, p1.n);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionOldStylePendantView.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       a.k(this, R.layout.arg_RES_7f0d0d98, true);
       this.b = this.findViewById(0x7f0a24ea);
       this.c = this.findViewById(0x7f0a1b9f);
       this.d = this.findViewById(0x7f0a09a3);
       return;
    }
    public void release(){
    }
    public void setPendantViewClickAction(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketConditionOldStylePendantView.class, "2")) {
          return;
       }
       this.setOnClickListener(p0);
       return;
    }
}
