package kaa.m;
import kaa.w;
import com.google.common.collect.HashBiMap;
import jaa.d;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.InternalFeatureId;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import qk.f;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.Text$b;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.Cover;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Cover$b;
import com.kwai.robust.PatchProxyResult;

public class m extends w	// class@002c2f
{
    public final d a;
    public static final f b;

    static {
       m.b = HashBiMap.create();
    }
    public void m(){
       super();
       this.a = new d(2, 7, 47);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().s("Migrator2745", "current version:"+this.a().toString(), objArray);
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       if (!PatchProxy.applyVoid(null, this, om, "3")) {
          f b = m.b;
          FeatureId$b uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_CUBE);
          b.put("cube_text1", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_ID_BLUE);
          b.put("id_blue", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_ID_RED);
          b.put("id_red", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_ID_YELLOW);
          b.put("id_orange", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BUBBLE_MOSAIC);
          b.put("bubble_mosaic", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_TRANSLUCENT_BLACK);
          b.put("banner_text0", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_TRANSLUCENT_ORANGE);
          b.put("banner_text1", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_BOLD_STROKE);
          b.put("banner_text2", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_TWOLINE_RED);
          b.put("two_lines_red", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_TWOLINE_BLUE);
          b.put("two_lines_blue", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_TWOLINE_YELLOW);
          b.put("two_lines_orange", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_TWOLINE_BLACK);
          b.put("two_lines_black", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_YELLOW_01);
          b.put("yellow_01", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_SLOGAN_VIOLET);
          b.put("slogan_violet", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_IRREGULAR_YELLOW);
          b.put("irregular_yellow", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_NICKNAME_FRESH);
          b.put("nickname_fresh", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_NOTE_WHITE);
          b.put("note_white", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_QUIET_PURPLE);
          b.put("quiet_purple", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_ROUND_BLUE);
          b.put("round_text0", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_ROUND_RED);
          b.put("round_text1", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_SOLID_GRADIENT);
          b.put("solid_gradient", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BRUSH_BLACK);
          b.put("brush_black", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BUBBLE_BLUE);
          b.put("bubble_blue", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_DATE_ORANGE);
          b.put("date_orange", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_DATE_BLUE);
          b.put("date_blue", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_EMPTY_WHITE);
          b.put("empty_white", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_NICKNAME_GREEN);
          b.put("nickname_green", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_NICKNAME_ORANGE);
          b.put("nickname_orange", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_NICKNAME_WHITE);
          b.put("nickname_white", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_FOURLINE_CUBE);
          b.put("four_lines_cube", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_SIGNIN_ORANGE);
          b.put("signin_orange", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_SIGNIN_WHITE);
          b.put("signin_white", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_SLOGAN_TILT);
          b.put("slogan_tilt", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_YELLOW_02);
          b.put("yellow_02", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_SHADOW_01);
          b.put("shadow_01", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_SHADOW_02);
          b.put("shadow_02", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_01);
          b.put("border_01", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_02);
          b.put("border_02", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_03);
          b.put("border_03", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_04);
          b.put("border_04", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_05);
          b.put("border_05", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_06);
          b.put("border_06", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_07);
          b.put("border_07", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_08);
          b.put("border_08", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_09);
          b.put("border_09", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_10);
          b.put("border_10", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_15);
          b.put("border_15", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_GRADIENT_ORANGE);
          b.put("gradient_text0", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_GRADIENT_PURPLE);
          b.put("gradient_text1", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_GRADIENT_BLUE);
          b.put("gradient_text2", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BANNER_GRADIENT_PINK);
          b.put("gradient_text3", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.COVER_BANNER_GRADIENT_ORANGE);
          b.put("cover_gradient_text0", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.COVER_BANNER_GRADIENT_PURPLE);
          b.put("cover_gradient_text1", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.COVER_BANNER_GRADIENT_BLUE);
          b.put("cover_gradient_text2", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.COVER_BANNER_GRADIENT_PINK);
          b.put("cover_gradient_text3", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_11);
          b.put("border_11", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_COLORFUL_07);
          b.put("colorful_07", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_14);
          b.put("border_14", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_GRADUAL_CANDY);
          b.put("gradual_candy", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_FLUORESCENT_GREEN);
          b.put("fluorescent_green", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_YELLOW_05);
          b.put("yellow_05", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BLACK_01);
          b.put("black_01", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_WHITE_01);
          b.put("white_01", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_12);
          b.put("border_12", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_NEON_RED);
          b.put("neon_red", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_BORDER_13);
          b.put("border_13", uob3.build());
          uob3 = FeatureId.newBuilder();
          uob3.b(InternalFeatureId.TEXT_NEON_BLUE);
          b.put("neon_blue", uob3.build());
       }
       int i = 0;
       while (i < p0.getTextsCount()) {
          Text$b uob = p0.getTexts(i).toBuilder();
          String str = m.b.inverse().get(uob.getFeatureId());
          Object[] objArray1 = new Object[0];
          f.D().s("Migrator2745", "textId:"+str+"featureId: "+uob.getFeatureId().getInternal(), objArray1);
          if (!TextUtils.x(str)) {
             uob.h(this.c(str));
             p0.s(i, uob);
          }
          i = i + 1;
       }
       i = 0;
       while (i < p0.getCoversCount()) {
          Cover covers = p0.getCovers(i);
          Iterator iterator = covers.getTextsList().iterator();
          while (iterator.hasNext()) {
             Text$b uob1 = iterator.next().toBuilder();
             String str1 = m.b.inverse().get(uob1.getFeatureId());
             Object[] objArray2 = new Object[0];
             f.D().s("Migrator2745", "cover textId:"+str1+" featureId: "+uob1.getFeatureId().getInternal(), objArray2);
             if (TextUtils.x(str1)) {
                continue ;
             }
             uob1.h(this.c(str1));
             Cover$b uob2 = covers.toBuilder();
             uob2.g(i, uob1);
             p0.j(i, uob2);
          }
          i = i + 1;
       }
       return;
    }
    public final FeatureId c(String p0){
       FeatureId$b obj = PatchProxy.applyOneRefs(p0, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FeatureId.newBuilder();
       obj.a(p0);
       return obj.build();
    }
}
