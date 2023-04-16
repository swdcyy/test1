package m9a.r;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.detail.util.b;
import tl8.d;
import ok.h;
import tl8.e;
import java.util.List;
import nx9.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.detail.util.c;

public class r	// class@002f90
{

    public void r(){
       super();
    }
    public static boolean a(boolean p0,boolean p1,QPhoto p2){
       Object obj;
       Object obj1;
       if (PatchProxy.isSupport(r.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, null, r.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (PatchProxy.isSupport(r.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p2, null, r.class, "3");
          if (obj != PatchProxyResult.class) {
             p0 = obj.booleanValue();
          }else if(p0){
             obj1 = PatchProxy.applyOneRefs(p2, null, r.class, "5");
             if (obj1 != PatchProxyResult.class) {
                obj1 = obj1.booleanValue();
             }else if(p2 != null && e.a(p2.mEntity, User.class, b.b)){
                obj1 = true;
             }else {
                obj1 = false;
             }
             if (obj1 && (c.g() != null && c.g().size() > 0)) {
                obj1 = true;
             }
          }
       label_0077 :
          obj1 = false;
       }else {
          goto label_0041 ;
       }
       if (!p0) {
          if (PatchProxy.isSupport(r.class)) {
             obj1 = PatchProxy.applyTwoRefs(Boolean.valueOf(p1), p2, null, r.class, "4");
             if (obj1 != PatchProxyResult.class) {
                obj1 = obj1.booleanValue();
             }else if(p1){
                obj1 = PatchProxy.applyOneRefs(p2, null, r.class, "6");
                if (obj1 != PatchProxyResult.class) {
                   obj1 = obj1.booleanValue();
                }else if(p2 != null && p2.isAllowComment()){
                   obj1 = true;
                }else {
                   obj1 = false;
                }
                if (obj1) {
                   obj1 = PatchProxy.applyOneRefs(p2, null, r.class, "7");
                   if (obj1 != PatchProxyResult.class) {
                      obj1 = obj1.booleanValue();
                   }else if(p2 != null && e.a(p2.mEntity, PhotoMeta.class, c.b)){
                      obj1 = true;
                   }else {
                      obj1 = false;
                   }
                   if (obj1) {
                      obj1 = true;
                   }
                }
             }
          label_00d5 :
             obj1 = false;
          }else {
             goto label_0093 ;
          }
          if (!obj1) {
             b = true;
          }
       }
       return b;
    }
}
