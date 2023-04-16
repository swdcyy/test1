package com.tencent.connect.avatar.ImageActivity$a;
import android.view.View;
import com.tencent.connect.avatar.ImageActivity;
import android.content.Context;
import android.widget.Button;
import android.graphics.drawable.StateListDrawable;
import java.lang.String;
import android.graphics.drawable.Drawable;

public class ImageActivity$a extends View	// class@000e37
{
    public final ImageActivity a;

    public void ImageActivity$a(ImageActivity p0,Context p1){
       this.a = p0;
       super(p1);
    }
    public void a(Button p0){
       StateListDrawable stateListDra = new StateListDrawable();
       Drawable uDrawable = ImageActivity.a(this.a, "com.tencent.plus.blue_normal.png");
       stateListDra.addState(View.PRESSED_ENABLED_STATE_SET, ImageActivity.a(this.a, "com.tencent.plus.blue_down.png"));
       stateListDra.addState(View.ENABLED_FOCUSED_STATE_SET, uDrawable);
       stateListDra.addState(View.ENABLED_STATE_SET, uDrawable);
       stateListDra.addState(View.FOCUSED_STATE_SET, uDrawable);
       stateListDra.addState(View.EMPTY_STATE_SET, ImageActivity.a(this.a, "com.tencent.plus.blue_disable.png"));
       p0.setBackgroundDrawable(stateListDra);
    }
    public void b(Button p0){
       StateListDrawable stateListDra = new StateListDrawable();
       Drawable uDrawable = ImageActivity.a(this.a, "com.tencent.plus.gray_normal.png");
       stateListDra.addState(View.PRESSED_ENABLED_STATE_SET, ImageActivity.a(this.a, "com.tencent.plus.gray_down.png"));
       stateListDra.addState(View.ENABLED_FOCUSED_STATE_SET, uDrawable);
       stateListDra.addState(View.ENABLED_STATE_SET, uDrawable);
       stateListDra.addState(View.FOCUSED_STATE_SET, uDrawable);
       stateListDra.addState(View.EMPTY_STATE_SET, ImageActivity.a(this.a, "com.tencent.plus.gray_disable.png"));
       p0.setBackgroundDrawable(stateListDra);
    }
}
