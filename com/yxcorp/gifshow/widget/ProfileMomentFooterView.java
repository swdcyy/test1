package com.yxcorp.gifshow.widget.ProfileMomentFooterView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import dx5.g;

public class ProfileMomentFooterView extends AppCompatTextView	// class@00189e
{
    public Rect f;
    public Rect g;
    public g h;

    public void ProfileMomentFooterView(Context p0){
       super(p0, null);
    }
    public void ProfileMomentFooterView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ProfileMomentFooterView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new Rect();
       this.g = new Rect(0, 0, n.y(p0), n.u(p0));
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileMomentFooterView.class, "1")) {
          return;
       }
       object oobject = this.getCompoundDrawables()[2];
       if (oobject != null) {
          p0.translate(((- ((float)this.getWidth() - ((this.getPaint().measureText(this.getText().toString()) + (float)oobject.getIntrinsicWidth()) + (float)this.getCompoundDrawablePadding()))) / 2.00f), 0);
       }
       super.onDraw(p0);
       if (!PatchProxy.applyVoid(null, this, ProfileMomentFooterView.class, "2")) {
          this.getGlobalVisibleRect(this.f);
          if (this.g.intersect(this.f)) {
             ProfileMomentFooterView th = this.h;
             if (th != null) {
                th.a();
             }
          }
       }
       return;
    }
    public void setShownListener(g p0){
       this.h = p0;
    }
}
