package je9.c;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.ChildMagicFace;
import java.util.Map;
import com.yxcorp.gifshow.model.CustomConfig;
import java.io.File;
import i4b.g;
import kotlin.jvm.internal.a;
import q5b.a;
import java.lang.StringBuilder;
import java.util.Objects;
import fg6.a;
import qkd.c;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import q5b.b;
import java.lang.Runnable;
import ekd.k1;
import s5b.b;
import java.lang.Throwable;
import q87.c;

public final class c implements Callable	// class@002a6f
{
    public final MagicEmoji$MagicFace b;

    public void c(MagicEmoji$MagicFace p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Object[] objArray = null;
       String str = "1";
       c uoc = PatchProxy.apply(objArray, this, c.class, str);
       if (uoc != PatchProxyResult.class) {
       }else {
          MagicEmoji$MagicFace mChildMagicF = this.b.mChildMagicFace;
          if (mChildMagicF != null) {
             ChildMagicFace mConfig = mChildMagicF.mConfig;
             Map pickMoreMedi = (mConfig != null)? mConfig.getPickMoreMedia(): objArray;
             a uoa = 1;
             uoc = (pickMoreMedi == null || pickMoreMedi.isEmpty())? 1: null;
             if (uoc) {
                mChildMagicF = this.b.mChildMagicFace;
                if (mChildMagicF != null) {
                   mConfig = mChildMagicF.mConfig;
                   if (mConfig != null) {
                      objArray = mConfig.getInputText();
                   }
                }
                if (objArray != null && !objArray.isEmpty()) {
                   uoa = null;
                }
                if (uoa) {
                   try{
                      File uFile = g.c();
                      a.o(uFile, "MagicFaceResourceHelper.¡­MagicFaceResourceFolder\(\)");
                      uoa = a.a;
                      c tb = this.b;
                      String str1 = uFile.getAbsolutePath()+File.separator+g.b(this.b.mChildMagicFace);
                      Objects.requireNonNull(uoa);
                      if (!PatchProxy.applyVoidTwoRefs(tb, str1, uoa, a.class, str)) {
                         a.p(tb, "magicFace");
                         String str2 = "resourcePath";
                         a.p(str1, str2);
                         CustomConfig uCustomConfi = a.a.h(c.j(new File(new File(str1), "config.json")), CustomConfig.class);
                         HashMap hashMap = new HashMap();
                         Map pickMoreMedi1 = uCustomConfi.getPickMoreMedia();
                         if (pickMoreMedi1 != null) {
                            Iterator iterator = pickMoreMedi1.entrySet().iterator();
                            while (iterator.hasNext()) {
                               Map$Entry uEntry = iterator.next();
                               Object key = uEntry.getKey();
                               String absolutePath = new File(str1, uEntry.getValue()).getAbsolutePath();
                               a.o(absolutePath, "File\(resourcePath, it.value\).absolutePath");
                               hashMap.put(key, absolutePath);
                            }
                         }
                         uCustomConfi.setPickMoreMedia(hashMap);
                         k1.o(new b(tb, uCustomConfi));
                      }
                   }catch(java.lang.Exception e0){
                      b.D().z("magic_swap", "handleChildResource", e0);
                   }
                }
             }
          }
       }
       return uoc;
    }
}
