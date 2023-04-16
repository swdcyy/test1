package com.tachikoma.core.component.text.richtext.URLSpanEx;
import android.text.style.URLSpan;
import android.os.Parcel;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;

public class URLSpanEx extends URLSpan	// class@000da2
{

    public void URLSpanEx(Parcel p0){
       super(p0);
    }
    public void URLSpanEx(String p0){
       super(p0);
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, URLSpanEx.class, "1")) {
          return;
       }
       Context context = p0.getContext();
       Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.getURL()));
       intent.putExtra("com.android.browser.application_id", context.getPackageName());
       if (!context instanceof Activity) {
          intent.addFlags(0x10000000);
       }
       try{
          context.startActivity(intent);
       }catch(android.content.ActivityNotFoundException e0){
          intent.toString();
       }
       return;
    }
}
