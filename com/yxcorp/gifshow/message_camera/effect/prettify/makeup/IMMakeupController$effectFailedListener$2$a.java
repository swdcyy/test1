package com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$effectFailedListener$2$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$effectFailedListener$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a$a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.io.File;
import i4b.g;
import zsd.u;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import dc5.c;
import ui9.j;
import com.kwai.video.westeros.models.MakeupResource;
import f1c.c2;
import java.util.List;
import trd.t;
import z3b.a0;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import jib.b;
import z3b.f;

public final class IMMakeupController$effectFailedListener$2$a implements FaceMagicController$FaceMagicLoadEffectFailedListener	// class@001dd1
{
    public final IMMakeupController$effectFailedListener$2 b;

    public void IMMakeupController$effectFailedListener$2$a(IMMakeupController$effectFailedListener$2 p0){
       this.b = p0;
       super();
    }
    public final void onLoadFileError(String p0,int p1){
       IMMakeupController$effectFailedListener$2$a uoeffectFail = IMMakeupController$effectFailedListener$2$a.class;
       if (PatchProxy.isSupport(uoeffectFail) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoeffectFail, "1")) {
          return;
       }
       IMMakeupController$effectFailedListener$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       IMMakeupController iMMakeupCont = IMMakeupController.class;
       if (!PatchProxy.isSupport(iMMakeupCont) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this$0, iMMakeupCont, "16")) {
          a uoa = this$0.d();
          String str = "IMMakeupController";
          int i = 1;
          if (p1 == i && this$0.b != null) {
             boolean b = false;
             a uoa1 = (p0 == null || !p0.length())? 1: null;
             if (!uoa1 && uoa != null) {
                uoa1 = uoa.c;
                uoa1 = (uoa1 == null || uoa1.isEmpty())? 1: null;
                if (!uoa1) {
                   uoa1 = uoa.c;
                   a.o(uoa1, "currentConfig.mSubConfigs");
                   Iterator iterator = uoa1.iterator();
                   while (iterator.hasNext()) {
                      a$a uoa2 = iterator.next();
                      a$a f = uoa2.f;
                      if (f != null) {
                         a.o(f, "config.mMaterial");
                         if (!f.isEmpty()) {
                            f = uoa2.f;
                            File uFile = g.j(f);
                            a.o(uFile, "MagicFaceResourceHelper.getMagicFaceFile\(material\)");
                            String absolutePath = uFile.getAbsolutePath();
                            String str1 = (absolutePath == null || !absolutePath.length())? 1: null;
                            if (!str1 && u.q2(p0, absolutePath, b, 2, null)) {
                               c.g(str, "material: "+f.mId+" , is error, retry download.");
                               IMMakeupController b1 = this$0.b;
                               if (b1 != null && b1.l0(p0) == i) {
                                  c.c(str, "the material : "+f.mId+" may be wrong");
                                  break ;
                               }else {
                                  this$0.g(t.k(c2.a(b, 0, uoa2.a, "")), b);
                                  a0.o().b(c2.d(IMMakeupController.f), "inner_resource", f, new b(this$0, p0, uoa));
                                  break ;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       label_0113 :
          c.g(str, "handleLoadFileError 1");
       }
       return;
    }
}
