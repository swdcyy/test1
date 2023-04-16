package com.sina.weibo.sdk.share.ShareResultActivity;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import java.lang.Exception;

public class ShareResultActivity extends Activity	// class@000bce
{

    public void ShareResultActivity(){
       super();
    }
    public void onCreate(Bundle p0){
       try{
          super.onCreate(p0);
          Intent intent = this.getIntent();
          if (intent == null) {
             this.finish();
             return;
          }else if(intent.getIntExtra("start_flag", -1) != 1002){
             this.finish();
             return;
          }else {
             String action = intent.getAction();
             if (("com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY").equals(action)) {
                intent.setClassName(this, "com.sina.weibo.sdk.share.ShareTransActivity");
             }else if(("com.sina.weibo.sdk.action.ACTION_SDK_REQ_STORY").equals(action)){
                intent.setClassName(this, "com.sina.weibo.sdk.share.ShareStoryActivity");
             }
             this.startActivity(intent);
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       this.finish();
       return;
    }
}
