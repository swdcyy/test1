package com.kuaishou.live.core.show.test.z0;
import yf6.h;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.live.core.show.test.z0$a;
import il2.z;
import android.view.View;
import com.kuaishou.live.core.show.test.w;
import android.os.Build$VERSION;
import android.content.Context;
import android.provider.Settings;
import java.lang.CharSequence;
import e17.i;
import yf6.g;
import android.widget.LinearLayout;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import lnc.a1;
import java.util.Iterator;
import com.kuaishou.live.core.show.test.z0$b;
import i2b.a;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.button.SlipSwitchButton;
import il2.q;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import java.lang.StringBuilder;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.core.show.test.z;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import j80.c;
import java.io.File;
import j80.f;
import java.lang.Float;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.test.k0;
import il2.w;
import il2.p;
import il2.s;
import android.widget.EditText;
import w51.a;
import android.text.TextWatcher;
import il2.a0;
import il2.b0;
import il2.c0;
import il2.d0;
import com.kuaishou.live.core.show.test.s0;
import il2.t;
import java.util.Objects;
import android.widget.Button;
import android.widget.RadioGroup;
import il2.f0;
import com.kuaishou.live.core.show.test.m0;
import com.kuaishou.live.core.show.test.b0;
import com.kuaishou.live.core.show.test.c0;
import com.kuaishou.live.core.show.test.d0;
import il2.v;
import il2.k;
import com.kuaishou.live.core.show.test.n0;
import com.kuaishou.live.core.show.test.f0;
import il2.x;
import com.kuaishou.live.core.show.test.g0;
import il2.y;
import com.kuaishou.live.core.show.test.h0;
import il2.n;
import com.kuaishou.live.core.show.test.q0;
import com.kuaishou.live.core.show.test.l0;
import com.kuaishou.live.core.show.test.i0;
import com.kuaishou.live.core.show.test.p0;
import android.widget.Switch;
import s81.a;
import com.kuaishou.live.core.show.test.t0;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.kuaishou.live.core.show.test.r0;
import com.kuaishou.live.core.show.test.u0;
import com.kuaishou.live.core.show.test.v0;
import il2.u;
import com.kuaishou.live.core.show.test.e0;
import com.kuaishou.live.core.show.test.j0;
import java.lang.Boolean;
import xf6.l;
import il2.r;
import com.kuaishou.live.core.show.test.w0;
import lnc.c3$a;
import lnc.c3;
import java.util.Collection;
import com.kuaishou.live.core.show.test.x0;
import erd.g;
import tkd.b;
import tkd.d;
import os5.l;
import com.kuaishou.live.core.show.test.y0;
import z1.e;
import com.kuaishou.live.core.show.test.a0;
import com.kuaishou.live.core.show.test.o0;
import java.lang.Exception;
import android.text.Editable;

public class z0 implements h	// class@0011d0
{
    public SlipSwitchButton b;
    public SlipSwitchButton c;
    public k d;
    public final List e;
    public final z0$a f;
    public EditText g;
    public EditText h;
    public w i;
    public static final CharSequence[] j;

