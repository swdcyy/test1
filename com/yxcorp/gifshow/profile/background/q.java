package com.yxcorp.gifshow.profile.background.q;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.y;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class q extends Accessor	// class@00128c
{
    public final ProfileBackgroundVideoPreviewSelectFragment$a c;
    public final y d;

    public void q(y p0,ProfileBackgroundVideoPreviewSelectFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.i);
    }
}
