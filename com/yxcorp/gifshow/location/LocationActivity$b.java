package com.yxcorp.gifshow.location.LocationActivity$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.location.LocationActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;

public class LocationActivity$b implements View$OnClickListener	// class@001ad6
{
    public final LocationActivity b;

    public void LocationActivity$b(LocationActivity p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationActivity$b.class, "1")) {
          return;
       }
       this.b.finish();
       this.b.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01010d);
       return;
    }
}
