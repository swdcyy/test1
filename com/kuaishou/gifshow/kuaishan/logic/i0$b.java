package com.kuaishou.gifshow.kuaishan.logic.i0$b;
import com.yxcorp.gifshow.models.QMedia;
import h90.e;
import java.lang.String;
import java.lang.Object;
import h90.a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ConditionLimit;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Integer;

public class i0$b	// class@001a50
{
    public final int a;
    public final QMedia b;
    public final e c;
    public final a d;
    public final String e;
    public final int f;
    public final EditorSdk2$ConditionLimit g;
    public final EditorSdk2$ExportOptions h;

    public void i0$b(int p0,QMedia p1,e p2,String p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       a uoa = new a();
       this.d = uoa;
       uoa.a = p1.path;
       this.f = p4;
       this.g = EditorSdk2Utils.getMVConditionLimitNativeLimit(p4);
       this.h = EditorSdk2Utils.getMVExportOptionsNativeOptions(p4, false);
    }
    public String a(){
       return this.b.path;
    }
    public a b(){
       return this.d;
    }
    public boolean c(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       i0$b obj = PatchProxy.apply(objArray, this, i0$b.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.c.o()) {
          obj = this.c;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, e.class, "12");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             e a = obj.A;
             if (a != null) {
                Iterator iterator = a.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (iterator.next().o()) {
                         b1 = true;
                         break ;
                      }
                   }
                }
             }
             b1 = false;
          }
          if (!b1) {
          label_0054 :
             return b;
          }
       }
       b = true;
       goto label_0054 ;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, i0$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.c.r) && !TextUtils.x(this.c.s))? true: false;
       return b;
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, i0$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b()+this.c.r+this.c.s;
    }
    public final Size f(QMedia p0,int p1){
       i0$b uob = i0$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && (p0.getWidth() > 0 && (p0.getHeight() <= 0 || p1 <= 0))) {
          return null;
       }else {
          int width = p0.getWidth();
          int height = p0.getHeight();
          int i = 0x3f800000;
          if (width <= height || (p0.getRatio() - i < 0 || (width < height && p0.getRatio() - i > 0))) {
             width = p0.getHeight();
             height = p0.getWidth();
          }
          if (width <= p1 && height <= p1) {
             p0.mExportWidth = width;
             p0.mExportHeight = height;
             return new Size(width, height);
          }else if(width > height){
             p0.mExportWidth = p1;
             p0.mExportHeight = (int)((float)p1 * ((float)height / (float)width));
          }else {
             p0.mExportHeight = p1;
             p0.mExportWidth = (int)((float)p1 * ((float)width / (float)height));
          }
          return new Size(p0.mExportWidth, p0.mExportHeight);
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i0$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PrepareTask{mIndex="+this.a+", mMedia="+this.b.path+", mArea="+this.c+'}';
    }
}
