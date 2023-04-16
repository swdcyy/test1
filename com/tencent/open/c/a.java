package com.tencent.open.c.a;
import android.widget.RelativeLayout;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.graphics.Rect;
import com.tencent.open.c.a$a;
import android.view.View$MeasureSpec;
import android.app.Activity;
import android.view.Window;
import android.view.View;
import android.view.WindowManager;
import android.view.Display;
import java.lang.Math;

public class a extends RelativeLayout	// class@000f59
{
    public Rect b;
    public boolean c;
    public a$a d;
    public static final String a;

    static {
       a.a = a.class.getName();
    }
    public void a(Context p0){
       super(p0);
       this.b = null;
       this.c = false;
       this.d = null;
       this.b = new Rect();
    }
    public void a(a$a p0){
       this.d = p0;
    }
    public void onMeasure(int p0,int p1){
       int size = View$MeasureSpec.getSize(p1);
       Activity context = this.getContext();
       context.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.b);
       int i = (context.getWindowManager().getDefaultDisplay().getHeight() - this.b.top) - size;
       a td = this.d;
       if (td != null && size) {
          if (i > 100) {
             td.a(((Math.abs(this.b.height()) - this.getPaddingBottom()) - this.getPaddingTop()));
          }else {
             td.a();
          }
       }
       super.onMeasure(p0, p1);
       return;
    }
}
