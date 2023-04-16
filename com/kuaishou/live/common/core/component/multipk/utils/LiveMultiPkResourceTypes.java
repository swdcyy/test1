package com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import pu1.d;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pu1.e;
import d61.c0;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveMultiPkResourceTypes extends Enum implements d	// class@0016a1
{
    public final String cdnUrlWithoutHost;
    public final String localFileName;
    public static final LiveMultiPkResourceTypes[] $VALUES;
    public static final LiveMultiPkResourceTypes ANIM_FILE_WEBP;
    public static final LiveMultiPkResourceTypes ARENA_RESULT_ANIM_FIRST;
    public static final LiveMultiPkResourceTypes ARENA_RESULT_ANIM_TIE;
    public static final LiveMultiPkResourceTypes ARENA_START_ANIM;
    public static final LiveMultiPkResourceTypes BOTTOM_BAR_LOOP_LOTTIE;
    public static final LiveMultiPkResourceTypes BOTTOM_BAR_NOTICE_LOTTIE;
    public static final LiveMultiPkResourceTypes COHESION_PK_RESULT_HEART;
    public static final LiveMultiPkResourceTypes COHESION_PK_RESULT_LOSE_BOTTOM_BACKGROUND;
    public static final LiveMultiPkResourceTypes COHESION_PK_RESULT_TIE_BOTTOM_BACKGROUND;
    public static final LiveMultiPkResourceTypes COHESION_PK_RESULT_WIN_BOTTOM_BACKGROUND;
    public static final LiveMultiPkResourceTypes COHESION_PK_START_ANIM;
    public static final LiveMultiPkResourceTypes FINAL_LOSE;
    public static final LiveMultiPkResourceTypes FINAL_TIE;
    public static final LiveMultiPkResourceTypes FINAL_WIN;
    public static final LiveMultiPkResourceTypes GIFT_MOMENT_ENTER_ANIM;
    public static final LiveMultiPkResourceTypes GIFT_MOMENT_TIP_ICON;
    public static final LiveMultiPkResourceTypes LIVE_PK_RANK_OPPONENT_EMPTY;
    public static final LiveMultiPkResourceTypes LIVE_PK_RANK_OPPONENT_FIRST;
    public static final LiveMultiPkResourceTypes LIVE_PK_RANK_OPPONENT_SECOND;
    public static final LiveMultiPkResourceTypes LIVE_PK_RANK_OPPONENT_THIRD;
    public static final LiveMultiPkResourceTypes LIVE_PK_RANK_SELF_EMPTY;
    public static final LiveMultiPkResourceTypes LIVE_PK_RANK_SELF_FIRST;
    public static final LiveMultiPkResourceTypes LIVE_PK_RANK_SELF_SECOND;
    public static final LiveMultiPkResourceTypes LIVE_PK_RANK_SELF_THIRD;
    public static final LiveMultiPkResourceTypes MULTI_PK_ANIMATION_FIRST;
    public static final LiveMultiPkResourceTypes MULTI_PK_ANIMATION_FOURTH;
    public static final LiveMultiPkResourceTypes MULTI_PK_ANIMATION_SECOND;
    public static final LiveMultiPkResourceTypes MULTI_PK_ANIMATION_THIRD;
    public static final LiveMultiPkResourceTypes PK_RESOURCE_FAIL_SMALL;
    public static final LiveMultiPkResourceTypes PK_RESOURCE_TIE_SMALL;
    public static final LiveMultiPkResourceTypes PK_RESOURCE_VS;
    public static final LiveMultiPkResourceTypes PK_RESOURCE_WIN_SMALL;
    public static final LiveMultiPkResourceTypes SCORE_LIMIE_RESULT_FAIL_SMALL;
    public static final LiveMultiPkResourceTypes SCORE_LIMIE_RESULT_LOSE;
    public static final LiveMultiPkResourceTypes SCORE_LIMIE_RESULT_TIE;
    public static final LiveMultiPkResourceTypes SCORE_LIMIE_RESULT_TIE_SMALL;
    public static final LiveMultiPkResourceTypes SCORE_LIMIE_RESULT_WIN;
    public static final LiveMultiPkResourceTypes SCORE_LIMIE_RESULT_WIN_SMALL;
    public static final LiveMultiPkResourceTypes VOTE_RANK_1;
    public static final LiveMultiPkResourceTypes VOTE_RANK_2;
    public static final LiveMultiPkResourceTypes VOTE_RANK_3;
    public static final LiveMultiPkResourceTypes VOTE_RANK_4;
    public static final LiveMultiPkResourceTypes WISH_BATTLE_ANIMATION_START;
    public static final LiveMultiPkResourceTypes WISH_BATTLE_RESULT_FIRST_BOTTOM;
    public static final LiveMultiPkResourceTypes WISH_BATTLE_RESULT_FOURTH_BOTTOM;
    public static final LiveMultiPkResourceTypes WISH_BATTLE_RESULT_SECOND_AND_THIRD_BOTTOM;

    static {
       LiveMultiPkResourceTypes[] liveMultiPkR = new LiveMultiPkResourceTypes[46];
       LiveMultiPkResourceTypes liveMultiPkR1 = new LiveMultiPkResourceTypes("VOTE_RANK_1", 0, "live_multi_pk_resource/live_multi_pk_animation_first.webp", "udata/pkg/kwai-client-image/live_multi_pk/live_multi_pk_animation_first.png");
       LiveMultiPkResourceTypes.VOTE_RANK_1 = liveMultiPkR1;
       liveMultiPkR[0] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("VOTE_RANK_2", 1, "live_multi_pk_resource/live_multi_pk_animation_second.webp", "udata/pkg/kwai-client-image/live_multi_pk/live_multi_pk_animation_second.png");
       LiveMultiPkResourceTypes.VOTE_RANK_2 = liveMultiPkR1;
       liveMultiPkR[1] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("VOTE_RANK_3", 2, "live_multi_pk_resource/live_multi_pk_animation_third.webp", "udata/pkg/kwai-client-image/live_multi_pk/live_multi_pk_animation_third.png");
       LiveMultiPkResourceTypes.VOTE_RANK_3 = liveMultiPkR1;
       liveMultiPkR[2] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("VOTE_RANK_4", 3, "live_multi_pk_resource/live_multi_pk_animation_fourth.webp", "udata/pkg/kwai-client-image/live_multi_pk/live_multi_pk_animation_fourth.png");
       LiveMultiPkResourceTypes.VOTE_RANK_4 = liveMultiPkR1;
       liveMultiPkR[3] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("ANIM_FILE_WEBP", 4, "live_multi_pk_resource/live_multi_pk_animation_fire.webp", "");
       LiveMultiPkResourceTypes.ANIM_FILE_WEBP = liveMultiPkR1;
       liveMultiPkR[4] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("SCORE_LIMIE_RESULT_WIN", 5, "live_pk_score_limit_res_dir/live_pk_result_win.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_score_limit_result_win_back.webp");
       LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_WIN = liveMultiPkR1;
       liveMultiPkR[5] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("SCORE_LIMIE_RESULT_LOSE", 6, "live_pk_score_limit_res_dir/live_pk_result_fail.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_score_limit_result_fail_back.webp");
       LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_LOSE = liveMultiPkR1;
       liveMultiPkR[6] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("SCORE_LIMIE_RESULT_TIE", 7, "live_pk_score_limit_res_dir/live_pk_result_tie.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_score_limit_result_tie_back.webp");
       LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_TIE = liveMultiPkR1;
       liveMultiPkR[7] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("SCORE_LIMIE_RESULT_WIN_SMALL", 8, "live_pk_score_limit_res_dir/live_pk_result_win_small.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_score_limit_result_win_back_small.webp");
       LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_WIN_SMALL = liveMultiPkR1;
       liveMultiPkR[8] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("SCORE_LIMIE_RESULT_FAIL_SMALL", 9, "live_pk_score_limit_res_dir/live_pk_result_fail_small.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_score_limit_result_fail_back_small.webp");
       LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_FAIL_SMALL = liveMultiPkR1;
       liveMultiPkR[9] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("SCORE_LIMIE_RESULT_TIE_SMALL", 10, "live_pk_score_limit_res_dir/live_pk_result_tie_small.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_score_limit_result_tie_back_small.webp");
       LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_TIE_SMALL = liveMultiPkR1;
       liveMultiPkR[10] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("FINAL_WIN", 11, "live_pk_animation_files_v3/live_pk_result_win_v3.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_win_backup_v3.webp");
       LiveMultiPkResourceTypes.FINAL_WIN = liveMultiPkR1;
       liveMultiPkR[11] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("FINAL_LOSE", 12, "live_pk_animation_files_v3/live_pk_result_fail_v3.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_lose_backup_v3.webp");
       LiveMultiPkResourceTypes.FINAL_LOSE = liveMultiPkR1;
       liveMultiPkR[12] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("FINAL_TIE", 13, "live_pk_animation_files_v3/live_pk_result_tie_v3.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_tie_backup_v3.webp");
       LiveMultiPkResourceTypes.FINAL_TIE = liveMultiPkR1;
       liveMultiPkR[13] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("PK_RESOURCE_WIN_SMALL", 14, "live_pk_result_small/live_pk_result_win_small.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_win_backup_v3.webp");
       LiveMultiPkResourceTypes.PK_RESOURCE_WIN_SMALL = liveMultiPkR1;
       liveMultiPkR[14] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("PK_RESOURCE_FAIL_SMALL", 15, "live_pk_result_small/live_pk_result_fail_small.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_lose_backup_v3.webp");
       LiveMultiPkResourceTypes.PK_RESOURCE_FAIL_SMALL = liveMultiPkR1;
       liveMultiPkR[15] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("PK_RESOURCE_TIE_SMALL", 16, "live_pk_result_small/live_pk_result_tie_small.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_tie_backup_v3.webp");
       LiveMultiPkResourceTypes.PK_RESOURCE_TIE_SMALL = liveMultiPkR1;
       liveMultiPkR[16] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("GIFT_MOMENT_ENTER_ANIM", 17, "live_pk_gift_moment/live_pk_enter_gift_moment_anim.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_gift_moment_backup_anim.webp");
       LiveMultiPkResourceTypes.GIFT_MOMENT_ENTER_ANIM = liveMultiPkR1;
       liveMultiPkR[17] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("GIFT_MOMENT_TIP_ICON", 18, "live_pk_gift_moment/live_pk_gift_moment_tip_icon.webp", "udata/pkg/kwai-client-image/live_revenue_gift/live_pk_gift_moment_rule_backup.webp");
       LiveMultiPkResourceTypes.GIFT_MOMENT_TIP_ICON = liveMultiPkR1;
       liveMultiPkR[18] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("LIVE_PK_RANK_SELF_EMPTY", 19, "live_pk_rank_image/live_pk_rank_self_empty.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_rank_self_empty.webp");
       LiveMultiPkResourceTypes.LIVE_PK_RANK_SELF_EMPTY = liveMultiPkR1;
       liveMultiPkR[19] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("LIVE_PK_RANK_SELF_FIRST", 20, "live_pk_rank_image/live_pk_rank_self_first.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_rank_self_first.webp");
       LiveMultiPkResourceTypes.LIVE_PK_RANK_SELF_FIRST = liveMultiPkR1;
       liveMultiPkR[20] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("LIVE_PK_RANK_SELF_SECOND", 21, "live_pk_rank_image/live_pk_rank_self_second.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_rank_self_second.webp");
       LiveMultiPkResourceTypes.LIVE_PK_RANK_SELF_SECOND = liveMultiPkR1;
       liveMultiPkR[21] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("LIVE_PK_RANK_SELF_THIRD", 22, "live_pk_rank_image/live_pk_rank_self_third.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_rank_self_third.webp");
       LiveMultiPkResourceTypes.LIVE_PK_RANK_SELF_THIRD = liveMultiPkR1;
       liveMultiPkR[22] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("LIVE_PK_RANK_OPPONENT_EMPTY", 23, "live_pk_rank_image/live_pk_rank_opponent_empty.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_rank_opponent_empty.webp");
       LiveMultiPkResourceTypes.LIVE_PK_RANK_OPPONENT_EMPTY = liveMultiPkR1;
       liveMultiPkR[23] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("LIVE_PK_RANK_OPPONENT_FIRST", 24, "live_pk_rank_image/live_pk_rank_opponent_first.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_rank_opponent_first.webp");
       LiveMultiPkResourceTypes.LIVE_PK_RANK_OPPONENT_FIRST = liveMultiPkR1;
       liveMultiPkR[24] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("LIVE_PK_RANK_OPPONENT_SECOND", 25, "live_pk_rank_image/live_pk_rank_opponent_second.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_rank_opponent_second.webp");
       LiveMultiPkResourceTypes.LIVE_PK_RANK_OPPONENT_SECOND = liveMultiPkR1;
       liveMultiPkR[25] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("LIVE_PK_RANK_OPPONENT_THIRD", 26, "live_pk_rank_image/live_pk_rank_opponent_third.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_rank_opponent_third.webp");
       LiveMultiPkResourceTypes.LIVE_PK_RANK_OPPONENT_THIRD = liveMultiPkR1;
       liveMultiPkR[26] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("WISH_BATTLE_ANIMATION_START", 27, "live_wish_battle_animation_start.webp", "");
       LiveMultiPkResourceTypes.WISH_BATTLE_ANIMATION_START = liveMultiPkR1;
       liveMultiPkR[27] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("MULTI_PK_ANIMATION_FIRST", 28, "live_multi_pk_animation_first.webp", "");
       LiveMultiPkResourceTypes.MULTI_PK_ANIMATION_FIRST = liveMultiPkR1;
       liveMultiPkR[28] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("MULTI_PK_ANIMATION_SECOND", 29, "live_multi_pk_animation_second.webp", "");
       LiveMultiPkResourceTypes.MULTI_PK_ANIMATION_SECOND = liveMultiPkR1;
       liveMultiPkR[29] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("MULTI_PK_ANIMATION_THIRD", 30, "live_multi_pk_animation_third.webp", "");
       LiveMultiPkResourceTypes.MULTI_PK_ANIMATION_THIRD = liveMultiPkR1;
       liveMultiPkR[30] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("MULTI_PK_ANIMATION_FOURTH", 31, "live_multi_pk_animation_fourth.webp", "");
       LiveMultiPkResourceTypes.MULTI_PK_ANIMATION_FOURTH = liveMultiPkR1;
       liveMultiPkR[31] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("WISH_BATTLE_RESULT_FIRST_BOTTOM", 32, "live_wish_battle_result_first_bottom.png", "");
       LiveMultiPkResourceTypes.WISH_BATTLE_RESULT_FIRST_BOTTOM = liveMultiPkR1;
       liveMultiPkR[32] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("WISH_BATTLE_RESULT_SECOND_AND_THIRD_BOTTOM", 33, "live_wish_battle_result_second_and_third_bottom.png", "");
       LiveMultiPkResourceTypes.WISH_BATTLE_RESULT_SECOND_AND_THIRD_BOTTOM = liveMultiPkR1;
       liveMultiPkR[33] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("WISH_BATTLE_RESULT_FOURTH_BOTTOM", 34, "live_wish_battle_result_fourth_bottom.png", "");
       LiveMultiPkResourceTypes.WISH_BATTLE_RESULT_FOURTH_BOTTOM = liveMultiPkR1;
       liveMultiPkR[34] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("BOTTOM_BAR_LOOP_LOTTIE", 35, "live_multi_pk_line_lottie.json", "");
       LiveMultiPkResourceTypes.BOTTOM_BAR_LOOP_LOTTIE = liveMultiPkR1;
       liveMultiPkR[35] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("BOTTOM_BAR_NOTICE_LOTTIE", 36, "live_multi_pk_notice_lottie.json", "");
       LiveMultiPkResourceTypes.BOTTOM_BAR_NOTICE_LOTTIE = liveMultiPkR1;
       liveMultiPkR[36] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("PK_RESOURCE_VS", 37, "live_pk_animation_files_v3/live_pk_start_vs_v3.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_start_vs_backup_v3.webp");
       LiveMultiPkResourceTypes.PK_RESOURCE_VS = liveMultiPkR1;
       liveMultiPkR[37] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("COHESION_PK_START_ANIM", 38, "live_pk_cohesion/live_pk_cohesion_start_animation.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_start_vs_backup_v3.webp");
       LiveMultiPkResourceTypes.COHESION_PK_START_ANIM = liveMultiPkR1;
       liveMultiPkR[38] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("COHESION_PK_RESULT_WIN_BOTTOM_BACKGROUND", 39, "live_pk_cohesion/live_pk_cohesion_result_win_support_view.9.png", "udata/pkg/kwai-client-image/live_new_pk/live_pk_cohesion_result_win_support_view.9.png");
       LiveMultiPkResourceTypes.COHESION_PK_RESULT_WIN_BOTTOM_BACKGROUND = liveMultiPkR1;
       liveMultiPkR[39] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("COHESION_PK_RESULT_LOSE_BOTTOM_BACKGROUND", 40, "live_pk_cohesion/live_pk_cohesion_result_lose_support_view.9.png", "udata/pkg/kwai-client-image/live_new_pk/live_pk_cohesion_result_lose_support_view.9.png");
       LiveMultiPkResourceTypes.COHESION_PK_RESULT_LOSE_BOTTOM_BACKGROUND = liveMultiPkR1;
       liveMultiPkR[40] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("COHESION_PK_RESULT_TIE_BOTTOM_BACKGROUND", 41, "live_pk_cohesion/live_pk_cohesion_result_tie_support_view.9.png", "udata/pkg/kwai-client-image/live_new_pk/live_pk_cohesion_result_tie_support_view.9.png");
       LiveMultiPkResourceTypes.COHESION_PK_RESULT_TIE_BOTTOM_BACKGROUND = liveMultiPkR1;
       liveMultiPkR[41] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("COHESION_PK_RESULT_HEART", 42, "live_pk_cohesion/live_pk_cohesion_result_heart.webp", "udata/pkg/kwai-client-image/live_new_pk/live_pk_cohesion_result_heart.png");
       LiveMultiPkResourceTypes.COHESION_PK_RESULT_HEART = liveMultiPkR1;
       liveMultiPkR[42] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("ARENA_START_ANIM", 43, "live_multi_line_arena_start_animation.webp", "udata/pkg/kwai-client-image/pk_revenue_pk/live_arena_start_anim_cdn_png.png");
       LiveMultiPkResourceTypes.ARENA_START_ANIM = liveMultiPkR1;
       liveMultiPkR[43] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("ARENA_RESULT_ANIM_FIRST", 44, "live_multi_pk_animation_first.webp", "udata/pkg/kwai-client-image/live_multi_pk/live_multi_pk_animation_first.png");
       LiveMultiPkResourceTypes.ARENA_RESULT_ANIM_FIRST = liveMultiPkR1;
       liveMultiPkR[44] = liveMultiPkR1;
       liveMultiPkR1 = new LiveMultiPkResourceTypes("ARENA_RESULT_ANIM_TIE", 45, "live_pk_animation_files_v3/live_pk_result_tie_v3.webp", "/udata/pkg/kwai-client-image/pk_revenue_pk/live_pk_tie_backup_v3.webp");
       LiveMultiPkResourceTypes.ARENA_RESULT_ANIM_TIE = liveMultiPkR1;
       liveMultiPkR[45] = liveMultiPkR1;
       LiveMultiPkResourceTypes.$VALUES = liveMultiPkR;
    }
    public void LiveMultiPkResourceTypes(String p0,int p1,String p2,String p3){
       super(p0, p1);
       this.localFileName = p2;
       this.cdnUrlWithoutHost = p3;
    }
    public static LiveMultiPkResourceTypes valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPkResourceTypes.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPkResourceTypes.class, p0);
    }
    public static LiveMultiPkResourceTypes[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkResourceTypes.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkResourceTypes.$VALUES.clone();
    }
    public String getCDNUrl(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveMultiPkResourceTypes obj = PatchProxy.apply(objArray, this, LiveMultiPkResourceTypes.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.cdnUrlWithoutHost;
       String str = PatchProxy.applyOneRefs(obj, objArray, e.class, "2");
       if (str != patchProxyRe) {
       }else {
          str = c0.a.b(obj);
       }
       return str;
    }
    public String getLocalFileName(){
       return this.localFileName;
    }
    public String getLocalFilePath(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveMultiPkResourceTypes obj = PatchProxy.apply(objArray, this, LiveMultiPkResourceTypes.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.localFileName;
       String str = PatchProxy.applyOneRefs(obj, objArray, e.class, "1");
       if (str != patchProxyRe) {
       }else {
          str = LiveResourceFileUtil.k("live_multi_pk")+'/'+obj;
       }
       return str;
    }
    public boolean hasCDNUrl(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkResourceTypes.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.cdnUrlWithoutHost) ^ 0x01);
    }
}
