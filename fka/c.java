package fka.c;
import fw8.r$a;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import fw8.q;
import android.content.Intent;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fka.e;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.x;
import com.google.gson.JsonObject;
import fka.f;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.KeyEvent;

public class c implements r$a	// class@001618
{

    public void c(){
       super();
    }
    public void a(Activity p0,View p1,ViewGroup$LayoutParams p2){
       q.k(this, p0, p1, p2);
    }
    public void b(Activity p0,View p1){
       q.j(this, p0, p1);
    }
    public String c(Intent p0){
       return q.h(this, p0);
    }
    public void d(Intent p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       if (p1 != null) {
          e uoe = e.a();
          Objects.requireNonNull(uoe);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          e uoe1 = e.class;
          if (!PatchProxy.applyVoidOneRefs(p1, uoe, uoe1, "7")) {
             Integer integer = PatchProxy.applyOneRefs(p1, uoe, uoe1, "2");
             if (integer != patchProxyRe) {
             }else {
                integer = x.e(p1);
                if (integer == null) {
                   integer = Integer.valueOf(0);
                }
             }
             int i = integer.intValue();
             JsonObject jsonObject = PatchProxy.applyOneRefs(p1, uoe, uoe1, "8");
             if (jsonObject != patchProxyRe) {
             }else {
                Object tag = p1.getTag(R.id.tag_pymk_portal_refer);
                p1 = p1.getTag(R.id.tag_pymk_follow_text_refer);
                jsonObject = new JsonObject();
                if (tag != null) {
                   jsonObject.c0("PYMK_PORTAL", tag.toString());
                }
                if (p1 != null) {
                   jsonObject.c0("FOLLOW_TEXT", p1.toString());
                }
             }
             if (e.h(uoe.c)) {
                uoe = uoe.c;
                uoe.c = i;
                uoe.d(jsonObject);
             }else {
                f uof = new f(1, i, "elementNode");
                uof.d(jsonObject);
                uoe.k(uof);
             }
          }
       }
       return;
    }
    public void e(Intent p0){
       q.a(this, p0);
    }
    public void f(FragmentActivity p0,Bundle p1){
       q.d(this, p0, p1);
    }
    public void g(FragmentActivity p0,Bundle p1){
       q.f(this, p0, p1);
    }
    public void h(FragmentActivity p0,MotionEvent p1){
       q.c(this, p0, p1);
    }
    public void i(FragmentActivity p0,Intent p1){
       q.e(this, p0, p1);
    }
    public void j(Activity p0,int p1){
       q.i(this, p0, p1);
    }
    public void k(FragmentActivity p0,KeyEvent p1){
       q.b(this, p0, p1);
    }
    public void onSaveInstanceState(Bundle p0){
       q.g(this, p0);
    }
}
