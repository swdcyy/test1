package kaa.c;
import kaa.w;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import haa.f;
import q87.c;
import com.kuaishou.edit.draft.Asset;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.kuaishou.edit.draft.Asset$ShootInfo$a;
import com.kuaishou.edit.draft.RecordBeauty;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Beauty$b;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import kaa.v;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.Beauty$Item$a;
import com.kuaishou.edit.draft.Beauty$Item;
import com.kuaishou.edit.draft.Beauty$Item$ID;
import com.kuaishou.edit.draft.RecordBeauty$SmoothSkinConfig;
import com.kuaishou.edit.draft.RecordBeauty$DeformConfig;

public class c extends w	// class@002c25
{
    public final d a;

    public void c(){
       super();
       this.a = new d(2, 1, 0);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().w("Migrator210", "migrate", objArray);
       for (; i < p0.getAssetsCount(); i = i + 1) {
          Asset$b uob = p0.getAssets(i).toBuilder();
          if (uob.instance.hasShootInfo() && uob.getShootInfo().hasRecordBeauty()) {
             Asset$ShootInfo$a shootInfo$a = uob.getShootInfo().toBuilder();
             RecordBeauty recordBeauty = uob.getShootInfo().getRecordBeauty();
             Beauty$b uob1 = PatchProxy.applyOneRefs(recordBeauty, this, c.class, "2");
             if (uob1 != PatchProxyResult.class) {
             }else {
                uob1 = Beauty.newBuilder();
                FeatureId$b uob2 = FeatureId.newBuilder();
                uob2.c(v.a(recordBeauty.getId()));
                uob1.d(uob2);
                uob1.c(recordBeauty.getAttributes());
                Beauty$Item$a item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.BRIGHT);
                f = recordBeauty.getSmoothConfig().getBright() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.SOFTEN);
                f = recordBeauty.getSmoothConfig().getSoften() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.TEETH_BRIGHTEN);
                f = recordBeauty.getSmoothConfig().getTeethBrighten() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.EYE_BRIGHTEN);
                f = recordBeauty.getSmoothConfig().getEyeBrighten() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.EYE_BAG_REMOVE);
                f = recordBeauty.getSmoothConfig().getEyeBagRemove() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.WRINKLE_REMOVE);
                f = recordBeauty.getSmoothConfig().getWrinkleRemove() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.NOSE_SHADOW);
                f = recordBeauty.getSmoothConfig().getNoseShadow() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.BEAUTIFY_LIPS);
                f = recordBeauty.getSmoothConfig().getBeautifyLips() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.ENLARGE_EYE);
                f = recordBeauty.getDeformConfig().getEnlargeEye() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.JAW);
                f = recordBeauty.getDeformConfig().getJaw() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.THIN_FACE);
                f = recordBeauty.getDeformConfig().getThinFace() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.THIN_NOSE);
                f = recordBeauty.getDeformConfig().getThinNose() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.TINY_FACE);
                f = recordBeauty.getDeformConfig().getTinyFace() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.EYE_DISTANCE);
                f = recordBeauty.getDeformConfig().getEyeDistance() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.CUT_FACE);
                f = recordBeauty.getDeformConfig().getCutFace() / 100.00f;
                item$a.b(f);
                uob1.b(item$a.build());
                item$a = Beauty$Item.newBuilder();
                item$a.a(Beauty$Item$ID.FORE_HEAD);
                float f1 = recordBeauty.getDeformConfig().getForeHead() / 100.00f;
                item$a.b(f1);
                uob1.b(item$a.build());
             }
             shootInfo$a.copyOnWrite();
             shootInfo$a.instance.setBeauty(uob1);
             shootInfo$a.copyOnWrite();
             shootInfo$a.instance.clearRecordBeauty();
             uob.t(shootInfo$a);
          }
          p0.g(i, uob);
       }
       return;
    }
}
