package com.tencent.connect.avatar.ImageActivity$6$1;
import java.lang.Runnable;
import com.tencent.connect.avatar.ImageActivity$6;
import java.lang.String;
import java.lang.Object;
import com.tencent.connect.avatar.ImageActivity;

public class ImageActivity$6$1 implements Runnable	// class@000e34
{
    public final String a;
    public final ImageActivity$6 b;

    public void ImageActivity$6$1(ImageActivity$6 p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       ImageActivity.b(this.b.a, this.a);
    }
}
