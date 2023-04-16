package com.kwai.feature.api.feed.tag.plugin.TagPluginHelper;
import com.kwai.feature.api.feed.tag.plugin.TagPluginHelper$Companion;
import nsd.u;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.tag.plugin.TagPluginHelper$Companion$gotoKwaiRankPage$1;
import android.content.Context;
import msd.a;
import android.content.Intent;
import java.lang.Exception;
import com.kuaishou.android.model.music.Music;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public final class TagPluginHelper	// class@000f71
{
    public static final TagPluginHelper$Companion a;

    static {
       TagPluginHelper.a = new TagPluginHelper$Companion(null);
    }
    public void TagPluginHelper(){
       super();
    }
    public static final void a(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, TagPluginHelper.class, "4")) {
          return;
       }
       TagPluginHelper$Companion a = TagPluginHelper.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, TagPluginHelper$Companion.class, "8")) {
          a.p(p0, "activity");
       }
       return;
    }
    public static final void b(Context p0,Intent p1){
       TagPluginHelper.a.b(p0, p1);
    }
    public static final void c(Context p0,Intent p1){
       TagPluginHelper$Companion a = TagPluginHelper.a;
       Objects.requireNonNull(a);
       a.p(p0, "context");
       String str = "intent";
       try{
          a.p(p1, str);
          p1.setClassName(p0, "com.yxcorp.plugin.tag.topic.TopicDetailActivity");
          a.b(p0, p1);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public static final boolean d(String p0,Music p1){
       boolean b;
       Music mId;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Music music = null;
       TagPluginHelper$Companion obj = PatchProxy.applyTwoRefs(p0, p1, music, TagPluginHelper.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = TagPluginHelper.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, TagPluginHelper$Companion.class, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(p1 != null){
          mId = p1.mId;
       }else {
          mId = music;
       }
       if (!TextUtils.x(mId)) {
          StringBuilder str = "ks://music_tag/";
          if (p1 != null) {
             music = p1.mId;
          }
          str1 = str+music;
       }else {
          str1 = "ks://music_tag";
       }
       b = TextUtils.n(p0, str1);
       return b;
    }
}
