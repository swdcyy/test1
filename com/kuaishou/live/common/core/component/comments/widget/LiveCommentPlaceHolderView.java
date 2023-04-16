package com.kuaishou.live.common.core.component.comments.widget.LiveCommentPlaceHolderView;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.view.View;
import java.lang.Boolean;
import android.view.View$MeasureSpec;
import androidx.appcompat.widget.AppCompatTextView;

public class LiveCommentPlaceHolderView extends SizeAdjustableTextView	// class@0010d4
{

    public void LiveCommentPlaceHolderView(Context p0){
       super(p0);
    }
    public void LiveCommentPlaceHolderView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveCommentPlaceHolderView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void layout(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveCommentPlaceHolderView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveCommentPlaceHolderView.class, "2")) {
          return;
       }
       KwaiSizeAdjustableTextView tp = this.p;
       if (tp > null && (p2 - p0) > tp) {
          p2 = p0 + tp;
       }
       super.layout(p0, p1, p2, p3);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveCommentPlaceHolderView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveCommentPlaceHolderView.class, "3")) {
             return;
          }
       }
       KwaiSizeAdjustableTextView tp = this.p;
       if (tp > null && (p3 - p1) > tp) {
          p3 = p1 + tp;
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveCommentPlaceHolderView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveCommentPlaceHolderView.class, "1")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p0);
       KwaiSizeAdjustableTextView tp = this.p;
       if (tp > null && size > tp) {
          p0 = View$MeasureSpec.makeMeasureSpec(tp, 0x40000000);
       }
       super.onMeasure(p0, p1);
       return;
    }
}
