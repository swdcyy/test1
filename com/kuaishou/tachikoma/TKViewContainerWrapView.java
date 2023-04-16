package com.kuaishou.tachikoma.TKViewContainerWrapView;
import sx4.e;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.String;
import tx4.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import tx4.w;
import com.kuaishou.tachikoma.TKViewContainerWrapView$b;
import android.view.View;
import sx4.e$a;
import java.lang.Integer;
import tw4.a;
import java.lang.Boolean;
import com.kuaishou.tachikoma.api.TKViewContainer;

public class TKViewContainerWrapView extends FrameLayout implements e	// class@000f5a
{
    public e b;
    public TKViewContainerWrapView$b c;
    public boolean d;
    public Throwable e;
    public w f;

    public void TKViewContainerWrapView(Context p0){
       super(p0);
       this.b = null;
       this.d = false;
    }
    public boolean a(){
       return this.d;
    }
    public Object b(String p0,String p1,h p2){
       TKViewContainerWrapView obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TKViewContainerWrapView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          return obj.b(p0, p1, p2);
       }
       return null;
    }
    public boolean c(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, TKViewContainerWrapView.class, "8")) {
          return;
       }
       TKViewContainerWrapView tb = this.b;
       if (tb != null) {
          tb.close();
       }
       return;
    }
    public void d(Throwable p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKViewContainerWrapView.class, "3")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.e = p0;
       this.f = p1;
       TKViewContainerWrapView tc = this.c;
       if (tc != null) {
          tc.b(p0, p1);
       }
       return;
    }
    public void e(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewContainerWrapView.class, "2")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.b = p0;
       this.addView(p0.getView());
       TKViewContainerWrapView tc = this.c;
       if (tc != null) {
          tc.onSuccess();
       }
       return;
    }
    public void f(TKViewContainerWrapView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewContainerWrapView.class, "4")) {
          return;
       }
       if (!this.a()) {
          TKViewContainerWrapView tc = this.c;
          if (tc != null) {
             tc.a();
          }
       }
       this.c = p0;
       if (p0 != null) {
          if (this.c()) {
             p0.onSuccess();
          }else if(this.a()){
             p0.b(this.e, this.f);
          }
       }
       return;
    }
    public e getContainer(){
       return this;
    }
    public FrameLayout getView(){
       return this;
    }
    public void setData(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewContainerWrapView.class, "5")) {
          return;
       }
       TKViewContainerWrapView tb = this.b;
       if (tb != null) {
          tb.setData(p0);
       }
       return;
    }
    public void setIJS2NativeInvoker(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewContainerWrapView.class, "6")) {
          return;
       }
       TKViewContainerWrapView tb = this.b;
       if (tb != null) {
          tb.setIJS2NativeInvoker(p0);
       }
       return;
    }
    public void setViewContainerIndex(int p0){
       if (PatchProxy.isSupport(TKViewContainerWrapView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKViewContainerWrapView.class, "1")) {
          return;
       }
       if (a.c.booleanValue()) {
          TKViewContainerWrapView tb = this.b;
          if (tb != null && tb instanceof TKViewContainer) {
             tb.setViewContainerIndex(p0);
          }
       }
       return;
    }
}