    static {
       String[] stringArray = new String[]{"�����ã����·�Ϊ׼","ǿ�ƿ���","ǿ�ƹر�"};
       z0.j = stringArray;
    }
    public void z0(){
       super();
       this.e = new ArrayList();
       this.f = new z0$a(null);
    }
    public static void b(z0 p0,View p1,View p2){
       p0.f(p1, p2);
    }
    private void f(View p0,View p1){
       z0 ti = this.i;
       if (ti != null) {
          ti.a();
          this.i = null;
       }else if(Build$VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(p0.getContext())){
          i.d(R.style.arg_RES_7f11066a, "������������Ȩ��");
       }else {
          this.i = new w(p0.getContext());
       }
       return;
    }
    public void a(View p0,boolean p1){
       g.a(this, p0, p1);
    }
    public final void c(LinearLayout p0,String p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, z0.class, "17")) {
          return;
       }
       TextView textView = new TextView(p0.getContext());
       textView.setText(p1);
       textView.setTextSize(12.00f);
       textView.setTextColor(a1.a(R.color.arg_RES_7f061fb7));
       p0.addView(textView);
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          z0$b uob = iterator.next();
          if (PatchProxy.applyVoidTwoRefs(p0, uob, this, z0.class, "18")) {
             continue ;
          }else {
             View view = a.a(p0.getContext(), R.layout.arg_RES_7f0d15cc);
             LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, a1.e(56.00f));
             layoutParams.bottomMargin = a1.e(0x3f800000);
             view.setLayoutParams(layoutParams);
             SlipSwitchButton slipSwitchBu = view.findViewById(R.id.item_button);
             view.findViewById(R.id.item_title).setText(uob.a);
             slipSwitchBu.setSwitch(uob.c);
             slipSwitchBu.setOnSwitchChangeListener(new q(uob));
             p0.addView(view);
          }
       }
       return;
    }
    public final void d(LinearLayout p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, z0.class, "20")) {
          return;
       }
       KwaiSizeAdjustableTextView kwaiSizeAdju = new KwaiSizeAdjustableTextView(p0.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, a1.e(50.00f));
       layoutParams.bottomMargin = a1.e(0x3f800000);
       kwaiSizeAdju.setLayoutParams(layoutParams);
       kwaiSizeAdju.setPadding(a1.d(R.dimen.arg_RES_7f070a7f), 0, a1.d(R.dimen.arg_RES_7f070a7f), 0);
       kwaiSizeAdju.setGravity(16);
       kwaiSizeAdju.setTextSizeAdjustable(true);
       kwaiSizeAdju.setTextSizeAdjustWithHeight(true);
       kwaiSizeAdju.setText(p1+" >");
       kwaiSizeAdju.setTextSize(14.00f);
       kwaiSizeAdju.setBackground(a1.f(R.drawable.arg_RES_7f08035c));
       kwaiSizeAdju.setOnClickListener(new z(this, p1, p2));
       p0.addView(kwaiSizeAdju);
       return;
    }
    public final void e(TextView p0,String p1){
       z0 oz0 = z0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oz0, "9")) {
          return;
       }
       String str = PatchProxy.applyOneRefs(p1, this, oz0, "8");
       if (str != PatchProxyResult.class) {
       }else {
          str = b.a(-1504323719).d(p1).getAbsolutePath();
       }
       Object[] objArray = new Object[]{Float.valueOf(((float)f.d(str) / 1024.00f))};
       p0.setText(String.format("%.2f", objArray)+"kb");
       return;
    }
    public String getTitle(){
       return "ֱ��";
    }
    public View newPage(ViewGroup p0){
       Iterator obj1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z0 oz0 = z0.class;
       String str = "1";
       Object[] obj = PatchProxy.applyOneRefs(p0, this, oz0, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d15c4);
       if (!PatchProxy.applyVoidOneRefs(view, this, oz0, "4")) {
          view.findViewById(R.id.live_frequency_config).setOnClickListener(k0.b);
          view.findViewById(R.id.live_open_float_timestamp).setOnClickListener(new w(this, view));
          view.findViewById(R.id.tv_clear_anchor_guide_time_limit).setOnClickListener(new p(view));
          view.findViewById(R.id.tv_clear_live_beauty_v2_cache).setOnClickListener(new s(view));
          this.b = view.findViewById(0x7f0a0fc9);
          this.c = view.findViewById(0x7f0a0fc7);
          this.g = view.findViewById(0x7f0a2530);
          EditText uEditText = view.findViewById(R.id.live_transition_duration);
          uEditText.setText(String.valueOf(a.m()));
          uEditText.addTextChangedListener(new z(this));
          uEditText = view.findViewById(R.id.live_enter_transition_delay_duration);
          uEditText.setText(String.valueOf(a.k()));
          uEditText.addTextChangedListener(new a0(this));
          uEditText = view.findViewById(R.id.live_comment_area_top_guideline_edit_text);
          uEditText.setText(String.valueOf(a.e()));
          uEditText.addTextChangedListener(new b0(this));
          uEditText = view.findViewById(R.id.live_one_step_interval);
          uEditText.setText(String.valueOf(a.a));
          uEditText.addTextChangedListener(new c0(this));
          uEditText = view.findViewById(R.id.live_one_step_duration);
          uEditText.setText(String.valueOf(a.b));
          uEditText.addTextChangedListener(new d0(this));
          view.findViewById(R.id.clear_slide_guide_record).setOnClickListener(s0.b);
          view.findViewById(R.id.live_pk_score_progress_bar_test_activity).setOnClickListener(new t(view));
          z0 tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(view, tf, z0$a.class, str)) {
             view.findViewById(R.id.live_kswitch_btn).setOnClickListener(new f0(view.findViewById(R.id.live_kswitch_radio_group), view.findViewById(R.id.live_kswitch_key)));
          }
          view.findViewById(R.id.clear_explicit_gift_double_check_popup_status).setOnClickListener(m0.b);
          view.findViewById(R.id.clear_pk_recommend_low_level_gift_double_check_popup_status).setOnClickListener(b0.b);
          view.findViewById(R.id.clear_pk_recommend_high_level_gift_double_check_popup_status).setOnClickListener(c0.b);
          view.findViewById(R.id.clear_pk_rank_cache).setOnClickListener(d0.b);
          view.findViewById(R.id.clear_top_user_list_filter_enable_comment_notice_show_record).setOnClickListener(new v(this));
          this.d = new k(view);
          if (!PatchProxy.applyVoidOneRefs(view, this, oz0, "7")) {
             view.findViewById(R.id.clear_multi_pk_controlfile_resources).setOnClickListener(n0.b);
             view.findViewById(R.id.clear_multi_pk_normal_resources).setOnClickListener(f0.b);
             TextView textView = view.findViewById(R.id.calculate_multi_pk_normal_resources_size);
             textView.setOnClickListener(new x(this, textView));
             view.findViewById(R.id.clear_multi_pk_activity_resources).setOnClickListener(g0.b);
             textView = view.findViewById(R.id.calculate_multi_pk_activity_resources_size);
             textView.setOnClickListener(new y(this, textView));
             view.findViewById(R.id.clear_multi_pk_honor_resources).setOnClickListener(h0.b);
             textView = view.findViewById(R.id.calculate_multi_pk_honor_resources_size);
             textView.setOnClickListener(new n(this, textView));
          }
          if (!PatchProxy.applyVoidOneRefs(view, this, oz0, "10")) {
             view.findViewById(R.id.clear_pk_controlfile_resources).setOnClickListener(q0.b);
             view.findViewById(R.id.clear_pk_score_rule_bubble_record).setOnClickListener(l0.b);
             view.findViewById(R.id.clear_pk_entry_panel_tab_selected_remember).setOnClickListener(i0.b);
             view.findViewById(R.id.reset_pk_value_random_pk_end_in_advance_default_remember_choice).setOnClickListener(p0.b);
          }
          if (!PatchProxy.applyVoidOneRefs(view, this, oz0, "11")) {
             Switch switch = view.findViewById(R.id.red_packet_new_style_btn);
             switch.setChecked(a.r());
             switch.setOnCheckedChangeListener(t0.b);
             view.findViewById(R.id.live_red_packet_skin_clear_cache_tv).setOnClickListener(r0.b);
             EditText uEditText1 = view.findViewById(R.id.live_red_packet_skin_resize_et);
             uEditText = view.findViewById(R.id.live_red_packet_skin_cache_size_et);
             EditText uEditText2 = view.findViewById(R.id.live_red_packet_skin_expire_et);
             uEditText1.setText(String.valueOf(a.s()));
             uEditText.setText(String.valueOf(a.t()));
             uEditText2.setText(String.valueOf(a.w()));
             Switch switch1 = view.findViewById(R.id.live_red_packet_skin_cdn_resize_switch_btn);
             switch1.setChecked(a.u());
             switch1.setOnCheckedChangeListener(u0.b);
             switch1 = view.findViewById(R.id.live_red_packet_skin_toast_enable_btn);
             switch1.setChecked(a.v());
             switch1.setOnCheckedChangeListener(patchProxyRe.b);
             view.findViewById(R.id.live_red_packet_skin_confirm_btn).setOnClickListener(new u(uEditText1, uEditText, uEditText2));
          }
          this.h = view.findViewById(0x7f0a1ae7);
          view.findViewById(R.id.live_camera_mock_file_delete_tv).setOnClickListener(e0.b);
          view.findViewById(R.id.clear_multi_pk_notice_anim_cache).setOnClickListener(j0.b);
       }
       obj = null;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(view, this, oz0, "5")) {
          z0 tb = this.b;
          Object obj3 = PatchProxy.apply(obj, obj, a.class, "3");
          boolean b1 = (obj3 != patchProxyRe)? obj3.booleanValue(): l.c("live_force_arya_test", i);
          tb.setSwitch(b1);
          this.b.setOnSwitchChangeListener(new r(this, view));
          this.c.setSwitch(a.y());
          this.g.setText(a.l());
          c3.c(this.d, w0.a);
          this.h.setText(a.i());
       }
       LinearLayout linearLayout = view.findViewById(R.id.switch_container);
       ArrayList uArrayList = PatchProxy.apply(obj, this, oz0, "13");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(new z0$b("�ر�����", "live_close_comment"));
          uArrayList.add(new z0$b("�رս���Ч��", "live_close_enter_room_effect"));
          uArrayList.add(new z0$b("�ر������λ", "live_close_gift_container"));
          uArrayList.add(new z0$b("�ر�Ʈ��", "live_close_like_particle_view"));
          uArrayList.add(new z0$b("�رն���֪ͨ", "live_close_top_notice"));
          uArrayList.add(new z0$b("�ر���������", "live_close_online_watch_count"));
          uArrayList.add(new z0$b("�رյ�����", "live_close_like_count"));
          uArrayList.add(new z0$b("�ر��ػ�λ", "live_close_guard"));
          uArrayList.add(new z0$b("�ر���Ը��", "live_close_wish_list"));
          uArrayList.add(new z0$b("�رհ񵥹Ҽ�", "live_close_hourly_rank_list"));
          uArrayList.add(new z0$b("�ر�����", "live_close_beauty"));
          uArrayList.add(new z0$b("�ر�С�������", "live_close_kwai_robot"));
          uArrayList.add(new z0$b("�ر�������Ч", "live_close_gift_effect"));
          uArrayList.add(new z0$b("�رղ�����", "live_close_player"));
          uArrayList.add(new z0$b("�ر����Ͻǻ�Ҽ�", "live_close_top_left_pendant"));
          uArrayList.add(new z0$b("�ر����½ǻ�Ҽ�", "live_close_bottom_right_pendant"));
          uArrayList.add(new z0$b("�رճ���δ��ע������ע����Ƶ��", "live_close_follow_guide_frequency"));
          uArrayList.add(new z0$b("�ر�����UI", "live_close_multi_line_ui"));
       }
       this.e.addAll(uArrayList);
       this.c(linearLayout, "����ģ������", uArrayList);
       uArrayList = PatchProxy.apply(obj, this, oz0, "14");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          z0$b uob = new z0$b("����App�������ڣ��ر�debugҡһҡ", "key_live_disable_debug_shake", i, x0.b);
          uob.d = true;
          uArrayList.add(uob);
          uArrayList.add(new z0$b("CNY - ������ֱ������򡹡�Ʒ�ƺ���������߼�", "skipDuplicateCnyApiSignalSei"));
          uArrayList.add(new z0$b("ǿ�ƿ���Liteֱ����", "forceEnableLite", a.a(), obj));
          uArrayList.add(new z0$b("����Liteֱ��������������ť", "forceEnableLiteSideBarShrinkButton", a.b(), obj));
          uArrayList.add(new z0$b("����Lite����������»�", "enableVerticalScrollGift", a.d(), obj));
          uArrayList.add(new z0$b("����Lite�����������", "enableSortGift", a.c(), obj));
          uArrayList.add(new z0$b("����Liteֱ�����ʱToast", "enableLitePerfToast"));
          uArrayList.add(new z0$b("ǿ�ƿ������½�KDS�Ҽ�", "live_enable_kds_bottom_pendant"));
          uArrayList.add(new z0$b("ǿ�ƴ򿪹��ڶ�Ͷ��", "forceOpenAudienceScreencast"));
          uArrayList.add(new z0$b("ǿ��ֱ��feed��ƬչʾΪV4��ʽ\(������Ч\)", "live_enable_feed_card_v4_style"));
          uArrayList.add(new z0$b("ͣ��ֱ��arya", "live_close_arya"));
          Object obj2 = PatchProxy.apply(obj, this, oz0, "12");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(a.t() || d.a(-1492894991).F7()){
             b = true;
          }else {
             b = false;
          }
          uArrayList.add(new z0$b("ֱ��ʹ��Ӳ������", "EnableHardwareEncodeLive", b, obj));
          uArrayList.add(new z0$b("��������", "key_enable_live_chat"));
          uArrayList.add(new z0$b("��Arya\(Stannis\)Dump", "arya_stannis_dump_test"));
          uArrayList.add(new z0$b("����������С��dump", "robot_dump_test"));
          uArrayList.add(new z0$b("��ʾ����Debug��Ϣ", "enable_test_gift"));
          uArrayList.add(new z0$b("��ֱֹ���������ж���activity", "KEY_LIVE_FORBID_ORIENTATION_JUDGE_BY_ACTIVITY"));
          uArrayList.add(new z0$b("ֱ����̨���ŷ����л�����", "livePlayBackgroundMinToSec"));
          uArrayList.add(new z0$b("���ذ�����", "KEY_HIDE_LOOP_BACKGROUND_SWITCH"));
          uArrayList.add(new z0$b("ǿ�ƹر���λ���ɲ���", "live_voice_party_force_disable_free_style"));
          uArrayList.add(new z0$b("ǿ�Ʊ��λ�Ͷ˻���\(���ܽ���ʹ��\)", "live_degrade_force_mark_low_phone"));
          uArrayList.add(new z0$b("ǿ��ʹ���°����»����", "force_new_live_slide"));
          uArrayList.add(new z0$b("ǿ��ʹ���°�Ҽ�", "live_new_pendant_enabled"));
          uArrayList.add(new z0$b("����ֱ����ײ���Ƭ�Ż��������¿�ܣ�", "enablePreviewBottomCardV2"));
          uArrayList.add(new z0$b("������̬ҵ�����ģʽ", "enableLiveEcoDebugMode"));
          uArrayList.add(new z0$b("ǿ�ƿ���������ǰ����", "enableLiveInnerPullOpt"));
          uArrayList.add(new z0$b("����ֱ����ײ���Ƭǿ��������ҵ������", "forceHitAdPreviewBottomCard"));
          uArrayList.add(new z0$b("ǿ�ƿ���ֱ��ax2c\(���ڶ�\)", "liveAudienceStartAx2c"));
          uArrayList.add(new z0$b("ǿ�ƿ���ֱ��ax2c-PK\(���ڶ�\)", "liveAudienceStartAx2cPK"));
          uArrayList.add(new z0$b("ǿ�ƿ���xmlInflateͳ��\(���ڶ�\)", "liveAudienceXmlInflateCost"));
          uArrayList.add(new z0$b("ǿ�ƿ����߳��ϱ�\(���ڶ�\)", "liveAudienceThreadReport"));
          uArrayList.add(new z0$b("���ٰ�ر�Ԥ����AryaSo", "key_enable_close_pre_download_arya_so"));
          uArrayList.add(new z0$b("���ٰ�ģ��AryaSo����ʧ��", "key_enable__delete_arya_so"));
          uArrayList.add(new z0$b("ʹ��SurfaceView��Ϊ��������ͼ��ÿ��������Ҫ���¹ر��ٿ�������Ч��", "key_enable_use_surface_view", l.c("key_enable_use_surface_view", i), y0.b));
          uArrayList.add(new z0$b("����ɨ��ֱ��·�ɵ���", "enableLiveRouterDev"));
          uArrayList.add(new z0$b("����ֱ���ز�Toast����", "enableLiveEffectToast"));
          uArrayList.add(new z0$b("ֱ���ز�ʹ�����ô洢Ŀ¼", "forceLiveEffectUseExternalStorage"));
          uArrayList.add(new z0$b("ǿ�ƿ���ֱ���زĵʹ���ģʽ", "forceOpenLiveEffectLowDisk"));
          uArrayList.add(new z0$b("�������������������Toast", "voicePartyErrorRequestToast", l.c("voicePartyErrorRequestToast", true), obj));
          uArrayList.add(new z0$b("�滻Camera�ɼ�����Ϊ������Ƶ", "key_enable_replace_camera_source_by_local_video"));
          uArrayList.add(new z0$b("��������PK mock����", "key_mock_multi_pk"));
          uArrayList.add(new z0$b("�Զ����ܶ��˻�������", "key_auto_accept_interact_invite"));
          uArrayList.add(new z0$b("��������StreamType����", "key_open_anchor_stream_type_detect"));
          uArrayList.add(new z0$b("��������PK statistic��־", "enableMultiPkStatisticLog"));
          uArrayList.add(new z0$b("ģ��ֱ������������loadingʱ������", "key_mock_post_plugin_load"));
          uArrayList.add(new z0$b("�������˻���������������", "key_enable_interactive_gift_adapt"));
          uArrayList.add(new z0$b("��Ը��ģʽǿ�ƿ�������", "key_wish_list_mode"));
          uArrayList.add(new z0$b("ģ��ֱ���������ʧ��", "key_mock_post_plugin_load"));
          uArrayList.add(new z0$b("�ر�ֱ�����Ԥ���أ�App��������չʾ֮��", "key_enable_plugin_preload"));
          uArrayList.add(new z0$b("ģ��ֱ���������ʧ�ܣ���������Ч��", "key_mock_post_plugin_load"));
          uArrayList.add(new z0$b("1/4��RTC�����ֱ��ʽ�Ϊlow", "key_downscale_rtc_push_size_1_4_low"));
          uArrayList.add(new z0$b("���ڶ�ǿ��ʹ�ö�������ɿ��", "enableAudienceOldMultiChat"));
          uArrayList.add(new z0$b("ģ����ڶ� sei ��ʧ", "enableSimulateSeiLoss"));
       }
       this.e.addAll(uArrayList);
       this.c(linearLayout, "��������", uArrayList);
       if (!PatchProxy.applyVoidOneRefs(linearLayout, this, oz0, "15")) {
          this.d(linearLayout, "��������ABʵ��", "enableCommentAreaOpt");
          this.d(linearLayout, "�������������-���̶̹��߶�", "enableCommentAreaOpt_keyboardHeight");
          this.d(linearLayout, "�������������-�������λ", "enableCommentAreaOpt_bigGift");
          this.d(linearLayout, "�������������-ǿ���Ѷ���", "enableCommentAreaOpt_jackUp");
          this.d(linearLayout, "�������������-��ԭ�����λλ��", "enableCommentAreaOpt_giftPosition");
          this.d(linearLayout, "��������������", "live_comment_enable_background");
          this.d(linearLayout, "�����ֲ�����", "live_enable_scatter_loader");
          this.d(linearLayout, "�������̺���Ϸ�ֲ�����", "live_enable_merchant_and_gzone_scatter_loader");
          this.d(linearLayout, "����PK����", "live_pk_custom_skin");
          this.d(linearLayout, "����PK��������������Ȩ", "live_pk_skin_self_honor");
          this.d(linearLayout, "����PK�Է�����������Ȩ", "live_pk_skin_opponent_honor");
          this.d(linearLayout, "ʹ��native PK���", "forceUseNativePkPanel");
          this.d(linearLayout, "���ó������߳���������", "keyLimitLongConnectionThreadCnt");
          this.d(linearLayout, "������ϸֱ���俨���Ż�", "enableLiveDetailPlayJankOpt");
          this.d(linearLayout, "������ϸֱ����Measure�Ż�", "enableLiveDetailPlayMeasureJankOpt");
          this.d(linearLayout, "��������Presenter��ɢ�Ż�", "enableLivePlayPresenterScatter");
          this.d(linearLayout, "��������Presenter��ɢ�Ż�\(���»�\)", "enableLivePlayPresenterScatterOnSlide");
          this.d(linearLayout, "�����첽����ҵ��UI\(���»�\)", "enableLiveViewLoadingStrategyOnSlide");
          this.d(linearLayout, "������������Presenter��ɢ", "enableLivePlayBasicPresenterScatter");
          this.d(linearLayout, "����Lite��ɢ����", "enableLiteScatterLoad");
          this.d(linearLayout, "����Lite VC��ɢ����", "enableLiteVCScatterLoad");
          this.d(linearLayout, "����Lite�����Ż�", "enableLiteJankOpt");
          this.d(linearLayout, "����lite����������2�μ���", "liteScatterTwoPhase");
          this.d(linearLayout, "����lite���߿����Ż�", "liteSlideAwayJankOpt");
          this.d(linearLayout, "�����Ż���˫�е��Ԥ����������", "enableClickPreCreatePlayerOpt");
          this.d(linearLayout, "����PK", "key_multi_pk");
          this.d(linearLayout, "�رյͶ˻�ħ�����", "key_disable_magic_face");
          String str1 = "ֱ��������UI ���ز���";
          List c = a.c;
          ArrayList uArrayList1 = PatchProxy.applyOneRefs(c, this, oz0, "16");
          if (uArrayList1 != patchProxyRe) {
          }else {
             uArrayList1 = new ArrayList();
             obj1 = c.iterator();
             while (obj1.hasNext()) {
                uArrayList1.add(obj1.next().a);
             }
          }
          obj1 = uArrayList1;
          if (!PatchProxy.applyVoidFourRefs(linearLayout, str1, "liveViewLoadingStrategy", obj1, this, z0.class, "19")) {
             KwaiSizeAdjustableTextView kwaiSizeAdju = new KwaiSizeAdjustableTextView(linearLayout.getContext());
             LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, a1.e(50.00f));
             layoutParams.bottomMargin = a1.e(0x3f800000);
             kwaiSizeAdju.setLayoutParams(layoutParams);
             kwaiSizeAdju.setPadding(a1.d(R.dimen.arg_RES_7f070a7f), i, a1.d(R.dimen.arg_RES_7f070a7f), i);
             kwaiSizeAdju.setGravity(16);
             kwaiSizeAdju.setTextSizeAdjustable(true);
             kwaiSizeAdju.setTextSizeAdjustWithHeight(true);
             kwaiSizeAdju.setText("ֱ��������UI ���ز��� >");
             kwaiSizeAdju.setTextSize(14.00f);
             kwaiSizeAdju.setBackground(a1.f(R.drawable.arg_RES_7f08035c));
             kwaiSizeAdju.setOnClickListener(new a0(this, str1, "liveViewLoadingStrategy", obj1));
             linearLayout.addView(kwaiSizeAdju);
          }
          this.d(linearLayout, "������ǿ��ʹ�ö��������¿��", "enableAnchorNewMultiChat");
       }
       if (!PatchProxy.applyVoidOneRefs(view, this, oz0, "2")) {
          view.findViewById(R.id.open_live_test_activity).setOnClickListener(o0.b);
       }
       return view;
    }
    public void onConfirm(){
       boolean switch;
       z0 oz0 = z0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz0, "3")) {
          return;
       }
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          z0$b uob = iterator.next();
          if (uob.d == null) {
             l.l(uob.b, Boolean.valueOf(uob.c));
          }
          z0$b e = uob.e;
          if (e != null) {
             try{
                e.accept(Boolean.valueOf(uob.c));
             }catch(java.lang.Exception e3){
                e3.printStackTrace();
                goto label_0012 ;
             }
          }
       }
       a uoa = a.class;
       if (!PatchProxy.applyVoid(objArray, this, oz0, "6")) {
          List list = 8;
          if (this.b.getVisibility() != list) {
             switch = this.b.getSwitch();
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(switch), objArray, uoa, "2")) {
                l.h("live_force_arya_test", switch);
             }
          }
          if (this.c.getVisibility() != list) {
             switch = this.c.getSwitch();
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(switch), objArray, uoa, "4")) {
                l.h("live_force_live_push_to_cdn_test", switch);
             }
          }
          Editable text = this.g.getText();
          Object[] objArray1 = (text == null)? objArray: text.toString();
          if (!PatchProxy.applyVoidOneRefs(objArray1, objArray, uoa, "39")) {
             l.k("live_router_scheme", objArray1);
          }
          text = this.h.getText();
          if (text != null) {
             objArray = text.toString();
          }
          a.T(objArray);
       }
       return;
    }
}
