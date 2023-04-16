package a3d.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import android.content.Context;
import android.os.Bundle;
import ou5.a;
import java.lang.Object;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import v2d.k;
import v2d.q;
import k2d.s;
import im8.c;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import a3d.h;
import java.util.Map;
import java.util.HashMap;

public class a implements PopupInterface$f, g	// class@000076
{
    public PresenterV2 b;
    public LoginParams c;
    public c d;
    public c e;
    public c f;
    public c g;
    public int h;
    public Bundle i;
    public Context j;
    public a k;
    public q l;

    public void a(Context p0,Bundle p1,a p2){
       super();
       this.i = p1;
       this.j = p0;
       this.k = p2;
       if (p1 != null) {
          try{
             LoginParams serializable = SerializableHook.getSerializable(p1, "KEY_LOGIN_PARAM");
             this.c = serializable;
             this.h = serializable.mLoginSource;
          }catch(java.lang.Exception e0){
             e0.c();
          }
       }else {
          this.c();
       }
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "3");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       View view = a.g(p1, R.layout.arg_RES_7f0d0eb1, p2, false);
       PresenterV2 presenterV2 = new PresenterV2();
       this.b = presenterV2;
       presenterV2.U7(new k());
       q oq = new q();
       this.l = oq;
       this.b.U7(oq);
       this.b.U7(new s());
       this.b.f(view);
       Object[] objArray = new Object[]{this,new c("POPUP", p0)};
       this.b.i(objArray);
       a tk = this.k;
       if (tk != null) {
          tk.onShow();
       }
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a tk = this.k;
       if (tk != null) {
          tk.onDismiss();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       LoginParams$a uoa = new LoginParams$a();
       uoa.f(LoginParams.getStartPage());
       uoa.g(LoginParams.generateLoginSessionId());
       this.c = uoa.a();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new h());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
