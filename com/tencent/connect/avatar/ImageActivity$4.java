package com.tencent.connect.avatar.ImageActivity$4;
import java.lang.Runnable;
import com.tencent.connect.avatar.ImageActivity;
import java.lang.String;
import java.lang.Object;

public class ImageActivity$4 implements Runnable	// class@000e32
{
    public final String a;
    public final int b;
    public final ImageActivity c;

    public void ImageActivity$4(ImageActivity p0,String p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       ImageActivity.a(this.c, this.a, this.b);
    }
}
