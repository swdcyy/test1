package com.yxcorp.gifshow.model.MultiplePhotosProject$b;
import java.lang.Cloneable;
import com.yxcorp.gifshow.model.MultiplePhotosProject$Type;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.MultiplePhotosProject;
import java.lang.StringBuilder;
import cq.a;
import q87.c;
import com.google.gson.Gson;

public class MultiplePhotosProject$b implements Cloneable	// class@001e5c
{
    public File b;
    public String mCoverName;
    public List mPictures;
    public String mProjectId;
    public MultiplePhotosProject$Type mType;

    public void MultiplePhotosProject$b(MultiplePhotosProject$Type p0,String p1){
       super();
       this.mPictures = new ArrayList();
       this.mType = p0;
       this.c(p1);
    }
    public File a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MultiplePhotosProject$b obj = PatchProxy.applyOneRefs(p0, this, MultiplePhotosProject$b.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MultiplePhotosProject$b.class, "6") && this.b == null) {
          this.c(this.mProjectId);
       }
       obj = this.mProjectId;
       Object obj1 = PatchProxy.applyTwoRefs(obj, p0, objArray, MultiplePhotosProject$b.class, "3");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(TextUtils.isEmpty(p0)){
          objArray = new File(p0);
          if (!objArray.exists()) {
             objArray = new File(MultiplePhotosProject.h(obj), p0);
          }
       }
       return objArray;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MultiplePhotosProject$b.class, "7")) {
          return;
       }
       MultiplePhotosProject$b tb = this.b;
       MultiplePhotosProject$b tmType = this.mType;
       String str = PatchProxy.applyOneRefs(tmType, objArray, MultiplePhotosProject$b.class, "2");
       if (str != PatchProxyResult.class) {
       }else {
          str = tmType+".bat";
       }
       MultiplePhotosProject.j(this, new File(tb, str));
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiplePhotosProject$b.class, "5")) {
          return;
       }
       this.mProjectId = p0;
       File uFile = MultiplePhotosProject.h(p0);
       this.b = uFile;
       if (!uFile.exists()) {
          Object[] objArray = new Object[0];
          a.D().w("MultiplePhotosProject", "setProjectId\(\): create dir ok="+this.b.mkdirs()+" "+this.b, objArray);
       }
       return;
    }
    public Object clone(){
       MultiplePhotosProject$b uob = PatchProxy.apply(null, this, MultiplePhotosProject$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          Gson c = MultiplePhotosProject.c;
          uob = c.h(c.q(this), MultiplePhotosProject$b.class);
       }
       return uob;
    }
}
