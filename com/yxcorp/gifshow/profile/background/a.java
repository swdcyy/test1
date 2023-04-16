package com.yxcorp.gifshow.profile.background.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.e;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewFragment$a;
import java.lang.Object;
import androidx.fragment.app.Fragment;

public class a extends Accessor	// class@001240
{
    public final ProfileBackgroundImagePreviewFragment$a c;
    public final e d;

    public void a(e p0,ProfileBackgroundImagePreviewFragment$a p1){
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
