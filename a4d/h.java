package a4d.h;
import android.view.View$OnTouchListener;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.app.Activity;
import java.lang.Math;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;

public final class h implements View$OnTouchListener	// class@00008b
{
    public final EmotionFloatEditorFragment b;

    public void h(EmotionFloatEditorFragment p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       h tb = this.b;
       if (tb.getActivity() != null) {
          p1.setLocation(p1.getRawX(), p1.getRawY());
          if (tb.M.mInterceptEvents == null) {
             tb.getActivity().dispatchTouchEvent(p1);
          }
       }
       float f = 0x3f000000;
       if (!p1.getActionMasked()) {
          tb.k1 = (int)(p1.getX() + f);
          tb.l1 = (int)(p1.getY() + f);
       }
       if (tb.M.mTouchCancel != null && (tb.S == null && (p1.getActionMasked() == 0.00f && Math.sqrt((Math.pow((double)(tb.k1 - (int)(p1.getX() + f)), 2.00f) + Math.pow((double)(tb.l1 - (int)(p1.getY() + f)), 2.00f))) - (double)tb.m1 > 0))) {
          tb.S = true;
          tb.cancel();
       }
    label_007b :
       if (p1.getActionMasked() == 1) {
          if (tb.R != null) {
             tb.R = false;
          }else if(tb.c2.isEnableAtFloatPanel() && tb.E1 != null){
             tb.Ki();
          }else {
             tb.cancel();
          }
       }
       return true;
    }
}
