package nf9.a$d;
import java.lang.Runnable;
import nf9.a;
import com.kwai.video.westeros.models.ServerMediaRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import w46.b;
import java.lang.CharSequence;
import java.util.Map;
import kotlin.jvm.internal.a;
import crd.b;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Objects;
import com.kwai.video.westeros.models.PickingMediaResType;
import q87.c;
import k5b.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.server.ServerSwapDescription;
import qrd.l1;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import k5b.d;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.models.QMedia;
import t45.d;
import brd.z;
import nf9.b;
import erd.a;
import nf9.c;
import nf9.d;
import nf9.e;
import erd.g;

public final class a$d implements Runnable	// class@003175
{
    public final a b;
    public final ServerMediaRequest c;

    public void a$d(a p0,ServerMediaRequest p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       a uoa;
       a$d c;
       Object[] objArray1;
       b obj1;
       ServerSwapDescription serverSwapDe1;
       String str4;
       t ot;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, a$d.class, "1")) {
          return;
       }
       String str = "ServerSwapController";
       int i = 0;
       if (obj.b.o == null) {
          uoa = a.D();
          StringBuilder str1 = "current magicFace is null: ";
          c = obj.c;
          if (c != null) {
             objArray = c.getKey();
          }
          objArray1 = new Object[i];
          uoa.t(str, str1+objArray, objArray1);
          return;
       }else {
          a$d c1 = obj.c;
          if (c1 == null) {
             objArray = new Object[i];
             a.D().t(str, "request is null", objArray);
             return;
          }else {
             String text = c1.getText();
             uoa = (text == null || !text.length())? 1: null;
             if (uoa) {
                objArray1 = new Object[i];
                a.D().t(str, "request text is null or empty: "+obj.c.getKey(), objArray1);
                return;
             }else {
                text = obj.c.getServerAction();
                uoa = (text == null || !text.length())? 1: null;
                if (uoa) {
                   objArray1 = new Object[i];
                   a.D().t(str, "request action is null or empty : "+obj.c.getKey(), objArray1);
                   return;
                }else if(obj.b.p.get(obj.c.getKey()) != null){
                   obj1 = obj.b.p.get(obj.c.getKey());
                   a.m(obj1);
                   if (!obj1.isDisposed()) {
                      objArray1 = new Object[i];
                      a.D().t(str, "already requesting : "+obj.c.getKey(), objArray1);
                      return;
                   }
                }
                c1 = obj.b;
                a$d c2 = obj.c;
                a o = c1.o;
                a.m(o);
                SimpleMagicFace mId = o.mId;
                a.o(mId, "currentMagicFace!!.mId");
                Objects.requireNonNull(c1);
                if (!PatchProxy.applyVoidTwoRefs(c2, mId, c1, a.class, "3")) {
                   String str2 = ", ";
                   Object[] objArray2 = new Object[i];
                   a.D().w(str, "doServerMediaRequest : "+c2.getText()+" , "+c2.getServerAction()+" , "+mId+str2+c2.getType()+" , "+c2.getKey()+str2+c2.getDisableCache(), objArray2);
                   a p = c1.p;
                   String key = c2.getKey();
                   a.o(key, "request.key");
                   c b = c.b;
                   String text1 = c2.getText();
                   a.o(text1, "request.text");
                   ServerSwapDescription serverSwapDe = new ServerSwapDescription();
                   serverSwapDe.mServiceType = c2.getServerAction();
                   String str3 = (c2.getType() == PickingMediaResType.kPickingImage)? "png": "mp4";
                   serverSwapDe.mReturnMediaType = str3;
                   serverSwapDe.mDisableCache = c2.getDisableCache();
                   Objects.requireNonNull(b);
                   if (PatchProxy.isSupport(c.class)) {
                      serverSwapDe1 = serverSwapDe;
                      str4 = text1;
                      ot = PatchProxy.applyFourRefs(text1, Boolean.FALSE, mId, serverSwapDe, b, c.class, "3");
                      if (ot != PatchProxyResult.class) {
                      }else {
                      label_01cd :
                         a.p(str4, "text");
                         a.p(mId, "magicFaceId");
                         a.p(serverSwapDe1, "serverSwapDescription");
                         int i1 = (!str4.length())? 1: 0;
                         if (i1) {
                            ot = t.error(d.b);
                            a.o(ot, "Observable.error {\n     ¡­s null or empty\"\)\n      }");
                         }else {
                            ot = b.a(str4, null, 0, mId, serverSwapDe1);
                         }
                      }
                   }else {
                      serverSwapDe1 = serverSwapDe;
                      str4 = text1;
                      goto label_01cd ;
                   }
                   obj1 = ot.observeOn(d.a).doOnDispose(new b(c2)).subscribe(new c(c1, c2), new d(c1, c2), e.b);
                   a.o(obj1, "ServerSwapUtils.processM¡­sMediaComplete\"\)\n      }\)");
                   p.put(key, obj1);
                }
                return;
             }
          }
       }
    }
}
