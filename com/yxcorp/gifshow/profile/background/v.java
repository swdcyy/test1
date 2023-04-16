package com.yxcorp.gifshow.profile.background.v;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.y;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class v extends Accessor	// class@001291
{
    public final ProfileBackgroundVideoPreviewSelectFragment$a c;
    public final y d;

    public void v(y p0,ProfileBackgroundVideoPreviewSelectFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.j);
    }
}
