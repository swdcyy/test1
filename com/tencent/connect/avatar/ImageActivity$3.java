package com.tencent.connect.avatar.ImageActivity$3;
import android.view.View$OnClickListener;
import com.tencent.connect.avatar.ImageActivity;
import java.lang.Object;
import android.view.View;
import java.lang.System;
import java.lang.String;
import android.app.Activity;

public class ImageActivity$3 implements View$OnClickListener	// class@000e31
{
    public final ImageActivity a;

    public void ImageActivity$3(ImageActivity p0){
       this.a = p0;
       super();
    }
    public void onClick(View p0){
       this.a.a("10656", (System.currentTimeMillis() - ImageActivity.i(this.a)));
       this.a.setResult(0);
       ImageActivity.j(this.a);
    }
}
