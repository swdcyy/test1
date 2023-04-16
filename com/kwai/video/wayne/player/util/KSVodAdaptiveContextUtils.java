package com.kwai.video.wayne.player.util.KSVodAdaptiveContextUtils;
import java.lang.Object;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.wayne.player.logreport.KSVodAdaptiveContext$ManifestContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.player.mid.manifest.v2.Adaptation;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import com.kwai.video.player.mid.manifest.v2.Representation;
import com.kwai.video.wayne.player.logreport.KSVodAdaptiveContext$RepresentationContext;

public class KSVodAdaptiveContextUtils	// class@000dbd
{

    public void KSVodAdaptiveContextUtils(){
       super();
    }
    public static KSVodAdaptiveContext$ManifestContext fromManifest(KwaiManifest p0){
       Adaptation obj = null;
       KwaiManifest obj1 = PatchProxy.applyOneRefs(p0, obj, KSVodAdaptiveContextUtils.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null) {
          obj1 = p0.mAdaptationSet;
          if (obj1 != null && !obj1.isEmpty()) {
             KSVodAdaptiveContext$ManifestContext manifestCont = new KSVodAdaptiveContext$ManifestContext();
             manifestCont.videoId = p0.mVideoId;
             manifestCont.hevcRep = new ArrayList();
             manifestCont.avcRep = new ArrayList();
             Iterator iterator = p0.mAdaptationSet.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj == null) {
                   continue ;
                }else if(TextUtils.equals(obj.vcodec, "avc")){
                   KSVodAdaptiveContextUtils.inflateRepresentation(manifestCont.avcRep, obj.mRepresentation);
                }else if(TextUtils.equals(obj.vcodec, "hevc")){
                   KSVodAdaptiveContextUtils.inflateRepresentation(manifestCont.hevcRep, obj.mRepresentation);
                }
             }
             return manifestCont;
          }
       }
       return obj;
    }
    public static KSVodAdaptiveContext$ManifestContext fromManifest(String p0){
       KSVodAdaptiveContext$ManifestContext manifestCont;
       Object obj = PatchProxy.applyOneRefs(p0, null, KSVodAdaptiveContextUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          manifestCont = KSVodAdaptiveContextUtils.fromManifest(KwaiManifest.from(p0));
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return manifestCont;
    }
    public static void inflateRepresentation(ArrayList p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSVodAdaptiveContextUtils.class, "3")) {
          return;
       }
       if (p1 != null && !p1.isEmpty()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             Representation representati = iterator.next();
             if (representati == null) {
                continue ;
             }
             KSVodAdaptiveContext$RepresentationContext representati1 = new KSVodAdaptiveContext$RepresentationContext();
             representati1.id = representati.mId;
             representati1.qualityType = representati.mQualityType;
             p0.add(representati1);
          }
       }
       return;
    }
}
