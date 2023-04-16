package com.yxcorp.gifshow.v3.editor.music_v2.utils.AutoMusicUtils;
import java.lang.Object;
import urc.e;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.AutoMusicUtils$VideoCategory;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import lsc.a;
import java.lang.Enum;
import java.util.List;
import java.lang.IllegalArgumentException;
import com.kuaishou.android.model.music.Music;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import urc.f;
import urc.i;
import com.kuaishou.edit.draft.Workspace$From;
import com.yxcorp.gifshow.v3.f;
import urc.d;

public final class AutoMusicUtils	// class@00111e
{
    public static final AutoMusicUtils a;

    static {
       AutoMusicUtils.a = new AutoMusicUtils();
    }
    public void AutoMusicUtils(){
       super();
    }
    public final AutoMusicUtils$VideoCategory a(e p0){
       AutoMusicUtils$VideoCategory iMPORT_SINGL;
       Workspace$Type obj = PatchProxy.applyOneRefs(p0, this, AutoMusicUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.k();
       if (obj != Workspace$Type.VIDEO && obj != Workspace$Type.LONG_VIDEO) {
          return AutoMusicUtils$VideoCategory.UNDEFINED;
       }
       int i = a.a[p0.j().ordinal()];
       if (i != 1) {
          if (i != 2 && (i != 3 && (i != 4 && i != 5))) {
             return AutoMusicUtils$VideoCategory.UNDEFINED;
          }else {
             int i1 = p0.c().size();
             if (i1 > 0) {
                iMPORT_SINGL = (i1 == 1)? AutoMusicUtils$VideoCategory.IMPORT_SINGLE: AutoMusicUtils$VideoCategory.IMPORT_MULT;
                return iMPORT_SINGL;
             }else {
                throw new IllegalArgumentException("empty asset list");
             }
          }
       }else if(p0.v != null){
          iMPORT_SINGL = AutoMusicUtils$VideoCategory.CAPTURE_WITH_MAGIC_FACE;
       }else {
          iMPORT_SINGL = AutoMusicUtils$VideoCategory.CAPTURE_WITHOUT_MAGIC_FACE;
       }
       return iMPORT_SINGL;
    }
    public final boolean b(e p0,Music p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AutoMusicUtils.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "musicState");
       boolean b = false;
       if (PostExperimentUtils.D1()) {
          return b;
       }
       if (p0.k() == Workspace$Type.UNKNOWN) {
          return b;
       }
       if (p0.s().i() != null) {
          return b;
       }
       if (p0.j() == Workspace$Source.MEDIA_SCENE) {
          if (p0.i() != Workspace$From.PROFILE_AVATAR && p0.i() != Workspace$From.MEDIA_SENCE_COMMON) {
             b = true;
          }
          return b;
       }else if(p0.s != null || p0.n()){
          if (p1 != null) {
             return true;
          }else {
             Workspace$Type type = p0.k();
             if (p0.i() == Workspace$From.IM_SEND_MESSAGE || (p0.i() != Workspace$From.IM_SEND_MESSAGE_WHATS_UP && p0.i() != Workspace$From.IM_TAKE_IN_SAME)) {
                if (!f.E(type) && (type != Workspace$Type.PHOTO_MOVIE && (type != Workspace$Type.VIDEO && type != Workspace$Type.LONG_VIDEO))) {
                   return b;
                }else if(type == Workspace$Type.VIDEO || type == Workspace$Type.LONG_VIDEO){
                   if (!a.g("album_draft", p0.h().b)) {
                      type = PatchProxy.applyOneRefs(p0, this, AutoMusicUtils.class, "3");
                      if (type != patchProxyRe) {
                         b = type.booleanValue();
                      }else {
                         AutoMusicUtils$VideoCategory videoCategor = this.a(p0);
                         if (videoCategor == AutoMusicUtils$VideoCategory.IMPORT_MULT || videoCategor == AutoMusicUtils$VideoCategory.CAPTURE_WITHOUT_MAGIC_FACE) {
                            b = true;
                         }else if(videoCategor == AutoMusicUtils$VideoCategory.CAPTURE_WITH_MAGIC_FACE){
                            b = p0.o() ^ 0x01;
                         }
                      }
                   }
                }else {
                   Workspace$Source source = p0.j();
                   if (source != Workspace$Source.CAPTURE && (source != Workspace$Source.IMPORT && (source == Workspace$Source.PROFILE_BACKGROUND_POST || source == Workspace$Source.IM_MESSAGE))) {
                      b = true;
                   }
                   return b;
                }
             }
          }
       }
       return b;
    }
}
