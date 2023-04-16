package com.yxcorp.gifshow.model.MultiplePhotosProject;
import zk.d;
import zk.a;
import com.kwai.ksvideorendersdk.KSProjectExclusionStrategy;
import com.yxcorp.gifshow.model.MultiplePhotosProject$Type;
import com.yxcorp.gifshow.model.MultiplePhotosProject$PhotoInfoTypeEnumSerializer;
import java.lang.reflect.Type;
import java.lang.Object;
import com.yxcorp.gifshow.model.MultiplePhotosProject$PreviewMusicType;
import com.yxcorp.gifshow.model.MultiplePhotosProject$PreviewMusicTypeEnumSerializer;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext$VideoContextTypeAdapter;
import com.google.gson.Gson;
import java.lang.String;
import java.util.HashMap;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Calendar;
import java.lang.CharSequence;
import android.text.format.DateFormat;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import com.yxcorp.gifshow.model.MultiplePhotosProject$b;
import java.util.Map;

public class MultiplePhotosProject	// class@001e5d
{
    public File a;
    public Map b;
    public long lastUpdateTime;
    public MultiplePhotosProject$Type mCurType;
    public String mPhotosSignStr;
    public String mProjectId;
    public VideoContext mVideoContext;
    public static final Gson c;

    static {
       d uod = new d();
       a[] uoaArray = new a[]{new KSProjectExclusionStrategy()};
       uod.l(uoaArray);
       uod.i();
       uod.f(MultiplePhotosProject$Type.class, new MultiplePhotosProject$PhotoInfoTypeEnumSerializer());
       uod.f(MultiplePhotosProject$PreviewMusicType.class, new MultiplePhotosProject$PreviewMusicTypeEnumSerializer());
       uod.f(VideoContext.class, new VideoContext$VideoContextTypeAdapter());
       MultiplePhotosProject.c = uod.b();
    }
    public void MultiplePhotosProject(String p0){
       super();
       this.mCurType = MultiplePhotosProject$Type.ATLAS;
       this.mVideoContext = null;
       this.b = new HashMap();
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosProject", "MultiplePhotosProject projectId:"+p0, objArray);
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiplePhotosProject.class, "9")) {
       }else {
          this.mProjectId = p0;
          this.a();
       }
       return;
    }
    public static String b(String[] p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, MultiplePhotosProject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MultiplePhotosProject", "MultiplePhotosProject photoUrls:"+p0, objArray);
       obj = "";
       if (p0 != null) {
          int len = p0.length;
          for (; i < len; i = i + 1) {
             obj = obj+(p0[i]).hashCode()+",";
          }
       }
       return obj;
    }
    public static String c(){
       String obj = PatchProxy.apply(null, null, MultiplePhotosProject.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "kwai_mps_"+DateFormat.format("yyyyMMdd_kkmmss", Calendar.getInstance()).toString();
       File uFile = MultiplePhotosProject.d();
       File uFile1 = new File(uFile+File.separator+obj);
       if (uFile1.exists()) {
          int i = 1;
          while (i < 100) {
             uFile1 = new File(uFile+File.separator+obj+i);
             if (uFile1.exists()) {
                i = i + 1;
             }
          }
       }
       return uFile1.getName();
    }
    public static File d(){
       Object obj = PatchProxy.apply(null, null, MultiplePhotosProject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostUtils.p(".picture_project");
    }
    public static File h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MultiplePhotosProject.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(MultiplePhotosProject.d(), p0);
    }
    public static void j(Object p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, MultiplePhotosProject.class, "4")) {
          return;
       }
       try{
          b.v0(p1, MultiplePhotosProject.c.q(p0));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MultiplePhotosProject.class, "11")) {
          return;
       }
       this.a = new File(MultiplePhotosProject.d(), this.mProjectId);
       return;
    }
    public File e(){
       Object obj = PatchProxy.apply(null, this, MultiplePhotosProject.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          this.a();
       }
       return this.a;
    }
    public String f(){
       return this.mProjectId;
    }
    public MultiplePhotosProject$b g(MultiplePhotosProject$Type p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiplePhotosProject.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = new HashMap();
       }
       return this.b.get(p0);
    }
    public void i(MultiplePhotosProject$Type p0,MultiplePhotosProject$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MultiplePhotosProject.class, "14")) {
          return;
       }
       if (this.b == null) {
          this.b = new HashMap();
       }
       this.b.put(p0, p1);
       return;
    }
}
