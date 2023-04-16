package atc.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import vba.h;
import di0.b;
import com.kuaishou.kotlin.livedata.ListHolder;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import java.util.List;
import zsc.a;
import com.kuaishou.edit.draft.AssetSegment;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Collection;
import java.lang.Number;
import wba.z;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import vba.g;
import com.kuaishou.edit.draft.FineTuningParam;
import java.lang.Integer;

public final class a	// class@0002ca
{
    public final h a;
    public final b b;
    public final c c;

    public void a(c p0){
       a.p(p0, "workspaceDraft");
       super();
       this.c = p0;
       this.a = new h();
       this.b = new b(null, 1, null);
    }
    public final void a(String p0){
       String identifier;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "identifier");
       int i = -1;
       int i1 = 0;
       int i2 = this.b.v();
       if (i2 >= 0) {
          while (true) {
             ListHolder value = this.b.getValue();
             if (value != null) {
                List list = value.c();
                if (list != null) {
                   a uoa = list.get(i1);
                   if (uoa != null) {
                      AssetSegment uAssetSegmen = uoa.a();
                      if (uAssetSegmen != null) {
                         identifier = uAssetSegmen.getIdentifier();
                         if (identifier != null) {
                            break ;
                         }else {
                         label_003f :
                            identifier = "";
                            break ;
                         }
                      }else {
                         goto label_003f ;
                      }
                   }else {
                      goto label_003f ;
                   }
                }else {
                   goto label_003f ;
                }
             }else {
                goto label_003f ;
             }
          }
          if (a.g(identifier, p0)) {
             i = i1;
          }else if(i1 != i2){
             i1 = i1 + 1;
          }
       }
       if (i >= 0) {
          b.x(this.b, i, null, 2, null);
       }
       return;
    }
    public final ArrayList b(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(a.c(this.c).z());
    }
    public final int c(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return z.B(this.c);
    }
    public final void d(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          uoa = this.a;
          uoa.g(this.c);
          uoa.c(1);
       }
       List list = z.x(Workspace$Type.ATLAS, this.c);
       int i = 0;
       a tb = this.b;
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          AssetSegment uAssetSegmen = iterator.next();
          FineTuningParam fineTuningPa = list.get(i).getFineTuningParam();
          a.o(fineTuningPa, "assetSegmentList[index].fineTuningParam");
          i = i + 1;
          uArrayList.add(new a(uAssetSegmen, this.a.f(uAssetSegmen), fineTuningPa, i));
       }
       tb.s(uArrayList, Integer.valueOf(1));
       return;
    }
}
