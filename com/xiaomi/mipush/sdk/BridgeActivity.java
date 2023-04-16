package com.xiaomi.mipush.sdk.BridgeActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.content.Intent;
import java.lang.String;
import android.os.Parcelable;
import android.content.Context;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.lang.Throwable;
import rs8.c;

public class BridgeActivity extends Activity	// class@0010d3
{

    public void BridgeActivity(){
       super();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       Window window = this.getWindow();
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.height = 1;
       attributes.width = 1;
       attributes.gravity = 51;
       window.setAttributes(attributes);
    }
    public void onResume(){
       try{
          super.onResume();
          Intent intent = this.getIntent();
          if (intent != null) {
             intent = intent.getParcelableExtra("mipush_serviceIntent");
             if (intent != null) {
                PushMessageHandler.a(this.getApplicationContext(), intent);
             }
          }
       }catch(java.lang.Exception e0){
          c.o(e0);
       }
       this.finish();
       return;
    }
}
