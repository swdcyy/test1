package nkc.c;
import y8c.t;
import nkc.d;
import java.lang.Object;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import nkc.b;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import android.view.View;
import mkc.b;
import java.lang.Boolean;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.content.Context;

public class c implements t	// class@003764
{
    public d a;
    public View b;
    public View c;
    public View d;
    public View e;
    public View f;
    public float g;

    public void c(d p0){
       super();
       this.g = 0;
       this.a = p0;
    }
    public KwaiEmptyStateView$a a(){
       Object obj = PatchProxy.apply(null, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiEmptyStateView.e();
    }
    public KwaiEmptyStateView$a b(String p0){
       KwaiEmptyStateView$a obj = PatchProxy.applyOneRefs(p0, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwaiEmptyStateView.e();
       obj.p(new b(this));
       obj.i(p0);
       return obj;
    }
    public View c(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = this.a.c(b.g.a);
       }
       return this.d;
    }
    public void d(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "8")) {
          return;
       }
       this.a.b();
       if (p0) {
          this.a.a(this.e());
       }
       return;
    }
    public View e(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = this.a.c(b.d.a);
       }
       return this.b;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.a.b();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       this.a.b();
       return;
    }
    public void i(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       this.x();
       c ta = this.a;
       uoc = PatchProxy.apply(objArray, this, uoc, "5");
       if (uoc != PatchProxyResult.class) {
       }else if(this.c == null){
          this.c = this.a.c(b.i.a);
          this.a().a(this.c);
       }
       uoc = this.c;
       ta.a(uoc);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       this.a.b();
       this.f = null;
       return;
    }
    public void k(boolean p0,Throwable p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "12")) {
          return;
       }
       v0 = p1 instanceof KwaiException;
       if (uoc && p1.mErrorCode == 13) {
          return;
       }
       this.f();
       this.x();
       KwaiException kwaiExceptio = null;
       if (uoc) {
          kwaiExceptio = p1.mErrorMessage;
       }
       if (p0) {
          View view = this.c();
          view.setTranslationY(this.g);
          this.f = view;
          if (!PatchProxy.applyVoidThreeRefs(p1, view, kwaiExceptio, this, c.class, "13")) {
             this.b(kwaiExceptio).a(view);
          }
          this.a.a(view);
          ExceptionHandler.handleUserNotLoginFirstTimeAlert(p1, view);
          return;
       }else {
          Context context = this.a.getContext();
          if (context != null) {
             ExceptionHandler.handleException(context, p1);
          }
          return;
       }
    }
    public void n(View p0){
    }
    public void p(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "10")) {
          return;
       }
       c ta = this.a;
       uoc = PatchProxy.apply(objArray, this, uoc, "6");
       if (uoc != PatchProxyResult.class) {
       }else if(this.e == null){
          this.e = this.a.c(b.k.a);
       }
       uoc = this.e;
       ta.a(uoc);
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       this.a.b();
       return;
    }
}
