package kaa.l;
import kaa.w;
import jaa.d;
import jaa.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Karaoke;
import com.kuaishou.edit.draft.KaraokeAsset;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.edit.draft.Text;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.LyricAsset;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.SubtitleExtraParam$b;
import com.kuaishou.edit.draft.SubtitleExtraParam;
import com.kuaishou.edit.draft.Karaoke$b;
import com.kuaishou.edit.draft.KaraokeAsset$b;
import java.util.Iterator;
import com.kuaishou.edit.draft.StickerResult$b;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;

public class l extends w	// class@002c2e
{
    public final d a;

    public void l(){
       super();
       this.a = new d(2, 7, 38);
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       boolean b1;
       Text$b uob2;
       String previewImage;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.b(p0);
       c a = p0.a;
       p0 = p0.c;
       a.f("Android");
       ArrayList obj = PatchProxy.applyOneRefs(a, this, l.class, "4");
       int i = 0;
       int b = true;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(a.getType() == Workspace$Type.KTV_SONG || a.getType() == Workspace$Type.KTV_MV){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          obj = PatchProxy.applyOneRefs(a, this, l.class, "5");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(a.getKaraoke().getAsset().getLyricAssetsCount() > 0 || this.d(a)){
             b = false;
          }
          b1 = b;
          if (b1) {
             obj = new ArrayList();
             if (this.d(a)) {
                this.c(a);
                b = a.getTextsCount();
                List textsList = a.getTextsList();
                a.e();
                while (i < b) {
                   Text text = textsList.get(i);
                   if (text.hasSubtitleExtraParam()) {
                      obj.add(text.toBuilder());
                   }else {
                      a.copyOnWrite();
                      a.instance.addTexts(text);
                   }
                   i = i + 1;
                }
             }else {
                b = a.getKaraoke().getAsset().getLyricAssetsCount();
                for (; i < b; i = i + 1) {
                   uob2 = Text.newBuilder();
                   LyricAsset lyricAssets = a.getKaraoke().getAsset().getLyricAssets(i);
                   uob2.k(lyricAssets.getResult());
                   uob2.m(lyricAssets.getText());
                   uob2.l(SubtitleExtraParam.newBuilder());
                   obj.add(uob2);
                }
                this.c(a);
             }
             Karaoke$b uob = a.getKaraoke().toBuilder();
             KaraokeAsset$b uob1 = uob.getAsset().toBuilder();
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                uob2 = iterator.next();
                StickerResult$b uob3 = uob2.getResult().toBuilder();
                b0 obj1 = PatchProxy.applyTwoRefs(p0, uob3, this, l.class, "2");
                if (obj1 != PatchProxyResult.class) {
                }else if(!TextUtils.x(uob3.getPreviewImageFile())){
                   previewImage = uob3.getPreviewImageFile();
                }else {
                   previewImage = uob3.instance.getOutputImageFile();
                }
                if (TextUtils.x(previewImage)) {
                   obj1 = null;
                }else {
                   obj1 = new File(p0, previewImage);
                }
                if (obj1 != null && obj1.exists()) {
                   obj1 = BitmapUtil.E(obj1.getAbsolutePath());
                   uob3.r((double)obj1.a);
                   uob3.q((double)obj1.b);
                }
                uob3.t(0x3f800000);
                uob2.j(uob3);
                uob1.copyOnWrite();
                uob1.instance.addKtvLyric(uob2);
             }
             uob.a(uob1);
             uob.a(uob1);
             a.n(uob);
          }
       }
       return;
    }
    public final void c(Workspace$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       Karaoke$b uob = p0.getKaraoke().toBuilder();
       KaraokeAsset$b uob1 = uob.getAsset().toBuilder();
       uob1.a();
       uob.a(uob1);
       p0.n(uob);
       return;
    }
    public final boolean d(Workspace$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Iterator iterator = p0.getTextsList().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().hasSubtitleExtraParam()) {
             break ;
          }
       }
       return true;
    }
}
