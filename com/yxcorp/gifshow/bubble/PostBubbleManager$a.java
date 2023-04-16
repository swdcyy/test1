package com.yxcorp.gifshow.bubble.PostBubbleManager$a;
import android.os.Handler;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lnc.l3;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.yxcorp.gifshow.bubble.a;
import java.lang.StringBuilder;
import ra9.c;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import brd.t;
import t45.d;
import brd.z;
import ra9.h;
import ra9.g;
import erd.g;
import crd.b;

public class PostBubbleManager$a extends Handler	// class@001c6f
{
    public final PostBubbleManager a;

    public void PostBubbleManager$a(PostBubbleManager p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       boolean b;
       a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       PostBubbleManager$a ta = this.a;
       Objects.requireNonNull(ta);
       PostBubbleManager postBubbleMa = PostBubbleManager.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, postBubbleMa, "12")) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          l3.C().w("PostBubbleManager", "showNextBubble", objArray1);
          Object[] obj = PatchProxy.apply(objArray, ta, postBubbleMa, "19");
          int i1 = 1;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(ta.b == null){
             if (ta.c == null) {
                String str = "android.permission.RECORD_AUDIO";
                String str1 = "android.permission.CAMERA";
                String str2 = "android.permission.WRITE_EXTERNAL_STORAGE";
                Object[] objArray3 = 2;
                l3 ol3 = (ta.d != objArray3 || (PermissionUtils.a(ta.f, str2) || (ta.d != objArray3 && (PermissionUtils.a(ta.f, str1) && PermissionUtils.a(ta.f, str)))))? 1: null;
                if (!ol3) {
                   objArray3 = new Object[i];
                   l3.C().w("PostBubbleManager", "permission not allowed, cann\'t show bubble", objArray3);
                   uoa = ta.f();
                   if (uoa != null && (!uoa.g(str1) && (uoa.g(str) || uoa.g(str2)))) {
                      objArray1 = new Object[i];
                      l3.C().w("PostBubbleManager", "bubbleToShow:"+uoa.d().name()+" ignore permission check.", objArray1);
                   }
                }else {
                   ta.c = i1;
                }
             }
             b = true;
          }
       label_00c4 :
          b = false;
          if (b) {
             if (ta.a == null) {
                obj = new Object[i];
                l3.C().w("PostBubbleManager", "not resume status", obj);
             }else if(ta.j != null){
                objArray = new Object[i];
                l3.C().w("PostBubbleManager", ta.j.d().name()+" is showing", objArray);
             }else {
                uoa = ta.f();
                if (uoa == null) {
                   objArray = new Object[i];
                   l3.C().w("PostBubbleManager", "no bubble to show", objArray);
                   objArray1 = new Object[i];
                   l3.C().w("PostBubbleManager", "onNoBubbleAvailable "+ta.k, objArray1);
                   Iterator iterator = ta.i.iterator();
                   while (iterator.hasNext()) {
                      PostBubbleManager$c uoc = iterator.next();
                      boolean b1 = (ta.k == null)? true: false;
                      uoc.c(b1);
                   }
                   ta.k = ta.k + i1;
                }else {
                   t ot = uoa.e();
                   if (ot != null) {
                      Object[] objArray2 = new Object[i];
                      l3.C().w("PostBubbleManager", "showNextBubble: asyncGet:"+uoa.d().name(), objArray2);
                      ta.j = uoa;
                      ta.e = ot.observeOn(d.a).subscribe(new h(ta, uoa), new g(ta, uoa));
                   }else {
                      ta.l(uoa);
                   }
                }
             }
          }
       }
       return;
    }
}
