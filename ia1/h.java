package ia1.h;
import com.kwai.framework.cache.a$a;
import java.lang.Object;
import v56.f;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import ia1.e;
import java.lang.Number;
import qkd.b;

public class h implements a$a	// class@00287d
{

    public void h(){
       super();
    }
    public boolean a(boolean p0,boolean p1){
       return f.d(this, p0, p1);
    }
    public long b(boolean p0){
       return f.g(this, p0);
    }
    public List c(boolean p0){
       ArrayList obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(new File(LiveResourceFileUtil.k("live_pk_resource")));
       obj.add(new File(LiveResourceFileUtil.k("live_multi_pk")));
       obj.add(new File(LiveResourceFileUtil.k("live_pk_image_resource_custom_skin_v2")));
       obj.add(new File(LiveResourceFileUtil.k("live_pk_image_resource_anchor_honor_v2")));
       obj.add(new File(LiveResourceFileUtil.k("live_multi_pk_resource_image_honor_skin")));
       obj.add(new File(LiveResourceFileUtil.k("live_multi_pk_resource_image_normal_skin")));
       obj.add(new File(LiveResourceFileUtil.k("live_multi_pk_resource_image_activity_skin")));
       obj.add(new File(LiveResourceFileUtil.k("live_enter_room_effect")));
       obj.add(new File(LiveResourceFileUtil.k(e.a)));
       obj.add(new File(LiveResourceFileUtil.k("mmu_models")));
       obj.add(new File(LiveResourceFileUtil.k("live_robot_audio")));
       obj.add(new File(LiveResourceFileUtil.k("live_quiz_sound")));
       obj.add(new File(LiveResourceFileUtil.k("live_voice_party")));
       obj.add(new File(LiveResourceFileUtil.k("live_first_recharge")));
       obj.add(new File(LiveResourceFileUtil.k("live_honor_medal_resource")));
       obj.add(new File(LiveResourceFileUtil.k("live_merchant_skin_resource")));
       obj.add(new File(LiveResourceFileUtil.k("live_new_icons_v2")));
       obj.add(new File(LiveResourceFileUtil.k("live_enter_room_effect")));
       obj.add(new File(LiveResourceFileUtil.k("live_wealth_grade_enter_room_effect")));
       obj.add(new File(LiveResourceFileUtil.k("live_audio_lottie")));
       obj.add(new File(LiveResourceFileUtil.k("live_pay_bullet_resource")));
       obj.add(new File(LiveResourceFileUtil.k("live_noble_enter_room_mount_resource")));
       obj.add(new File(LiveResourceFileUtil.k("live_noble_enter_room_welcome_resource")));
       obj.add(new File(LiveResourceFileUtil.k("merchant_live_mmu")));
       obj.add(new File(LiveResourceFileUtil.k("live_magic_box_loading_background_resource")));
       obj.add(new File(LiveResourceFileUtil.k("live_send_gift_combo_button_animation_resource")));
       obj.add(new File(LiveResourceFileUtil.k("live_activity_red_packet_resource")));
       obj.add(new File(LiveResourceFileUtil.k("live_arya_ai_denoise_model")));
       obj.add(new File(LiveResourceFileUtil.k("live_arya_audio_cae_model")));
       obj.add(new File(LiveResourceFileUtil.k("live_chatroom_micseat_share")));
       obj.add(new File(LiveResourceFileUtil.k("live_over_room_resource")));
       return obj;
    }
    public long d(){
       File[] obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = new File[32];
       obj[0] = new File(LiveResourceFileUtil.k("live_over_room_resource"));
       obj[1] = new File(LiveResourceFileUtil.k("live_pk_resource"));
       obj[2] = new File(LiveResourceFileUtil.k("live_multi_pk"));
       obj[3] = new File(LiveResourceFileUtil.k("live_pk_image_resource_custom_skin_v2"));
       obj[4] = new File(LiveResourceFileUtil.k("live_pk_image_resource_anchor_honor_v2"));
       obj[5] = new File(LiveResourceFileUtil.k("live_multi_pk_resource_image_honor_skin"));
       obj[6] = new File(LiveResourceFileUtil.k("live_multi_pk_resource_image_normal_skin"));
       obj[7] = new File(LiveResourceFileUtil.k("live_multi_pk_resource_image_activity_skin"));
       obj[8] = new File(LiveResourceFileUtil.k("live_enter_room_effect"));
       obj[9] = new File(LiveResourceFileUtil.k(e.a));
       obj[10] = new File(LiveResourceFileUtil.k("mmu_models"));
       obj[11] = new File(LiveResourceFileUtil.k("live_robot_audio"));
       obj[12] = new File(LiveResourceFileUtil.k("live_quiz_sound"));
       obj[13] = new File(LiveResourceFileUtil.k("live_voice_party"));
       obj[14] = new File(LiveResourceFileUtil.k("live_first_recharge"));
       obj[15] = new File(LiveResourceFileUtil.k("live_honor_medal_resource"));
       obj[16] = new File(LiveResourceFileUtil.k("live_merchant_skin_resource"));
       obj[17] = new File(LiveResourceFileUtil.k("live_new_icons_v2"));
       obj[18] = new File(LiveResourceFileUtil.k("live_enter_room_effect"));
       obj[19] = new File(LiveResourceFileUtil.k("live_wealth_grade_enter_room_effect"));
       obj[20] = new File(LiveResourceFileUtil.k("live_audio_lottie"));
       obj[21] = new File(LiveResourceFileUtil.k("live_pay_bullet_resource"));
       obj[22] = new File(LiveResourceFileUtil.k("live_noble_enter_room_mount_resource"));
       obj[23] = new File(LiveResourceFileUtil.k("live_noble_enter_room_welcome_resource"));
       obj[24] = new File(LiveResourceFileUtil.k("merchant_live_mmu"));
       obj[25] = new File(LiveResourceFileUtil.k("live_magic_box_loading_background_resource"));
       obj[26] = new File(LiveResourceFileUtil.k("live_send_gift_combo_button_animation_resource"));
       obj[27] = new File(LiveResourceFileUtil.k("live_activity_red_packet_resource"));
       obj[28] = new File(LiveResourceFileUtil.k("live_arya_ai_denoise_model"));
       obj[29] = new File(LiveResourceFileUtil.k("live_arya_audio_cae_model"));
       obj[30] = new File(LiveResourceFileUtil.k("live_chatroom_micseat_share"));
       obj[31] = new File(LiveResourceFileUtil.k("live_multi_line_resource"));
       return b.p0(obj);
    }
    public long e(boolean p0){
       return f.h(this, p0);
    }
    public List f(boolean p0){
       return f.f(this, p0);
    }
    public void g(boolean p0){
       f.a(this, p0);
    }
    public void h(boolean p0){
       f.j(this, p0);
    }
    public List i(boolean p0){
       return f.c(this, p0);
    }
    public int j(boolean p0){
       return f.e(this, p0);
    }
    public List k(boolean p0){
       return f.i(this, p0);
    }
    public String name(){
       return "LiveResource_CacheHandler";
    }
}
