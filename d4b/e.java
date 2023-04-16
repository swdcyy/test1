package d4b.e;
import erd.o;
import d4b.b;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicFaceResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import s5b.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.lang.Integer;
import q87.c;
import f4b.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Map;

public final class e implements o	// class@00242d
{
    public final b b;
    public final Ref$IntRef c;
    public final Ref$ObjectRef d;
    public final Ref$ObjectRef e;

    public void e(b p0,Ref$IntRef p1,Ref$ObjectRef p2,Ref$ObjectRef p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "netFaceResponse");
          b uob = b.D();
          StringBuilder str = "getApiService : "+this.b.c.mName+"  ";
          MagicFaceResponse mMagicFaces = p0.mMagicFaces;
          Integer integer = (mMagicFaces != null)? Integer.valueOf(mMagicFaces.size()): null;
          Object[] objArray = new Object[0];
          uob.s("MagicLocalRepository", str+integer, objArray);
          uob = this.b.c;
          Ref$IntRef element = this.c.element;
          uob.mLoadIndex = element;
          if (element >= uob.mMagicFaces.size()) {
             this.b.c.mNoMore = true;
          }
          b.e(p0.mMagicFaces);
          uArrayList = new ArrayList();
          Iterator iterator = this.d.element.iterator();
          while (iterator.hasNext()) {
             MagicEmoji$MagicFace magicFace = iterator.next();
             MagicEmoji$MagicFace magicFace1 = p0.getMagicFace(magicFace.mId);
             if (magicFace1 == null) {
                magicFace1 = this.e.element.get(magicFace.mId);
             }
             if (magicFace1 != null) {
                uArrayList.add(magicFace1);
             }
          }
       }
       return uArrayList;
    }
}
