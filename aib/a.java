package aib.a;
import nw5.c;
import java.lang.Object;
import lw5.d;
import mw5.e;
import lw5.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cib.d;
import kotlin.jvm.internal.a;
import dib.a;
import java.lang.StringBuilder;
import lw5.b;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager;
import dc5.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel;
import n0c.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectPanel;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import hp.f;
import android.content.Context;
import mw5.d;
import com.yxcorp.gifshow.message_camera.view.IMRTCTextureView;
import bib.k;

public class a implements c	// class@000086
{

    public void a(){
       super();
    }
    public c C9(d p0,e p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMPrettifyEffectPanel obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       b uob = null;
       obj = PatchProxy.applyTwoRefs(p0, p1, uob, d.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "config");
          boolean b = p1 instanceof a;
          IMMagicEffectPanel obj1 = (!b)? uob: p1;
          char c = ' ';
          StringBuilder str = "videoWrapper "+b+c+"isCameraRunning ";
          boolean b1 = (p1 != null)? p1.isCameraRunning(): false;
          str = str+b1+c+"effectManager ";
          b uob1 = (obj1 != null)? obj1.b(): uob;
          if (!uob1 instanceof IMEffectManager) {
             uob1 = uob;
          }
          c.g("IMEffectPanelFactory", str+uob1);
          uob1 = (obj1 != null)? obj1.b(): uob;
          if (uob1 instanceof IMEffectManager) {
             uob = uob1;
          }
          if (uob != null) {
             d b2 = p0.b;
             if (b2 != 1) {
                if (b2 == 2) {
                   IMPrettifyEffectPanel iMPrettifyEf = new IMPrettifyEffectPanel(p0, uob.c(), uob.b(), uob.f(), uob.d());
                }else {
                   throw new IllegalArgumentException("panel type is unknown");
                }
             }else {
                obj1 = new IMMagicEffectPanel(p0, uob.e(), uob.c().d());
             }
          }else {
             throw new IllegalArgumentException("effectManager is null, 不应该走到这里");
          }
       }
       return obj;
    }
    public d Wb(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMRTCTextureView(p0);
    }
    public boolean isAvailable(){
       return true;
    }
    public e zY(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(p0.getApplicationContext());
    }
}
