package com.yxcorp.gifshow.profile.background.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.n;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewSelectFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class k extends Accessor	// class@00124a
{
    public final ProfileBackgroundImagePreviewSelectFragment$a c;
    public final n d;

    public void k(n p0,ProfileBackgroundImagePreviewSelectFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.h);
    }
}
