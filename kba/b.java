package kba.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.UndoAction;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.UndoAction$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.edit.draft.UndoAction$ActionCase;
import com.kuaishou.edit.draft.DeleteAssetAction;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.AssetArrangeAction;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import java.util.Collection;
import ekd.q;
import com.kuaishou.edit.draft.AuditFrame;

public class b extends e	// class@002c41
{

    public void b(File p0,UndoAction p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       UndoAction undoAction = PatchProxy.apply(null, this, b.class, "1");
       if (undoAction != PatchProxyResult.class) {
       }else {
          UndoAction$b uob = UndoAction.newBuilder();
          uob.d(DraftUtils.i());
          undoAction = uob.build();
       }
       return undoAction;
    }
    public List j(GeneratedMessageLite p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          if (p0.getActionCase() == UndoAction$ActionCase.DELETE_ASSET_ACTION) {
             this.m(p0.getDeleteAssetAction().getAsset(), uArrayList);
          }else if(p0.getActionCase() == UndoAction$ActionCase.ASSET_ARRANGE_ACTION){
             Iterator iterator = p0.getAssetArrangeAction().getOriginalAssetsList().iterator();
             while (iterator.hasNext()) {
                this.m(iterator.next(), uArrayList);
             }
          }else {
             uArrayList = null;
          }
       }
       return uArrayList;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.f().d(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
    public final void m(Asset p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       p1.add(p0.getFile());
       Asset$ShootInfo shootInfo = p0.getShootInfo();
       List auditFrameLi = shootInfo.getAuditFrameList();
       if (!q.f(auditFrameLi)) {
          Iterator iterator = auditFrameLi.iterator();
          while (iterator.hasNext()) {
             p1.add(iterator.next().getFile());
          }
       }
       List magicFaceAtt = shootInfo.getMagicFaceAttributeFrameList();
       if (!q.f(magicFaceAtt)) {
          Iterator iterator1 = magicFaceAtt.iterator();
          while (iterator1.hasNext()) {
             AuditFrame uAuditFrame = iterator1.next();
             p1.add(uAuditFrame.getFile());
             p1.add(uAuditFrame.getJsonFile());
          }
       }
       return;
    }
}
