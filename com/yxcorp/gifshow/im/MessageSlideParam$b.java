package com.yxcorp.gifshow.im.MessageSlideParam$b;
import java.lang.Object;
import com.yxcorp.gifshow.im.MessageSlideParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.im.MessageSlideParam$a;

public class MessageSlideParam$b	// class@00191d
{
    public String a;
    public int b;
    public String c;
    public boolean d;
    public boolean e;

    public void MessageSlideParam$b(){
       super();
    }
    public MessageSlideParam a(){
       Object obj = PatchProxy.apply(null, this, MessageSlideParam$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MessageSlideParam(this, null);
    }
    public MessageSlideParam$b b(boolean p0){
       this.e = p0;
       return this;
    }
    public MessageSlideParam$b c(boolean p0){
       this.d = p0;
       return this;
    }
    public MessageSlideParam$b d(String p0){
       this.a = p0;
       return this;
    }
    public MessageSlideParam$b e(String p0){
       this.c = p0;
       return this;
    }
    public MessageSlideParam$b f(int p0){
       this.b = p0;
       return this;
    }
}
