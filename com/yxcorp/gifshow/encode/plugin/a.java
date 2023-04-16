package com.yxcorp.gifshow.encode.plugin.a;
import pca.d0;
import java.lang.Object;
import c26.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.encode.EncodeManager;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.util.Objects;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.encode.o;
import java.lang.Runnable;
import t45.c;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.yxcorp.gifshow.encode.p;
import com.yxcorp.gifshow.encode.EncodeManager$c;
import java.lang.Boolean;
import com.yxcorp.gifshow.encode.q;

public class a implements d0	// class@000d45
{

    public void a(){
       super();
    }
    public void E5(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       EncodeManager.o().b(p0);
       return;
    }
    public void M30(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       EncodeManager.o().B(p0);
       return;
    }
    public void Oy(int p0){
       PostEncodeInfo postEncodeIn;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "7")) {
          return;
       }
       if (PatchProxy.isSupport(a.class)) {
          postEncodeIn = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "5");
          if (postEncodeIn != PatchProxyResult.class) {
          label_0034 :
             if (!PatchProxy.applyVoidOneRefs(postEncodeIn, this, a.class, "6")) {
                EncodeManager.o().I(postEncodeIn);
             }
             return;
          }
       }
       postEncodeIn = EncodeManager.o().k(p0);
       goto label_0034 ;
    }
    public void We(PostEncodeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       EncodeManager.o().I(p0);
       return;
    }
    public void XN(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       EncodeManager uEncodeManag = EncodeManager.o();
       Objects.requireNonNull(uEncodeManag);
       if (!PatchProxy.applyVoid(objArray, uEncodeManag, EncodeManager.class, "60")) {
          Log.g("EncodeManager", "suspendAll");
          if (PostExperimentUtils.L()) {
             c.a(o.b);
          }else {
             EditorSdk2Utils.SuspendExportWorks();
          }
          uEncodeManag.w(new p(uEncodeManag));
       }
       return;
    }
    public boolean b8(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return EncodeManager.o().d(p0, p1);
    }
    public PostEncodeInfo c3(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return EncodeManager.o().k(p0);
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean l3(int p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return EncodeManager.o().L(p0, p1);
    }
    public void resumeAll(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       EncodeManager uEncodeManag = EncodeManager.o();
       Objects.requireNonNull(uEncodeManag);
       if (!PatchProxy.applyVoid(objArray, uEncodeManag, EncodeManager.class, "61")) {
          Log.g("EncodeManager", "resumeAll");
          EditorSdk2Utils.ResumeExportWorks();
          uEncodeManag.w(new q(uEncodeManag));
       }
       return;
    }
}
