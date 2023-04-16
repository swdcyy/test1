package com.meizu.cloud.pushsdk.b$a;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.b;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.b;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import java.lang.String;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;

public class b$a extends a	// class@001496
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(Context p0,Intent p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1);
          }
       }
       return;
    }
    public void a(Context p0,MzPushMessage p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1);
          }
       }
       return;
    }
    public void a(Context p0,PushSwitchStatus p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1);
          }
       }
       return;
    }
    public void a(Context p0,RegisterStatus p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1);
          }
       }
       return;
    }
    public void a(Context p0,SubAliasStatus p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1);
          }
       }
       return;
    }
    public void a(Context p0,SubTagsStatus p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1);
          }
       }
       return;
    }
    public void a(Context p0,UnRegisterStatus p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1);
          }
       }
       return;
    }
    public void a(Context p0,String p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1);
          }
       }
       return;
    }
    public void a(Context p0,String p1,String p2){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1, p2);
          }
       }
       return;
    }
    public void a(Context p0,boolean p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0, p1);
          }
       }
       return;
    }
    public void a(PushNotificationBuilder p0){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.a(p0);
          }
       }
       return;
    }
    public void b(Context p0,MzPushMessage p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.b(p0, p1);
          }
       }
       return;
    }
    public void b(Context p0,String p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.b(p0, p1);
          }
       }
       return;
    }
    public void c(Context p0,MzPushMessage p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.c(p0, p1);
          }
       }
       return;
    }
    public void c(Context p0,String p1){
       Iterator iterator = b.a(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          a value = iterator.next().getValue();
          if (value != null) {
             value.c(p0, p1);
          }
       }
       return;
    }
}
