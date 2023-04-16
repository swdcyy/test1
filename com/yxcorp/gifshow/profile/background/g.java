package com.yxcorp.gifshow.profile.background.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.n;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewSelectFragment$a;
import java.lang.Object;
import androidx.fragment.app.Fragment;

public class g extends Accessor	// class@001246
{
    public final ProfileBackgroundImagePreviewSelectFragment$a c;
    public final n d;

    public void g(n p0,ProfileBackgroundImagePreviewSelectFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
