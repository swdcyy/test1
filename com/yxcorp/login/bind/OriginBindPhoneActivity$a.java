package com.yxcorp.login.bind.OriginBindPhoneActivity$a;
import com.yxcorp.gifshow.widget.SwipeLayout$c;
import com.yxcorp.login.bind.OriginBindPhoneActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class OriginBindPhoneActivity$a extends SwipeLayout$c	// class@001a42
{
    public final OriginBindPhoneActivity a;

    public void OriginBindPhoneActivity$a(OriginBindPhoneActivity p0){
       this.a = p0;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, OriginBindPhoneActivity$a.class, "1")) {
          return;
       }
       this.a.onBackPressed();
       return;
    }
}
