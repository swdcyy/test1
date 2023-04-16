package kaa.e;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.BeautyFilter;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.BeautyFilter$b;
import com.kuaishou.edit.draft.EditBeauty$b;
import com.kuaishou.edit.draft.EditBeauty;

public class e extends w	// class@002c27
{
    public final d a;

    public void e(){
       super();
       this.a = new d(2, 2, 3);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.b(p0);
       c a = p0.a;
       a.f("Android");
       if (p0.a.getType() == Workspace$Type.KUAISHAN || p0.a.getSource() == Workspace$Source.KUAI_SHAN) {
          p0.a.c();
          return;
       }else {
          for (int i = 0; i < p0.a.instance.getBeautyFiltersCount(); i = i + 1) {
             BeautyFilter$b uob = a.instance.getBeautyFilters(i).toBuilder();
             EditBeauty$b uob1 = EditBeauty.newBuilder();
             double d = 0x3fe0000000000000;
             double d1 = (uob.getBright() - d <= 0)? uob.getBright() * 2.00f: 0x3ff0000000000000;
             uob1.copyOnWrite();
             uob1.instance.setBrightIntensity((float)d1);
             if (uob.getSoft() - d <= 0) {
                d = uob.getSoft() * 0x3ff3333340000000;
             }else {
                d = uob.getSoft() * 0x3fe99999a0000000;
                d = d + 0x3fc99999a0000000;
             }
             uob1.copyOnWrite();
             uob1.instance.setSoftenIntensity((float)d);
             a.copyOnWrite();
             a.instance.addEditBeauty(uob1);
             a.copyOnWrite();
             a.instance.setBeautyFilters(i, uob);
          }
          a.c();
          return;
       }
    }
}
