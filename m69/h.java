package m69.h;
import j69.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import l69.n;
import l69.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.c;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import tkd.b;
import tkd.d;
import b26.c;
import b26.d;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig$ImportEncodeConfig;
import h69.g;
import q87.c;

public final class h implements f	// class@002e1f
{

    public void h(){
       super();
    }
    public boolean a(){
       return true;
    }
    public boolean b(){
       boolean b;
       o obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = n.f.d();
       if (obj != null) {
          VideoTemplateProject videoTemplat = obj.b();
          if (videoTemplat != null) {
             b = videoTemplat.isAnnualAlbum();
          label_0028 :
             return b;
          }
       }
       b = false;
       goto label_0028 ;
    }
    public void c(EditorSdk2$ExportOptions p0){
       boolean b;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "2")) {
          return;
       }
       a.p(p0, "options");
       EncodeConfig uEncodeConfi = b.c();
       a.o(uEncodeConfi, "EncodeConfigUtils.getEncodeConfig\(\)");
       p0.setX264Params(uEncodeConfi.getX264Params());
       EncodeConfig obj = PatchProxy.apply(null, this, oh, "1");
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): d.a(0x2e6e89ac).C5(720, 1280);
       if (!b) {
          return;
       }else {
          int i = 0;
          if (GSConfig.c() != null) {
             obj = GSConfig.c();
             a.o(obj, "GSConfig.getEncodeConfig\(\)");
             if (obj.getImportEncodeConfig() != null) {
                obj = 1;
             label_005f :
                Object[] objArray = new Object[i];
                g.D().s("AICutTransCoder", "exportVideo: using VIDEO_ENCODER_TYPE_MEDIACODEC", objArray);
                p0.setVideoEncoderType(5);
                p0.setVideoGopSize(250);
                p0.setVideoBitrate(0x7a1200);
                if (obj) {
                   obj = GSConfig.c();
                   a.o(obj, "GSConfig.getEncodeConfig\(\)");
                   EncodeConfig$ImportEncodeConfig importEncode = obj.getImportEncodeConfig();
                   a.m(importEncode);
                   p0.setVideoGopSize(importEncode.mVideoGopSize);
                   obj = GSConfig.c();
                   a.o(obj, "GSConfig.getEncodeConfig\(\)");
                   importEncode = obj.getImportEncodeConfig();
                   a.m(importEncode);
                   p0.setVideoBitrate(importEncode.mVideoBitrate);
                }
                return;
             }
          }
          obj = null;
          goto label_005f ;
       }
    }
    public String getSessionId(){
       String str;
       o obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n.f.d();
       if (obj != null) {
          str = obj.f();
          if (str != null) {
          label_0021 :
             return str;
          }
       }
       str = "";
       goto label_0021 ;
    }
}
