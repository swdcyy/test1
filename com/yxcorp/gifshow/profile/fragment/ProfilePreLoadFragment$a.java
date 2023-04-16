package com.yxcorp.gifshow.profile.fragment.ProfilePreLoadFragment$a;
import com.yxcorp.gifshow.profile.widget.a;
import com.yxcorp.gifshow.profile.fragment.ProfilePreLoadFragment;
import android.view.ViewGroup;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class ProfilePreLoadFragment$a extends a	// class@001313
{
    public final String h;
    public final ProfilePreLoadFragment i;

    public void ProfilePreLoadFragment$a(ProfilePreLoadFragment p0,ViewGroup p1,RxFragment p2,String p3){
       this.i = p0;
       this.h = p3;
       super(p1, p2);
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreLoadFragment$a.class, "1")) {
          return;
       }
       this.i.Wg(this.h);
       return;
    }
}
