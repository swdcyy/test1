package com.kuaishou.live.core.show.test.q0;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.pk.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import com.yxcorp.utility.TextUtils;
import qkd.c;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import kw1.b;
import java.util.HashMap;
import s81.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import java.lang.CharSequence;
import e17.i;

public final class q0 implements View$OnClickListener	// class@0011bc
{
    public static final q0 b;

    static {
       q0.b = new q0();
    }
    public void q0(){
       super();
    }
    public final void onClick(View p0){
       SharedPreferences a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, b.class, "20")) {
       }else if(!a.a().c()){
          c.g(TextUtils.k(LiveResourceFileUtil.k("live_pk_resource")));
          LiveResourceFileUtil.q(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_RESOURCE);
          LiveResourceFileUtil.q(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_SCORE_LIMIT_RESOURCE);
          c.g(TextUtils.k(LiveResourceFileUtil.k("live_pk_image_resource_custom_skin_v2")));
          LiveResourceFileUtil.q(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_CUSTOM_SKIN_V2);
          c.g(TextUtils.k(LiveResourceFileUtil.k("live_pk_image_resource_anchor_honor_v2")));
          LiveResourceFileUtil.q(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_ANCHOR_HONOR_V2);
          if (!PatchProxy.applyVoid(objArray, objArray, b.class, "5")) {
             a = a.a;
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putString("livePkActivitySkinThemeIdMap", b.e(new HashMap()));
             g.a(uEditor);
             SharedPreferences$Editor uEditor1 = a.edit();
             uEditor1.putString("livePkHonorSkinThemeIdMap", b.e(new HashMap()));
             g.a(uEditor1);
          }
       }
       i.d(R.style.arg_RES_7f110668, "ÒÑÇå³ý");
       return;
    }
}
