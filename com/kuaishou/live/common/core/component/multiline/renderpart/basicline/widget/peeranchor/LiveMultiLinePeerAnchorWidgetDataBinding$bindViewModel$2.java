package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.peeranchor.LiveMultiLinePeerAnchorWidgetDataBinding$bindViewModel$2;
import msd.q;
import kotlin.jvm.internal.Lambda;
import android.widget.TextView;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;

public final class LiveMultiLinePeerAnchorWidgetDataBinding$bindViewModel$2 extends Lambda implements q	// class@00155b
{
    public final TextView $peerNameTextView;

    public void LiveMultiLinePeerAnchorWidgetDataBinding$bindViewModel$2(TextView p0){
       this.$peerNameTextView = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2.intValue());
       return l1.a;
    }
    public final void invoke(String p0,Boolean p1,int p2){
       if (PatchProxy.isSupport(LiveMultiLinePeerAnchorWidgetDataBinding$bindViewModel$2.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveMultiLinePeerAnchorWidgetDataBinding$bindViewModel$2.class, "1")) {
          return;
       }
       this.$peerNameTextView.setText(p0);
       return;
    }
}
