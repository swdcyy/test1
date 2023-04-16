package com.yxcorp.gifshow.v3.previewer.ktv.u;
import im8.g;
import vl8.c;
import com.yxcorp.gifshow.v3.previewer.ktv.u$a;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Karaoke;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.List;
import mwc.d0;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import org.json.JSONObject;
import org.json.JSONException;
import com.kuaishou.edit.draft.KaraokeAsset;
import com.kuaishou.edit.draft.KaraokeVoiceAsset;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.Song;
import com.kuaishou.android.model.music.Music;
import kqb.g0;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.model.KtvSelectionInfo;
import lnc.l4;
import com.kuaishou.edit.draft.KaraokeGeneral;
import com.kuaishou.edit.draft.KaraokeMixing;
import com.kuaishou.edit.draft.VoiceChange;
import com.kuaishou.edit.draft.KaraokeClip;
import com.kuaishou.edit.draft.Workspace;
import java.lang.Long;
import java.lang.Number;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Karaoke$b;
import z30.y0;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import mwc.e0;
import java.util.Map;
import java.util.HashMap;

public final class u extends c implements g	// class@0015d3
{
    public c c;
    public a d;
    public a e;
    public KtvInfo f;

    public void u(u$a p0){
       super();
       Object[] objArray = new Object[]{p0};
       this.u(objArray);
    }
    public static KtvInfo N(c p0){
       double d;
       KaraokeAsset asset;
       u f;
       Song song;
       u f1;
       File uFile1;
       Lyrics lyrics;
       KaraokeGeneral general;
       float f2;
       TimeRange selectedRang;
       u f3;
       KtvInfo mSingStart;
       u ou = u.class;
       File uFile = null;
       KtvInfo obj = PatchProxy.applyOneRefs(p0, uFile, ou, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KtvInfo();
       u ou1 = new u(new u$a(obj, p0));
       if (!PatchProxy.applyVoid(uFile, ou1, ou, "1")) {
          Karaoke karaoke = ou1.d.v();
          if (karaoke != null) {
             if (ou1.c.a1() == Workspace$Type.KTV_SONG) {
                ou1.f.setSongMode(true);
                ou1.f.mPhotosPath = q.g(ou1.e.z(), new d0(ou1));
                ou = ou1.f;
                ou.mCoverCount = ou.mPhotosPath.size();
             }else {
                ou1.f.setSongMode(0);
             }
             String str = DraftFileManager.E().C(karaoke.getKaraokeParamFile(), ou1.d);
             if (str != null) {
                try{
                   ou1.f.fromSimpleJson(new JSONObject(str));
                }catch(org.json.JSONException e0){
                   e0.printStackTrace();
                }
             }
          }
       }
       return obj;
    }
    public static long O(c p0,KtvInfo p1,long p2){
       u obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(u.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), null, u.class, "4");
          if (obj != patchProxyRe) {
             return obj.longValue();
          }
       }
       obj = new u(new u$a(p1, p0));
       if (PatchProxy.isSupport(u.class)) {
          p0 = PatchProxy.applyOneRefs(Long.valueOf(p2), obj, u.class, "2");
          if (p0 != patchProxyRe) {
             p2 = p0.longValue();
          }else {
          label_0045 :
             obj.d.c0();
             Karaoke$b uob = obj.d.k();
             long l = DraftUtils.u(uob);
             if (l - p2 > 0) {
                uob.d(obj.d.U(obj.f.toSimpleJson(), "json"));
                obj.d.f();
                p2 = l;
             }else {
                obj.d.j();
             }
          }
       }else {
          goto label_0045 ;
       }
       return p2;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new e0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, u.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(u.class, new e0());
       }else {
          obj.put(u.class, null);
       }
       return obj;
    }
}
