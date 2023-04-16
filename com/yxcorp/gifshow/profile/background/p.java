package com.yxcorp.gifshow.profile.background.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.y;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;

public class p extends Accessor	// class@00124f
{
    public final ProfileBackgroundVideoPreviewSelectFragment$a c;
    public final y d;

    public void p(y p0,ProfileBackgroundVideoPreviewSelectFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
