package com.yxcorp.gifshow.camera.record.magic.sticker.StickerFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;

public class StickerFrameLayout extends FrameLayout	// class@000e59
{

    public void StickerFrameLayout(Context p0){
       super(p0);
    }
    public void StickerFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void StickerFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerFrameLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isEnabled() && super.dispatchTouchEvent(p0))? true: false;
       return b;
    }
}
