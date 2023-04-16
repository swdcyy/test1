package kaa.h;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace;
import java.util.List;
import java.util.Collections;
import com.kuaishou.edit.draft.EditBeauty;
import com.kuaishou.edit.draft.Beauty$b;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Beauty$Item$a;
import com.kuaishou.edit.draft.Beauty$Item;
import com.kuaishou.edit.draft.Beauty$Item$ID;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Iterator;
import com.kuaishou.edit.draft.DeformParam;

public class h extends w	// class@002c2a
{
    public final d a;

    public void h(){
       super();
       this.a = new d(2, 5, 1);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       Beauty$Item$a item$a1;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       for (int i = 0; i < Collections.unmodifiableList(p0.instance.getEditBeautyList()).size(); i = i + 1) {
          EditBeauty editBeauty = p0.instance.getEditBeauty(i);
          Beauty$b uob = Beauty.newBuilder();
          uob.copyOnWrite();
          uob.instance.setFeatureId(editBeauty.getFeatureId());
          Beauty$Item$a item$a = Beauty$Item.newBuilder();
          item$a.a(Beauty$Item$ID.BRIGHT);
          item$a.b(editBeauty.getBrightIntensity());
          uob.b(item$a.build());
          item$a = Beauty$Item.newBuilder();
          item$a.a(Beauty$Item$ID.SOFTEN);
          item$a.b(editBeauty.getSoftenIntensity());
          uob.b(item$a.build());
          item$a = Beauty$Item.newBuilder();
          item$a.a(Beauty$Item$ID.WRINKLE_REMOVE);
          item$a.b(editBeauty.getWrinkleRemoveIntensity());
          uob.b(item$a.build());
          item$a = Beauty$Item.newBuilder();
          item$a.a(Beauty$Item$ID.EYE_BAG_REMOVE);
          item$a.b(editBeauty.getEyeBagRemoveIntensity());
          uob.b(item$a.build());
          item$a = Beauty$Item.newBuilder();
          item$a.a(Beauty$Item$ID.EYE_BRIGHTEN);
          item$a.b(editBeauty.getEyeBrightenIntensity());
          uob.b(item$a.build());
          item$a = Beauty$Item.newBuilder();
          item$a.a(Beauty$Item$ID.TEETH_BRIGHTEN);
          item$a.b(editBeauty.getTeethBrightenIntensity());
          uob.b(item$a.build());
          item$a = Beauty$Item.newBuilder();
          item$a.a(Beauty$Item$ID.BEAUTIFY_LIPS);
          item$a.b(editBeauty.getBeautifyLipsIntensity());
          uob.b(item$a.build());
          item$a = Beauty$Item.newBuilder();
          item$a.a(Beauty$Item$ID.NOSE_SHADOW);
          item$a.b(editBeauty.getNoseShadowIntensity());
          uob.b(item$a.build());
          Iterator iterator = editBeauty.getDeformParamsList().iterator();
          while (iterator.hasNext()) {
             DeformParam uDeformParam = iterator.next();
             switch (uDeformParam.getIdentifier()){
                 case 0:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.EYE_DISTANCE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 1:
                 case 2:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.ENLARGE_EYE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 3:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.MOUTH_WIDTH);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 4:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.MOUTH_HEIGHT);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 5:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.EYE_CORNER);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 6:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.THIN_FACE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 7:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.CUT_FACE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 8:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.TINY_FACE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 9:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.JAW);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 10:
                 case 21:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.THIN_NOSE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 11:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.LONG_NOSE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 12:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.FORE_HEAD);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 13:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.THIN_CHEEKBONE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 14:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.ENLARGE_EYE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 15:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.PHILTRUM);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 16:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.MOUTH);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 17:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.THIN_LOWER_JAW);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 18:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.LOWER_JAWBONE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 19:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.NARROW_FACE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 case 20:
                   item$a1 = Beauty$Item.newBuilder();
                   item$a1.a(Beauty$Item$ID.SHORT_FACE);
                   item$a1.b(uDeformParam.getIntensity());
                   uob.b(item$a1.build());
                   break;
                 default:
             }
          }
          p0.copyOnWrite();
          p0.instance.addBeauties(uob);
       }
       return;
    }
}
