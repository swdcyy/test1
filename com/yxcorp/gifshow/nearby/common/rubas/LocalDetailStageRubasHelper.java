package com.yxcorp.gifshow.nearby.common.rubas.LocalDetailStageRubasHelper;
import com.yxcorp.gifshow.nearby.common.rubas.LocalDetailStageRubasHelper$DetailStage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import rw5.a;
import asb.a;
import com.kwai.soc.arch.rubas.base.Rubas;
import java.lang.Enum;

public class LocalDetailStageRubasHelper	// class@002132
{
    public static LocalDetailStageRubasHelper$DetailStage a;

    static {
       LocalDetailStageRubasHelper.a = LocalDetailStageRubasHelper$DetailStage.LAUNCH;
    }
    public void LocalDetailStageRubasHelper(){
       super();
    }
    public static void a(int p0){
       LocalDetailStageRubasHelper localDetailS = LocalDetailStageRubasHelper.class;
       if (PatchProxy.isSupport(localDetailS) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, localDetailS, "5")) {
          return;
       }
       if (p0 == a.c.intValue()) {
          Rubas.d("local_biserial_block_list_slide", a.c);
       }else if(p0 == a.d.intValue()){
          Rubas.d("local_biserial_block_list_slide", a.d);
       }
       return;
    }
    public static void b(int p0){
       LocalDetailStageRubasHelper localDetailS = LocalDetailStageRubasHelper.class;
       if (PatchProxy.isSupport(localDetailS) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, localDetailS, "3")) {
          return;
       }
       if (LocalDetailStageRubasHelper.a.ordinal() > LocalDetailStageRubasHelper$DetailStage.ENTER.ordinal()) {
          return;
       }
       if (p0 == a.a.intValue()) {
          Rubas.d("local_detail_create_container", a.a);
       }else if(p0 == a.b.intValue()){
          Rubas.d("local_detail_create_container", a.b);
       }
       LocalDetailStageRubasHelper.a = LocalDetailStageRubasHelper$DetailStage.CONTAINER_CREATE;
       return;
    }
    public static void c(int p0){
       LocalDetailStageRubasHelper localDetailS = LocalDetailStageRubasHelper.class;
       if (PatchProxy.isSupport(localDetailS) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, localDetailS, "4")) {
          return;
       }
       if (LocalDetailStageRubasHelper.a.ordinal() > LocalDetailStageRubasHelper$DetailStage.CONTAINER_CREATE.ordinal()) {
          return;
       }
       if (p0 == a.a.intValue()) {
          Rubas.d("local_detail_start_play", a.a);
       }else if(p0 == a.b.intValue()){
          Rubas.d("local_detail_start_play", a.b);
       }
       LocalDetailStageRubasHelper.a = LocalDetailStageRubasHelper$DetailStage.FEED_PLAY;
       return;
    }
    public static void d(int p0){
       LocalDetailStageRubasHelper localDetailS = LocalDetailStageRubasHelper.class;
       if (PatchProxy.isSupport(localDetailS) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, localDetailS, "1")) {
          return;
       }
       if (p0 == a.a.intValue()) {
          Rubas.d("local_biserial_click_feed", a.a);
       }else if(p0 == a.b.intValue()){
          Rubas.d("local_biserial_click_feed", a.b);
       }
       LocalDetailStageRubasHelper.a = LocalDetailStageRubasHelper$DetailStage.CLICK;
       return;
    }
}
