package com.yxcorp.gifshow.camera.rn.ktv.tune.BaseKtvKrnActivity;
import je.a;
import com.yxcorp.gifshow.SingleFragmentPostActivity;
import com.yxcorp.gifshow.camera.rn.ktv.tune.BaseKtvKrnActivity$a;
import nsd.u;
import com.kuaishou.krn.model.LaunchModel$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import java.util.Iterator;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import java.util.Set;
import ekd.x0;
import li9.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.robust.PatchProxyResult;
import oi9.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import android.util.Pair;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import zf6.l;
import ekd.i;
import com.yxcorp.gifshow.activity.BasePostActivity;
import androidx.core.app.a;

public abstract class BaseKtvKrnActivity extends SingleFragmentPostActivity implements a	// class@000ff3
{
    public static final BaseKtvKrnActivity$a O;

    static {
       BaseKtvKrnActivity.O = new BaseKtvKrnActivity$a(null);
    }
    public void BaseKtvKrnActivity(){
       super();
    }
    public final void K3(LaunchModel$b p0){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseKtvKrnActivity.class, "8")) {
          return;
       }
       String str = "builder";
       try{
          a.p(p0, str);
          str = this.N3();
          if (str.length() > 0) {
             jSONObject = 1;
          label_0020 :
             jSONObject = (jSONObject)? new JSONObject(str): this.L3();
             if (jSONObject.keys().hasNext()) {
                str = jSONObject.toString();
                a.o(str, "extJson.toString\(\)");
                p0.e("extParams", str);
             }
             Intent intent = this.getIntent();
             if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                   Iterator iterator = x0.c(data).iterator();
                   while (iterator.hasNext()) {
                      String str1 = iterator.next();
                      String str2 = x0.a(data, str1);
                      if (!str1.equals("extParams") && !jSONObject.has(str1)) {
                         Object[] objArray = new Object[0];
                         a.C().w("BaseKtvKrnActivity", "addParsePassThroughKrnParams : "+str1+" : "+str2, objArray);
                         p0.e(str1, str2);
                      }
                   }
                }
             }
          }else {
             jSONObject = null;
             goto label_0020 ;
          }
       }catch(java.lang.Exception e12){
          PostUtils.D("BaseKtvKrnActivity", "addParsePassThroughKrnParams exception", e12);
       }
       return;
    }
    public final JSONObject L3(){
       JSONObject obj = PatchProxy.apply(null, this, BaseKtvKrnActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          boolean b = false;
          String str = a.c(this.getIntent(), b);
          if (!TextUtils.isEmpty(str)) {
             obj.put("atFriends", str);
          label_0029 :
             Boolean uBoolean = a.d(this.getIntent(), b);
             if (uBoolean != null) {
                obj.put("forbidRecoverDraft", uBoolean.booleanValue());
             }
             uBoolean = a.e(this.getIntent(), b);
             if (uBoolean != null) {
                obj.put("returnToOriginalPage", uBoolean.booleanValue());
             }
             Pair pair = a.f(this.getIntent(), b);
             if (pair != null) {
                Pair first = pair.first;
                a.o(first, "tag.first");
                String str1 = (first.booleanValue())? "tag": "topic";
                obj.put(str1, pair.second);
             }
             str = a.b(this.getIntent(), b);
             if (!TextUtils.isEmpty(str)) {
                obj.put("activity", str);
             }
          }else {
             goto label_0029 ;
          }
       }catch(org.json.JSONException e1){
          a.C().v("BaseKtvKrnActivity", "parse params exception", e1);
       }
       return obj;
    }
    public final boolean M3(Intent p0){
       Uri data;
       boolean b;
       Uri obj = PatchProxy.applyOneRefs(p0, this, BaseKtvKrnActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.getData() != null) {
          obj = p0.getData();
          a.m(obj);
          a.o(obj, "intent.data!!");
          if (!TextUtils.equals(obj.getAuthority(), "ktv")) {
             obj = p0.getData();
             String str = null;
             String authority = (obj != null)? obj.getAuthority(): str;
             if (!TextUtils.equals(authority, "ktvduet")) {
                obj = p0.getData();
                authority = (obj != null)? obj.getAuthority(): str;
                if (!TextUtils.equals(authority, "ktvmelodyranklist")) {
                   obj = p0.getData();
                   authority = (obj != null)? obj.getAuthority(): str;
                   if (!TextUtils.equals(authority, "ktvclassify")) {
                      data = p0.getData();
                      if (data != null) {
                         str = data.getAuthority();
                      }
                      if (!TextUtils.equals(str, "ktvtheme")) {
                      label_0082 :
                         b = false;
                      label_0083 :
                         return b;
                      }
                   }
                }
             }
          }
       label_0080 :
          b = true;
          goto label_0083 ;
       }else {
          goto label_0082 ;
       }
    }
    public final String N3(){
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, this, BaseKtvKrnActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getIntent();
       if (obj != null) {
          objArray = obj.getData();
       }
       String str = "";
       if (objArray != null) {
          Intent intent = this.getIntent();
          a.o(intent, "intent");
          String str1 = x0.b(intent.getData(), "extParams", str);
          a.o(str1, "extParams");
          int i = 0;
          StringBuilder str2 = (str1.length() > 0)? 1: null;
          if (str2) {
             Object[] objArray1 = new Object[i];
             a.C().w("BaseKtvKrnActivity", "use scheme ext params : "+str1, objArray1);
             return str1;
          }
       }
       return str;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, BaseKtvKrnActivity.class, "10")) {
          return;
       }
       this.onBackPressed();
       return;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseKtvKrnActivity.class, "1")) {
          return;
       }
       Intent intent = this.getIntent();
       a.o(intent, "intent");
       Object[] objArray = new Object[0];
       a.C().w("BaseKtvKrnActivity", this.getClass().getSimpleName()+", data: "+intent.getData(), objArray);
       i.i(this, 0, l.r(), true);
       super.onCreate(p0);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, BaseKtvKrnActivity.class, "9")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       a.C().w("BaseKtvKrnActivity", this.getClass().getSimpleName()+", onDestroy", objArray);
       return;
    }
    public void startActivity(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseKtvKrnActivity.class, "2")) {
          return;
       }
       a.p(p0, "intent");
       if (this.M3(p0)) {
          Object[] objArray = new Object[0];
          a.C().w("BaseKtvKrnActivity", "launch ktv record", objArray);
          a.j(this, p0, 304, null);
       }else {
          super.startActivity(p0);
       }
       return;
    }
    public void startActivity(Intent p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseKtvKrnActivity.class, "3")) {
          return;
       }
       a.p(p0, "intent");
       if (this.M3(p0)) {
          Object[] objArray = new Object[0];
          a.C().w("BaseKtvKrnActivity", "launch ktv record", objArray);
          a.j(this, p0, 304, p1);
       }else {
          super.startActivity(p0);
       }
       return;
    }
}
