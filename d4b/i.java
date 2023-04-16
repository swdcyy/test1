package d4b.i;
import java.util.concurrent.Callable;
import d4b.h;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.MagicEmoji;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import f4b.b;
import s5b.b;
import java.lang.StringBuilder;
import java.lang.Integer;
import q87.c;
import java.util.Collection;
import ekd.q;
import java.util.Map;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;

public final class i implements Callable	// class@002432
{
    public final h b;
    public final Ref$ObjectRef c;

    public void i(h p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       Object[] objArray = null;
       ArrayList uArrayList = PatchProxy.apply(objArray, this, i.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          i tb = this.b;
          h c = tb.c;
          MagicEmoji mNextPageIds = c.mNextPageIds;
          if (c.mTabType == 3) {
             mNextPageIds = b.d(tb.a, c.mId, 0, 999);
          }
          b uob = b.D();
          StringBuilder str = "get queryList : ";
          Integer integer = (mNextPageIds != null)? Integer.valueOf(mNextPageIds.size()): objArray;
          Object[] objArray1 = new Object[0];
          uob.w("MagicRepository", str+integer+" pCursor: "+this.b.c.mPCursor, objArray1);
          if (!q.f(mNextPageIds)) {
             Map map = b.b(mNextPageIds);
             a.o(map, "MagicBriefPageDbHelper.g¡­CacheMagicFace\(queryList\)");
             this.c.element = map;
             Ref$ObjectRef element = this.c.element;
             if (element != null) {
                objArray = element.values();
             }
             Iterator iterator = objArray.iterator();
             while (iterator.hasNext()) {
                MagicEmoji$MagicFace magicFace = iterator.next();
                uArrayList.add(magicFace.mId+'='+magicFace.mChecksum);
             }
          }
       }
       return uArrayList;
    }
}
