package maa.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Asset;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import ekd.q;
import com.kuaishou.edit.draft.AuditFrame;
import com.kuaishou.edit.draft.AssetSegment;
import com.kuaishou.edit.draft.AEEffect;
import com.yxcorp.gifshow.edit.draft.model.c$a;
import maa.b$a;

public class b extends e	// class@002fa0
{
    public a f;
    public a g;
    public a h;
    public c$a i;

    public void b(File p0,Asset p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       Asset uAsset = PatchProxy.apply(null, this, b.class, "2");
       if (uAsset != PatchProxyResult.class) {
       }else {
          Asset$b uob = Asset.newBuilder();
          uob.f(DraftUtils.i());
          uAsset = uob.build();
       }
       return uAsset;
    }
    public List j(GeneratedMessageLite p0){
       List list = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (list != PatchProxyResult.class) {
       }else {
          list = this.m(p0);
          if (p0.getSubAssetCount() > 0) {
             Iterator iterator = p0.getSubAssetList().iterator();
             while (iterator.hasNext()) {
                list.addAll(this.m(iterator.next()));
             }
          }
       }
       return list;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.f().f(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
    public final List m(Asset p0){
       Iterator iterator1;
       AuditFrame uAuditFrame;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(p0.getFile());
       Asset$ShootInfo shootInfo = p0.getShootInfo();
       List auditFrameLi = shootInfo.getAuditFrameList();
       if (!q.f(auditFrameLi)) {
          Iterator iterator = auditFrameLi.iterator();
          while (iterator.hasNext()) {
             obj.add(iterator.next().getFile());
          }
       }
       List magicFaceAtt = shootInfo.getMagicFaceAttributeFrameList();
       if (!q.f(magicFaceAtt)) {
          iterator1 = magicFaceAtt.iterator();
          while (iterator1.hasNext()) {
             uAuditFrame = iterator1.next();
             obj.add(uAuditFrame.getFile());
             obj.add(uAuditFrame.getJsonFile());
          }
       }
       magicFaceAtt = p0.getAssetAuditFrameList();
       if (!q.f(magicFaceAtt)) {
          iterator1 = magicFaceAtt.iterator();
          while (iterator1.hasNext()) {
             uAuditFrame = iterator1.next();
             obj.add(uAuditFrame.getFile());
             obj.add(uAuditFrame.getJsonFile());
          }
       }
       magicFaceAtt = p0.getAssetSegmentList();
       if (!q.f(magicFaceAtt)) {
          iterator1 = magicFaceAtt.iterator();
          while (iterator1.hasNext()) {
             AssetSegment uAssetSegmen = iterator1.next();
             obj.add(uAssetSegmen.getFile());
             obj.add(uAssetSegmen.getCropFile());
          }
       }
       magicFaceAtt = p0.getAe2EffectsList();
       if (!q.f(magicFaceAtt)) {
          iterator1 = magicFaceAtt.iterator();
          while (iterator1.hasNext()) {
             AEEffect uAEEffect = iterator1.next();
             obj.add(uAEEffect.getAeAssetDir());
             for (int i = 0; i < uAEEffect.getTextPicturePathCount(); i = i + 1) {
                obj.add(uAEEffect.getTextPicturePath(i));
             }
          }
       }
       obj.add(p0.getAudioPath());
       obj.add(p0.getPictureCropFile());
       return obj;
    }
    public final c$a n(){
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          this.i = new b$a(this);
       }
       return this.i;
    }
    public final List o(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new ArrayList();
       }
       return this.d;
    }
}
