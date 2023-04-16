package com.yxcorp.gifshow.profile.background.w;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.y;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment$a;
import java.lang.Object;
import java.lang.Long;

public class w extends Accessor	// class@001292
{
    public final ProfileBackgroundVideoPreviewSelectFragment$a c;
    public final y d;

    public void w(y p0,ProfileBackgroundVideoPreviewSelectFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Long.valueOf(this.c.e);
    }
}
