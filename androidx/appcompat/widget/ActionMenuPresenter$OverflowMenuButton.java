package androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton;
import androidx.appcompat.widget.ActionMenuView$a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ActionMenuPresenter;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.view.View;
import w0.y;
import androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$a;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import java.lang.Math;
import androidx.core.graphics.drawable.a;

public class ActionMenuPresenter$OverflowMenuButton extends AppCompatImageView implements ActionMenuView$a	// class@0005c7
{
    public final ActionMenuPresenter d;

    public void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter p0,Context p1){
       this.d = p0;
       super(p1, null, 0x7f0400f0);
       this.setClickable(true);
       this.setFocusable(true);
       this.setVisibility(0);
       this.setEnabled(true);
       y.a(this, this.getContentDescription());
       this.setOnTouchListener(new ActionMenuPresenter$OverflowMenuButton$a(this, this, p0));
    }
    public boolean b(){
       return false;
    }
    public boolean g(){
       return false;
    }
    public boolean performClick(){
       if (super.performClick()) {
          return true;
       }
       this.playSoundEffect(0);
       this.d.G();
       return true;
    }
    public boolean setFrame(int p0,int p1,int p2,int p3){
       boolean b = super.setFrame(p0, p1, p2, p3);
       Drawable background = this.getBackground();
       if (this.getDrawable() != null && background != null) {
          p1 = this.getWidth();
          p3 = this.getHeight();
          int i = Math.max(p1, p3) / 2;
          p1 = (p1 + (this.getPaddingLeft() - this.getPaddingRight())) / 2;
          p3 = (p3 + (this.getPaddingTop() - this.getPaddingBottom())) / 2;
          int i1 = p1 - i;
          int i2 = p3 - i;
          a.l(background, i1, i2, (p1 + i), (p3 + i));
       }
       return b;
    }
}
