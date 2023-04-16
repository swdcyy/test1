package kaa.p;
import kaa.w;
import jaa.d;
import jaa.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Asset;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset$b;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import haa.f;
import q87.c;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;

public class p extends w	// class@002c32
{
    public final String a;
    public final d b;

    public void p(){
       super();
       this.a = "Migrator2770";
       this.b = new d(2, 7, 70);
    }
    public d a(){
       return this.b;
    }
    public void b(c p0){
       boolean b;
       String file;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, op, "1")) {
          return;
       }
       super.b(p0);
       c a = p0.a;
       p0 = p0.c;
       a.f("Android");
       Asset$b obj = PatchProxy.applyOneRefs(a, this, op, "2");
       String str = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(a.getType() == Workspace$Type.SINGLE_PICTURE){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          obj = PatchProxy.applyOneRefs(a, this, op, "3");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(a.getAssetsCount() > 0){
             double originPicWid = a.getAssets(0).getOriginPicWidth();
             if (a.getAssets(0).getOriginPicHeight() > 0 && originPicWid > 0) {
             label_0068 :
                String str1 = str;
             }
          }
          str = null;
          goto label_0068 ;
          if (b == null) {
             obj = a.getAssets(0).toBuilder();
             Object obj1 = PatchProxy.applyTwoRefs(p0, obj, this, op, "4");
             if (obj1 != patchProxyRe) {
             }else {
                file = obj.getFile();
                obj1 = (TextUtils.x(file))? null: new File(p0, file);
             }
             if (obj1 == null) {
                Object[] objArray = new Object[0];
                f.D().A("Migrator2770", "no valid file", objArray);
             }else {
                b0 uob0 = BitmapUtil.E(obj1.getAbsolutePath());
                obj.o((double)uob0.b);
                obj.p((double)uob0.a);
                a.g(0, obj);
             }
          }
       }
       return;
    }
}
