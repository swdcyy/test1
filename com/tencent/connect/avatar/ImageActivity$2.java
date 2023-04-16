package com.tencent.connect.avatar.ImageActivity$2;
import android.view.View$OnClickListener;
import com.tencent.connect.avatar.ImageActivity;
import java.lang.Object;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Button;
import android.graphics.Color;
import java.lang.Thread;
import com.tencent.connect.avatar.ImageActivity$2$1;
import java.lang.Runnable;
import java.lang.String;
import java.lang.System;
import com.tencent.connect.avatar.c;

public class ImageActivity$2 implements View$OnClickListener	// class@000e30
{
    public final ImageActivity a;

    public void ImageActivity$2(ImageActivity p0){
       this.a = p0;
       super();
    }
    public void onClick(View p0){
       ImageActivity.d(this.a).setVisibility(0);
       ImageActivity.e(this.a).setEnabled(0);
       ImageActivity.e(this.a).setTextColor(Color.rgb(21, 21, 21));
       ImageActivity.f(this.a).setEnabled(0);
       ImageActivity.f(this.a).setTextColor(Color.rgb(36, 94, 134));
       new Thread(new ImageActivity$2$1(this)).start();
       if (ImageActivity.h(this.a)) {
          this.a.a("10657", 0);
       }else {
          this.a.a("10655", (System.currentTimeMillis() - ImageActivity.i(this.a)));
          if (ImageActivity.c(this.a).b != null) {
             this.a.a("10654", 0);
          }
       }
       return;
    }
}
