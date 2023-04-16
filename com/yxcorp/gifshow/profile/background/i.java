package com.yxcorp.gifshow.profile.background.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.n;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewSelectFragment$a;
import java.lang.Object;
import java.lang.String;

public class i extends Accessor	// class@001248
{
    public final ProfileBackgroundImagePreviewSelectFragment$a c;
    public final n d;

    public void i(n p0,ProfileBackgroundImagePreviewSelectFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.g;
    }
    public void set(Object p0){
       this.c.g = p0;
    }
}
