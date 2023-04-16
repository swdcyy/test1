package com.kuaishou.android.post.SimpleEditParam$a;
import java.lang.Object;
import com.kuaishou.android.post.SimpleEditParam$SocialParam;
import java.lang.Integer;
import java.lang.String;

public class SimpleEditParam$a	// class@000ea9
{
    public String a;
    public String b;
    public SimpleEditParam$SocialParam c;

    public void SimpleEditParam$a(){
       super();
       this.a = "SOCIAL_TIETIE_PICTURE";
       this.b = "CAMERA_SOURCE";
       this.c = new SimpleEditParam$SocialParam(false, null, null);
    }
    public SimpleEditParam$a a(SimpleEditParam$SocialParam p0){
       this.c = p0;
       return this;
    }
    public SimpleEditParam$a b(String p0){
       this.b = p0;
       return this;
    }
    public SimpleEditParam$a c(String p0){
       this.a = p0;
       return this;
    }
}
