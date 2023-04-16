package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdTextView;
import zq5.a;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenTextItem;
import java.lang.CharSequence;
import zsd.u;
import z12.x;
import java.lang.Number;
import android.graphics.Color;
import android.text.TextUtils$TruncateAt;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenSegmentItem;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import lnc.a1;
import nf1.c;
import java.lang.Integer;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class LiveFloatingScreenStdTextView extends TextView implements a	// class@000b18
{
    public HashMap b;

    public void LiveFloatingScreenStdTextView(Context p0){
       super(p0, null);
    }
    public void LiveFloatingScreenStdTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFloatingScreenStdTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final void a(LiveFloatingScreenBaseItemData p0){
       CharSequence uCharSequenc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenStdTextView.class, "1")) {
          return;
       }
       if (p0 != null) {
          List list = null;
          if (p0 instanceof LiveFloatingScreenTextItem) {
             this.setText(p0.getText());
             if (u.S1(p0.getTextColorStr()) ^ 1) {
                String textColorStr = p0.getTextColorStr();
                Object obj = PatchProxy.applyOneRefs(textColorStr, list, x.class, "25");
                int i = (obj != patchProxyRe)? obj.intValue(): Color.parseColor(textColorStr);
             label_0046 :
                this.setTextColor(i);
             }else if(p0.getTextColor()){
                this.setTextColor(p0.getTextColor());
             }
             if (p0.getTextSize()) {
                this.setTextSize(2, (float)p0.getTextSize());
             }
             this.setEllipsize(TextUtils$TruncateAt.END);
             this.setSingleLine();
             this.setMaxLines(1);
          }else if(p0 instanceof LiveFloatingScreenSegmentItem){
             UserStateRichTextSegment[] segment = p0.getSegment();
             int i1 = (!p0.getSegmentHeight())? a1.d(R.dimen.arg_RES_7f070a33): p0.getSegmentHeight();
             int i2 = a1.d(R.dimen.arg_RES_7f07031b);
             if (PatchProxy.isSupport(c.class)) {
                uCharSequenc = PatchProxy.applyThreeRefs(segment, Integer.valueOf(i1), Integer.valueOf(i2), null, c.class, "3");
                if (uCharSequenc != patchProxyRe) {
                label_00be :
                   this.setText(uCharSequenc);
                }
             }
             if (segment != null) {
                list = ArraysKt___ArraysKt.uy(segment);
             }
             uCharSequenc = c.f(list, i1, i2);
             goto label_00be ;
          }
          ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = -2;
             layoutParams.width = -2;
          }else {
             layoutParams = new ViewGroup$MarginLayoutParams(-2, -2);
          }
          this.setLayoutParams(layoutParams);
       }
       return;
    }
    public void h(){
    }
    public void l(){
    }
}
