package com.google.android.material.chip.Chip$c;
import g2.a;
import com.google.android.material.chip.Chip;
import android.view.View;
import android.os.Bundle;
import b2.d;
import com.google.android.material.chip.a;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.os.Build$VERSION;
import android.content.Context;
import android.widget.CheckBox;
import java.lang.Object;
import android.text.TextUtils;
import android.graphics.Rect;
import b2.d$a;
import android.graphics.RectF;
import java.util.List;
import java.lang.Integer;

public class Chip$c extends a	// class@00166e
{
    public final Chip q;

    public void Chip$c(Chip p0,Chip p1){
       this.q = p0;
       super(p1);
    }
    public boolean F(int p0,int p1,Bundle p2){
       if (p1 == 16 && !p0) {
          return this.q.j();
       }
       return false;
    }
    public void G(d p0){
       Chip e = this.q.e;
       boolean b = (e != null && e.b0())? true: false;
       p0.Y(b);
       p0.a0(Chip.class.getName());
       CharSequence text = this.q.getText();
       if (Build$VERSION.SDK_INT >= 23) {
          p0.C0(text);
       }else {
          p0.e0(text);
       }
       return;
    }
    public void H(int p0,d p1){
       String str = "";
       if (this.q.g()) {
          CharSequence closeIconCon = this.q.getCloseIconContentDescription();
          if (closeIconCon != null) {
             p1.e0(closeIconCon);
          }else {
             closeIconCon = this.q.getText();
             Context context = this.q.getContext();
             Object[] objArray = new Object[1];
             if (!TextUtils.isEmpty(closeIconCon)) {
                str = closeIconCon;
             }
             objArray[0] = str;
             p1.e0((context.getString(R.string.arg_RES_7f1036ea, objArray)).trim());
          }
          p1.V(this.q.getCloseIconTouchBoundsInt());
          p1.b(d$a.i);
          p1.h0(this.q.isEnabled());
       }else {
          p1.e0(str);
          p1.V(Chip.r);
       }
       return;
    }
    public int x(float p0,float p1){
       int i = (this.q.g() && this.q.getCloseIconTouchBounds().contains(p0, p1))? 0: -1;
       return i;
    }
    public void y(List p0){
       if (this.q.g()) {
          p0.add(Integer.valueOf(0));
       }
       return;
    }
}
