package com.sina.weibo.sdk.share.e;
import java.lang.Object;
import android.app.Activity;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import android.content.Context;
import android.os.Bundle;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import android.content.Intent;
import com.sina.weibo.sdk.share.ShareTransActivity;
import java.lang.Class;
import java.util.List;
import com.sina.weibo.sdk.b.a;
import java.lang.CharSequence;
import android.widget.Toast;
import java.util.ArrayList;

public final class e	// class@000bd7
{
    public long D;

    public void e(){
       super();
    }
    public static void a(Activity p0,WeiboMultiMessage p1){
       if (p0 == null) {
          return;
       }
       if (!e.a(p0, p1)) {
          return;
       }
       Bundle uBundle = new Bundle();
       uBundle.putInt("_weibo_command_type", 1);
       uBundle.putString("_weibo_transaction", System.currentTimeMillis());
       uBundle.putAll(p1.writeToBundle(uBundle));
       Intent intent = new Intent(p0, ShareTransActivity.class);
       intent.putExtra("start_flag", 1001);
       intent.putExtras(uBundle);
       p0.startActivityForResult(intent, 0x2711);
       return;
    }
    public static boolean a(Context p0,WeiboMultiMessage p1){
       if (p1 != null) {
          List list = e.b(p1);
          if (p1.superGroupObject != null && !a.d(p0)) {
             if (e.a(list, p1.superGroupObject)) {
                Toast.makeText(p0, "微博版本过低，不支持超话分享", 0).show();
                return 0;
             }else {
                p1.superGroupObject = null;
             }
          }
       }
       return true;
    }
    public static boolean a(List p0,Object p1){
       if (p0 != null && (p0.isEmpty() || (p1 != null && (p0.contains(p1) && p0.size() == 1)))) {
          return true;
       }
       return false;
    }
    public static List b(WeiboMultiMessage p0){
       ArrayList uArrayList = new ArrayList();
       WeiboMultiMessage textObject = p0.textObject;
       if (textObject != null) {
          uArrayList.add(textObject);
       }
       textObject = p0.imageObject;
       if (textObject != null) {
          uArrayList.add(textObject);
       }
       textObject = p0.mediaObject;
       if (textObject != null) {
          uArrayList.add(textObject);
       }
       textObject = p0.multiImageObject;
       if (textObject != null) {
          uArrayList.add(textObject);
       }
       textObject = p0.videoSourceObject;
       if (textObject != null) {
          uArrayList.add(textObject);
       }
       p0 = p0.superGroupObject;
       if (p0 != null) {
          uArrayList.add(p0);
       }
       return uArrayList;
    }
}
