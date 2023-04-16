package com.yxcorp.login.bind.OriginPhoneOneKeyBindActivity$a;
import com.yxcorp.gifshow.widget.SwipeLayout$c;
import com.yxcorp.login.bind.OriginPhoneOneKeyBindActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class OriginPhoneOneKeyBindActivity$a extends SwipeLayout$c	// class@001a44
{
    public final OriginPhoneOneKeyBindActivity a;

    public void OriginPhoneOneKeyBindActivity$a(OriginPhoneOneKeyBindActivity p0){
       this.a = p0;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, OriginPhoneOneKeyBindActivity$a.class, "1")) {
          return;
       }
       this.a.onBackPressed();
       return;
    }
}
