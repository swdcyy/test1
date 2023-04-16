package com.kuaishou.live.core.show.test.w;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.view.WindowManager;
import android.view.WindowManager$LayoutParams;
import android.os.Build$VERSION;
import android.widget.TextView;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.text.SimpleDateFormat;
import java.lang.System;
import java.util.Date;
import java.lang.CharSequence;
import il2.b;
import java.lang.Runnable;

public class w	// class@0011c9
{
    public WindowManager a;
    public WindowManager$LayoutParams b;
    public final TextView c;
    public boolean d;
    public static final Handler e;

    static {
       w.e = new Handler(Looper.getMainLooper());
    }
    public void w(Context p0){
       super();
       this.a = p0.getSystemService("window");
       WindowManager$LayoutParams layoutParams = new WindowManager$LayoutParams();
       this.b = layoutParams;
       layoutParams.type = (Build$VERSION.SDK_INT >= 26)? 2038: 2002;
       layoutParams.format = 1;
       layoutParams.gravity = 51;
       layoutParams.flags = 40;
       layoutParams.width = 500;
       layoutParams.height = 100;
       layoutParams.x = 500;
       layoutParams.y = 300;
       TextView textView = new TextView(p0);
       this.c = textView;
       textView.setBackgroundResource(R.color.arg_RES_7f0601cb);
       textView.setTextColor(p0.getResources().getColor(R.color.arg_RES_7f060142));
       textView.setTextSize(20.00f);
       this.a.addView(textView, this.b);
       this.b(textView);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, w.class, "2")) {
          return;
       }
       this.d = true;
       this.a.removeView(this.c);
       return;
    }
    public void b(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       System.currentTimeMillis();
       p0.setText(new SimpleDateFormat("HH:mm:ss SSS").format(new Date(System.currentTimeMillis())));
       if (this.d == null) {
          w.e.postDelayed(new b(this, p0), 10);
       }
       return;
    }
}
